package com.example.springJDBC1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void crud() {
        Comment byId = commentRepository.findById(100L);
        assertThat(byId).isNull();
    }
}
