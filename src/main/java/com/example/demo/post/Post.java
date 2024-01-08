package com.example.demo.post;

public class Post {
    private static Long idCounter = 1L;

    private int id;
    private String title;
    private String body;
    private String authorName;

    public static Long getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(Long idCounter) {
        Post.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthorname() {
        return authorName;
    }

    public void setAuthorname(String authorname) {
        this.authorName = authorname;
    }

    public Post(int id, String title, String body, String authorname) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.authorName = authorname;
    }
}
