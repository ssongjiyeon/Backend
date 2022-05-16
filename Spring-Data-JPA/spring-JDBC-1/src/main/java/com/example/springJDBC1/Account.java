package com.example.springJDBC1;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {

    @Id @GeneratedValue
    private Long id;

    private String username;

    private String password;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "home_street"))
    })
    private Address homeAddress;

    @OneToMany(mappedBy = "owner")
    private Set<Study> study = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
