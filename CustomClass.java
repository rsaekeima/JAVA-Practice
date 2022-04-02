class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("Employee name is :" + name);
        System.out.println("Employee id is :" + id);
    }
}

public class CustomClass {
    public static void main(String[] args) {
        Employee raki = new Employee();
        // System.out.println(raki);
        raki.id = 1;
        raki.name = "Surajit";
        raki.printDetails();
    }

}
