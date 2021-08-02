
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire
{   
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    
    public PartTimeStaffHire(int vacancyNumber,String designation,String jobType,int workingHour,int wagesPerHour,String shifts){
        // Creating Consturctor
        super(vacancyNumber,designation,jobType);   //Calling super class
        this.workingHour=workingHour;   //Calling instance variable workingHour
        this.wagesPerHour=wagesPerHour; //Calling instance wagesPerDay
        this.shifts=shifts;                //Calling instance shifts
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }
    public int getworkingHour(){    //getter method for workinghour
       return workingHour;     //returing the value
    }
    public int getwagesPerHour(){    //getter method for wagesperhour
       return wagesPerHour;    //returing the value
    }
    public String getstaffName(){  //getter method for staff name
       return staffName;      //returing the value
    }
    public String getjoiningDate(){ //getter method for joining date
       return joiningDate;   //returing the value
    }
    public String getqualification(){ //getter method for qulaification
       return qualification;   //returing the value
    }
    public String getappointedBy(){   //getter method for appointed by
       return appointedBy;     //returing the value
    }
    public String getshifts(){      //getter method for shifts
        return shifts;      //returing the value
    } 
    public boolean getJoined(){
        return joined;
    }
    public boolean getterminated(){
        return terminated;
    }
    public void setChangeShifts(String newShifts){  //setter method for shifts and assinging new salary
        if(joined==false){ // if staff is not joined then do this
            this.shifts=newShifts;  //calling instance variable shifts
        }else{          // Joined==false then do this 
            System.out.println("The shifts are not allowed");
        }
    }
    public void hirePartTime(String staffName,String joiningDate,String qualification,String appointedBy){
        //method to hire the part time stass
        this.staffName=staffName;     //Calling instance variable staffName
        this.joiningDate=joiningDate; //Calling instance variable joiningDate
        this.qualification=qualification; //Calling instance variable qualification
        this.appointedBy=appointedBy;   //Calling instance variable appointedBy
        
        if(joined==true){    // if staff is joined then do this
            System.out.println("The staff is already hired");
            System.out.println("Staff Name:"+staffName);
            System.out.println("Joined Date:"+joiningDate);
        }else{    // Joined==false then do this
            System.out.println("The staff is now hired");
            System.out.println("Staff Name:"+staffName);
            System.out.println("Join Date:"+joiningDate);
            System.out.println("Qualification:"+qualification);
            System.out.println("Appointed By:"+appointedBy);
            joined=true;
            terminated=false;
        }
    }
    public void terminateStaff(){   //method to terminate staff
        if(terminated==true){     // if staff is ternimated then do this
            System.out.println("The staff is already terminated");
        }else{     // terminated==false then do this
            staffName="";
            joiningDate="";
            qualification="";
            appointedBy="";
            joined=false;
            terminated=true;
        }
    }
    public void display(){  //method to display the information of staff
       super.display();  //calling super class
       if(joined==true){  // if staff is ternimated then do this
           System.out.println("Staff Name:"+staffName);
           System.out.println("Shifts:"+shifts);
           System.out.println("Working Hours:"+workingHour);
           System.out.println("Joining Date:"+joiningDate);
           System.out.println("Qualification:"+qualification);
           System.out.println("Appointed By:"+appointedBy);
           System.out.println("Wages Per Hour:"+wagesPerHour);
           System.out.println("Income Per Day:"+wagesPerHour*workingHour);
       }
    }   
}         
          
            
            
        
        
    
    

