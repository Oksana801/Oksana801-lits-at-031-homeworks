public class Employee {
    private int Id;
    private String Name;
    private String Position;

    public Employee() {

    }

    public Employee(String s) {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    private String Salary;

    public Employee(int id, String name, String Position, String Salary) {
        this.Id = id;
        this.Name = name;
        this.Position = Position;
        this.Salary = Salary;
    }


    public String toString() {
        return "Employee [id=" + Id + ", name=" + Name + ", dob=" + Salary + ", email=" + Position
                + "]";

    }
}

