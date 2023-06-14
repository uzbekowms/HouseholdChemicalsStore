package ua.store.domain.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.store.domain.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId AND (lower( p.name ) LIKE '%' || lower(:search) ||'%' OR lower(p.description) LIKE '%' || lower(:search) )")
    List<Product> findAll(Pageable pageable, int categoryId, String search);

}
