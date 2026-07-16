package com.back.domain.post.post.service

import com.back.domain.member.member.entity.Member
import com.back.domain.post.post.entity.Post
import com.back.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service
import java.util.Optional


@Service
class PostService(
    private val postRepository: PostRepository
) {

    fun count() = postRepository.count()

    fun findById(id: Int): Optional<Post> =
        postRepository.findById(id)

    fun modify(post: Post, title: String, content: String) {
        post.title = title
        post.content = content
    }

    fun write(author : Member, title : String, content : String) : Post
            = postRepository.save(Post(author, title, content))
}