package partymanagement.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import partymanagement.config.kafka.KafkaProcessor;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PartyRepository partyRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    MoveInfoRepository moveInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}
    // keep

}
