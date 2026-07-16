package com.back.domain.post.post.entity

import com.back.domain.member.member.entity.Member
import com.back.global.jpa.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.ManyToOne

@Entity
class Post(

    @ManyToOne //포스트가 많고 memer는 적다
    //기본값은 설정해도 되고 하지 않아도 된다
    var author: Member? = null,

    var title: String = "",

    @Column(columnDefinition = "TEXT")
    var content: String = ""

) : BaseEntity()