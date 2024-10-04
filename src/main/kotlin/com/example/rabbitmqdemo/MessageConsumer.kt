package com.example.rabbitmqdemo

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Service

@Service
class MessageConsumer(
    private val messageRepository: MessageRepository
) {

    @RabbitListener(queues = ["example.queue"])
    fun receiveMessage(message: String) {
        println("Mensagem recebida: $message")
        // Salvar a mensagem no banco de dados
        messageRepository.save(MessageEntity(content = message))
    }
}