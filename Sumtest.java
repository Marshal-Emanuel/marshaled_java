public class Sumtest {
    static int num1=2;
    static int num2=2;
    //static String name="Emanuel Marshal";
  //Must define instance var to static to access it in a method
    public static void main(String[]  args){
        int sum=num1+num2;
        String chair="chair";
        String meza="chair";
        String name="Emanuel Marshal";
        int age=20;
        String country="Kenyan";
        String occupation="Student";
      //System.out.println(++sum);
      //System.out.println(name);
      System.out.println(chair == meza); 

      String sentanece = String.format("My name is %s. I am a %s at Chuka university. I am %d years old ", name, occupation, age);
      System.out.println(sentanece);     
         }


}
 