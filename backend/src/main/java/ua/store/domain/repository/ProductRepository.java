package ua.store.domain.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.store.domain.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId")
    List<Product> findAll(int categoryId, Pageable pageable);

    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId AND lower(p.name) LIKE '%' || :search || '%'")
    List<Product> findAll(int categoryId, Pageable pageable, String search);

    @Query("SELECT p FROM Product p WHERE lower(p.name) LIKE '%' || :search || '%'")
    List<Product> findAll(Pageable pageable, String search);
}
