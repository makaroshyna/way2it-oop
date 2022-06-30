package org.way2it.oop.homework2.flower;

public class Main {

    public static void main(String[] args) {
        Eustoma eustoma = new Eustoma();
        eustoma.setColor("purple");
        eustoma.setPrice(41);

        Orchid orchid = new Orchid();
        orchid.setColor("purple");
        orchid.setPrice(57);

        Rose whiteRose = new Rose();
        whiteRose.setColor("white");
        whiteRose.setPrice(35);

        Rose pinkRose = new Rose();
        pinkRose.setColor("pink");
        pinkRose.setPrice(38);

        Rose redRose = new Rose();
        redRose.setColor("red");
        redRose.setPrice(30);

        System.out.println("Arranging a new bouquet:");
        System.out.println("Bouquet of 5 eustomas, 3 orchids, 4 white roses and 3 pink roses");
        int bouquetPrice = eustoma.price * 5 + orchid.price * 3 + whiteRose.price * 4 + pinkRose.price * 3;
        System.out.println("Final price: " + bouquetPrice);
    }
}
