package com.example.Proje.repository;

import com.example.Proje.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("select p.unit from Product p where p.id=:productId")
    int checkUnit(@Param("productId") Long productId);
}
