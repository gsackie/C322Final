package edu.iu.gsackie.C322Final.Repository;

import org.springframework.stereotype.Repository;

import edu.iu.gsackie.C322Final.Model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository <Flower, Integer> {

}
