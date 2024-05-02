package edu.iu.gsackie.C322Final.Controllers;

import edu.iu.gsackie.C322Final.Model.OrderData;
import edu.iu.gsackie.C322Final.Repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody OrderData order) {
        try {
            orderRepository.save(order);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Order created successfully");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    @GetMapping("/{username}")
    public ResponseEntity<?> check(@PathVariable String username) {
        HashMap<String, List<OrderData>> result = new HashMap<>();

        try {
            List<OrderData> orders = orderRepository.findByUsername(username);
            result.put("orders", orders);

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(result);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}