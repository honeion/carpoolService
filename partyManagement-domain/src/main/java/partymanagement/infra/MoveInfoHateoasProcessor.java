package partymanagement.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;

@Component
public class MoveInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<MoveInfo>> {

    @Override
    public EntityModel<MoveInfo> process(EntityModel<MoveInfo> model) {
        return model;
    }
}
