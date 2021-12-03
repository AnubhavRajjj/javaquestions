import java.util.Objects;

public class Programming {
    String a;

    Programming(String a){
        this.a=a;

    }
    public void print(){
        if(Objects.equals(a, " ")){
            System.out.println("I love programming languages");
        }
        else{
            System.out.println( "I love"+a);
        }
    }

    public static void main(String[] args) {
        Programming obj=new Programming( " Java");
        obj.print();
    }
}
