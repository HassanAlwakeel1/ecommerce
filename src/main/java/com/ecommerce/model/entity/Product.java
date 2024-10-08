package com.ecommerce.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotBlank(message = "Name is mandatory")
    private String name;

    @Column(name = "price")
    @NotNull(message = "Price is mandatory") // Updated from NotBlank to NotNull
    private double price;

    @Column(name = "description")
    private String description;

    @Size(max = 9)
    @ElementCollection
    @Column(name = "image_url")
    private List<String> imageUrls;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // The owner of the product

    @ManyToOne
    @JoinColumn(name = "subcategory_id", nullable = false)
    private Subcategory subcategory; // The subcategory of the product

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category; // The category of the product

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>(); // List of reviews for this product

    public long getNumberOfReviewers() {
        return reviews.stream()
                .map(Review::getUser)
                .distinct()
                .count();
    }
}
