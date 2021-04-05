package com.marc7806.camundasockets.websocket;

import com.marc7806.camundasockets.model.InstanceCreatedMessage;
import org.camunda.bpm.engine.impl.history.event.HistoricActivityInstanceEventEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageHandler {
    private final SimpMessagingTemplate template;

    public MessageHandler(SimpMessagingTemplate template) {this.template = template;}

    public void sendTravelProcessStartMessage(HistoricActivityInstanceEventEntity historyEvent) {
        template.convertAndSend("/topic/travels", new InstanceCreatedMessage(historyEvent.getActivityInstanceId(), historyEvent.getAssignee(), historyEvent.getEventType(), historyEvent.getStartTime()));
    }
}
