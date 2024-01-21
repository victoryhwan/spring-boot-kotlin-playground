package com.example.demo.repository

import com.example.demo.model.UserModel
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<UserModel, Int>{

    fun findByName(name: String): UserModel?

    fun findAllBy(): List<UserModel>?
}