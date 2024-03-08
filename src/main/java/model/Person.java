package model;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Scanner;

//@Getter
//@Setter
//@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder
@Accessors(chain = true)
public class Person {
    private int id;
    private String fullName;
    private String gender;
    private String email;
    private String address;


    public Person addPerson(Scanner input){
        System.out.println("Enter Fullname: ");
        fullName = input.nextLine();
        System.out.println("Enter Gender : ");
        gender = input.nextLine();
        System.out.println("Enter Email: ");
        address = input.nextLine();
        System.out.println("Enter Address : ");
        email = input.nextLine();

        return this;
    }

}
