package partymanagement.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import partymanagement.domain.*;
import partymanagement.domain.repository.*;
import partymanagement.domain.event.*;

@RestController
@RequestMapping(value = "/moveInfos")
@Transactional
public class MoveInfoController {

    @Autowired
    MoveInfoRepository moveInfoRepository;
    // keep
}
