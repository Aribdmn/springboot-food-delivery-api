package com.pangan.delivery_api.service;

import com.pangan.delivery_api.model.CategoryRevenueDTO;
import com.pangan.delivery_api.model.FoodOrder;
import com.pangan.delivery_api.repository.FoodOrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodOrderService {
    
    private final FoodOrderRepository foodOrderRepository;

    // Constructor injection for the repository
    public FoodOrderService(FoodOrderRepository foodOrderRepository) {
        this.foodOrderRepository = foodOrderRepository;
    }

    public List<FoodOrder> getAllFoodOrders() {
        return foodOrderRepository.findAll();
    }

    public List<CategoryRevenueDTO> getRevenueByCategoryAnalytics() {
        return foodOrderRepository.getRevenueByCategory();
    }

    // public List<FoodOrder> getFoodOrdersByStatus(String status) {
    //     return foodOrderRepository.findByStatusPesanan(status);
    // }

    public FoodOrder createFoodOrder(FoodOrder order) {
        if (order.getIdPesanan() == null || order.getIdPesanan().isEmpty()) {
            throw new IllegalArgumentException("ID Pesanan cannot be null or empty");
        }
        return foodOrderRepository.save(order);
    }

}
