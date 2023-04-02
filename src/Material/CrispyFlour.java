package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CrispyFlour extends Material implements Discount {
    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {

        long daysToExpire = manufacturingDate.getMonthValue();
        if (daysToExpire <= 2) {
            return getAmount() * 40 / 100;
        } else if (daysToExpire > 2 && daysToExpire <= 4) {
            return getAmount() * 20 / 100;
        }else {
            return getAmount() * 5 /100;
        }

    }

    @Override
    public String toString() {
        return "CrispyFlour { " + getRealMoney() + "}";
    }
    //    @Override
//    public double getRealMoney() {
//
//        if (daysToExpire <= 5) {
//            return getAmount() * 30 / 100;
//        } else {
//            return getAmount() * 10 / 100;
//        }
//    }

}
