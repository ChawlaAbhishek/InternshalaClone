package SortObjects;

import java.util.Comparator;

public class EmployeeNameCom implements Comparator<EmployeeObject> {
    @Override
    public int compare(EmployeeObject o1, EmployeeObject o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
