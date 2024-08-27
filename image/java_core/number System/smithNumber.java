import java.util.Scanner;

public class SmithNumber{

    // Function to calculate the sum of digits of a number
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Function to calculate the sum of prime factors of a number
    static int primeFactorSum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += digitSum(i);
                n /= i;
            }
        }
        return sum;
    }

    // Function to check if a number is a Smith number
    static boolean isSmithNumber(int n) {
        return digitSum(n) == primeFactorSum(n);
    }

    public static void main(String[] args) {
        
        int number = 32;

        // Check if the entered number is a Smith number
        if (isSmithNumber(number)) {
            System.out.println(number + " is a Smith number.");
        } else {
            System.out.println(number + " is not a Smith number.");
        }

    }
}