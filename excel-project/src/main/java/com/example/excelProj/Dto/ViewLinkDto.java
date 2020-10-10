package com.example.excelProj.Dto;

public class ViewLinkDto {

    private String email;
    private String token;
    private String visited;


    public ViewLinkDto() {
    }

    public ViewLinkDto(String email, String token, String visited) {
        this.email = email;
        this.token = token;
        this.visited = visited;
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
