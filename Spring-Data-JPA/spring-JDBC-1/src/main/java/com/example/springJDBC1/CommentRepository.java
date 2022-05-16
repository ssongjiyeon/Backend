package com.example.springJDBC1;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

public interface CommentRepository extends MyRepository<Comment, Long> {
}
