package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.are= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid.width= " + cuboid.getWidth());
        System.out.println("Cuboid.length= " + cuboid.getLength());
        System.out.println("Cuboid.area= " + cuboid.getArea());
        System.out.println("Cuboid.height= " + cuboid.getHeight());
        System.out.println("Cuboid.volume= " + cuboid.getVolume());
    }
}
