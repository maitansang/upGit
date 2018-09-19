package OOP_StudentManager;

public class MainStudentManagerTest {
    public static void main(String[] args) {
        Student andy= new Student("Andy",23);

        System.out.println(andy.getInformation());
        System.out.println("name: "+ andy.getName());
        System.out.println("age: "+ andy.getAge());

        StudentManager studentManager = new StudentManager();
        studentManager.add(andy);
        System.out.println("added"+andy.getInformation());
        studentManager.displayAll();

        Student booby = new Student("Booby",25 );
        studentManager.add(booby);
        System.out.println("added " +booby.getInformation());
        studentManager.displayAll();

        Student samy = new Student("Samy",22 );
        studentManager.add(samy);
        System.out.println("added " +samy.getInformation());
        studentManager.displayAll();

        studentManager.find("Samy");
    }
}

