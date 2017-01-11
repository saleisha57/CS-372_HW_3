/**
 * School class that inherits from Building.
 */
import java.util.ArrayList;

public class School extends Building
{
   ArrayList<String> current_occ = new ArrayList<String>();
    String name;
    String address;
    
    /**
     * Sets up the name and the address.
     */
    public School(String n, String ad)
    {
	super(n, ad);
	name = n;
	address = ad;
    }

    /**
     * Adds people to the array using their names.
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
     * Prints everyone from the ArrayList.
     */
    public void show_people()
    {
	for(String holder : current_occ)
	    System.out.println(holder);
    }

}
