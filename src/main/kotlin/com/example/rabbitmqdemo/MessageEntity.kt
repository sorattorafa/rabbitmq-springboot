package com.example.rabbitmqdemo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class MessageEntity(
    @Id @GeneratedValue var id: Long? = null,
    var content: String
)

