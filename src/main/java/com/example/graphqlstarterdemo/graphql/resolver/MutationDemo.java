package com.example.graphqlstarterdemo.graphql.resolver;

import com.example.graphqlstarterdemo.graphql.data.Post;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class MutationDemo implements GraphQLMutationResolver {
    public Post writePost(String title, String text, String category) {
        return new Post("id1", title, text, category, 1);
    }
}
