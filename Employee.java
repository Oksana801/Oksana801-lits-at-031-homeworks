public class Employee implements Comparable<Employee> {
    private int ID;
    private String NAME;
    private String Position;
    private int Salary;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Employee(int ID, String NAME, String Position, int Salary) {
        this.ID = ID;
        this.NAME = NAME;
        this.Position = Position;
        this.Salary = Salary;
    }

    public Employee() {

    }

    public String toString() {
        return " ID: " + ID + "; NAME: " + NAME + "\n";
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.NAME.compareTo(employee.NAME);
        if (result == 0)
            return Integer.compare(this.ID, employee.ID);

        return result;
    }
}



