package com.marc7806.camundasockets.listener;

import com.marc7806.camundasockets.websocket.MessageHandler;
import org.camunda.bpm.engine.impl.history.event.HistoricActivityInstanceEventEntity;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class CamundaListener {
    private final MessageHandler _messageHandler;

    public CamundaListener(MessageHandler _messageHandler) {this._messageHandler = _messageHandler;}

    @EventListener(condition = "#historyEvent.getEventType()=='start' && #historyEvent.getActivityId()=='travel_process'")
    public void onHistoryEvent(HistoricActivityInstanceEventEntity historyEvent) {
        _messageHandler.sendTravelProcessStartMessage(historyEvent);
    }
}
