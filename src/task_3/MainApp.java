package task_3;

import task_2.Worker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Price [] prices = new Price[2];
        String productName = "";
        String storeName = "";
        double priceValue = 0.0;

        for (int i = 0; i < 2; i++) {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter the product name:");
            productName = in.nextLine();
            System.out.println("Enter the store name:");
            storeName = in.nextLine();
            System.out.println("Enter the price:");
            priceValue = in.nextDouble();

            prices[i] = new Price(productName, storeName, priceValue);
        }

        // sorting the array by store name
        Arrays.sort(prices, new Comparator<Price>() {
            @Override
            public int compare(Price priceFirst, Price priceSecond) {
                return priceFirst.getStore().compareTo(priceSecond.getStore());
            }
        });
        System.out.println(Arrays.deepToString(prices));

        Scanner in = new Scanner (System.in);
        System.out.println("Enter the required store name:");
        String requiredStore = in.nextLine();

        int count = 0;
        for(Price p : prices) {
            if ( p.getStore().equals(requiredStore) ) {
                System.out.println(p);
                count++;
            }
        }

        try {
            if (count == 0) {
                throw new Exception();
            }
        }
        catch (Exception o) {
            System.out.println("There are no products at the indicated store.");
        }

    }

}
