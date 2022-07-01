package partymanagement.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.*;
import partymanagement.PartyManagementApplication;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;
//@Embeddable
@Entity
@Table(name = "MoveInfo_table")
@Data
public class MoveInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    private String placeOfDeparture;
    private String destination;
    private Date fromDate;
    private Date toDate;
    private String price;
    //@OneToOne(targetEntity=Role.class)
   // private Role role;
    private Long role_id;

    @PostPersist
    public void onPostPersist() {
        DriverMoveInfoAdded driverMoveInfoAdded = new DriverMoveInfoAdded(this);
        driverMoveInfoAdded.publishAfterCommit();

        CarPoolerMoveInfoAdded carPoolerMoveInfoAdded = new CarPoolerMoveInfoAdded(
            this
        );
        carPoolerMoveInfoAdded.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        DriverMoveInfoUpdated driverMoveInfoUpdated = new DriverMoveInfoUpdated(
            this
        );
        driverMoveInfoUpdated.publishAfterCommit();

        CarPoolerMoveInfoUpdated carPoolerMoveInfoUpdated = new CarPoolerMoveInfoUpdated(
            this
        );
        carPoolerMoveInfoUpdated.publishAfterCommit();
    }

    public static MoveInfoRepository repository() {
        MoveInfoRepository moveInfoRepository = PartyManagementApplication.applicationContext.getBean(
            MoveInfoRepository.class
        );
        return moveInfoRepository;
    }
}
