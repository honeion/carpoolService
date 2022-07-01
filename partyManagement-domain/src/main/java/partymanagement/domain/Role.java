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
@Table(name = "Role_table")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String partyId;

    private CarPoolRole carPoolRole;

    @PostPersist
    public void onPostPersist() {
        DriverAdded driverAdded = new DriverAdded(this);
        driverAdded.publishAfterCommit();

        CarPoolerAdded carPoolerAdded = new CarPoolerAdded(this);
        carPoolerAdded.publishAfterCommit();
    }

    public static RoleRepository repository() {
        RoleRepository roleRepository = PartyManagementApplication.applicationContext.getBean(
            RoleRepository.class
        );
        return roleRepository;
    }
}
