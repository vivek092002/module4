package org.vivek.module4.services;

import org.springframework.stereotype.Service;
import org.vivek.module4.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();
    PostDTO createNewPost(PostDTO inputPost);
    PostDTO getPostById(Long postId);

    PostDTO updatePost(PostDTO inputPost, Long postId);
}
