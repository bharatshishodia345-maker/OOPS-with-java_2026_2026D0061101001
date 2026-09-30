import java.util.*;


class Student{
    String name;
    int rollno;
    int marks;

    Student(String n, int r, int m){
        name = n;
        rollno = r;
        marks = m;
    }
}

public class SortingDemo{
    public static void main(String[] args) {
        ArrayList<Integer> i  = new ArrayList<>();
        i.add(23);
        i.add(13);
        i.add(15);
        i.add(25);
        i.add(30);
        i.sort(null);
        // Collection.sort(i:,null)

    System.out.println(i);
    i.sort(Collections.reverseOrder());
    System.out.println(i);
    }
}