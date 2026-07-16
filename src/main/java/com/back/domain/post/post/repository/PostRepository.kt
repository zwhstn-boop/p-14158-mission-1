package com.back.domain.post.post.repository

import com.back.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository
//리포지토리들은 자동변환시 ? 만 제거해줄것
interface PostRepository : JpaRepository<Post, Int>