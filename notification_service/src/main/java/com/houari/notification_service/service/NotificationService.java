package com.houari.notification_service.service;

import java.util.List;

import com.houari.notification_service.dto.NotificationDto;

public interface NotificationService {
    
    NotificationDto saveNotification(NotificationDto notificationDto);

    List<NotificationDto> getNotifications();



}
