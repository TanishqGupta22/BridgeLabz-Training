public class UniversityDemo {

    public static void main(String[] args) {

        Student s = new Student(101, "Rahul");
        s.setCGPA(8.6);
        System.out.println("Student CGPA: " + s.getCGPA());

        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Tanishq", "AI");
        pg.displayDetails();
        pg.setCGPA(9.1);
        System.out.println("PG Student CGPA: " + pg.getCGPA());
    }
}

// ---------------- Student Class ----------------
class Student {

    public int rollNumber;     // public
    protected String name;     // protected
    private double CGPA;       // private

    Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Public setter
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Public getter
    public double getCGPA() {
        return CGPA;
    }
}

// ---------------- Subclass ----------------
class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollNumber, String name, String specialization) {
        super(rollNumber, name);
        this.specialization = specialization;
    }

    void displayDetails() {
        System.out.println("Roll No: " + rollNumber);   // public
        System.out.println("Name: " + name);            // protected
        System.out.println("Specialization: " + specialization);
    }
}
