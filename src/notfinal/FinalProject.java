package NotFinal;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FinalProject {

    
    public static void main(String[] args) {
        
        Login log = new Login();
        log.input();
         
        System.out.println("===========================================");
        System.out.println("      WELCOME TO ABC FORM DOCUMATATION");
        System.out.println("\n" + "NAME: "+log.Name + "   " + "FATHER NAME: "+log.FatherName + "\n" + "ID_NO: "+log.id_no + "         " + "EMAIL: "+log.Email );
        
        choice ch = new choice();
        ch.Choice(); 
        
        select sel = new select();
        sel.Choice();
   
    }
    
}

class Login{
    public String Name;
    public String FatherName;
    public int id_no;
    public String Email;
    
    Scanner sc = new Scanner(System.in);
    Scanner fc = new Scanner(System.in);
    
    public void input(){
        System.out.println("Enter Your Name: ");
        Name = fc.nextLine();
        
        System.out.println("Enter Your Father Name: ");
        FatherName = fc.nextLine();
        
        System.out.println("Enter Your ID NUMBER (4 Digit only): ");
        id_no = sc.nextInt();
        
        System.out.println("Enter Your Email: ");
        Email = fc.nextLine();
    } 
}
 
class choice{
    
    public void Choice()
    {
        Scanner ch = new Scanner(System.in);
        
        System.out.println("\n       **Select Your Choice** ");
        System.out.println("\n1) New Form     2) Raed Your Form     3) Delete Form");
        
    }    
}

class select extends choice
{
    
    @Override
    public void Choice()
    {
        Scanner ch = new Scanner(System.in);
        int cho = ch.nextInt();
        int sel;        
        switch(cho)
        {
            case 1:
            {
                System.out.println("**WELCOME TO FORM REGISTRATION**");
                System.out.println("1) NIC FORM REGISTRATION \n2) B_FORM REGISTRATION \n3) PASSPORT REGISTRATION \n4) MATRIC EXAMINATION REGISTRATION \n5) INTERMEDIATE EXAMINATION REGISTRATION \n6) ADMISSION REGISTRATION \n7) VISA REGISTRATION \n8) DOMICILE REGISTRATION \n9) VEHICLE LICENSE REGISTRATION \n10) PROPERTY REGISTRATION");
                sel = ch.nextInt();
                
                switch(sel)
                {
                    case 1:
                    {
                        System.out.println("\nWelcome to Nic Form Registration\n");
                        Nic n = new Nic();
                        n.form();
                        System.out.println("\nThanks For Registration");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("\nWelcome to B Form Registration\n");
                        B_form b = new B_form();
                        b.form();
                        System.out.println("\nThanks For Registration");
                        break;
                    }
                    case 3:
                    {
                        System.out.println("\nWelcome to PASSPORT Registration\n");
                        Passport b = new Passport();
                        b.form();
                        System.out.println("\nThanks For Registration");
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Welcome to Matric Examination Form");
                        MATRIC_Examination c = new MATRIC_Examination();
                        c.form();
                        System.out.println("\nThanks For Registration");
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Welcomee to Intermediate Examination Form");
                        Intermediate_Examination v = new Intermediate_Examination();
                        v.form();
                        System.out.println("\nThanks For Registration");
                        break;
                        
                    }
                    case 6:
                    {
                         System.out.println("Welcomee to Admission Form");
                         Admission_registration x = new Admission_registration();
                        x.form();
                        System.out.println("\nThanks For Registration");
                        break;
                    }
                    case 7:
                    {
                      System.out.println("Welcomee to Visa Registration");
                        visa_registration u = new visa_registration();
                        u.form();
                        System.out.println("\nThanks For Registration");
                        break;   
                    }
                    case 8:
                    {
                     System.out.println("Welcomee to Domicile Registration");
                       domicile_registration p = new domicile_registration();
                        p.form();
                        System.out.println("\nThanks For Registration");
                        break;     
                    }
                    case 9:
                    {
                      System.out.println("Welcomee to Vechile license Registration");
                        vechile_license r = new  vechile_license();
                        r.form();
                        System.out.println("\nThanks For Registration");
                        break;    
                    }
                    case 10:
                    {
                      System.out.println("Welcomee t oproperty Registration");
                        property_registration e = new  property_registration();
                        e.form();
                        System.out.println("\nThanks For Registration");
                        break;     
                    }
                }
              
            }
            
            case 2:
            {
               break; 
            }
            
            case 3:
            {
                break;
            }
        }
    
    }
}

    

abstract class FORM
{
    abstract public void form();
    
}
 
class Nic extends FORM
{
    String name;
    String father_name;
    String mother_name;
    int age;
    String b_form;
    String nationality;
    String blood_grp;

    @Override
    public void form() 
    {
        try 
        {
              Scanner ob = new Scanner(System.in);
              Scanner ob1 = new Scanner(System.in);
              
              System.out.println("Enter Name: ");
              name = ob.nextLine();
              System.out.println("Enter Father Name: ");
              father_name = ob.nextLine();
              System.out.println("Enter Mother Name: ");
              mother_name = ob.nextLine();
              System.out.println("Enter Your Age: ");
              age = ob1.nextInt();
              System.out.println("Enter YOur B-Form Number: ");
              b_form = ob.nextLine();
              System.out.println("Enter Natioality: ");
              nationality = ob.nextLine();
              System.out.println("Enter Blood Group: ");
              blood_grp = ob.nextLine();
              
              FileWriter Object = new FileWriter("NicForm.txt");
              Object.write(name + "\n");
              Object.write(father_name + "\n");
              Object.write(mother_name + "\n");
              Object.write(age + "\n");
              Object.write(b_form + "\n");
              Object.write(nationality + "\n");
              Object.write(blood_grp + "\n");
              Object.close();
        }
        
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
  }

class B_form extends FORM{

    String dob;
    String name;
    String father_name;
    String sirname;
    String dob_palace;
    String father_cnic;
    
    
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Child Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Child Father Name: ");
            father_name = obj.nextLine();
            System.out.println("Enter Your Child Sir Name: ");
            sirname = obj.nextLine();
            System.out.println("Enter Your Child Birth Palace: ");
            dob_palace = obj.nextLine();
            System.out.println("Enter Your Child's Father CNIC: (xxxxx-xxxxxxx-x ");
            father_cnic = obj1.nextLine();
            System.out.println("Enter Your Child Date of Birth: (12-01-2000) ");
            dob = obj.nextLine();
            
            FileWriter object = new FileWriter("B_Form.txt");
            
            object.write(name + "\n");
            object.write(father_name + "\n");
            object.write(sirname + "\n");
            object.write(dob_palace + "\n");
            object.write(father_cnic + "\n");
            object.write(dob);
            object.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("Enter The Proper Values");
        }
    }
    
}

class Passport extends FORM{
    
        String name;
        String father_name;
        String sirname;
        String dob;
        String CNIC;
        String Nationality;
        
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Child Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Child Father Name: ");
            father_name = obj.nextLine();
            System.out.println("Enter Your Child Sir Name: ");
            sirname = obj.nextLine();
            System.out.println("Enter Your Child Birth (12-01-2000) : ");
            dob = obj.nextLine();
            System.out.println("Enter Your CNIC: (xxxxx-xxxxxxx-x ");
            CNIC = obj1.nextLine();
            System.out.println("Enter Your Nationality");
            Nationality = obj.nextLine();
            
            FileWriter object = new FileWriter("passport_registration.txt");
            
            object.write(name + "\n");
            object.write(father_name + "\n");
            object.write(sirname + "\n");
            object.write(dob + "\n");
            object.write(CNIC + "\n");
            object.write(Nationality);
            object.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("Enter The Proper Values");
        }
    }
    
}
class MATRIC_Examination extends FORM{

        String name;
        String father_name;
        String school_name;
        String registered_courses;
        String registration_no;
        String exam_date;
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Father Name: ");
            father_name = obj.nextLine();
            System.out.println("Enter Your School nmae: ");
            school_name = obj.nextLine();
            System.out.println("Enter Your Registered Courses : ");
            registered_courses = obj.nextLine();
            System.out.println("Enter Your Registration number ");
            registration_no = obj1.nextLine();
            System.out.println("Enter Your examination Date");
           exam_date = obj.nextLine();
            
            FileWriter object = new FileWriter("examination_registration.txt");
            
            object.write(name + "\n");
            object.write(father_name + "\n");
            object.write(school_name + "\n");
            object.write(registered_courses+ "\n");
            object.write( registration_no+ "\n");
            object.write(exam_date);
            object.close();
        } 
        catch (IOException ex) {
    }
    }

}
class Intermediate_Examination extends FORM{

        String name;
        String father_name;
        String matric_no;
        String registered_courses;
        String registration_no;
        String exam_date;
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Father Name: ");
            father_name = obj.nextLine();
            System.out.println("Enter Your Matric number: ");
            matric_no = obj.nextLine();
            System.out.println("Enter Your Registered Courses : ");
            registered_courses = obj.nextLine();
            System.out.println("Enter Your Registration number ");
            registration_no = obj1.nextLine();
            System.out.println("Enter Your examination Date");
           exam_date = obj.nextLine();
            
            FileWriter object = new FileWriter("matric_examination.txt");
            
            object.write(name + "\n");
            object.write(father_name + "\n");
            object.write(matric_no + "\n");
            object.write(registered_courses+ "\n");
            object.write( registration_no+ "\n");
            object.write(exam_date);
            object.close();
        } 
        catch (IOException ex) {
    }
    }

}
class Admission_registration extends FORM{

        String name;
        String father_name;
        String contact_no;
        int    age;
        String email_address;
        String citizen;
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Father Name: ");
            father_name = obj.nextLine();
            System.out.println("Enter Your contact number: ");
            contact_no = obj.nextLine();
            System.out.println("Enter Your Age : ");
            age= obj.nextInt();
            System.out.println("Enter Your Registration number ");
            email_address = obj1.nextLine();
            System.out.println("Enter Your citizen");
            citizen = obj.nextLine();
            
            FileWriter object = new FileWriter("admission_registration.txt");
            
            object.write(name + "\n");
            object.write(father_name + "\n");
            object.write(contact_no + "\n");
            object.write(age+ "\n");
            object.write(email_address+ "\n");
            object.write(citizen);
            object.close();
        } 
        catch (IOException ex) {
    }
    }

}
class visa_registration extends FORM{

        String name;
        String father_name;
        String sex;
        String date_of_birth;
        String Civil_status;
        String identity_no;
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Father Name: ");
            father_name = obj.nextLine();
            System.out.println("Enter Your Sexuality: ");
            sex = obj.nextLine();
            System.out.println("Enter Your date of birth : ");
            date_of_birth = obj.nextLine();
            System.out.println("Enter Your Civil status ");
           Civil_status = obj1.nextLine();
            System.out.println("Enter Your identity number");
            identity_no = obj.nextLine();
            
            FileWriter object = new FileWriter("visa_egistration.txt");
            
            object.write(name + "\n");
            object.write(father_name + "\n");
            object.write(sex + "\n");
            object.write(date_of_birth+ "\n");
            object.write( Civil_status+ "\n");
            object.write( identity_no);
            object.close();
        } 
        catch (IOException ex) {
    }
    }

}
class domicile_registration extends FORM{

        String name;
        String father_name;
        String sex;
        String Trade_and_occupation;
        String Civil_status;
        String issue_date;
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Father Name: ");
            father_name = obj.nextLine();
            System.out.println("Enter Your Sexuality: ");
            sex = obj.nextLine();
            System.out.println("Enter Your trade and occupation : ");
            Trade_and_occupation = obj.nextLine();
            System.out.println("Enter Your Civil status ");
           Civil_status = obj1.nextLine();
            System.out.println("Enter Your issue_date");
            issue_date = obj.nextLine();
            
            FileWriter object = new FileWriter("visa_registration.txt");
            
            object.write(name + "\n");
            object.write(father_name + "\n");
            object.write(sex + "\n");
            object.write( Trade_and_occupation+ "\n");
            object.write( Civil_status+ "\n");
            object.write( issue_date);
            object.close();
        } 
        catch (IOException ex) {
    }
    }

}
class vechile_license extends FORM{

        String name;
        int age;
        String Cnic;
        String citizen;
        String vechile_no;
        String issue_date;
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter Your Name: ");
            name = obj.nextLine();
            System.out.println("Enter Your Age: ");
            age = obj.nextInt();
            System.out.println("Enter Your CNIC: ");
            Cnic = obj.nextLine();
            System.out.println("Enter Your citizen : ");
            citizen = obj.nextLine();
            System.out.println("Enter Your vechile number ");
            vechile_no = obj1.nextLine();
            System.out.println("Enter Your issue_date");
            issue_date = obj.nextLine();
            
            FileWriter object = new FileWriter("vechile_license.txt");
            
            object.write(name + "\n");
            object.write(age + "\n");
            object.write(Cnic + "\n");
            object.write(citizen+ "\n");
            object.write(vechile_no+ "\n");
            object.write(issue_date);
            object.close();
        } 
        catch (IOException ex) {
    }
    }

}
class property_registration extends FORM{

        String property_address;
        String   property_owner;
        String Cnic;
        String plot_no;
        String contact_no;
        String issue_date;
    @Override
    public void form() {
        try{       
            Scanner obj = new Scanner(System.in);
            Scanner obj1 = new Scanner(System.in);
            
            System.out.println("Enter the property address: ");
            property_address = obj.nextLine();
            System.out.println("Enter property owner name: ");
            property_owner = obj.nextLine();
            System.out.println("Enter Your CNIC: ");
            Cnic = obj.nextLine();
            System.out.println("Enter the plot no : ");
             plot_no = obj.nextLine();
            System.out.println("Enter Your contact number ");
            contact_no = obj1.nextLine();
            System.out.println("Enter Your issue_date");
            issue_date = obj.nextLine();
            
            FileWriter object = new FileWriter("property_registration.txt");
            
            object.write(property_address + "\n");
            object.write( property_owner + "\n");
            object.write(Cnic + "\n");
            object.write( plot_no+ "\n");
            object.write(contact_no+ "\n");
            object.write(issue_date);
            object.close();
        } 
        catch (IOException ex) {
    }
    }

}

interface read{
    abstract public void NIC();
    abstract public void B_FORM();
    abstract public void PASSPORT();
    abstract public void MATRIC();
    abstract public void INTERMEDIATE();
    abstract public void ADMISSION();
    abstract public void VISA();
    abstract public void DOMICILE();
    abstract public void VEHICLE();
    abstract public void PROPERTY();
}

class reading implements read{

    @Override
    public void NIC() {
    }

    @Override
    public void B_FORM() {
    }

    @Override
    public void PASSPORT() {
    }

    @Override
    public void MATRIC() {
    }

    @Override
    public void INTERMEDIATE() {
    }

    @Override
    public void ADMISSION() {
    }

    @Override
    public void VISA() {
    }

    @Override
    public void DOMICILE() {
    }

    @Override
    public void VEHICLE() {
    }

    @Override
    public void PROPERTY() {
    }
    
}
