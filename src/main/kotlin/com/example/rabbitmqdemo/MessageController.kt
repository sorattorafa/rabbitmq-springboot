package com.example.rabbitmqdemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(private val messageProducer: MessageProducer) {

    @GetMapping("/send")
    fun send(@RequestParam message: String): String {
        messageProducer.sendMessage(message)
        return "Mensagem enviada: $message"
    }
}
