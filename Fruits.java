package Fruits;

import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double priceVeg = sc.nextDouble();
        double priceFru = sc.nextDouble();
        double kgVeg = sc.nextDouble();
        double kgFru = sc.nextDouble();
        double finalVeg = priceVeg * kgVeg;
        double finalFru = priceFru * kgFru;
        double leva = finalFru + finalVeg;
        double euro = leva / 1.94;
        System.out.println(euro);


    }
}
