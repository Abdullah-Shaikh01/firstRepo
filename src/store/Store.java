package store;

interface Taxable{
    double TAXRATE = 0.06;
    double calculateTax();
}

class Goods{
    String description;
    double price;
    
    Goods(String des,double pri){
        description = des;
        price = pri;
    }
    
    void display(){
        System.out.println("\nDescription : "+description);
        System.out.println("Price : "+price);
    }
}

class Toy extends Goods implements Taxable{
    int minimumAge;
    Toy(String des,double pri,int min){
        super(des,pri);
        minimumAge = min;
    }
    
    @Override
    public double calculateTax(){
        return price*TAXRATE;
    }
    
    void display(){
        super.display();
        System.out.println("Tax :" +calculateTax());
    }
}

class Food extends Goods{
        double calories;
        Food(String des,double pr,double cal){
            super(des,pr);
            calories=cal;
        }
        
        void display(){
            super.display();
            System.out.println("calories ="+calories);
        }        
}

class Book extends Goods implements Taxable{
    String author;
        
    Book(String des,double pr,String auth){
        super(des,pr);
        author=auth;
    }
        
    void display(){
        super.display();
        System.out.println("Author= "+author);
    }
      
    public double calculateTax(){
        return price*TAXRATE;
    }
        
}
public class Store {

    public static void main(String[] args) {
        Goods obj=new Goods("Soap",12);
        Food obj1=new Food("Potato",4.45,1500);
        Book obj2=new Book("Emma",24.95,"Austen");
        Toy obj3=new Toy("Legos",54.45,8);
     
        obj.display();
        obj1.display();
        obj2.display();
        System.out.println("Tax is "+obj2.calculateTax()+"\n");
        obj3.display();
        System.out.println("Tax is "+obj3.calculateTax()+"\n");
    }
 
}