package com.example.demo.controller

import com.example.demo.model.UserModel
import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.Objects
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RestController
@RequestMapping("/rest")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping("/users")
    private fun getUsers(): ResponseEntity<Any> {
        return ResponseEntity
                .ok()
                .body(userService.getAllUsers())
    }

    @GetMapping("/user/{id}")
    private fun getUserById(@PathVariable id: Int): ResponseEntity<Any> {
        return ResponseEntity
            .ok()
            .body(userService.getUser(id))
    }

    @GetMapping("/user")
    private fun getUserByName(@RequestParam(value = "name") name: String): ResponseEntity<Any>{
        return ResponseEntity.ok().body(userService.getUserByName(name))
    }

    @PostMapping("/user")
    private fun postUser(@RequestBody userModel: UserModel): ResponseEntity<Any>{
        userService.saveUser(userModel)
        val result = mutableMapOf<String, Any>()

        result["status"] = true
        result["code"]= 200
        return ResponseEntity.ok().body(result)
    }
}