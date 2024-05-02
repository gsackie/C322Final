package edu.iu.gsackie.C322Final.Repository;

import edu.iu.gsackie.C322Final.Model.OrderData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderData, Integer> {
    List<OrderData> findByUsername(String username);


}
