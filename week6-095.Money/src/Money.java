
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        Money plus = new Money(added.euros() + this.euros, added.cents + this.cents);
        return plus;
    }

    public boolean less(Money compared) {
        if (compared.euros == this.euros() && compared.cents < this.cents) {
            return false;
        }
        if (compared.euros < this.euros) {
            return false;
        }
        return true;
    }

    public Money minus(Money decremented) {
        Money minus = new Money(0, 0);
        int euroHelper = 0;
        int centHelper = 0;
        int euros1 = this.euros - decremented.euros();
        int cents1 = this.cents - decremented.cents();
        if (this.cents < decremented.cents) {
            euroHelper = euros1 - 1;
            centHelper = 100 - decremented.cents;
            return minus = new Money(euroHelper, centHelper);
        }
        if (this.euros < decremented.euros) {
            return minus;
        }
        return minus = new Money(euros1, cents1);
    }

}
