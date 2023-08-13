package com.houari.notification_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.houari.notification_service.dto.NotificationDto;
import com.houari.notification_service.service.NotificationService;

@RestController
@RequestMapping("api/notification")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping()
    public ResponseEntity<NotificationDto> saveNotification(@RequestBody NotificationDto notificationDto) {
        System.out.println(notificationDto.toString());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(notificationService.saveNotification(notificationDto));
    }

    @GetMapping()
    public ResponseEntity<List<NotificationDto>> getNotifications() {
        return ResponseEntity.ok(notificationService.getNotifications());
    }

}
