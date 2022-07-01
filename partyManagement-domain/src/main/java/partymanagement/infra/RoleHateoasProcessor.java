package partymanagement.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;

@Component
public class RoleHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Role>> {

    @Override
    public EntityModel<Role> process(EntityModel<Role> model) {
        return model;
    }
}
