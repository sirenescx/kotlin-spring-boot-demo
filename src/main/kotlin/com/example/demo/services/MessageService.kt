package com.example.demo.services

import com.example.demo.models.Message
import com.example.demo.repositories.MessageRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class MessageService(val repository: MessageRepository) {
    fun findMessages(): List<Message> = repository.findAll().toList()

    fun findMessageById(id: String): List<Message> = repository.findById(id).toList()

    fun save(message: Message) {
        repository.save(message)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}