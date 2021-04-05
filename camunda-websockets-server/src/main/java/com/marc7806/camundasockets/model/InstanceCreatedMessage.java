package com.marc7806.camundasockets.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InstanceCreatedMessage {
    private String processId;
    private String assignee;
    private String eventType;
    private Date startTime;
}
