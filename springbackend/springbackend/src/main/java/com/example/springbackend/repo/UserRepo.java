package com.example.springbackend.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbackend.entities.*;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
