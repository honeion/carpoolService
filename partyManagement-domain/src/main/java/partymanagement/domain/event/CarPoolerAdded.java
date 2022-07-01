package partymanagement.domain;

import java.util.Date;
import lombok.Data;
import partymanagement.domain.*;
import partymanagement.infra.AbstractEvent;

@Data
public class CarPoolerAdded extends AbstractEvent {

    private Long id;
    private String userId;
    private String partyId;
    private CarPoolRole carPoolRole;

    public CarPoolerAdded(Role aggregate) {
        super(aggregate);
    }

    public CarPoolerAdded() {
        super();
    }
    // keep

}
