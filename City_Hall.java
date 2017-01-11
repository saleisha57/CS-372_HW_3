/**
  * City_Hall class that inherits from Building.
  */
import java.util.ArrayList;

public class City_Hall extends Building
{
    ArrayList<String> current_occ = new ArrayList<String>();
    String name;
    String address;
    
    /**
     * Constructor that sets up the name and address.
     */
    public City_Hall(String n, String ad)
    {
	super(n, ad);
	name = n;
	address = ad;
    }

    /**
     * Adds names to the ArrayList.
     */
    public void add_to_array(String nm)
    {
	current_occ.add(nm);
    }

    /**
     * Returns the name.
     */
    public String get_name()
    {
	return name;
    }

    /**
     * Returns the address.
     */
    public String get_address()
    {
	return address;
    }
    
    /**
     * Prints out the people in the ArrayList.
     */
    public void show_people()
    {
	for(String holder : current_occ)
	    System.out.println(holder);
    }

}