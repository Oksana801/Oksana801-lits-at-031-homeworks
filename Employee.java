public class Employee {
    private int id;
    private String name;
    private String dob;
    private String email;

    public Employee(int id, String name, String dob, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email
                + "]";

    }
}

