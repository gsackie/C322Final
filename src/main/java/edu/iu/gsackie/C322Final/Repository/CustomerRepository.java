package edu.iu.gsackie.C322Final.Repository;

import edu.iu.gsackie.C322Final.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByUsername(String username);

}
