package com.sungsan.hellospring

import com.sungsan.hellospring.domain.user.User

data class UserResponse(
        val id: Long,
        val name: String
) {
    constructor(user: User) : this(user.id, user.name)
}
