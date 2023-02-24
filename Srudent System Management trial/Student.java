public class Student {
    private int id;
    private String name;
    private int grade;
    private int fees_paid;
    private int fees_total;

    //Id should not be repeated
    //Constructor to create a new student object by initializinthe values

    /*
     * fees for every student=30,000
     * Fees paid initialy=0
     */

     //Always initialize all the fields
    public Student(int id, String name, int grade){
        //Fees paid is not passed as an argument
        this.fees_paid=0;
        this.fees_total=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
        
    }

//set grade to allow altering of the grades (update)
    public void setGrade(int grade){
        this.grade=grade;
    }

    //We are not altering student name So setName method is not requred, same to Id

//Setter method to update the fees paid
//keep adding the fees to fees paid
   
    public void updateFeesPaid(int fees){
fees_paid=+fees;

}



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFees_paid() {
        return fees_paid;
    }

    public int getFees_total() {
        return fees_total;
    }
}
