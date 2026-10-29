public class BalanceTools {
    static int newBalance(int balance, int deposit) {
        int Total = balance + deposit;
        return Total;
    }

    static boolean hasAvailableFunds(int balance, int withdrawal) {
        if (balance >= withdrawal) {
            return true;
        } else {
            return false;
        }
    }

    static int annualBondInterest(int openningbalance, double interest) {
        double interestonbalance = openningbalance * interest;
        return (int) interestonbalance;
    }

    static int bondIllustration(int amount, double interest) {
        int amountofinterest = annualBondInterest(amount, interest);
        int expectedbalance = amountofinterest + amount;
        return expectedbalance;
    }

    static int bondIllustration(int openingbalance, double interest, int noofbondyears) {
        int newamount = openingbalance;
        for (int i = 0; i < noofbondyears; i++) {
            newamount = bondIllustration(newamount, interest);
        }
        return newamount;
    }


}