package ua.store.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "products")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private float price;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "image_path")
    private String imagePath;

    private boolean disabled;

    @OneToMany(mappedBy = "product")
    private List<Review> reviews;
}
