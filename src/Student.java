
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/13/17.
 */
public class Student implements Comparable <Student>{
    private String firstName, lastName;
    private int score;

    public String firstName() { return firstName; }
    public String lastName()  { return lastName;  }
    public int score(){ return score; }

    public Student(String firstName, String lastName) {
        if (firstName == null || lastName == null)
            throw new NullPointerException();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Student))
            return false;
        Student n = (Student) o;
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }

    public int hashCode() {
        return 31*firstName.hashCode() + lastName.hashCode();
    }

    public String toString() {
        return firstName + " " + lastName + " " + score;
    }

    public int compareTo(Student n) {
        int lastCmp = lastName.compareTo(n.lastName);
        return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
    }

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
}
