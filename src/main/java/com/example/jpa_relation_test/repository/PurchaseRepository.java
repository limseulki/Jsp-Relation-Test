package com.example.jpa_relation_test.repository;


import com.example.jpa_relation_test.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
