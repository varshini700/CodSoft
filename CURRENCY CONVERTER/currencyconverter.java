import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class currencyconverter{
    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("1 Rupee to USD");
        System.out.println("2 Rupee to Euro");
        System.out.println("3 Rupee to UAE Dirham");
        System.out.println("4 USD to Rupee");
        System.out.println("5 Euro to Rupee");
        System.out.println("6 UAE Dirham to Rupee");
        System.out.print("Enter your choice (1 or 2 or 3 or 4 or 5 or 6): ");
        int choice = scanner.nextInt();

       
        if (choice == 1) {
            System.out.print("Enter the amount in Rupee: ");
            double Rupee = scanner.nextDouble();
            double USD = RupeeToUsd(Rupee);
            System.out.println("Converted amount in USD: " + USD);

        } 
            else if (choice == 2) {
                System.out.print("Enter the amount in Rupee: ");
                double Rupee = scanner.nextDouble();
                double Euro = RupeeToEuro(Rupee);
                System.out.println("Converted amount in Euro: " + Euro);
        }
            else if (choice == 3) {
                System.out.print("Enter the amount in Rupee: ");
                double Rupee = scanner.nextDouble();
                double UAEDirham = RupeeToUaeDirham(Rupee);
                System.out.println("Converted amount in UAEDirham : " + UAEDirham);
        } 
            else if (choice == 4) {
                System.out.print("Enter the amount in USD: ");
                double USD = scanner.nextDouble();
                double Rupee = UsdToRupee(USD);
                System.out.println("Converted amount in Rupee: " + Rupee);
        }
            else if (choice == 5) {
                System.out.print("Enter the amount in Euro: ");
                double Euro = scanner.nextDouble();
                double Rupee = euroToRupee(Euro);
                System.out.println("Converted amount in Rupee: " + Rupee);
        }
            else if (choice == 6) {
                System.out.print("Enter the amount in UAEDirham: ");
                double UAEDirham = scanner.nextDouble();
                double Rupee = UaeDirhamToRupee(UAEDirham);
                System.out.println("Converted amount in Rupee: " + Rupee);
        }
       
        else {
            System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4 or 5 or 6.");
        }

        scanner.close();
    }

    public static double RupeeToUsd(double Rupee) {
        return Rupee * 0.012; 
    }
    public static double RupeeToEuro(double Rupee) {
        return Rupee * 0.011;   
    }
    public static double RupeeToUaeDirham(double Rupee) {
        return Rupee * 0.044;  
    }
    public static double UsdToRupee(double USD) {
        return USD * 83.52;   
    }
    public static double euroToRupee(double Euro) {
        return Euro * 91.21;   
    }
    public static double UaeDirhamToRupee(double UAEDirham) {
        return UAEDirham * 22.74;   
    }
}

import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}

public class Studentmanagement_System{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("1 Add Student");
            System.out.println("2 Remove Student");
            System.out.println("3 Search Student");
            System.out.println("4 Display All Students");
            System.out.println("5 Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();

                    Student newStudent = new Student(name, rollNumber, grade);
                    sms.addStudent(newStudent);
                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    boolean removed = sms.removeStudent(rollToRemove);
                    if (removed) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter roll number of student to search: ");
                    int rollToSearch = scanner.nextInt();
                    Student searchedStudent = sms.searchStudent(rollToSearch);
                    if (searchedStudent != null) {
                        System.out.println("Student found:");
                        System.out.println(searchedStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    List<Student> allStudents = sms.getAllStudents();
                    if (allStudents.isEmpty()) {
                        System.out.println("No students to display.");
                    } else {
                        System.out.println("All Students:");
                        for (Student student : allStudents) {
                            System.out.println(student);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exit");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
