package com.blogapp.blogapp.dataconverter;

import com.blogapp.blogapp.dto.PostDto;
import com.blogapp.blogapp.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostConverter {


    public Post convertDtoToEntity(PostDto postDto){
        Post post = new Post();
        post.setName(postDto.getName());
        post.setDescription(postDto.getDescription());
        post.setPrice(postDto.getPrice());

        return post;
    }

    public PostDto convertEntityToDto(Post post){

        PostDto postDtoResponse = new PostDto();
        postDtoResponse.setId(post.getId());
        postDtoResponse.setName(post.getName());
        postDtoResponse.setDescription(post.getDescription());
        postDtoResponse.setPrice(post.getPrice());

        return postDtoResponse;
    }
}
