package com.back.domain.member.member.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Member(
    @field:Column(unique = true) private var username: String?,
    private val password: String?,
    private val nickname: String?
)