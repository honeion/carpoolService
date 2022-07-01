package partymanagement.domain;
import javax.persistence.*;
import lombok.*;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;
@Embeddable
public class CarPooler {
    Long id;
    String name;
    String photo;
    String gender;
    /*
    @OneToOne(targetEntity=MoveInfo.class)
    MoveInfo moveInfo;
    @OneToOne(targetEntity=Role.class)
    Role role;
    */
    Long moveInfo_id;
    Long role_id;
}
