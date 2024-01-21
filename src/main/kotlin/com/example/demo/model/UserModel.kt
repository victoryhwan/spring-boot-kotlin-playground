package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "User")
data class UserModel(
        @Id
        @GeneratedValue
        var id: Int,
        var name: String,
        var email: String
)