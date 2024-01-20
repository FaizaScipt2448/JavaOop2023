package week9;

public class Taxi {
    int locationX;
    int locationY;
    String availability;
    int taxiID;

    public Taxi() {

    }

    public Taxi(int locationX, int locationY, String availability, int taxiID) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.availability = availability;
        this.taxiID = taxiID;
    }

    public int getLocationX() {
        return locationX;
    }

    public void setLocationX(int locationX) {
        this.locationX = locationX;
    }

    public int getLocationY() {
        return locationY;
    }

    public void setLocationY(int locationY) {
        this.locationY = locationY;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public int getTaxiID() {
        return taxiID;
    }

    public void setTaxiID(int taxiID) {
        this.taxiID = taxiID;
    }

    public double calculateFare(double distance) {
        return distance * 10;
    }

    @Override
    public String toString() {
        return String.format("LocationX = %d\tLocationY = %d\tTaxi ID = %d\t Availability: %s",locationX,locationY,taxiID,availability);
    }
}




