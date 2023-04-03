package com.example.springbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbackend.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
