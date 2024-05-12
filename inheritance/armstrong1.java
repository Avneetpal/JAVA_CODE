// Base class to perform number operations
import java.util.*;
class NumberOperations {
    public int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}

// Derived class to check for Armstrong numbers
class ArmstrongChecker extends NumberOperations {
    public boolean isArmstrong(int number) {
        int originalNumber = number;
        int n = countDigits(number);
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += calculatePower(digit, n);
            number /= 10;
        }
        return sum == originalNumber;
    }
}

 class Main {
    public static void main(String[] args) {
        ArmstrongChecker armstrongChecker = new ArmstrongChecker();
        Scanner ob=new Scanner(System.in);
        int number  = ob.nextInt(); // Change this number to check for different Armstrong numbers
        if (armstrongChecker.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
