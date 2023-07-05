package bt4;
import java.util.Scanner;
public class Student {

    public String name ;
    public int age ;
    public String className ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public Student (String name ,int age , String className){
        this.name = name ;
        this.age = age;
        this.className = className;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("name");
        String name1 = scanner.nextLine();

        System.out.println("age");
        int age1= scanner.nextInt();
        scanner.nextLine();
        //6 + enter

        System.out.println("className");
        String className1 = scanner.nextLine();
        //enter

        Student student1 = new Student(name1,age1,className1);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getClassName());

    }
}
