package com.sungsan.hellospring

import com.sungsan.hellospring.domain.user.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
        private val userService: UserService
) {

    @GetMapping("/api/user/{id}")
    fun findUser(@PathVariable id: Long): UserResponse {
        return UserResponse(userService.read(id))
    }

    @PostMapping("/api/user")
    fun addUser(@RequestBody request: NewUserRequest): NewUserResponse {
        return NewUserResponse(userService.add(request.name))
    }
}
