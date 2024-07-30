package Others;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImplementSorting {

    public static void main(String[] args) {


int[][] array={
        {1,2,3},
        {4,5,6},
        {6,7,8}
};

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println(
        );
        System.out.println();

int[] arr={1,2,3,4,5};

Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);



int[] n={5};

        for (int i = 0; i <=5; i++) {
            for (int m = 5; m > i; m--) {
                System.out.print(" ");
            }
            for (int j = 0; j<i ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }


        List<Employee> employees =new ArrayList<>();
        employees.add(new Employee(22112,"22112"));
        employees.add(new Employee(32112,"32112"));
        employees.add(new Employee(32112,"42112"));
        employees.add(new Employee(22224,"12112"));
        employees.add(new Employee(130,"52112"));

        employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getId).reversed()).forEach(x->System.out.println(x));
        System.out.println(
        );

        System.out.println();
        employees.stream().sorted((o1,o2)->(o2.getSalary()).compareTo(o1.getSalary() )).forEach(x->System.out.println(x));

        String s="Aravinth,ram,vishnu,prabhu,ram,vishnu";
        List<String> strings= Arrays.asList(s.split(","));
        Set<String> stringSet=new HashSet<>();
           Map<String,Long> stringLongMap=strings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(stringLongMap);

     Set<String> set= strings.stream().filter(x->stringSet.add(x)).collect(Collectors.toSet());
        System.out.println(set);

    }
}
