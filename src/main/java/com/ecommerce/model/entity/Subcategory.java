package com.ecommerce.model.entity;

import com.ecommerce.model.entity.enums.SubcategoryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "subcategories")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Subcategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private SubcategoryType type; // Use the enum for subcategory type

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category; // Reference to the parent category
}
