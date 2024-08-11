package Java_Projects.email_application;

import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String companySuffix="awt.com";
    private int mailBoxcapacity;
    private int defaultpasswordLen=8;
    private String alrenateEmail;
    
    // Constructor to recive the first name and last name
    public email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        // Call a method asking for the department - return the department 
        this.department=setDepartment();
        System.out.println("department : "+this.department);

        // Call a method thar returns a random password
        this.password=randomPassword(defaultpasswordLen);
        System.out.println("Your password is :"+this.password);
        email =firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("your email is : "+email);
    }

    // Ask for the department 
    private String setDepartment(){
        System.out.println("new worker "+firstName+" Enter the department\n1 for sales\n2 for development\n0 for none ");
        Scanner sc=new Scanner(System.in);
        int depChoice =sc.nextInt();
        if(depChoice==1){return "sales";}
        else if(depChoice==2){return "dev";}
        else {return "";}
    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMONPQRSTUVWXZ0123456789!@$%";
        char[] password= new char[length];
        for(int i=0;i<length;i++){
            int ran=(int)(Math.random()*passwordSet.length());
            password[i]=passwordSet.charAt(ran);
        }
        return new String(password);
    }
    // Set the mailbox capacity
    public void setMalibox(int capacity){
        this.mailBoxcapacity=capacity;

    }
    // Set altenate email
    public void setAlternateEmail(String atlEmail){
        this.alrenateEmail=atlEmail;
    }
    // change the password
    public void changePassword(String password){
        this.password=password;
    }
    public int getMailbox(){
        return mailBoxcapacity;
    }
    public String getAlternateEmail(){
        return alrenateEmail;
    }
    public String getpassword(){
        return password;
    }
    public String showinfo(){
        return "display name: "+firstName +" "+lastName +"\ncompany email "+email+"\nmailbox capacity "+mailBoxcapacity; 
    }

}
