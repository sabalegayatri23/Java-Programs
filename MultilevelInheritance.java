class Student {
    String name;
    int rollNo;

    void getStudent(String n, int r) 
{
        name = n;
        rollNo = r;
    }

    void displayStudent()
 {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
class Test1 extends Student {
    int marks1;

    void getMarks1(int m1) {
        marks1 = m1;
    }

    void displayTest1() {
        System.out.println("Test1 Marks: " + marks1);
    }
}

class Test2 extends Test1 {
    int marks2;

    void getMarks2(int m2) {
        marks2 = m2;
    }

    void displayResult() {
        int sum = marks1 + marks2;
        double average = sum / 2;

        displayStudent();
        displayTest1();

        System.out.println("Test2 Marks: " + marks2);
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Test2 obj = new Test2();

        obj.getStudent("Rahul", 101);
        obj.getMarks1(78);
        obj.getMarks2(85);

        obj.displayResult();
    }
}