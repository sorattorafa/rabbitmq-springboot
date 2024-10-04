package com.example.rabbitmqdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageHistoryController(private val messageRepository: MessageRepository) {

    @GetMapping("/messages")
    fun getMessages(): List<MessageEntity> {
        return messageRepository.findAll()
    }
}
