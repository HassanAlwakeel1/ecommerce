package com.ecommerce.model.entity.enums;

public enum CategoryType {
    ELECTRONICS("Electronics"),
    CLOTHING("Clothing"),
    HOME_KITCHEN("Home & Kitchen"),
    BOOKS("Books"),
    BEAUTY("Beauty & Personal Care"),
    TOYS("Toys & Games"),
    SPORTS("Sports & Outdoors"),
    GROCERY("Grocery & Gourmet Food"),
    AUTOMOTIVE("Automotive"),
    PET_SUPPLIES("Pet Supplies");

    private final String displayName;

    // Constructor for the enum
    CategoryType(String displayName) {
        this.displayName = displayName;
    }

    // Method to retrieve the display name
    public String getDisplayName() {
        return displayName;
    }
}
