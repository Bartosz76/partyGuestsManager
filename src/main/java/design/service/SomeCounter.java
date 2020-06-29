package design.service;

import java.util.Arrays;

public class SomeCounter extends Thread {

    private static int[] values = {1, 2, 3, 4, 5, 6};
    public void run(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                Arrays.stream(values)
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .sum()
        );
        System.out.println("IT WERKS");

    }
}
