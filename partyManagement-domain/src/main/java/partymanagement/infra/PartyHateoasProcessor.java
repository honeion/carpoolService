package partymanagement.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;

@Component
public class PartyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Party>> {

    @Override
    public EntityModel<Party> process(EntityModel<Party> model) {
        return model;
    }
}
