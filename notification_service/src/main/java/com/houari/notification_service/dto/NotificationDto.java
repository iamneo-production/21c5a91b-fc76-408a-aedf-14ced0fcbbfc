package com.houari.notification_service.dto;

import java.util.Date;

import com.houari.notification_service.utill.Transformer;

import lombok.Data;

@Data
public class NotificationDto implements Transformer{
    
    private int id;

    private String message;

    private String notificationType;

    private Date date;

    private int customerId;
}
