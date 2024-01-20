package uberFareexample;



    class Passenger {
        private Location location;

        public Passenger(int x, int y) {
            this.location = new Location(x, y);
        }

        public Location getLocation() {
            return location;
        }
    }



