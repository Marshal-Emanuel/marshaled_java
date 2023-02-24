import java.util.List;

public class School {

    /**
     * @param teachers list of teachers
     * @param students list of students
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }
    //School has many teachers and students but we are accounting for only one
    // we can use array lists ti imlememnt teachers and students
    private List<Teacher> teachers; 
    private List<Student> students;
    //initialize the values to zero
    private int total_money_earned=0;
    private int total_money_spent=0;

    
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public int getTotal_money_earned() {
        return total_money_earned;
    }
    public void setTotal_money_earned(int total_money_earned) {
        this.total_money_earned = total_money_earned;
    }
    public int getTotal_money_spent() {
        return total_money_spent;
    }
    public void setTotal_money_spent(int total_money_spent) {
        this.total_money_spent = total_money_spent;
    }
}
