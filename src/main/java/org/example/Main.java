package org.example;
import org.CT417Assignment1.*;
import org.CT417Assignment1.Module;
import org.joda.time.DateTime;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        // Create Students
        String testStudent1Name = "Jimmy Gates";
        int testStudent1Age = 32;
        DateTime testStudent1Dob = new DateTime(1990, 3, 12, 0, 0, 0);

        Student testStudent1 = new Student(testStudent1Name, testStudent1Age, testStudent1Dob, null, null);
        String testStudent2Name = "Geralt Rivia";
        int testStudent2Age = 27;
        DateTime testStudent2Dob = new DateTime(1995, 3, 4, 0, 0, 0);

        Student testStudent2 = new Student(testStudent2Name, testStudent2Age, testStudent2Dob, null, null);

        String testStudent3Name = "Mike Tyson";
        int testStudent3Age = 56;
        DateTime testStudent3Dob = new DateTime(1966, 6, 30, 0, 0, 0);

        Student testStudent3 = new Student(testStudent3Name, testStudent3Age, testStudent3Dob, null, null);

        // Grouping the students
        ArrayList<Student> studentGroupA = new ArrayList<Student>();
        studentGroupA.add(testStudent1);
        studentGroupA.add(testStudent2);

        ArrayList<Student> studentGroupB = new ArrayList<Student>();
        studentGroupB.add(testStudent1);
        studentGroupB.add(testStudent3);

        ArrayList<Student> studentGroupC = new ArrayList<Student>();
        studentGroupC.add(testStudent3);
        studentGroupC.add(testStudent2);

        // Creating Lecturers
        String testLecturer1Name = "Joe Biden";
        int testLecturer1Age = 32;
        DateTime testLecturer1Dob = new DateTime(1990,1,1,0,0);

        Lecturer testLecturer1 = new Lecturer(testLecturer1Name, testLecturer1Age, testLecturer1Dob, null);

        String testLecturer2Name = "Mary Hughes";
        int testLecturer2Age = 31;
        DateTime testLecturer2Dob = new DateTime(1991,1,1,0,0);

        Lecturer testLecturer2 = new Lecturer(testLecturer2Name, testLecturer2Age, testLecturer2Dob, null);

        String testLecturer3Name = "Daniel Jones";
        int testLecturer3Age = 30;
        DateTime testLecturer3Dob = new DateTime(1992,1,1,0,0);

        Lecturer testLecturer3 = new Lecturer(testLecturer3Name, testLecturer3Age, testLecturer3Dob, null);


        // Creating Modules
        Module testModule1 = new Module("Maths","CT111" , studentGroupA, null, testLecturer1);

        Module testModule2 = new Module("Science","CT112" , studentGroupB, null, testLecturer1);

        Module testModule3 = new Module("Geography","CT113" , studentGroupC, null, testLecturer3);

        Module testModule4 = new Module("Art","CT114" , studentGroupC, null, testLecturer2);

        // Grouping Modules
        ArrayList<Module> moduleGroupA = new ArrayList<Module>();
        moduleGroupA.add(testModule1);
        moduleGroupA.add(testModule2);
        moduleGroupA.add(testModule3);

        ArrayList<Module> moduleGroupB = new ArrayList<Module>();
        moduleGroupB.add(testModule1);
        moduleGroupB.add(testModule2);
        moduleGroupB.add(testModule4);

        ArrayList<Module> moduleGroupC = new ArrayList<Module>();
        moduleGroupC.add(testModule3);
        moduleGroupC.add(testModule2);
        moduleGroupC.add(testModule1);


        DateTime testCourse1StartDate = new DateTime(2020,1,1,0,0);
        DateTime testCourse1EndDate = new DateTime(2024,1,1,0,0);

        Course testCourse1 = new Course("Computer Science", moduleGroupA, studentGroupA, testCourse1StartDate, testCourse1EndDate);


        DateTime testCourse2StartDate = new DateTime(2021,1,1,0,0);
        DateTime testCourse2EndDate = new DateTime(2023,1,1,0,0);
        Course testCourse2 = new Course("Geology", moduleGroupB, studentGroupB, testCourse2StartDate, testCourse2EndDate);

        DateTime testCourse3StartDate = new DateTime(2023,1,1,0,0);
        DateTime testCourse3EndDate = new DateTime(2026,1,1,0,0);
        Course testCourse3 = new Course("Astrophysics", moduleGroupC, studentGroupC, testCourse3StartDate, testCourse3EndDate);


        printDetails(testCourse1);
        printDetails(testCourse2);
        printDetails(testCourse3);
    }

    /**
     * Print details of the course
     * @param course
     */
    public static void printDetails(Course course)
    {
        System.out.println("Course Details: \n");
        System.out.println(course.toString());

        System.out.println("------------------");
        System.out.println("Module Details: \n");

        for (Module module : course.GetModules())
        {
            System.out.println(module.toString());
            System.out.println("Assigned lecturer Details: \n");
            System.out.println(module.GetLecturer().toString());

        }

        System.out.println("------------------");
        System.out.println("Student Details: \n");

        for (Student student : course.GetStudents())
        {
            System.out.println(student.toString());
        }

    }
}