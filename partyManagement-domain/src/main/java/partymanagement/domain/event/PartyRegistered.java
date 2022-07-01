package partymanagement.domain.event;

import java.util.Date;
import lombok.Data;
import partymanagement.domain.*;
import partymanagement.infra.AbstractEvent;
import java.util.*;
import javax.persistence.*;
@Data
public class PartyRegistered extends AbstractEvent {

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
        @AttributeOverride(name="moveInfo", column = @Column(name="DRIVER_MOVE_INFO")),
        @AttributeOverride(name="role", column = @Column(name="DRIVER_ROLE")),
    })
    private Driver driver;
    
    @ElementCollection
    private List<CarPooler> carPooler;
    private String partyStatus;

    public PartyRegistered(Party aggregate) {
        super(aggregate);
    }

    public PartyRegistered() {
        super();
    }
    // keep

}
