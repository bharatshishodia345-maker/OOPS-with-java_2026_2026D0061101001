class Pen{
    String colour;
    String type;
    
    public void write(){
        System.out.println("Write Somthing");
    }
    public void colour(){
        System.out.println(this.colour);
    }
    public void type(){
        System.out.println(this.type);
    }

}

class Student{
    String name;
    int Age;
    String Brench;

    // public void StduInfo(){
    //     System.out.println(this.name);
    //     System.out.println(this.Age);
    //     System.out.println(this.Brench);

    // }
    // Student(){
    //     System.out.println("Construted calling");
    // }

    // Student(String name, int Age){
    //     this.name = name;
    //     this.Age = Age;
    // }

    public void stuinfo(String name){
        System.out.println(this.name);
    }
    public void stuinfo(int age){
        System.out.println(this.Age);
    }
    public void stuinfo(String name,int Age,String Brench){
        System.out.println(this.name);
        System.out.println(this.Age);
        System.out.println(this.Brench);
    }
}


public class oops {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Bharat";
        student.Age = 19;
        student.Brench = "Information Technology";

        student.stuinfo(student.name);
        student.stuinfo(student.name,student.Age,student.Brench);
        student.stuinfo(student.Age);










        // Pen pen1 = new Pen();
        // pen1.colour = "Blue";
        // pen1.type = "Gel";

        // Pen pen2 = new Pen();
        // pen2.colour = "Black";
        // pen2.type = "Boll";


        // pen1.colour();
        // pen1.type();
        // pen2.colour();
        // pen2.type();
        // pen1.write();
    

        
    }
} 

