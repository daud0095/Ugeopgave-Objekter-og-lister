package Opgave2;

public class Main {
    public static void main(String[] args){

        Product pr1 = new Product("pc", 300, new String[] {"Elektronik", "new"});
        Product pr2 = new Product("Playstation", 500, new String[] {"Elektronik", "sale"});
        Product pr3 = new Product("Iphone", 300, new String[] {"Elektronik"});

        Product[] products = {pr1, pr2, pr3};



//        for(Product p : products){
//            if(p.hasTag("sale")){
//                p.printInfo();
//            }
//        }
    }

}
