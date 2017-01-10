/**
 * This is the teacher class that inherits from person.
 */

import java.util.Random;

public class Teacher extends Person
    implements Employee
{
    String name, phone_number;
    int age, id_num, grade_level;
    double money = 0;
    Random r = new Random();


    /**
     * Enum of teaching certificates.
     */
    public enum TeacherCert
    {
	Math,
	English,
	History,
	Art
    }

    private TeacherCert cert;
    
    /**
     * Constructor that sets up the teachers information.
     */
    public Teacher(String n, int a, String p)
    {
	super(n, a, p);
	name = n;
	age = a;
	phone_number = p;
	grade_level = r.nextInt((12-1)+1) + 1;
	ask_id_num();
    }

    /**
     * Returns the name of the person.
     */
    public String get_name()
    {
	return name;
    }

    /**
     * Returns the age of the person.
     */
    public int get_age()
    {
	return age;
    }
    
    /**
     * Returns the phone number of the person.
     */
    public String get_phone()
    {
	return phone_number;
    }

    /**
     * Returns the grade level of the person.
     */
    public int getGrade()
    {
	return grade_level;
    }

    /**
     * Returns the certificate of the teacher.
     */
    public TeacherCert getCert() {return cert;}
    
    /**
     * Sets the certificate of the teacher..
     */
    public void setCert(TeacherCert ct) 
    {
	cert = ct; 
    }

    /**
     * Creates an id number for the teacher.
     */
    public void ask_id_num()
    {
        id_num = r.nextInt()%99999+100000;
    }


    /**
     * Returns the id number of the person.
     */
    public int get_id()
    {
	return id_num;
    }

    
    /**
     * Adds to the amount of money.
     */
    public void give_money(double amt)
    {
	money += amt;
    }

    /**
     * Returns the money.
     */
    public double show_money()
    {
	return money;
    }
    
}
