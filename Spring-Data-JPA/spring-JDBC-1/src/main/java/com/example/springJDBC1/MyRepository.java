package com.example.springJDBC1;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends Repository<T, Id> {

    <E extends T> E save(E entity);

    List<T> findAll();

    <E extends T> E findById(Id id);
}
