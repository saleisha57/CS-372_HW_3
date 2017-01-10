/**
 * Abstract class that provides functions for City_Hall.java and School.java.
 */
public abstract class Building
{
    String name, address;

    /**
     * Constructor of the Building class thats sets up the name and address.
     */
    public Building(String n, String ad)
    {
	name = n;
	address = ad;
    }

    abstract void add_to_array(String nm);
    
    abstract void show_people();
    
    abstract String get_name();

    abstract String get_address();

}
