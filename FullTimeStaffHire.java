
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (DIpesh Shrestha)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire
{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,int salary,int workingHour){
        // Creating Consturctor  
        super(vacancyNumber,designation,jobType);
        this.salary=salary; //Calling instance variable salary
        this.workingHour=workingHour;   //Calling instance variable salary
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
    }
    public int getsalary(){   //getter method for salary
       return salary;  //returing the value
    }
    public int getworkingHour(){  //getter method for working hour
       return workingHour;
    }
    public String getstaffName(){  //getter method for staff name
       return staffName;   //returing the value
    }
    public String getjoiningDate(){ //getter methode for joining date
       return joiningDate;    //returing the value
    }
    public String getqualification(){ //getter methode for qulaification
       return qualification;     //returing the value
    }
    public String getappointedBy(){   //getter methode for appointed by
       return appointedBy;     //returing the value
    }
    public boolean getjoined(){
        return joined;
    }
    public void setSalary(int newSalary){   //setter method for assgning new salary
      if(joined==false){            //condition for checking if joined
          this.salary=newSalary;
      }else{                          // joined==true then do this
           System.out.println("The salary cant be change for"+staffName);
      }
    }
    public void setWorkingHour(int newWorkingHour){  //setter method for assigning new working hour
      this.workingHour=newWorkingHour;  
    }
    
    public void toHire(String staffName,String joiningDate,String qualification,String appointedBy){ 
        //method to hire fullTimestaff
        this.staffName=staffName;
        this.joiningDate=joiningDate;
        this.qualification=qualification;
        this.appointedBy=appointedBy;
        if(joined==false){
            // if staff is not hired then do this
            System.out.println("Staff has been successfully hired");
            System.out.println("StaffName:"+staffName);
            System.out.println("Join Date:"+joiningDate);
            System.out.println("Qualification:"+qualification);
            System.out.println("AppointedBy:"+appointedBy);
            joined=true;
        }else{
            // Joined==true then do this 
            System.out.println("The staff is already hire");
            System.out.println("StaffName:"+staffName);
            System.out.println("JoinedDate:"+joiningDate);
        }
            
    }
    public void display(){ //method for display 
       super.display();  //calling super class method 
       if(joined==true){ //if joined then do this
       System.out.println("Staff Name:"+staffName);
       System.out.println("Salary:"+salary);
       System.out.println("Working Hours:"+workingHour);
       System.out.println("Joining Date:"+joiningDate);
       System.out.println("Qualification:"+qualification);
       System.out.println("Appointed By:"+appointedBy);
       }
    
    }
    
    
}
   
  
    
    

    
            
        
        



