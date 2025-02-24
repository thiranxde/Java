package FP04Programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String toString(){
        return name+ ":" +noOfStudents+ ":" +reviewScore;
    }

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }
}
public class FP04CustomClass {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;

        System.out.println(
                courses.stream()
                        .allMatch(reviewScoreGreaterThan95Predicate));

        System.out.println(
                courses.stream()
                        .noneMatch(reviewScoreLessThan90Predicate));

        System.out.println(
                courses.stream()
                        .anyMatch(reviewScoreLessThan90Predicate));

        Comparator<Course> sortByStudentsIncreasing = Comparator.comparing(Course::getNoOfStudents);

        System.out.println(
        courses.stream()
                .sorted(sortByStudentsIncreasing)
                .collect(Collectors.toList()));
        // [FullStack:14000:91, Spring Boot:18000:95, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, AWS:21000:92, Azure:21000:99, API:25000:96]

        Comparator<Course> sortByStudentsDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();

        System.out.println(
                courses.stream()
                        .sorted(sortByStudentsDecreasing)
                        .skip(3)
                        .limit(2)
                        .collect(Collectors.toList()));
        // [Spring:20000:98, Docker:20000:92]

        Comparator<Course> sortByStudentsAndReviewsDecreasing = Comparator.comparingInt(Course::getNoOfStudents)
                .thenComparingInt(Course::getReviewScore).reversed();

        System.out.println(
                courses.stream()
                        .sorted(sortByStudentsAndReviewsDecreasing)
                        .limit(5)
                        .collect(Collectors.toList()));
        // [API:25000:96, Azure:21000:99, AWS:21000:92, Spring:20000:98, Docker:20000:92]

        System.out.println(
        courses.stream()
                .takeWhile(course -> course.getReviewScore()>=95)
                .collect(Collectors.toList()));
        //[Spring:20000:98, Spring Boot:18000:95, API:25000:96]

        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore()>=95)
                        .collect(Collectors.toList()));
        // [FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]

        System.out.println(
                courses.stream()
                .max(sortByStudentsIncreasing));
        // gives the last element if the list - Optional[API:25000:96]

        System.out.println(
                courses.stream()
                        .min(sortByStudentsIncreasing));
        // gives the first element if the list - Optional[FullStack:14000:91]

        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .min(sortByStudentsIncreasing));
        // Optional.empty

        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .min(sortByStudentsIncreasing)
                        .orElse(new Course("Kubernetes", "Cloud", 91, 20000)));
        // Kubernetes:20000:91

        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .findFirst());
        // Optional.empty

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .findFirst());
        // Optional[Spring:20000:98]

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .findAny());
        // Finds ant list elements meets the above criteria (reviewScoreGreaterThan90Predicate)
        // Optional[Spring:20000:98]

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .mapToInt(course -> course.getNoOfStudents())
                        .sum()); //159000

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .mapToInt(course -> course.getNoOfStudents())
                        .average());// OptionalDouble[19875.0]

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .mapToInt(course -> course.getNoOfStudents())
                        .count()); // 8

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .mapToInt(course -> course.getNoOfStudents())
                        .max());// OptionalInt[25000]

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .mapToInt(course -> course.getNoOfStudents())
                        .min());// OptionalInt[14000]

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory)));
        //{Cloud=[AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91], FullStack=[FullStack:14000:91], Microservices=[API:25000:96], Framework=[Spring:20000:98, Spring Boot:18000:95]}
        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
        //{Cloud=4, FullStack=1, Microservices=1, Framework=2}

        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
        //{Cloud=Optional[Azure:21000:99], FullStack=Optional[FullStack:14000:91], Microservices=Optional[API:25000:96], Framework=Optional[Spring:20000:98]}


        System.out.println(
                courses.stream()
                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName,Collectors.toList()))));
        //{Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API], Framework=[Spring, Spring Boot]}

        Predicate<Course> reviewScoreGreaterThan95Predicate2 = getCoursePredicate2(95);
        Predicate<Course> reviewScoreGreaterThan90Predicate2 = getCoursePredicate2(90);
    }

    private static Predicate<Course> getCoursePredicate2(int cutOffReviewScore) {
        return course -> course.getReviewScore() > cutOffReviewScore;
    }
}
