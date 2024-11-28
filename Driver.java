import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.lang.Math;
import java.util.stream.Stream;

public class Driver {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(1, "JJ. Jognson", 38));
        students.add(new Student(2, "P. Tibbs", 48));
        students.add(new Student(3, "W. Major", 28));
        students.add(new Student(4, "P. Turner", 60));
        students.add(new Student(5, "A. Ball", 20));
        students.add(new Student(6, "B. Smithy", 90));
        students.add(new Student(7, "R. Jules", 71));
        students.add(new Student(8, "T. Verne", 97));

        //students.stream().forEach(System.out::println);
        //students.stream().filter((s)->s.getGrade() >70 ).forEach(System.out::println);
        List <String> studentList = students.stream().map((student) -> student.getName().toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(studentList);

        double Average = students.stream().mapToDouble((student) -> student.getGrade()).average().getAsDouble();
        System.out.println(Average);

        IntStream.range(90,100).map((i) -> i*i*i).forEach(System.out::println);

        List <Integer> numList = Stream.generate(Math::random).map(n -> (int)(n * 5 + 1)).limit(10).collect(Collectors.toList());
        for (Integer next : numList) {
            System.out.println("Next vaue is : " + next);
        }
        // create your Stream solutions here

    }
}