package uberFareexample;

public class Taxi {

        private Location location;

        public Taxi(int x, int y) {
            this.location = new Location(x, y);
        }

        public Location getLocation() {
            return location;
        }

        public double calculateDistance(Location passengerLocation) {
            int x1 = this.location.getX();
            int y1 = this.location.getY();
            int x2 = passengerLocation.getX();
            int y2 = passengerLocation.getY();

            return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        }
    }





