import java.util.*;


class Student implements Comparable<Student>{
    String name;
    int rollno;
    int marks;

    Student(String n, int r, int m){
        name = n;
        rollno = r;
        marks = m;
    }
    @Override 
    public int compareTo(Student o){
        return this.rollno - o.rollno;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return rollno+ " " + name+" "+ marks;
    }
}
class CustomComparator implements Comparator<Student>{
    @Override 
    public int compare(Student o1, Student o2){
        if (o1.marks != o2.marks){
            return o2.marks - o1.marks; 
        }
        return o1.rollno - o2.rollno;
    }
}

class NameComparator implements Comparator<Student>{
    @Override 
    public int compare(Student s1, Student s2){
       return s1.name.compareTo(s2.name);
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
        ArrayList<Student> st = new ArrayList<>();

        st.add(new Student("rahul", 1, 150));
        st.add(new Student("Bharat", 2, 120));
        st.add(new Student("Madan", 3, 160));
        st.add(new Student("Prathvi", 4, 130));
        st.add(new Student("Tarun", 5, 140));
        st.add(new Student("Ayush", 6, 170));
        st.sort(null);
        System.out.println(st);
        st.sort(new CustomComparator());
        System.out.println(st);
        st.sort(new NameComparator());
        System.out.println(st);
    }
}


