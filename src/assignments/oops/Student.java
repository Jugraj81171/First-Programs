package assignments.oops;

public class Student<T,R>{
    T roll_no;
    R name;

    public Student(T roll_no, R name) {
        this.roll_no = roll_no;
        this.name = name;
    }
    public void studentInfo(){
        System.out.println("Student Roll No:"+roll_no);
        System.out.println("Student Name:"+name);
    }

    public static void main(String[] args) {
        Student <Integer,String> student=new Student<Integer,String>(45,"Jugraj");
        student.studentInfo();

    }

}
