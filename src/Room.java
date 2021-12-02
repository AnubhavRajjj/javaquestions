import java.util.Scanner;

public class Room {
    boolean ac;
    boolean htheatre;
    boolean fan;
    boolean light;
    int p;

    Room(){
        Scanner s =new Scanner(System.in);
        ac=s.nextBoolean();
        htheatre=s.nextBoolean();
        fan=s.nextBoolean();
        light=s.nextBoolean();
    }
    public void message(){
        int ac0;
        int htheatre0;
        int fan0;
        int light0;
        if (ac == true || htheatre == true || fan == true || light == true) {
            ac0=1200;
            htheatre0=600;
            fan0=400;
            light0=100;

        }
        else{
            ac0=0;
            htheatre0=0;
            fan0=0;
            light0=0;
        }
        p=(ac0+htheatre0+fan0+light0);
        if(p>2000){
            System.out.println("overload");
        }
        else{
            System.out.println("All okk");
        }


    }

    public static void main(String[] args) {
        Room obj1 = new Room();
        obj1.message();
    }


}
