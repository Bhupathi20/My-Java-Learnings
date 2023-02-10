
public class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(55);
        obj.setName("raazu");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

class Human{
   private int age = 25;
   private String name = "Bhupattii";

   public int getAge(){
    return age;
   }
    public String getName() {
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }

     
}
