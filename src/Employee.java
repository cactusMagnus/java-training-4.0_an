public class Employee implements Payable {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return calculatePay();
    }

    @Override
    public String toString() {
        String roundedSalary = String.format("%.2f", (double)Math.round(getAverageMonthlySalary()));
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", average monthly salary='" + roundedSalary + '\'' +
                '}';
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}