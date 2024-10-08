package com.ecommerce.model.entity.enums;

public enum SubcategoryType {
    // Subcategories for ELECTRONICS
    MOBILE_PHONES("Mobile Phones", CategoryType.ELECTRONICS),
    LAPTOPS("Laptops", CategoryType.ELECTRONICS),
    TELEVISION("Television", CategoryType.ELECTRONICS),
    HEADPHONES("Headphones", CategoryType.ELECTRONICS),
    CAMERAS("Cameras", CategoryType.ELECTRONICS),

    // Subcategories for CLOTHING
    MEN_CLOTHING("Men's Clothing", CategoryType.CLOTHING),
    WOMEN_CLOTHING("Women's Clothing", CategoryType.CLOTHING),
    KIDS_CLOTHING("Kids' Clothing", CategoryType.CLOTHING),
    SHOES("Shoes", CategoryType.CLOTHING),
    CLOTHING_ACCESSORIES("Clothing Accessories", CategoryType.CLOTHING), // Renamed

    // Subcategories for HOME & KITCHEN
    FURNITURE("Furniture", CategoryType.HOME_KITCHEN),
    KITCHEN_APPLIANCES("Kitchen Appliances", CategoryType.HOME_KITCHEN),
    BEDDING("Bedding", CategoryType.HOME_KITCHEN),
    DECOR("Home Decor", CategoryType.HOME_KITCHEN),
    STORAGE("Storage & Organization", CategoryType.HOME_KITCHEN),

    // Subcategories for BOOKS
    FICTION("Fiction", CategoryType.BOOKS),
    NON_FICTION("Non-Fiction", CategoryType.BOOKS),
    CHILDRENS_BOOKS("Children's Books", CategoryType.BOOKS),
    TEXTBOOKS("Textbooks", CategoryType.BOOKS),
    COOKBOOKS("Cookbooks", CategoryType.BOOKS),

    // Subcategories for BEAUTY
    SKINCARE("Skincare", CategoryType.BEAUTY),
    HAIRCARE("Haircare", CategoryType.BEAUTY),
    MAKEUP("Makeup", CategoryType.BEAUTY),
    FRAGRANCES("Fragrances", CategoryType.BEAUTY),
    BEAUTY_ACCESSORIES("Beauty Accessories", CategoryType.BEAUTY), // Renamed

    // Subcategories for TOYS
    ACTION_FIGURES("Action Figures", CategoryType.TOYS),
    PUZZLES("Puzzles", CategoryType.TOYS),
    DOLLS("Dolls", CategoryType.TOYS),
    BOARD_GAMES("Board Games", CategoryType.TOYS),
    EDUCATIONAL_TOYS("Educational Toys", CategoryType.TOYS),

    // Subcategories for SPORTS
    OUTDOOR_EQUIPMENT("Outdoor Equipment", CategoryType.SPORTS),
    GYM_EQUIPMENT("Gym Equipment", CategoryType.SPORTS),
    TEAM_SPORTS("Team Sports", CategoryType.SPORTS),
    FITNESS_APPAREL("Fitness Apparel", CategoryType.SPORTS),

    // Subcategories for GROCERY
    SNACKS("Snacks", CategoryType.GROCERY),
    BEVERAGES("Beverages", CategoryType.GROCERY),
    CANNED_GOODS("Canned Goods", CategoryType.GROCERY),
    FROZEN_FOOD("Frozen Food", CategoryType.GROCERY),

    // Subcategories for AUTOMOTIVE
    AUTO_PARTS("Auto Parts", CategoryType.AUTOMOTIVE),
    AUTOMOTIVE_ACCESSORIES("Automotive Accessories", CategoryType.AUTOMOTIVE), // Renamed
    TIRES("Tires", CategoryType.AUTOMOTIVE),

    // Subcategories for PET SUPPLIES
    DOG_SUPPLIES("Dog Supplies", CategoryType.PET_SUPPLIES),
    CAT_SUPPLIES("Cat Supplies", CategoryType.PET_SUPPLIES),
    BIRD_SUPPLIES("Bird Supplies", CategoryType.PET_SUPPLIES);

    private final String displayName;
    private final CategoryType parentCategory; // Reference to the parent category

    // Constructor for the enum
    SubcategoryType(String displayName, CategoryType parentCategory) {
        this.displayName = displayName;
        this.parentCategory = parentCategory;
    }

    // Method to retrieve the display name
    public String getDisplayName() {
        return displayName;
    }

    public CategoryType getParentCategory() {
        return parentCategory;
    }
}
