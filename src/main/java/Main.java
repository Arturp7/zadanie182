import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje dochody");
        double incomes = scan.nextDouble();
        Calculator calculator = new Calculator();
        System.out.print("Podatek do zapłaty wynosi : ");
        System.out.printf("%.0f%n", calculator.calculation(incomes));
    }
}
