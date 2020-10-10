package com.example.excelProj.Model;

import javax.persistence.*;

@Entity
public class ViewLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "VARCHAR(255)")
    private String email;
    private String token;
    private String visited;


    public ViewLink() {
    }

    public ViewLink(String email, String token, String visited) {

        this.email = email;
        this.token = token;
        this.visited = visited;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }
}
