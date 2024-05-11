package Codes;

public class student {
    String name;
    String rollNo;
    int age;
    int marks;

    public student(String name, String rollNo, int age, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Student Details: {" +
                "name: " + name + ", " +
                "rollNo: " + rollNo + ", " +
                "age: " + age + ", " +
                "marks: " + marks +
                "}";

    }

    public static void main(String[] args) {
        student Student = new student("Saurav", "2373120", 21, 80);
        System.out.println(Student);

    }

}

/*output =
 * Student Details: {name: Saurav, rollNo: 2373120, age: 21, marks: 80}
 */