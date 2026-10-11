import java.util.*;

class Student {
    String name;
    int[] marks;

    Student(String n, int[] m) {
        name = n;
        marks = m;
    }

    double average() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    char grade() {
        double a = average();

        if (a >= 75) return 'B';
        if (a >= 60) return 'C';
        if (a >= 40) return 'D';
        return 'F';
    }
}

public class StudentResultCard {
    public static void main(String[] args) {
        Student s1 = new Student("Asha", new int[]{80, 90, 70});
        Student s2 = new Student("Ravi", new int[]{60, 55, 50});

        print(s1);
        print(s2);
    }

    static void print(Student s) {
        System.out.printf("%s: Average %.1f, Grade %c%n",
                s.name.toUpperCase(), s.average(), s.grade());
    }
}
