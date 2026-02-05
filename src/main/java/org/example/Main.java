package org.example;

import org.example.model.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bedroom bedroom=new Bedroom("Tolga",new Wall("left"),new Wall("right"),new Wall("up"),new Wall("down"),new Ceiling(50,PaintColor.GREEN),
                new Bed("square",2,3,5,5),new Lamp(LampType.NEON,true,5),new Wardrobe(12,12,13.5),new Carpet(12,15,PaintColor.GREEN));

        System.out.println(bedroom.getCarpet().getColor());
    }
}