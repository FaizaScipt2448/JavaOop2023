package Casestudy;


    public class Smartphone extends Electronics{
        private String operatingSystem;
        private String storageCapacity;
        private String cameraResolution;

        Smartphone(String name, double price, int stockQuantity, double taxationSpecifics,ProductType category, String powerConsumption, Date warranty,String operatingSystem,String storageCapacity,String cameraResolution){
            super(name,price,stockQuantity,taxationSpecifics,category,powerConsumption,warranty);
            this.operatingSystem=operatingSystem;
            this.storageCapacity=storageCapacity;
            this.cameraResolution=cameraResolution;
        }

        public String getOperatingSystem() {
            return operatingSystem;
        }

        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }

        public String getStorageCapacity() {
            return storageCapacity;
        }

        public void setStorageCapacity(String storageCapacity) {
            this.storageCapacity = storageCapacity;
        }

        public String getCameraResolution() {
            return cameraResolution;
        }

        public void setCameraResolution(String cameraResolution) {
            this.cameraResolution = cameraResolution;
        }

        @Override
        public String toString(){
            return String.format("%-23s %-7s %-13s %-17s",super.toString(),operatingSystem,storageCapacity,cameraResolution);
        }

    }


