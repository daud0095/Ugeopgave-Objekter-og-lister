package Opgave2;

public class Product {
    String name;
    double price;
    String[] tags;

    Product(String name, double price, String[] tags){
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public void printInfo(){
        System.out.println(name + " price: " + price);
        for(int i = 0; i < tags.length; i++){
            System.out.println(tags[i]);
        }
    }

    public boolean hasTag(String tag){
        for(String s : tags){
           if(tags.equals(tag)){
               return true;
           }
        }
        return false;
    }
}
