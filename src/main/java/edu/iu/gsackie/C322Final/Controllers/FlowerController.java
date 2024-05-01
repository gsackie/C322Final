package edu.iu.gsackie.C322Final.Controllers;

import edu.iu.gsackie.C322Final.Model.Flower;
import edu.iu.gsackie.C322Final.Repository.FlowerRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }





}