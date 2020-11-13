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
}
