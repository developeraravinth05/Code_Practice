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

int transpose[][]=new int[3][3];

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                transpose[i][j]=array[j][i];
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }

        for (int[] transposeArray:transpose
             ) {
            System.out.println(Arrays.toString(transposeArray));

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
            for (int j = 0; j<5-i ; j++) {
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

       Integer sum= (int) employees.stream().collect(Collectors.summarizingInt(Employee::getId)).getSum();
        System.out.println(sum);


        System.out.println(
        );
        List<Integer> integers2=Arrays.asList(1,5,5,7,9,8);
        integers2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet()).forEach(System.out::println);



        Map<Integer, Optional<Employee>> maxMap=     employees.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.maxBy(Comparator.comparing(Employee::getSalary).reversed())));

        maxMap.forEach((id, employee) -> {
            System.out.println("ID " + id + ": " + (employee.isPresent() ? employee.get() : "No employees"));
        });


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
