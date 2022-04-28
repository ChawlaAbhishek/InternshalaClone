package SortObjects;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<EmployeeObject> ts = new TreeSet<>( new EmployeeSalaryCom());
        Scanner sc = new Scanner(System.in);

        int count = 1;
        while(count<=4){
            System.out.println("Enter details of employee"+count++);

            System.out.println("Enter Employee Id");
               int id = sc.nextInt();

            System.out.println("Enter Employee Name");
               String  name =  sc.next();

            System.out.println("Enter employee address");
                String address = sc.next();

            System.out.println("Enter employee salary");
                 Double salary =  sc.nextDouble();

            EmployeeObject eo = new EmployeeObject(id,name,address,salary);
            ts.add(eo);
        }




        System.out.println(ts);

    }
}
