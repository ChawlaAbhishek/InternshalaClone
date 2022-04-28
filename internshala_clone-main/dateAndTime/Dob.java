package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Dob {
    public void printDob(String dob){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try{
            LocalDate date = LocalDate.parse(dob,dtf);
            LocalDate d = LocalDate.now();

            Long year = ChronoUnit.YEARS.between(d,date);
            if(date.isAfter(d)){
                System.out.println("Please do not Enter a future Date");
                System.exit(1);
            }
            System.out.println("you are"+year+"old");

        }catch (Exception e){
            System.out.println("Please do not Invalid Format");
        }



    }
}
