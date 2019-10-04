package com.dylanapp.ttscapstone.repositories;

import com.dylanapp.ttscapstone.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
@Transactional
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
