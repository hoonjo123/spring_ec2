package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PostRepository {

    List<Post> posts;
    PostRepository(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1, "title1","hello java world1","honggildong1"));
        this.posts.add(new Post(2, "title1","hello java world2","honggildong2"));
        this.posts.add(new Post(3, "title1","hello java world3","honggildong3"));
        this.posts.add(new Post(4, "title1","hello java world4","honggildong4"));
        this.posts.add(new Post(5, "title1","hello java world5","honggildong5"));
        this.posts.add(new Post(6, "title1","hello java world6","honggildong6"));
        this.posts.add(new Post(7, "title1","hello java world7","honggildong7"));
        this.posts.add(new Post(8, "title1","hello java world8","honggildong8"));


    }
    List<Post> findAll(){
        return this.posts;
    }
}