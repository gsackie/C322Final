package edu.iu.gsackie.C322Final.Model;

public class Flower {
    private int id;
    private String name;
    private String image;
    private double price;
    private String type;

    public Flower(int id, String name, String image, double price, String type) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}