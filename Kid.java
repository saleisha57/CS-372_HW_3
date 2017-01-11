/**
 * Kid class that inherits from Person.
 */
public class Kid extends Person
{
    String fav_candy, name, phone_number;
    int age;
    
    /**
     * Sets up the Kid using the provided information.
     */
    public Kid(String n, int a, String p, String candy)
    {
	super(n, a, p);
	name = n;
	age = a;
	phone_number = p;
	set_fav_candy(candy);
    }
    

    /**
     * Sets the kids favorite candy.
     */
    public void set_fav_candy(String c)
    {
	fav_candy = c;
    }

    /**
     * Returns the favorite candy.
     */
    public String get_fav_candy()
    {
	return fav_candy;
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
    
    
}
