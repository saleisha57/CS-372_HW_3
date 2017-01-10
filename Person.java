/**
 * This is a person class that will be the base for Police.java, Teacher.java, and Kid.java.
 */
public class Person
{
    String name, phone_number;
    int age;
    /**
     * The constructor that will set the names, ages, and phone numbers of the people.
     */

    public Person(String n, int a, String p)
    {
	setName(n);
	setAge(a);
	setPhone(p);
    }
    
    private void setName(String _n)
    {
	name = _n;
    }
    private void setAge(int _a)
    {
	age = _a;
    }
    private void setPhone(String _p)
    {
	phone_number = _p;
    }

    /**
     * Returns the name of the person.
     */

    public String getName()
    {
	return name;
    }

    /**
     * Returns the age of the person.
     */
    public int getAge()
    {
	return age;
    }

    /**
     * Returns the phone number of the person.
     */
    public String getPhone()
    {
	return phone_number;
    }
    
    
}
