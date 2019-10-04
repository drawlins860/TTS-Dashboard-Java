package com.dylanapp.ttscapstone.repositories;

import com.dylanapp.ttscapstone.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
@Transactional
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
}
