package com.example.springJDBC1;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setUsername("jj");
        account.setPassword("jj");

        Study study = new Study();
        study.setName("sss");
        study.setOwner(account);

        Post post = new Post();
        post.setTitle("ndnd");

        Comment comment = new Comment();
        comment.setComment("ssss");
        post.addComment(comment);

        Comment comment1 = new Comment();
        comment.setComment("ssa");
        post.addComment(comment1);

        Session session = entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);


    }
}
