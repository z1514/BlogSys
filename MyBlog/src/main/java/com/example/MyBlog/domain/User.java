package com.example.MyBlog.domain;


import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name can't be null")
    @Size(min=2, max=20)
    @Column(nullable = false, length = 20)
    private String name;

    @NotEmpty(message = "Email can't be null")
    @Size(max = 50)
    @Email(message = "wrong format email")
    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @NotEmpty(message = "Account can't be null")
    @Size(min = 3, max = 20)
    @Column(nullable = false, length = 20, unique = true)
    private String username;

    @NotEmpty(message = "Password can't be null")
    @Size(max = 100)
    @Column(length = 100)
    private String password;

    @Column(length = 200)
    private String avatar;

    protected User() {
    }

    public User(String name, String email,String username,String password) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format("User[id=%d, username='%s', name='%s', email='%s', password='%s']", id, username, name, email,
                password);
    }
}
