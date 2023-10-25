package com.example.demo.repositories

import com.example.demo.models.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
}