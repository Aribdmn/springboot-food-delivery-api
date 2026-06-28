package com.pangan.delivery_api.repository;

import com.pangan.delivery_api.model.CategoryRevenueDTO;
import com.pangan.delivery_api.model.FoodOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, String> {

    @Query(
        "SELECT new com.pangan.delivery_api.model.CategoryRevenueDTO(o.kategoriMenu, SUM(o.hargaPesanan)) " +
        "FROM FoodOrder o " +
        "GROUP BY o.kategoriMenu " +
        "ORDER BY SUM(o.hargaPesanan) DESC"
    )

    List<CategoryRevenueDTO> getRevenueByCategory();
    //List<FoodOrder> findByStatusPesanan(String status);
}
