package partymanagement.domain.event;

import java.util.Date;
import lombok.Data;
import partymanagement.domain.*;
import partymanagement.infra.AbstractEvent;

@Data
public class DriverAdded extends AbstractEvent {

    private Long id;
    private String userId;
    private String partyId;
    private CarPoolRole carPoolRole;

    public DriverAdded(Role aggregate) {
        super(aggregate);
    }

    public DriverAdded() {
        super();
    }
    // keep

}
