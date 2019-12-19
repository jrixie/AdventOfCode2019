import java.util.Scanner;

public class main1_1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int count = 0;

        while(s1.hasNext()) {
            int fuel = (s1.nextInt() / 3) - 2;
            count += fuel;

            fuel = (fuel / 3) - 2;
            while(fuel > 0) {
                count += fuel;
                fuel = (fuel / 3) - 2;
            }
        }

        System.out.println("Here: " + count);

    }
}
