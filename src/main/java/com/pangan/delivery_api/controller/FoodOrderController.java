package com.pangan.delivery_api.controller;

import com.pangan.delivery_api.model.CategoryRevenueDTO;
import com.pangan.delivery_api.model.FoodOrder;
import com.pangan.delivery_api.service.FoodOrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/orders")
public class FoodOrderController {
    
    private final FoodOrderService foodOrderService;

    public FoodOrderController(FoodOrderService foodOrderService) {
        this.foodOrderService = foodOrderService;
    }

    @GetMapping
    public ResponseEntity<List<FoodOrder>> getAll() {
        return ResponseEntity.ok(foodOrderService.getAllFoodOrders());
    }

    @GetMapping("/analytics/revenue-by-category")
    public ResponseEntity<List<CategoryRevenueDTO>> getRevenueByCategory(){
        return ResponseEntity.ok(foodOrderService.getRevenueByCategoryAnalytics());
    }
    

    // @GetMapping("/status/{status}")
    // public ResponseEntity<List<FoodOrder>> getByStatus(@PathVariable String status) {
    //     return ResponseEntity.ok(foodOrderService.getFoodOrdersByStatus(status));
    // }

    @PostMapping
    public ResponseEntity<FoodOrder> create(@RequestBody FoodOrder order) {
        FoodOrder savedOrder = foodOrderService.createFoodOrder(order);
        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
    }
}
