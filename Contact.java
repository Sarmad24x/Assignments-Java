package Assignment;

import java.util.Scanner;

public class Contact {
    private String f_name,l_name,phone,email,dob,id;
    public Contact(String f,String l, String p,String e, String d, String i)
    {
        this.f_name=f;
        this.l_name=l;
        this.phone=p;
        this.email=e;
        this.dob=d;
        this.id=i;
    }
    public String getF_name() {
        return f_name;
    }
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }
    public String getL_name() {
        return l_name;
    }
    public void setL_name(String l_name) {
        this.l_name = l_name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class ContactList
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Contact c = new Contact("s", "d", "f", "e", "q", "r");
        System.out.println("Press 1 to Add a Contact\n" +
                "Press 2 to Exit..");
        System.out.print("Enter Here: ");
        int choice = s.nextInt();
        while (choice==1)
        {
            if (choice==1) {
                System.out.println("Enter Your First Name: ");
                c.setF_name(s.next());
                System.out.println("Enter Your Last Name: ");
                c.setL_name(s.next());
                System.out.println("Enter Your Phone Number: ");
                c.setPhone(s.next());
                System.out.println("Enter Your E-mail: ");
                c.setEmail(s.next());
                System.out.println("Enter Your Date of Birth: ");
                c.setDob(s.next());
                System.out.println("Enter Your ID: ");
                c.setId(s.next());
                System.out.println("First Name: " + c.getF_name());
                System.out.println("Last Name: " + c.getL_name());
                System.out.println("Phone Number: " + c.getPhone());
                System.out.println("E-mail: " + c.getEmail());
                System.out.println("Date of Birth: " + c.getDob());
                System.out.println("ID: " + c.getId());
                System.out.println("Do You Want To Another Number: (Yes/No)");
                String choice_2=s.next();
                if (choice_2.equals("yes"))
                {
                    continue;
                }
                else {
                    System.out.println("Exiting...");
                    break;
                }
            } else if (choice == 2) {
                System.out.println("Exiting...");
            }
        }
    }
}