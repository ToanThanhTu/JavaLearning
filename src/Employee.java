public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int emmployeeNo = 1;

    public Employee(String name, String birthDate,
                    String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.emmployeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
