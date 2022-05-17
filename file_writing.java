
package com.company;
import java.util.Scanner;

public class Patient {


    public String getName()
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter Patients Name: ");
        return name.nextLine();
    }
    public String getAge()
    {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter Patients Age: ");
        return age.nextLine();
    }
    public String getGender()
    {
        Scanner gender = new Scanner(System.in);
        System.out.println("Enter Patients Gender: ");
        return gender.nextLine();
    }
    public void setName(String name) {
    }
    public void setAge(String age) {
    }
    public void setGender(String gender) {
    }


}
