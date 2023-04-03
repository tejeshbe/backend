package com.example.springbackend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbackend.entities.Category;
import com.example.springbackend.entities.Post;
import com.example.springbackend.entities.User;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);	
}
