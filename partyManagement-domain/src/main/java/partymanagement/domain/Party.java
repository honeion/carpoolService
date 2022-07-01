package partymanagement.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import partymanagement.PartyManagementApplication;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;
@Entity
@Table(name = "Party_table")
@Data
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer curNumberOfParty;

    private Integer maxNumberOfParty;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="id", column = @Column(name="DRIVER_ID")),
        @AttributeOverride(name="name", column = @Column(name="DRIVER_NAME")),
        @AttributeOverride(name="photo", column = @Column(name="DRIVER_PHOTO")),
        @AttributeOverride(name="carKind", column = @Column(name="DRIVER_CAR_KIND")),
        @AttributeOverride(name="carNumber", column = @Column(name="DRIVER_CAR_NUMBER")),
        @AttributeOverride(name="gender", column = @Column(name="DRIVER_GENDER")),
        @AttributeOverride(name="moveInfo_id", column = @Column(name="DRIVER_MOVE_INFO")),
        @AttributeOverride(name="role_id", column = @Column(name="DRIVER_ROLE")),
    })
    private Driver driver;
    
    @ElementCollection
    private List<CarPooler> carPooler;

    private PartyStatus status;

    @PostPersist
    public void onPostPersist() {
        PartyRegistered partyRegistered = new PartyRegistered(this);
        partyRegistered.publishAfterCommit();

        PartyModified partyModified = new PartyModified(this);
        partyModified.publishAfterCommit();

        PartyDeleted partyDeleted = new PartyDeleted(this);
        partyDeleted.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {}

    public static PartyRepository repository() {
        PartyRepository partyRepository = PartyManagementApplication.applicationContext.getBean(
            PartyRepository.class
        );
        return partyRepository;
    }
}
