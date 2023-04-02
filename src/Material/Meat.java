package Material;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Meat extends Material implements Discount {
    private double weight;

    public Meat() {
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return cost * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }


    @Override
    public double getRealMoney() {

        long daysToExpire = manufacturingDate.getDayOfMonth();
        if (daysToExpire <= 5) {
            return getAmount() * 30 / 100;
        } else {
            return getAmount() * 10 / 100;
        }
    }

    @Override
    public String toString() {
        return "Meat {" + getRealMoney() + "}";
    }
}
