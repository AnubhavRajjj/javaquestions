import java.util.Scanner;

public class AddAmount {
    int amount=50;

    AddAmount(){}

    AddAmount(int p){
        amount=p+amount;
    }
    public void total(){
        System.out.println(amount);

    }

    public static void main(String[] args) {
        AddAmount obj=new AddAmount(45);
        obj.total();
    }
}


