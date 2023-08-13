package com.houari.notification_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houari.notification_service.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer>{
    
}
