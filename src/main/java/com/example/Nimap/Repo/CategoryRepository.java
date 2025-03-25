package com.example.Nimap.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Nimap.Model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
