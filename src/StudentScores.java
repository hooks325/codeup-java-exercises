import java.util.*;

/**
 * Created by nedwaldie on 1/13/17.
 */
public class StudentScores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        List studentList = new ArrayList();
        Student student;
        String anotherStudent;
        String firstName;
        String lastName;
        int score;

        do {
            firstName = validator.getString("Enter first name: ");
            lastName = validator.getString("Enter last name:");
            score = validator.getInt("Enter score:");

            student = new Student(firstName, lastName, score);
            studentList.add(student);

            anotherStudent = validator.getString("Do you want to enter another student?");
        } while (anotherStudent.equalsIgnoreCase("yes"));


        System.out.println("\n" + studentList + "\n");

        Collections.sort(studentList);

        System.out.println(studentList);
    }
}
