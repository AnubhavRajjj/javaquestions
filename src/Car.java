public class Car {
    String man,man1,man2;
    int price,price1,price2;


    Car(String man,String man1,String man2,int price,int price1,int price2 ){
        this.man=man;
        this.price=price;
        this.man1=man1;
        this.man2=man2;
        this.price1=price1;
        this.price2=price2;

    }
    public void display(){
        if(price>price1 && price>price2){
            System.out.println("the manufacturer is"+" "+man);
            System.out.println("the price is"+" "+price);
        }
        else if(price1>price && price1>price2){
            System.out.println("the manufacturer is"+" "+man1);
            System.out.println("the price is"+" "+price1);
        }
        else if(price2>price && price2>price1){
            System.out.println("the manufacturer is"+" "+man2);
            System.out.println("the price is"+"  "+price2);
        }
        else{
            System.out.println("the manufacturer is not available");
            System.out.println("the price is not available");
        }

    }

    public static void main(String[] args) {
        Car obj = new Car("aaa","bbb","ccc",900000,5000000,600000);
        obj.display();
    }

}


