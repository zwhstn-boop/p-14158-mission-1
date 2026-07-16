package com.back.domain.member.member.entity

import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Member(
    @Column(unique = true)
    val username: String,
    var password: String,
    var nickname: String,
) : BaseEntity() {
    override fun toString(): String =
        "Member(username=$username, password=$password, nickname=$nickname)"
}