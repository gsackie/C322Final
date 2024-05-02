package edu.iu.gsackie.C322Final.Controllers;

import edu.iu.gsackie.C322Final.Model.Flower;
import edu.iu.gsackie.C322Final.Repository.FlowerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/flowers")
public class FlowerController {
    private final FlowerRepository flowerRepository;

    public FlowerController(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @GetMapping
    public ResponseEntity<List<Flower>> getAllFlowers() {
        try {
            List<Flower> flowers = flowerRepository.findAll();
            return new ResponseEntity<>(flowers, HttpStatus.OK);
        } catch (Exception e) {
            // Log the exception
            System.out.println("Error fetching flowers: " + e.getMessage());
            // Return an appropriate response
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public Flower createFlower(@RequestBody Flower flower) {
        return flowerRepository.save(flower);
    }





}