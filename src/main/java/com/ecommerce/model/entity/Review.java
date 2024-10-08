package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reviews")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // The user who wrote the review

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product; // The product being reviewed

    @Column(name = "rating")
    private int rating; // Rating out of 5

    @Column(name = "comment")
    private String comment; // User's comment on the product
}
