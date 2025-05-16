/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author User
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student(); //s1 as object
        s1.setName("Prerna");
        s1.setSid(1);
        
        Student s2 = new Student();
        s2.setName("dilpreet");
        s2.setSid(2);
        
        Student s3 = new Student();
        s3.setName("Anureet");
        s3.setSid(3);
        
        //store 3 students in an array
        //Array of object
        Student[] list = new Student[3]; //object of student in array
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++){
        System.out.println(list[i].getName()+" "+list[i].getSid());
    }
        
        
    }
    
}
