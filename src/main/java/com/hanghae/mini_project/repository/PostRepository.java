package com.hanghae.mini_project.repository;

import com.hanghae.mini_project.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface PostRepository extends JpaRepository<Post, Long> {
}