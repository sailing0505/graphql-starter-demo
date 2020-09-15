package com.example.graphqlstarterdemo.graphql.resolver;

import com.example.graphqlstarterdemo.graphql.data.Author;
import com.example.graphqlstarterdemo.graphql.data.Post;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorResolver implements GraphQLResolver<Author> {
    public List<Post> getPosts(Author author) {
        System.out.println("enter getPosts");
        return  null;
    }
}
