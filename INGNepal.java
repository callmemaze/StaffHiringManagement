import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class INGNepal implements ActionListener
{   
    //Creating Instance Varibale 
    private JFrame frame;
    private JButton btnFull;
    private JButton btnHalf;
    private JButton btnAdd;
    private JButton btnAppoint;
    private JButton btnClear;
    private JButton btnAddPartTime;
    private JButton btnAppointPartTime;
    private JButton btnTerminate;
    private JLabel lblHead;
    private JLabel lblWelcome;
    private JLabel lblChoose;
    private JLabel lblName;
    private JLabel lblDesignation;
    private JLabel lblQualification;
    private JLabel lblJoin;
    private JLabel lblAppoint;
    private JLabel lblWorking;
    private JLabel lblHour;
    private JLabel lblSalary;
    private JLabel lblWages;
    private JButton btnDisplay;
    private JPanel panel;
    private JLabel lblVacancyNo;
    private JLabel lblJobType;
    private String job[]={"Full Time"};
    private String partJob[]={"Part Time"};
    private String date[]={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
    private String month[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
    private String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
    private JComboBox jobType;
    private JComboBox joiningDate;
    private JComboBox joiningDay;
    private JComboBox joiningMonth;
    private JTextField txtName;
    private JTextField txtVacancyNo;
    private JTextField txtDesignation;
    private JTextField txtQualification;
    private JTextField txtJoin;
    private JTextField txtAppoint;
    private JTextField txtWorking;
    private JTextField txtHour;
    private JTextField txtSalary;
    private JTextField txtWages; 
    Color c=new Color(255,165,0);
    Color c1=new Color(142, 68, 173);
    ArrayList<StaffHire> list=new ArrayList<StaffHire>(); //Creating list of type StaffHire
    public INGNepal(){
        //Creating a JFrame frame  
        frame=new JFrame("ING Nepal Form");
        frame.getContentPane().setBackground(c);
        
        //Creating a Jlabel in frame for header
        lblHead=new JLabel("ING Nepal Form");
        lblHead.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
        lblHead.setBounds(60,0,250,50);
        frame.add(lblHead);
        
        //Creating a Jlabel in frame for welcoming
        lblWelcome=new JLabel("Welcome To ING Nepal");
        lblWelcome.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
        lblWelcome.setBounds(30,50,250,50);
        frame.add(lblWelcome);
        
        //Creating a Jlabel in frame 
        lblChoose=new JLabel("Choose one option form below");
        lblChoose.setFont(new Font("Comic Sans Ms",Font.PLAIN,20));
        lblChoose.setBounds(10,90,300,50);
        frame.add(lblChoose);
        
        //Creating a JButton in frame for full time staff hire
        btnFull=new JButton("Full Time Staff");
        btnFull.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnFull.setBackground(Color.orange);
        btnFull.setBounds(10,150,130,50);
        btnFull.addActionListener(this);
        frame.add(btnFull);
        
        //Creating a JButton in frame for part time staff hire
        btnHalf=new JButton("Part Time Staff");
        btnHalf.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnHalf.setBackground(Color.orange);
        btnHalf.setBounds(150,150,130,50);
        btnHalf.addActionListener(this);
        frame.add(btnHalf);
        
        //Creating a JButton in frame for display
        btnDisplay=new JButton("Display");
        btnDisplay.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnDisplay.setBackground(Color.orange);
        btnDisplay.setBounds(80,210,130,50);
        btnDisplay.addActionListener(this);
        frame.add(btnDisplay);
        
        //DISPONSE_ON_CLOSE since we don't have to stop application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(300,400);
    }
    public void fullTimeForm(){
        frame = new JFrame("Full Staff Form"); //Creating a JFrame frame for fulltime staff form
        
        JLabel lblTitle = new JLabel("Full Time Staff Form");
        lblTitle.setFont(new Font("Comic Sans Ms",Font.PLAIN,25));
        lblTitle.setBounds(260,10,270,30);
        frame.add(lblTitle);
        
        panel = new JPanel();
        panel.setBounds(10,50,800,100);
        panel.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        panel.setLayout(null);
        frame.add(panel);
                
        lblVacancyNo = new JLabel("VacancyNo");
        lblVacancyNo.setBounds(20,50,100,30);
        lblVacancyNo.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        panel.add(lblVacancyNo);
        
        txtVacancyNo = new JTextField();
        txtVacancyNo.setBounds(100,50,100,30);
        panel.add(txtVacancyNo);
        
        lblJobType = new JLabel("JobType");
        lblJobType.setBounds(580,50,100,30);
        lblJobType.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        panel.add(lblJobType);
     
        jobType=new JComboBox<>(job);
        jobType.setBounds(650,50,120,30);
        panel.add(jobType);
        
        lblName=new JLabel("Staff Name");
        lblName.setBounds(30,150,100,30);
        lblName.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblName);
        
        txtName=new JTextField();
        txtName.setBounds(120,150,150,30);
        frame.add(txtName);
        
        lblDesignation=new JLabel("Designation");
        lblDesignation.setBounds(300,150,100,30);
        lblDesignation.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblDesignation);
        
        txtDesignation=new JTextField();
        txtDesignation.setBounds(390,150,150,30);
        frame.add(txtDesignation);
        
        lblQualification=new JLabel("Qualification");
        lblQualification.setBounds(560,150,100,30);
        lblQualification.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblQualification);
        
        txtQualification=new JTextField();
        txtQualification.setBounds(660,150,120,30);
        frame.add(txtQualification);
        
        lblJoin=new JLabel("Joining Date");
        lblJoin.setBounds(30,200,100,30);
        lblJoin.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblJoin);
        
        joiningDate=new JComboBox<>(date);
        joiningDate.setBounds(120,200,85,30);
        frame.add(joiningDate);
        
        joiningMonth=new JComboBox<>(month);
        joiningMonth.setBounds(200,200,60,30);
        frame.add(joiningMonth);
        
        joiningDay=new JComboBox<>(day);
        joiningDay.setBounds(260,200,60,30);
        frame.add(joiningDay);
        
        lblAppoint=new JLabel("Appointed By");
        lblAppoint.setBounds(330,200,100,30);
        lblAppoint.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblAppoint);
        
        txtAppoint=new JTextField();
        txtAppoint.setBounds(440,200,150,30);
        frame.add(txtAppoint);
        
        lblWorking=new JLabel("Shift");
        lblWorking.setBounds(600,200,100,30);
        lblWorking.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblWorking);
        
        txtWorking=new JTextField();
        txtWorking.setBounds(660,200,120,30);
        frame.add(txtWorking);
        
        lblHour=new JLabel("Working Hour");
        lblHour.setBounds(30,250,100,30);
        lblHour.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblHour);
        
        txtHour=new JTextField();
        txtHour.setBounds(130,250,150,30);
        frame.add(txtHour);
        
        lblSalary=new JLabel("Salary");
        lblSalary.setBounds(300,250,100,30);
        lblSalary.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblSalary);
        
        txtSalary=new JTextField();
        txtSalary.setBounds(400,250,150,30);
        frame.add(txtSalary);
        
        lblWages=new JLabel("Wages");
        lblWages.setBounds(560,250,100,30);
        lblWages.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblWages);
        
        txtWages=new JTextField();
        txtWages.setBounds(660,250,120,30);
        frame.add(txtWages);
        
        navigation(); //calling navigation method
        
        //DISPONSE_ON_CLOSE since we don't have to stop application
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800,450);
        frame.setVisible(true);
    }
    public void navigation(){ //This method contain all button for fulltime staff hire 
        btnAdd=new JButton("Add fullTime");
        btnAdd.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnAdd.setBounds(80,320,150,50);
        btnAdd.addActionListener(this);
        frame.add(btnAdd);
        
        btnAppoint=new JButton("Appoint fulltime");
        btnAppoint.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnAppoint.setBounds(250,320,150,50);
        btnAppoint.addActionListener(this);
        frame.add(btnAppoint);
        
        btnClear=new JButton("Clear");
        btnClear.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnClear.setBounds(600,320,150,50);
        btnClear.addActionListener(this);
        frame.add(btnClear);
        
    }
    public void partTimeForm(){
        frame = new JFrame("Part Staff Form"); //Creating a JFrame frame for parttime staff form
        
        JLabel lblTitle = new JLabel("Part Time Staff Form");
        lblTitle.setFont(new Font("Comic Sans Ms",Font.PLAIN,25));
        lblTitle.setBounds(250,10,280,30);
        frame.add(lblTitle);
        
        panel = new JPanel();
        panel.setBounds(10,50,800,100);
        panel.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        panel.setLayout(null);
        frame.add(panel);
                
        lblVacancyNo = new JLabel("VacancyNo");
        lblVacancyNo.setBounds(20,50,100,30);
        lblVacancyNo.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        panel.add(lblVacancyNo);
        
        txtVacancyNo = new JTextField();
        txtVacancyNo.setBounds(100,50,100,30);
        panel.add(txtVacancyNo);
        
        lblJobType = new JLabel("JobType");
        lblJobType.setBounds(580,50,100,30);
        lblJobType.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        panel.add(lblJobType);
     
        jobType=new JComboBox<>(partJob);
        jobType.setBounds(650,50,120,30);
        panel.add(jobType);
        
        lblName=new JLabel("Staff Name");
        lblName.setBounds(30,150,100,30);
        lblName.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblName);
        
        txtName=new JTextField();
        txtName.setBounds(120,150,150,30);
        frame.add(txtName);
        
        lblDesignation=new JLabel("Designation");
        lblDesignation.setBounds(300,150,100,30);
        lblDesignation.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblDesignation);
        
        txtDesignation=new JTextField();
        txtDesignation.setBounds(390,150,150,30);
        frame.add(txtDesignation);
        
        lblQualification=new JLabel("Qualification");
        lblQualification.setBounds(560,150,100,30);
        lblQualification.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblQualification);
        
        txtQualification=new JTextField();
        txtQualification.setBounds(660,150,120,30);
        frame.add(txtQualification);
        
        lblJoin=new JLabel("Joining Date");
        lblJoin.setBounds(30,200,100,30);
        lblJoin.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblJoin);
        
        joiningDate=new JComboBox<>(date);
        joiningDate.setBounds(120,200,85,30);
        frame.add(joiningDate);
        
        joiningMonth=new JComboBox<>(month);
        joiningMonth.setBounds(200,200,65,30);
        frame.add(joiningMonth);
        
        joiningDay=new JComboBox<>(day);
        joiningDay.setBounds(260,200,65,30);
        frame.add(joiningDay);
        
        lblAppoint=new JLabel("Appointed By");
        lblAppoint.setBounds(330,200,150,30);
        lblAppoint.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblAppoint);
        
        txtAppoint=new JTextField();
        txtAppoint.setBounds(440,200,130,30);
        frame.add(txtAppoint);
        
        lblWorking=new JLabel("Shift");
        lblWorking.setBounds(600,200,100,30);
        lblWorking.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblWorking);
        
        txtWorking=new JTextField();
        txtWorking.setBounds(660,200,120,30);
        frame.add(txtWorking);
        
        lblHour=new JLabel("Working Hour");
        lblHour.setBounds(30,250,100,30);
        lblHour.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblHour);
        
        txtHour=new JTextField();
        txtHour.setBounds(130,250,150,30);
        frame.add(txtHour);
        
        lblSalary=new JLabel("Salary");
        lblSalary.setBounds(300,250,100,30);
        lblSalary.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblSalary);
        
        txtSalary=new JTextField();
        txtSalary.setBounds(400,250,150,30);
        frame.add(txtSalary);
        
        lblWages=new JLabel("Wages");
        lblWages.setBounds(560,250,100,30);
        lblWages.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        frame.add(lblWages);
        
        txtWages=new JTextField();
        txtWages.setBounds(660,250,120,30);
        frame.add(txtWages);
        
        navigationPart(); //calling navigationpart method  
        
        //DISPONSE_ON_CLOSE since we don't have to stop application
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800,450);
        frame.setVisible(true);
    }
    public void navigationPart(){  //This method contain all button for parttime staff hire 
        btnAddPartTime=new JButton("Add PartTime");
        btnAddPartTime.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnAddPartTime.setBounds(80,320,150,50);
        btnAddPartTime.addActionListener(this);
        frame.add(btnAddPartTime);
        
        btnAppointPartTime=new JButton("Appoint PartTime");
        btnAppointPartTime.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnAppointPartTime.setBounds(230,320,150,50);
        btnAppointPartTime.addActionListener(this);
        frame.add(btnAppointPartTime);
        
        btnClear=new JButton("Clear");
        btnClear.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnClear.setBounds(630,320,150,50);
        btnClear.addActionListener(this);
        frame.add(btnClear);
        
        btnTerminate=new JButton("Terminate");
        btnTerminate.setFont(new Font("Comic Sans Ms",Font.PLAIN,15));
        btnTerminate.setBounds(380,320,150,50);
        btnTerminate.addActionListener(this);
        frame.add(btnTerminate);
    }
    public static void main(String []args){  //main method
        new INGNepal();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnFull){ //if this button is tiggered the fulltime staff form is opened
           fullTimeForm(); 
        }
        if(e.getSource()==btnHalf){ //if this button is tiggered the parttime staff form is opened
           partTimeForm(); 
        }
        if(e.getSource()==btnAdd){ //on the button trigger of button of fulltime staff
            int vacancyNo=0;
            int salary=0;
            int workingHour=0;
            String jobTypes="";
            String designation="";
            try{
                //getText for getting the value of textfield and parseInt for changing string to int
                vacancyNo=Integer.parseInt(txtVacancyNo.getText());
                salary=Integer.parseInt(txtSalary.getText());
                workingHour=Integer.parseInt(txtHour.getText());
                jobTypes=(jobType.getSelectedItem()).toString(); //selectedItem for getting value of comboBox
                designation=txtDesignation.getText();
                boolean isDupli=false;
                for(StaffHire each:list){
                    if(each.getvacancyNumber()==vacancyNo){
                        isDupli=true;
                        break;
                    }
                }
                if(isDupli==false){
                    FullTimeStaffHire obj=new FullTimeStaffHire(vacancyNo,designation,jobTypes,salary,workingHour);
                    list.add(obj); //adding in list
                    JOptionPane.showMessageDialog(frame,"Vacancy Number:"+"\t"+vacancyNo+"\t"+"was added");
                }else{
                    JOptionPane.showMessageDialog(frame,"Input Vacancy is already in the list");
                }
                }catch(Exception exp){
                    JOptionPane.showMessageDialog(frame,"Invalid! Please try again");
            }
        }
        if(e.getSource()==btnAddPartTime){ //on the button trigger of button of parttime staff
            int vacancyNo=0;
            int workingHour=0;
            String jobTypes="";
            String designation="";
            String shift="";
            int wagesPerHour=0;
            try{
                //getText for getting the value of textfield and parseInt for changing string to int
                vacancyNo=Integer.parseInt(txtVacancyNo.getText());
                workingHour=Integer.parseInt(txtHour.getText());
                jobTypes=(jobType.getSelectedItem()).toString(); //selectedItem for getting value of comboBox
                designation=txtDesignation.getText();
                shift=txtWorking.getText();
                wagesPerHour=Integer.parseInt(txtWages.getText());
                boolean isDupli=false;
                for(StaffHire each:list){
                    if(each.getvacancyNumber()==vacancyNo){
                        isDupli=true;
                        break;
                    }
                }
                if(isDupli==false){
                    PartTimeStaffHire obj=new PartTimeStaffHire(vacancyNo,designation,jobTypes,workingHour,wagesPerHour,shift);
                    list.add(obj); //adding in list
                    JOptionPane.showMessageDialog(frame,"Vacancy Number:"+"\t"+vacancyNo+"\t"+"was added");
                }else{
                    JOptionPane.showMessageDialog(frame,"Input Vacancy is already in the list");
                }
            }catch(Exception exp){
                    JOptionPane.showMessageDialog(frame,"Invalid! Please try again ");
            }
        }
        if(e.getSource()==btnAppoint){ //on the button trigger of Appoint button of fulltime staff
            try{
                //getText for getting the value of textfield and parseInt for changing string to int
                int vacancyNo=Integer.parseInt(txtVacancyNo.getText());
                String staffName=txtName.getText();
                String joinDate=(joiningDate.getSelectedItem()).toString(); //selectedItem for getting value of comboBox
                String joinMonth=(joiningMonth.getSelectedItem()).toString();
                String joinDay=(joiningDay.getSelectedItem()).toString();
                String qualification=txtQualification.getText();
                String appointedBy=txtAppoint.getText();
                boolean found=false;
                for(StaffHire each:list){
                    if(each.getvacancyNumber()==vacancyNo){
                         found=true;
                         if(each instanceof FullTimeStaffHire){
                             FullTimeStaffHire hire=(FullTimeStaffHire)each;
                             if(hire.getjoined()==true){
                                 JOptionPane.showMessageDialog(frame,"Staff has already hired!");
                             }else{
                                 hire.toHire(staffName,joinDate+"/"+joinMonth+"/"+joinDay,qualification,appointedBy);
                                 JOptionPane.showMessageDialog(frame,"Staff has been successfully hired!");
                                 break;
                             }
                         }
                    }
                }
            }catch(Exception exp){
                JOptionPane.showMessageDialog(frame,"Invalid! Please make sure staff is added.");
            }
        }
        if(e.getSource()==btnAppointPartTime){ //on the button trigger of appoint button of parttime staff
            try{
                //getText for getting the value of textfield and parseInt for changing string to int
                int vacancyNo=Integer.parseInt(txtVacancyNo.getText());
                String staffName=txtName.getText();
                String joinDate=(joiningDate.getSelectedItem()).toString();
                String joinMonth=(joiningMonth.getSelectedItem()).toString();
                String joinDay=(joiningDay.getSelectedItem()).toString();
                String qualification=txtQualification.getText();
                String appointedBy=txtAppoint.getText();
                boolean found=false;
                for(StaffHire each:list){
                    if(each.getvacancyNumber()==vacancyNo){
                         found=true;
                         if(each instanceof PartTimeStaffHire){
                             PartTimeStaffHire hire=(PartTimeStaffHire)each;
                             if(hire.getJoined()==true){
                                 JOptionPane.showMessageDialog(frame,"Staff has already hired!");
                             }else{
                                 hire.hirePartTime(staffName,joinDate+"/"+joinMonth+"/"+joinDay,qualification,appointedBy);
                                 JOptionPane.showMessageDialog(frame,"Staff has been successfully hired!");
                                 break;
                             }
                         }
                    }
                }
            }catch(Exception exp){
                JOptionPane.showMessageDialog(frame,"Invalid! Please make sure staff is added.");
            }
        }
        if(e.getSource()==btnTerminate){ //on the button trigger of terminate button of parttime staff
            try{
                int vacancyNo=Integer.parseInt(txtVacancyNo.getText());
                for(StaffHire each:list){
                    if(each.getvacancyNumber()==vacancyNo){
                        if(each instanceof PartTimeStaffHire){
                            PartTimeStaffHire hire=(PartTimeStaffHire)each;
                            if(hire.getterminated()==true){
                               JOptionPane.showMessageDialog(frame,"Staff has already terminated"); 
                            }else{
                               hire.terminateStaff();
                               JOptionPane.showMessageDialog(frame,"Staff has been successfully terminated!");
                               break; 
                            }
                        }
                    }
                }
            }catch(Exception exp){
                 JOptionPane.showMessageDialog(frame,"Invalid!  Please make sure staff is appointed.");
            }
        }
        if(e.getSource()==btnDisplay){ //on the button trigger of display button of fulltime and parttimestaff 
            try{
                for(StaffHire obj:list){
                    if(obj instanceof FullTimeStaffHire){
                        System.out.println("------------------------");
                        System.out.println("Full Time Staff Information:");
                        System.out.println("------------------------");
                        ((FullTimeStaffHire)obj).display();
                    }
                    if(obj instanceof PartTimeStaffHire){
                        System.out.println("------------------------");
                        System.out.println("Part Time Staff Information");
                        System.out.println("------------------------");
                        ((PartTimeStaffHire)obj).display();
                    }
                }
            }catch(Exception exp){
                JOptionPane.showMessageDialog(frame,"Invalid!  Please make sure staff is appointed.");
            }
        }
        if(e.getSource()==btnClear){ //on the button trigger of clear button of fulltime and parttimestaff
            //set the value to the initial values or empty 
            txtName.setText("");
            txtVacancyNo.setText("");
            txtDesignation.setText("");
            txtQualification.setText("");
            txtAppoint.setText("");
            txtWorking.setText("");
            txtHour.setText("");
            txtSalary.setText("");
            txtWages.setText("");
            joiningDate.setSelectedIndex(0);
            joiningMonth.setSelectedIndex(0);
            joiningDay.setSelectedIndex(0);
        }
    }
}
