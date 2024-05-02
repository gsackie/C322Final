package edu.iu.gsackie.C322Final.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "flowers", name = "order")

public class OrderData {
    @Id
    @GeneratedValue

    private long id;
    private String username;
    private String flowerName;

    private String deliveryAddress;
    private String deliveryDate;
    private String firstName;
    private String lastName;
    private Long price;

    public OrderData() {
    }

    public OrderData(long id, String username, String flowerName, String deliveryAddress, String deliveryDate, String firstName, String lastName, Long price) {
        this.id = id;
        this.username = username;
        this.flowerName = flowerName;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(){
        this.username = username;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(){
        this.flowerName = flowerName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(){
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(){
        this.deliveryDate = deliveryDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(){
        this.price = price;
    }






}
