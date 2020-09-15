package com.example.graphqlstarterdemo.graphql.data;

import lombok.Data;

import java.util.List;

@Data
public class Author {
    private String id;
    private String name;
    private String thumbnail;
    List<Post> posts;

}
