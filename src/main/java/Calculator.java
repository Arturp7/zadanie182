

public class Calculator {

    double calculation(double incomes) {
        double tax = 0;

        if (incomes <= 3091) {
            tax = 0;
        } else if (incomes > 3091 && incomes <= 85528) {
            tax = (incomes * 0.18) - 556.02;
        } else if (incomes > 85_528) {
            tax = 14839 + (0.32 * (incomes - 85528));
        }
        return tax;

    }


}
