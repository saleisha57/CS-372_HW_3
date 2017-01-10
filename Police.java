/**
 * This is a Police class that inherits from Person.
 */
import java.util.Random;

public class Police extends Person
    implements Employee
{
    String name, phone_number;
    int age, id_num;
    double money = 0;

    /**
     * An enum that contains the jobs available to the police.
     */
    public enum PoliceRole
    {
	Patrol,
	Sargent,
	Captain,
	Chief
    }

    private PoliceRole role;

    /**
     * The constructor that will set the names, ages, and phone numbers of the people.
     */

    public Police(String n, int a, String p)
    {
	super(n, a, p);

	name = n;
	age = a;
	phone_number = p;
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
     * Returns the police role.
     */
    public PoliceRole getRole() {return role;}
    
    /**
     * Sets the police role.
     */
    public void setRole(PoliceRole pr) 
    {
	role = pr; 
    }

    /**
     * Creates an id number for the police.
     */
    public void ask_id_num()
    {
	Random rand = new Random();	

        id_num = rand.nextInt()%99999+100000;
    }

     /**
     * Returns the id number of the person.
     */
    public int get_id()
    {
	return id_num;
    }

     /**
     * Pays the person.
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
