import java.util.HashMap;
import java.util.Scanner;
import packagesName.staffDatabase;


class Student {
    private String name;
    private int age;
    private int birthday;
    private String course;
    private int lrn;

    public Student(String name, int age, int birthday, String course, int lrn) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.course = course;
        this.lrn = lrn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBirthday(){
    return birthday;
    }
    
    public String getCourse() {
        return course;
    }

    public int getlrn(){
        return lrn;
    }


}

class Staff{
    private String staffName;
    private int staffAge;
    private int staffBirthday;
    private String staffPosition;

    public Staff(String staffName, int staffAge, int staffBirthday, String staffPosition){
        this.name = staffName;
        this.age = staffAge;
        this.birthday = staffBirthday;
        this.position = staffPosition;
    }

    public String getName() {
        return staffName;
    }

    public int getAge() {
        return staffAge;
    }

    public int getBirthday(){
    return staffBirthday;
    }
    
    public String getPosition() {
        return staffPosition;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "admin123");
        users.put("staff", "staff123");

        System.out.println("Welcome to Marketing System! gikapoy nasad ko haha shift nata");
        System.out.print("Enter your role (admin/staff): ");
        String role = scanner.nextLine();

        if (role.equals("admin") || role.equals("staff")) {
            System.out.print("Enter your username: ");
            scanner.nextLine();
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            if (users.containsKey(role) && users.get(role).equals(password)) {
                System.out.println("Login successful!");

                // Create siyag list to store student information wahaha walang kiss sa tropa

                HashMap<String, Student> studentDatabase = new HashMap<>();
                HashMap<String, Staff> staffDatabase = new HashMap<>();

                while (true) {
                    System.out.println("\nOptions:");
                    System.out.println("1. Add Student");
                    System.out.println("2. View Student Information/List");
                    System.out.println("3. Add Staff");
                    System.out.println("4. View Staff Informarion/List");
                    System.out.println("5. Exit Program");
                    System.out.print("Select an option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    // To consume the newline sa characterteristics sa tao nga walay kiss sa tropa haha

                    switch (option) {
                        case 1:
                            System.out.print("Enter student name: ");
                            String name = scanner.nextLine();
                            System.out.print("Enter student age: ");
                            int age = scanner.nextInt();
                            scanner.nextLine(); 
                            System.out.println("Enter Student Birthday: ");
                            int birthday = scanner.nextInt();
                            scanner.nextLine();
                            
                            // To consume the newline sa characterteristics sa tao nga walay kiss sa tropa haha

                            System.out.print("Enter student course: ");
                            String course = scanner.nextLine();
                            System.out.println("Enter student LRN: ");
                            int lrn = scanner.nextInt();

                            Student student = new Student(name, age, birthday, course, lrn);
                            studentDatabase.put(name, student);
                            System.out.println("Student added successfully!");
                            break;

                        case 2:
                            System.out.print("Enter student name to view information: ");
                            String studentName = scanner.nextLine();
                            if (studentDatabase.containsKey(studentName)) {
                                Student selectedStudent = studentDatabase.get(studentName);
                                System.out.println("Student Name: " + selectedStudent.getName());
                                System.out.println("Student Age: " + selectedStudent.getAge());
                                System.out.println("Student Birthday: " + selectedStudent.getBirthday());
                                System.out.println("Student Course: " + selectedStudent.getCourse());
                                System.out.println("Student LRN: " + selectedStudent.getlrn());

                            } else {
                                System.out.println("Student not found!");
                                return;
                            }
                            break;

                        case 3:
                            System.out.print("Enter staff name: ");
                            String staffName = scanner.nextLine();
                            System.out.print("Enter staff age: ");
                            int staffAge = scanner.nextInt();
                            scanner.nextLine(); 
                            System.out.println("Enter staff Birthday: ");
                            int staffBirthday = scanner.nextInt();
                            scanner.nextLine();
                            
                            // To consume the newline sa characterteristics sa tao nga walay kiss sa tropa haha

                            System.out.print("Enter staff position: ");
                            String staffPosition = scanner.nextLine();

                            Staff staff = new Staff(staffName, staffAge, staffBirthday, staffPosition);
                            staffDatabase.put(staffName, staff);
                            System.out.println("Staff added successfully!");
                            break;

                        case 4:
                            System.out.print("Enter staff name to view information: ");
                            String staffName = scanner.nextLine();
                            if (staffDatabase.containsKey(staffName)) {
                                Staff selectedStaff = staffDatabase.get(staffName);
                                System.out.println("Staff Name: " + selectedStaff.getName());
                                System.out.println("Staff Age: " + selectedStaff.getAge());
                                System.out.println("Staff Birthday: " + selectedStaff.getBirthday());
                                System.out.println("Staff Position: " + selectedStaff.getPosition());

                            } else {
                                System.out.println("Staff not found!");
                                return;
                            }
                            break;

                        case 5:
                            System.out.println("Exiting program.");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid username or password. Please try again.");
                return;
            }

        } else {
            System.out.println("Invalid role. Please choose either 'admin' or 'staff' dili kay mag sige rakag pamataka waa ka HAHAHAHAHAHAHA.");
            return;
        }
    }
}