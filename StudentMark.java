import java.util.*;

public class StudentMark{

    public static void addMarks(List<Integer> marks, int mark) {
        marks.add(mark);
    }

    public static double calculateAverage(List<Integer> marks) {

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.size();
    }

    public static int findHighest(List<Integer> marks) {
        return Collections.max(marks);
    }

    public static void displayMarks(List<Integer> marks) {

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}