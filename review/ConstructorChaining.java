public class ConstructorChaining {

   
    static class Parent {
        String name;
        int age;

        public Parent() {
           
            this("Unknown", 0);
            System.out.println("Parent(): no-arg constructor finished");
        }

        public Parent(String name) {
         
            this(name, 0);
            System.out.println("Parent(String): single-arg constructor finished");
        }

        public Parent(String name, int age) {
            
            this.name = name;
            this.age = age;
            System.out.println("Parent(String,int): base initialization");
        }

        @Override
        public String toString() {
            return "Parent{name='" + name + "', age=" + age + "}";
        }
    }

   
    static class Child extends Parent {
        String role;

        public Child() {
            
            this("DefaultChild");
            System.out.println("Child(): no-arg constructor finished");
        }

        public Child(String name) {
          
            this(name, 1, "unassigned");
            System.out.println("Child(String): single-arg constructor finished");
        }

        public Child(String name, int age, String role) {
            
            super(name, age);
            this.role = role;
            System.out.println("Child(String,int,String): child initialization (called super)");
        }

        @Override
        public String toString() {
            return "Child{" + "name='" + name + "', age=" + age + ", role='" + role + "'}";
        }
    }

   
    static class Point {
        int x, y, z;

        public Point() {
            
            this(0, 0);
            System.out.println("Point(): no-arg finished");
        }

        public Point(int x, int y) {
            
            this(x, y, 0);
            System.out.println("Point(int,int): two-arg finished");
        }

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
            System.out.println("Point(int,int,int): base initialization");
        }

        @Override
        public String toString() {
            return "Point{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Creating Child with no-arg constructor ---");
        Child c1 = new Child();
        System.out.println("Result: " + c1 + "\n");

        System.out.println("--- Creating Child with (\"Alice\", 30, \"engineer\") ---");
        Child c2 = new Child("Alice", 30, "engineer");
        System.out.println("Result: " + c2 + "\n");

        System.out.println("--- Creating Point with no-arg constructor ---");
        Point p = new Point();
        System.out.println("Result: " + p + "\n");

        System.out.println("--- Creating Point with (2,3) ---");
        Point p2 = new Point(2, 3);
        System.out.println("Result: " + p2 + "\n");

        System.out.println("Documentation:");
        System.out.println("- this(...) calls another constructor in the same class.");
        System.out.println("- super(...) calls a constructor in the parent class and must be the first statement in the constructor.");
    }
}
