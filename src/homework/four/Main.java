package homework.four;

import homework.four.job.members;

public class Main {

    public  static void main(String[] args) {
        // Task 4
        members member0 = new members("Ivanov Ivan Ivanovich", "director", 11111111111l, 2000000, 55);
        System.out.println(member0.getFullName() + " - " + member0.getPosition());
        System.out.println();
    }
}
