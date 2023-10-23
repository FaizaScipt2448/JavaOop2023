package Casestudy;



    public class AudioDevices extends Electronics{

        AudioDevices(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, String powerConsumption, Date warranty){
            super(name,price,stockQuantity,taxationSpecifics,category,powerConsumption,warranty);
        }

        @Override
        public String toString() {
            return String.format("%s",super.toString());
        }
    }

