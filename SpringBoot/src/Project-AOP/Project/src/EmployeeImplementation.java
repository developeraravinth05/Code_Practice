import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImplementation {
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();

        employees.add(new Employee(1,15000,"IT"));
        employees.add(new Employee(2,25000,"Business"));
        employees.add(new Employee(3,10000,"HR"));

        List<Integer> list= Arrays.asList(2,3,4,45,1);

        Map<Boolean, List<Integer>> partitionedNumbers = list.stream()
                .collect(Collectors.teeing(num -> num % 2 == 0));;


        System.out.println(partitionedNumbers.get(false));
        employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);

//        System.out.println(map);
    }
}
