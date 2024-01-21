package com.example.demo.service

import com.example.demo.model.UserModel
import org.springframework.stereotype.Service

@Service
interface UserService {
    fun getAllUsers(): List<UserModel>?

    fun getUser(id: Int): UserModel?

    fun saveUser(userModel: UserModel): UserModel

    fun getUserByName(name: String): UserModel?
}