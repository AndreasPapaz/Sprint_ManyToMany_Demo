package com.example.demo.repo;

import com.example.demo.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publisher, Integer> {
}
