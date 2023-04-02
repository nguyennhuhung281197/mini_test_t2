package Material;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CrispyFlour[] arr = new CrispyFlour[5];

        arr[0] = new CrispyFlour("1", "A", LocalDate.of(2023, 1, 10), 1, 20);
        arr[1] = new CrispyFlour("2", "B", LocalDate.of(2023, 2, 20), 2, 20);
        arr[2] = new CrispyFlour("3", "C", LocalDate.of(2023, 3, 3), 3, 3);
        arr[3] = new CrispyFlour("4", "D", LocalDate.of(2023, 4, 4), 4, 4);
        arr[4] = new CrispyFlour("5", "E", LocalDate.of(2023, 5, 5), 5, 5);
        for (int i = 0; i < arr.length; i++) {
            arr[i].getRealMoney();
            int sum = 0;
            sum += arr[i].getAmount() - arr[i].getRealMoney();
            System.out.println("Tổng Tiền đã được khuyến mãi của bột : " + sum);
        }
        System.out.println("Tiền chênh lệch của bột : " + Arrays.toString(arr));

        System.out.println();

        Meat[] arr1 = new Meat[5];

        arr1[0] = new Meat("6", "F", LocalDate.of(2023, 6, 1), 6, 10);
        arr1[1] = new Meat("7", "G", LocalDate.of(2023, 7, 7), 7, 20);
        arr1[2] = new Meat("8", "H", LocalDate.of(2023, 8, 2), 8, 30);
        arr1[3] = new Meat("9", "J", LocalDate.of(2023, 9, 9), 9, 40);
        arr1[4] = new Meat("10", "K", LocalDate.of(2023, 10, 10), 10, 50);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i].getRealMoney();
            int sum1 = 0;
            sum1 += arr1[i].getAmount() - arr1[i].getRealMoney();
            System.out.println("Tổng tiền đã khuyến mãi của thịt : " + sum1);
        }
        System.out.println("Tiền chênh lệnh của thịt : " + Arrays.toString(arr1));
    }

}



