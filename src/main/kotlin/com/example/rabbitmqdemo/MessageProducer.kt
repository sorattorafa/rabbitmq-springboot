package com.example.rabbitmqdemo

import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Service

@Service
class MessageProducer(private val rabbitTemplate: RabbitTemplate) {

    fun sendMessage(message: String) {
        rabbitTemplate.convertAndSend("example.queue", message)
        println("Mensagem enviada: $message")
    }
}
