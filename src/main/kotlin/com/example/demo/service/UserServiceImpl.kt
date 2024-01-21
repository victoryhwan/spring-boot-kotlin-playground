package com.example.demo.service

import com.example.demo.model.UserModel
import com.example.demo.repository.UserRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl constructor(@Autowired private val userRepository: UserRepository) : UserService {

    override fun getAllUsers(): List<UserModel>? = userRepository.findAllBy()

    override fun getUser(id: Int): UserModel? = userRepository.findById(id).orElse(null)

    override fun getUserByName(name: String): UserModel? {
        return userRepository.findByName(name)
    }

    @Transactional
    override fun saveUser(userModel: UserModel): UserModel = userRepository.save(userModel)
}