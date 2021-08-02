
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire
{
    private int vacancyNumber;
    private String designation;
    private String jobType;
    
    public  StaffHire(int vacancyNumber, String designation,String jobType){  //Creating Constructor
    this.vacancyNumber=vacancyNumber; //calling instance variable vacancyNumber
    this.designation= designation;    //calling instance variable designation
    this.jobType=jobType;             //calling instance variable jobType 
    }
   
    public int getvacancyNumber(){  //getter method for vacancyNumber
       return vacancyNumber;     //returing the value
    }
    public void set(int vacancyNumber){  //setter method for vacancyNumber
       this.vacancyNumber=vacancyNumber;   //returing the value
    }
    
    public String getdesignation(){  //getter method for designation
       return designation;   //returing the value  
    }
    
    public void setdesignation(String designation){  //setter method for designation
       this.designation=designation;   //calling the instance variable designation
    }
    
    public String getjobType(){  //getter method for jobType
       return jobType;   //returing the value
    }
    public void setjobType(String jobType){  //setter method for jobType
       this.jobType=jobType;  //returing the value
    }
    public void display(){   //method display
        System.out.println("VacancyNumber:" +getvacancyNumber());
        System.out.println("Designation:" +getdesignation());
        System.out.println("JobType:" +getjobType());
    }
}
