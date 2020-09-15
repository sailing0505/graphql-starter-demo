package com.example.graphqlstarterdemo.graphql.data;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Post {
    String id;
    String title;
    String text;
    String category;
    int authorId;

    public Post() {
    }

    public Post(String id, String title, String text, String category, int authorId) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.category = category;
        this.authorId = authorId;
    }
}
