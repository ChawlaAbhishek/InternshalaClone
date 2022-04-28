package dateAndTime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dob db = new Dob();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dob");
        String dob = sc.next();
        db.printDob(dob);
    }
}
