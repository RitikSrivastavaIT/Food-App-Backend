package com.ritik.service;

import com.ritik.model.Category;
import com.ritik.model.Food;
import com.ritik.model.Restaurant;
import com.ritik.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public  List<Food> getRestaurantsFood(Long restaurantId,
                                          boolean isVegetarian,
                                          boolean isNonVeg,
                                          boolean isSeasonal,
                                          String foodCategory);
    public List<Food> searchFood(String keyword);
    public Food findFoodById(Long foodId) throws Exception;

    public Food updateAvailabilityStatus(Long foodId) throws Exception;
}
