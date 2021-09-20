package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class StudentMainClass {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//         String student=sc.nextLine();

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "Vijay", "HYD"));
        students.add(new Student(2, "Ajay", "Banglore"));
        students.add(new Student(3, "john", "Newyork"));
        students.add(new Student(4, "Sujay", "Banglore"));
        students.add(new Student(5, "Ariana", "Ramapur"));
        students.add(new Student(6, "Dravid", "ranchi"));

        /** Display all the students **/
        for (Student st : students) {
            System.out.println(st);
        }
        /** students in a particular city **/
        System.out.println("in a particular city " + students.stream().filter(s -> s.getCity().equals("HYD"))
                .collect(Collectors.toList()).get(0));


        /** sorted by Name using collection **/
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("After sorted by Name" + students);

        /** sorted by city using collection **/

        Collections.sort(students, (t1, t2) -> t1.getCity().compareTo(t2.getCity()));
        System.out.println("After sorted by city " + students);

        /** find By id using collections **/
        try {

            System.out.println("found by ID " + students.stream().filter(s -> s.getId() == 4).collect(Collectors.toList()).get(0));

        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Student not found by id");

        }
    }
}
