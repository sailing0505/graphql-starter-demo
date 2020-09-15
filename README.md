# Introduction
The Spring Boot GraphQL Starter offers a fantastic way to get a GraphQL server running in a very short time. Combined with the GraphQL Java Tools library, we need only write the code necessary for our service.
> by default, this will expose the GraphQL Service on the **/graphql** endpoint of our application and will accept POST requests containing the GraphQL Payload. 
This endpoint can be customised in our application.properties file if necessary.
```gradle
dependencies {
implementation 'com.graphql-java-kickstart:graphql-spring-boot-starter:7.0.1'
}
```

# schema
The Spring Boot GraphQL starter automatically finds these schema files.
These files need to be saved with the extension ***“.graphqls”*** and can be present anywhere on the classpath

# Concept
- Data bean: graphQL定义的type,类比orm里面的entity class
- Root Resolver: graphQL里的顶层类型：常用的有Query, Mutation, Subscription
- Field Resolver: DataBean之间的相互应用需要通过相应的resolver类来获取数据

# Tips
- all resolver should in spring context
- class name is not matter, but should follow the convention
- method name does matter, and should follow the following priority
	1. < field>
	2. is< field > -only if the field is of type Boolean
	3. get< field >

# Root Query Resolver
The root query needs to defined in the Spring Context (@Component annotated)  and implements GraphQlQueryResolver name. 
The class name doesn't matter, but the method name should be one of the following according to schema definition:
1. < field>
2. is< field > -only if the field is of type Boolean
3. get< field >

- graphql field definition
```json
type Query {
    recentPosts(count: Int, offset: Int): [Post]!
    valid: Boolean
}
```
- related java implementation
```java
@Component
public class testQuery implements GraphQLQueryResolver {
	public List<> getRecentPosts(int count, int offset) {
		...
	}
	public boolean isValid() {
		...
	}
}
```
# Mutation Resolver
This is the root resolver for mutation


# Filed Resolver
Filed Resovler is used to resolve the data reference from data bean. 
e.g
```json
type Post {
    id: ID!
    title: String!
    text: String!
    category: String
    author: Author!
}

author is the reference type.
```

the class name is not matter but should along with the Field type
The method follow the same rule, tips
- clas name: "< DataBean name >Resolver"
- class method: "get< Field name >"

e.g.
the first method, **author()** will be invoked due to higher priority.
```
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
```



