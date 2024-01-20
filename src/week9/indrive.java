package week9;

public class indrive {

    public void addTaxi(Taxi[] taxis) {
        for(int i=0; i<taxis.length; i++) {
            if(taxis[i] == null) {
                taxis[i] = new Taxi();
            }
        }
    }

    public static<K,V> void distanceWiseList(Taxi[] taxis, Person person) {
        for(int i=0; i<taxis.length; i++) {
            for(int j=0; j<taxis.length-1; j++) {
                if(taxis[j] != null && taxis[j+1]!=null) {
                    double distance = Math.sqrt(Math.pow(taxis[j].locationX - person.personLocationX, 2) + Math.pow(taxis[j].locationY - person.personLocationY, 2));
                    double distance2 = Math.sqrt(Math.pow(taxis[j+1].locationX - person.personLocationX, 2) + Math.pow(taxis[j+1].locationY - person.personLocationY, 2));
                    if(distance2 <= distance) {
                        Taxi temp = taxis[j];
                        taxis[j] = taxis[j+1];
                        taxis[j+1] = temp;
                    }
                }
            }
        }
    }
    public static<T,V> Taxi findNearestTaxi(Taxi[] taxis, Person person) {
        Taxi t = null;
        double min = Math.sqrt(Math.pow(taxis[0].locationX - person.personLocationX, 2) + Math.pow(taxis[0].locationY - person.personLocationY, 2));
        for(int i = 0; i<taxis.length; i++) {
            if(taxis[i] != null) {
                double distance = Math.sqrt(Math.pow(taxis[i].locationX - person.personLocationX, 2) + Math.pow(taxis[i].locationY - person.personLocationY, 2));
                if(distance<= min) {
                    min = distance;
                    t = taxis[i];
                }
            }
        }
        // System.out.println("The fare is: " +t.calculateFare(min));
        return t;
    }
}


