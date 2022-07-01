package partymanagement.domain;
import javax.persistence.*;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;
import lombok.*;
// //VO->Relation을 갖는 Entity
// @Entity
// @Table(name = "Driver_table")
@Embeddable
@Data
public class Driver {
    
    Long id;
    String name;
    String photo;
    String gender;
    String carNumber;
    String carKind;
    Long moveInfo_id;
    Long role_id;
  
}
//value object가 2중으로
//임베디드로 들어갔으면 추가적인 릴레이션을 못잡고
//완전히 잡을거면 다 테이블로하고
//Driver랑 카풀러를 엔티티로 잡을거면 안되겠다.
