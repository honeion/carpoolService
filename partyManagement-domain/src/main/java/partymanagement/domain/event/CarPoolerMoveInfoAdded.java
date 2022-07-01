package partymanagement.domain;

import java.util.Date;
import lombok.Data;
import partymanagement.domain.*;
import partymanagement.infra.AbstractEvent;

@Data
public class CarPoolerMoveInfoAdded extends AbstractEvent {

    private Long id;
    private String userId;
    private String placeOfDeparture;
    private String destination;
    private Date fromDate;
    private Date toDate;
    private String price;
    private String role;

    public CarPoolerMoveInfoAdded(MoveInfo aggregate) {
        super(aggregate);
    }

    public CarPoolerMoveInfoAdded() {
        super();
    }
    // keep

}
