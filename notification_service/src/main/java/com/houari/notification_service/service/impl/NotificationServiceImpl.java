package com.houari.notification_service.service.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houari.notification_service.dto.NotificationDto;
import com.houari.notification_service.entity.Notification;
import com.houari.notification_service.repository.NotificationRepository;
import com.houari.notification_service.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService{

    @Autowired
    NotificationRepository notificationRepository;

	@Override
	public NotificationDto saveNotification(NotificationDto notificationDto) {
        Notification notification = notificationDto.toEntity(Notification.class);
        notification.setDate(new Date());

        return notificationRepository.save(notification).toDto(NotificationDto.class);
	}

	@Override
	public List<NotificationDto> getNotifications() {
		
        return notificationRepository.findAll().stream()
        .map(notification -> notification.toDto(NotificationDto.class))
        .collect(Collectors.toList());
	}

}
