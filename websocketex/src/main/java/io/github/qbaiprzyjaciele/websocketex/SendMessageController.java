package io.github.qbaiprzyjaciele.websocketex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/message")
public class SendMessageController {

    private static final Logger LOG = LoggerFactory.getLogger(SendMessageController.class);

    private final SimpMessagingTemplate template;

    public SendMessageController(SimpMessagingTemplate template) {
        this.template = template;
    }

    @GetMapping(value = "/send")
    public String send(@RequestParam(value = "group") String group, @RequestParam(value = "message") String message) {
        LOG.info(message);
        this.template.convertAndSend(String.format("/topic/messages-%s", group), message);
        return "sent";
    }

}
