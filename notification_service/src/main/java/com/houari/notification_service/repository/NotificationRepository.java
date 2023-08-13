package com.houari.notification_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.houari.notification_service.entity.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer>{
    
}
