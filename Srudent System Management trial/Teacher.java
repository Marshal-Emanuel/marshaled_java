public class Teacher {
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    //this class is responsible for kepping hte track of techers name id and salary
    private int id;
    private String name;
    private int salary;

    //getters and setters
    public int getId() {
        return id;
    }
   
    public String getName() {
        return name;
    }
    
    //we set the salary because it is variable but elements like id and nam ewhich do not change dont need to be hanged hence dont requre a setter
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
