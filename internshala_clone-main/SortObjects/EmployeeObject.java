package SortObjects;

public class EmployeeObject {
    int empId;
    String empName;
    String empAdd;
    double empSalary;

    public EmployeeObject(int empId, String empName, String empAdd, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAdd = empAdd;
        this.empSalary = empSalary;
    }

    public EmployeeObject() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "EmployeeObject{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAdd='" + empAdd + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
