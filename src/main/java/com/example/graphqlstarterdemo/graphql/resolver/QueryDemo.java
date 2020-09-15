package com.example.graphqlstarterdemo.graphql.resolver;

import com.example.graphqlstarterdemo.graphql.data.Post;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryDemo implements GraphQLQueryResolver {
    public List<Post> getRecentPost(int count, int offset) {
        return null;
    }

    public Post getPost(String id) {
        Post post = new Post("id-1", "test", "test", "test", 1);
        return post;
    }
}
