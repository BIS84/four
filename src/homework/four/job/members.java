package homework.four.job;

public class members {
    String fullName;
    String position;
    long phone;
    float salary;
    int age;

    public members(String fullName, String position, long phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {return fullName;}

    public String getPosition() {return position; }

    public long getPhone() {return phone; }

    public float getSalary() {return salary; }

    public int getAge() {return age; }

    /// Task 6
    public void setSalary(float salary) {this.salary = salary; }
}
