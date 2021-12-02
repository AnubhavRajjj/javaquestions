public class Student {
    String name;
    int age;
    String address;

    Student(){
        name= "unknown";
        age=0;
        address="not available";

    }
    public void setInfo(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println(name+" "+age);

    }
    public void setInfo(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
        System.out.println(name+" " +age+ " "+ address);

    }

    public static void main(String[] args) {
        Student obj=new Student();
        obj.setInfo("Samar",20,"Bombay");
    }
}
