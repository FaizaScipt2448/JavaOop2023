package Casestudy;

    public class Driver {
        public static void main(String[] args) {
            Inventory inventory=new Inventory();

            Products p1=new Products("Chair",1200.0,12,13.1,ProductType.FURNITURE);
            Electronics e1=new Electronics("Television",50000,23,10000,ProductType.ELECTRONICS,"72MW",new Date(1,3,2027));
            Groceries g1=new Groceries("Milk",120,20,23.5,ProductType.GROCERIES,new Date(1,12,2023),"Calories,Proteins,Fats");
            Smartphone s1=new Smartphone("Nokia",20000,100,5000,ProductType.ELECTRONICS,"12MW",new Date(12,12,2025),"Android","32GB","64MP");

            inventory.addProduct(p1);
            inventory.addProduct(e1);
            inventory.addProduct(g1);
            inventory.addProduct(s1);


            inventory.updateProduct(1,new Products("Laptop",12,12,12,ProductType.ELECTRONICS));
            inventory.updateProduct(2,new Furniture("Desk",1000,123,12.0,ProductType.FURNITURE,"Wood","2-BY-2"));
            inventory.getDetails();

            inventory.searchProduct();

            inventory.removeProducts(3);
            inventory.getDetails();
        }
    }


