package com.example.springJDBC1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class PostRepositoryTest {
    @Autowired
    PostRepository postRepository;

    @Test
    public void crudRepository() {
        // Given
        Post post = new Post();
        post.setTitle("hello common");
        assertThat(post.getId()).isNull();

        // When
        Post newPost = postRepository.save(post);

        // Then
        assertThat(newPost.getId()).isNotNull();

        // When
        List<Post> posts = postRepository.findAll();

        // Then
        assertThat(posts.size()).isEqualTo(1);
        assertThat(posts).contains(newPost);

        // When
        Page<Post> page = postRepository.findAll(PageRequest.of(0, 10));
        assertThat(page.getTotalElements()).isEqualTo(1);
        assertThat(page.getSize()).isEqualTo(10);

        // When
        page = postRepository.findByTitleContains("spring", PageRequest.of(0, 10));

        // Then
        assertThat(page.getTotalElements()).isEqualTo(0);

    }
}
