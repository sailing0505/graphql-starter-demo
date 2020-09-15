package com.example.graphqlstarterdemo.graphql.resolver;

import com.example.graphqlstarterdemo.graphql.data.Author;
import com.example.graphqlstarterdemo.graphql.data.Post;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class PostResolver implements GraphQLResolver<Post> {
    public Author author(Post post) {
        Author author = new Author();
        author.setId("author-1");
        author.setName("jason");
        author.setThumbnail("jason");

        return author;
    }
    public Author getAuthor(Post post) {
        Author author = new Author();
        author.setId("author-1");
        author.setName("jason");
        author.setThumbnail("jason");

        return author;
    }
}
