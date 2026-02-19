package Opgave1;

// Task 1

public class Main {

    public static void main(String[] args){

        Student s1 = new Student("Arif", 22);
        Student s2 = new Student("Loqman", 23);
        Student s3 = new Student("Albert", 21);

        Student[] students = {s1, s2, s3};

        for(Student s : students){
            s.printinfo();
        }
/*
        System.out.println("\nDen ældeste stundet");
        for(Student s : students){
            if(){

            }
        }

 */

    }

}




