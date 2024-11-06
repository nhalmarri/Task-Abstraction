package Person;

public class Teacher extends Person {

    private String subject;
    private String school;
    private int years;
    private int research;


    public Teacher(String name, String subject, String school , int years, int research) {
        super(name);
        this.subject = subject;
        this.school = school;
        this.years = years;
        this.research = research;

    }


   public void describeRole(){

        System.out.printf("I teach %S in $S school",subject,school);
   }

   public int yearsOfExperience(int years){
       this.years = years;
        return years;
   }

   //property named knowledge

   public int knowledge (int research){
        this.research = research;

        int increasedknowledge = 0;

       increasedknowledge += research;

        return increasedknowledge;
   }


    @Override
    public String toString() {
        return super.toString()+ "\n==== Teacher ==== \n" + "Subject : " + subject + '\'' +
                " \nSchool : '" + school + '\'' +
                " \nYears : " + years +
                " \nKnowledge based on number of research :  " + knowledge(research);
    }
}//end of class
