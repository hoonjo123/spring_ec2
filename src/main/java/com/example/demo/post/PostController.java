package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
@Controller

public class PostController {
    private PostService postService;

    PostController(){
        this.postService = new PostService();
    }
    //초기화
    //데이터만 리턴
    @GetMapping("/csr/json")
    @ResponseBody
    public List<Post> findAll(){
        return postService.findAll();
    }

    //사용자에게 화면과 data 까지 리턴
    @GetMapping("/ssr")
    public String findAllSsr(Model model){
        List<Post>posts = postService.findAll();
        model.addAttribute("posts",posts);
        return "post_list";
    }
}


