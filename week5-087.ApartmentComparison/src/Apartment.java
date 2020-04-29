
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        return this.squareMeters > otherApartment.squareMeters;
    }

    public int priceDifference(Apartment otherApartment) {
        int firstPrice = this.squareMeters * this.pricePerSquareMeter;
        int secondPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (firstPrice > secondPrice) {
            return firstPrice - secondPrice;
        } else {
            return secondPrice - firstPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int firstPrice = this.squareMeters * this.pricePerSquareMeter;
        int secondPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        return firstPrice > secondPrice;
    }
}
