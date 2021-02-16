public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String position;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public Employee(int id, String name, String position, int salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee() {

    }

    public String toString() {
        return " ID: " + id + "; NAME: " + name + "\n";
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.name.compareTo(employee.name);
        if (result == 0)
            return Integer.compare(this.id, employee.id);

        return result;
    }
}



