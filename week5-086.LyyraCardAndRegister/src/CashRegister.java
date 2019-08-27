
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double PRICE_GOURMET = 4.00;
    private static final double PRICE_ECONOMICAL = 2.5;

    public CashRegister() {
        // at start the register has 1000 euros 
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:

        if (PRICE_ECONOMICAL <= cashGiven) {
            //    the price of lunch is added to register
            cashInRegister += PRICE_ECONOMICAL;
            //    the amount of sold lunch is incremented by one
            economicalSold++;
            //    method returns cashGiven - lunch price 
            return cashGiven - PRICE_ECONOMICAL;
        } else {
            // if not enough money given, all is returned and nothing else happens        
            return cashGiven;
        }
    }

    public double payGourmet(double cashGiven) {

        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        if (PRICE_GOURMET <= cashGiven) {
            cashInRegister += PRICE_GOURMET;
            gourmetSold++;
            return cashGiven - PRICE_GOURMET;

        } else {
            // if not enough money given, all is returned and nothing else happens
            return cashGiven;
        }
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.pay(PRICE_ECONOMICAL)) {
            economicalSold++;

            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.pay(PRICE_GOURMET)) {
            gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (0 <= sum) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
