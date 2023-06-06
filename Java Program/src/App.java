class Dep {
    String Depl;
    String Dep2;
}

class Sem extends Dep {
    int sem1;
    int sem2;
}

class Student extends  Dep{
    String student1;
    String student2;
}

public class App {
    public static void main(String[] args) {
        Dep st1 = new Dep();
        st1.Depl = "CS";
        st1.Dep2 = "English";
        Sem st2 = new Sem();
        st2.sem1 = 6;
        st2.sem2 = 8;
        Student st3 = new Student();
        st3.student1 = "Ali";
        st3.student2 = "Ahmed";
        System.out.println("Name: " + st3.student1 + "\nDepartment: " + st1.Depl + "\nSemester: " + st2.sem1);
        System.out.println("\nName: " + st3.student2 + "\nDepartment: " + st1.Dep2 + "\nSemester: " + st2.sem2);
    }
}