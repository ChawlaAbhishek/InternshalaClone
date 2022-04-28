package SortObjects;

import java.util.Comparator;

public class EmployeeSalaryCom implements Comparator<EmployeeObject> {

    @Override
    public int compare(EmployeeObject o1, EmployeeObject o2) {
        if(o1.getEmpSalary()> o2.getEmpSalary())
            return -1;
        else if(o1.getEmpSalary()< o2.getEmpSalary())
            return +1;
        else
            return o1.getEmpName().compareTo(o2.getEmpName());

    }
}
