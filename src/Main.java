import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = in.next();
        Integer age = in.nextInt();
        User firstUser = new User(name, age);
        name = in.next();
        age = in.nextInt();
        User secondUser = new User(name, age);
        System.out.println(firstUser.getAge() > secondUser.getAge() ? secondUser.toString() : firstUser.toString());
    }
}