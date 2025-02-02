package com.ritik.controller;

import com.ritik.model.Food;
import com.ritik.model.User;
import com.ritik.service.FoodService;
import com.ritik.service.RestaurantService;
import com.ritik.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
@Tag(name = "Food APIs")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String name,
                                                 @RequestHeader("Authorization") String jwt) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.searchFood(name);

        return new ResponseEntity<>(foods, HttpStatus.CREATED);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood(
            @RequestParam  boolean vegetarian,
            @RequestParam  boolean seasonal,
            @RequestParam  boolean nonVeg,
            @PathVariable Long restaurantId,
            @RequestParam(required = false) String food_category,
            @RequestHeader("Authorization") String jwt) throws Exception{
        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.getRestaurantsFood(restaurantId,vegetarian,seasonal,nonVeg, food_category);

        return new ResponseEntity<>(foods, HttpStatus.OK);
    }
}
