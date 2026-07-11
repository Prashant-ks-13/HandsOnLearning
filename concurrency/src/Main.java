import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        //Given a string s, find the length of the longest substring without duplicate characters.
//        //
//        //Input: s = "abcabcbb"
//        //Output: 3
//        //abc
//        //
//        //Input: s = "bbbbb"
//        //Output: 1
//        //b
//        System.out.println(findlongest("bbbabb"));
        List<Employee> employees = List.of(
                new Employee(1, "Rahul", "IT", 25, 55000, "Male", 2, "Bangalore"),
                new Employee(2, "Anita", "HR", 28, 48000, "Female", 4, "Mumbai"),
                new Employee(3, "Suresh", "Finance", 35, 85000, "Male", 10, "Delhi"),
                new Employee(4, "Priya", "IT", 30, 75000, "Female", 6, "Pune"),
                new Employee(5, "Amit", "IT", 40, 120000, "Male", 15, "Bangalore"),
                new Employee(6, "Neha", "Marketing", 27, 50000, "Female", 3, "Kolkata"),
                new Employee(7, "Vikram", "Finance", 45, 150000, "Male", 20, "Mumbai"),
                new Employee(8, "Pooja", "HR", 32, 62000, "Female", 7, "Delhi"),
                new Employee(9, "Rohit", "IT", 29, 68000, "Male", 5, "Hyderabad"),
                new Employee(10, "Sneha", "Marketing", 35, 72000, "Female", 9, "Pune"),
                new Employee(11, "Arjun", "IT", 26, 60000, "Male", 3, "Chennai"),
                new Employee(12, "Kiran", "Finance", 38, 98000, "Male", 12, "Bangalore"),
                new Employee(13, "Meera", "HR", 41, 90000, "Female", 18, "Mumbai"),
                new Employee(14, "Ravi", "IT", 34, 88000, "Male", 8, "Delhi"),
                new Employee(15, "Nisha", "Marketing", 24, 42000, "Female", 1, "Kolkata"),
                new Employee(16, "Manoj", "Finance", 28, 65000, "Male", 4, "Pune"),
                new Employee(17, "Divya", "IT", 31, 82000, "Female", 7, "Hyderabad"),
                new Employee(18, "Sunil", "HR", 36, 70000, "Male", 11, "Chennai"),
                new Employee(19, "Kavita", "Marketing", 39, 88000, "Female", 14, "Delhi"),
                new Employee(20, "Deepak", "IT", 42, 130000, "Male", 17, "Bangalore")
        );
        //Q1. Get the list of all employee names using Stream API.
        //List<String> ls = employees.stream().map(Employee::getName).toList();
        //System.out.println(ls);
        //Q2. Find all employees who belong to the IT department.
        //List<String> ITnames = employees.stream().filter(n -> n.getDepartment().equals("IT")).map(Employee::getName).toList();
        //System.out.println(ITnames);
        //Q3. Count the number of employees in the organization.
        long cnt = employees.stream().count();
        //System.out.println(cnt);
        //Q4. Get all employees whose salary is greater than 70,000.
        //List<String> ls = employees.stream().filter(n -> n.getSalary() > 70000)
        //        .map(Employee::getName).toList();
        //System.out.println(ls);
        //Q5. Find all female employees.
        //List<Employee> ls = employees.stream().filter(n -> "female".equalsIgnoreCase(n.getGender())).toList();
        //System.out.println(ls);
        //Q6. Get a list of employee names who are older than 30.
        //List<String> ls = employees.stream().filter(n -> n.getAge()>30).map(Employee::getName).toList();
        //System.out.println(ls);
        //Q7. Find the employee with the highest salary.
        //Employee emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
        //Employee emp = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        //System.out.println(emp);
        //Q8. Find the employee with the lowest salary using Stream API.
//        Optional<Employee> emp = employees.stream().min(Comparator.comparing(Employee::getSalary));
//        emp.ifPresent(System.out::println);
        //Q9. Sort employees by salary in ascending order using Stream API.
//        List<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
//        System.out.println(emp);
        //Q10. Sort employees by age in descending order using Stream API.
//        List<Employee> emp = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).toList();
//        System.out.println(emp);
        //Q11. Group employees by department using Stream API.
//        Map<String,List<Employee>> mp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(mp);
        //Q12. Count employees in each department using Stream API.
//        Map<String,Long> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(map);
        //Q13. Find the average salary of all employees using Stream API.
//        double avg = employees.stream().collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(avg);
        //Q14. Find the average salary of employees in each department using Stream API.
//        Map<String,Double> mp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(mp);
        //Q15. Get the list of employees who have more than 10 years of experience using Stream API.
//        List<Employee> emp = employees.stream().filter(n -> n.getExperience()>10).toList();
//        System.out.println(emp);
        //Q16. Find the highest-paid employee in each department using Stream API.
//        Map<String,Optional<Employee>> mp = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        System.out.println(mp);
        //Q17. Partition employees into two groups using Stream API:
        //
        //experience ≥ 5 years
        //
        //experience < 5 years
//        Map<Boolean,List<Employee>> mp = employees.stream().collect(Collectors.partitioningBy(n -> n.getExperience()>=5));
//        System.out.println(mp);
        //Q18. Find the department with the maximum number of employees using Stream API.
//        Optional<String> st = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey);
//        System.out.println(st);
        //Q19. Check if any employee earns more than 1,50,000 using Stream API.
//        boolean bol = employees.stream().anyMatch(n -> n.getSalary()>150000);
//        System.out.println(bol);
        //Q20. Create a Map using Stream API where:
        //
        //Key → department
        //
        //Value → list of employee names
        Map<String,List<String>> mp = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(mp);





//
     }
//        static int findlongest(String s){
//        int res = 0;
//        int cnt = 0;
//        Set<Character> st = new HashSet<>();
//        for(Character c : s.toCharArray()){
//
//
//            if(st.contains(c)){
//                cnt = 0;
//            }else{
//                st.add(c);
//                cnt++;
//            }
//            res = Math.max(res,cnt);
//
//        }
//        return res;
//    }


}
class Employee {
    private int id;
    private String name;
    private String department;
    private int age;
    private double salary;
    private String gender;
    private int experience;
    private String city;

    public Employee(int id, String name, String department, int age, double salary, String gender, int experience, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.experience = experience;
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", experience=" + experience +
                ", city='" + city + '\'' +
                '}';
    }
    // constructor, getters, setters, toString()
}
