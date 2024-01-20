package week9;

public class InDriveTest {
    public static void main(String[] args) {
        Taxi[] taxiCollection = new Taxi[10];
        taxiCollection[1] = new Taxi(10,20,"Available", 1);
        taxiCollection[2] = new Taxi(7,3,"Available", 2);
        taxiCollection[3] = new Taxi(6,1,"Available", 3);
        taxiCollection[4] = new Taxi(3,2,"Available", 4);

        Person p1 = new Person(2,5);
        // Taxi t = Indrive.<Taxi, Person>findNearestTaxi(taxiCollection, p1);
        for(int i=0; i<taxiCollection.length; i++) {
            if(taxiCollection[i] != null)
                System.out.println(taxiCollection[i]);
        }
        Indrive.<Taxi,Person>distanceWiseList(taxiCollection, p1);
        for(int i=0; i<taxiCollection.length; i++) {
            if(taxiCollection[i] != null)
                System.out.println(taxiCollection[i]);
        }
    }
}


