import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAssignment1 {
    public static void main(String[] args) {
        //Question 1: Cube of numbers from 1-10 and filter all who are divisible by 5
        List<Integer> cubeInt = IntStream.rangeClosed(1, 10)
                .map(n -> n * n * n)
                .filter(cube -> cube %5 != 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(cubeInt);

        System.out.println("------------------------------------------------------");
        //Question 2: Count the number of letter occurrence in the given string

        String i = "Jay Swaminarayan";
        Map<Character, Long> count = i.replaceAll(" ", "")
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        count.forEach((character, counts) ->
                System.out.println(character + " : " + counts));


        System.out.println("------------------------------------------------------");
        //Question 3: Find average of numbers stored as values in a map

        Map<String, Integer> mileageCar = Map.of(
                "Camry", 35,
                "Tuscon", 28,
                "Suburban", 15,
                "Sonata", 32,
                "Escalade", 12);

        OptionalDouble averageMileage = mileageCar.values()
                .stream()
                .mapToInt(Integer::intValue)
                .average();
        if (averageMileage.isPresent()) {
            System.out.println("Average mileage " + averageMileage.getAsDouble());
        }else{
            System.out.println("No cars present");
        }
    }
}
