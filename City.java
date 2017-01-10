import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

/**
 * This is a city class that will model police, teachers, and children in City halls and School.
 */
public class City extends JComponent implements MouseMotionListener
{
    int i_x, i_y;
    Image i_1, i_2;
    JFrame frame;

    public static void main(String[] args)
    {
	String background = "/images/Base_Grass.png";
	String person = "/images/child_f.gif";
	
	Image image = Toolkit.getDefaultToolkit().getImage(City.class.getResource(person));
	image = image.getScaledInstance(500, 500, Image.SCALE_DEFAULT);
	Image image_2 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(background));


	JFrame frame = new JFrame("Everton");
	frame.add( new City(image, image_2) );
	frame.setSize(500, 500);
	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	frame.setVisible(true);
	
    }

    public City(Image _i, Image _i_2)
    {
	i_1 = _i;
	i_2 = _i_2;
	
	init();
	
	addMouseMotionListener(this);
	
	frame.setVisible(true);
    }



    private void init()
    {
	/*
	frame = new JFrame();
	frame.setBounds(100, 100, 300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.setLayout(new FlowLayout());
	*/

	try
	    {
		frame.setLayout(new BorderLayout());
		Toolkit t = Toolkit.getDefaultToolkit();
		URL imgurl = getClass().getResource("/images/Base_Grass.png");
		Image img = t.getImage(imgurl);
		img = img.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
	
		ImageIcon icon = new ImageIcon(img);
		//JButton b = new JButton(icon);
		//frame.add(b);
		frame.add(new JButton(icon), BorderLayout.CENTER);		
	    }
	catch(Exception e) {;}





	System.out.println("Welcome to the city of Everton!\n");

	Police [] p = {new Police("Steve Ericson", 37, "124-9765"), new Police("Craig Mason", 42, "514-9875"), 
		       new Police("Heather James", 25, "831-6498"), new Police("Tyler Hen", 27, "456-8132")};
       	p[0].setRole(Police.PoliceRole.Patrol);
	p[1].setRole(Police.PoliceRole.Chief);
	p[2].setRole(Police.PoliceRole.Captain);
	p[3].setRole(Police.PoliceRole.Sargent);


	Teacher [] t = {new Teacher("Samantha Johnson", 28, "328-6475"), new Teacher("James Smith", 44, "657-6532")};
	t[0].setCert(Teacher.TeacherCert.Math);
	t[1].setCert(Teacher.TeacherCert.English);
       	

	Kid [] k = {new Kid("Faith Law", 10, "235-9876", "Candy Corn"), new Kid("Junie Lords", 11, "684-7956", "Gummy Worms"), 
		    new Kid("Ray Jones", 8, "254-6542", "Chocolate"), new Kid("John Smith", 10, "564-3185", "Chocolate")};

	City_Hall ch = new City_Hall("City Hall", "612 N Drive dr");
	School sc = new School("Everton Elementary", "254 W Arrow st");

	
	/*	
	int i;


	System.out.println("Police:");

	
	for(i = 0; i < p.length; i++)
	    {
		System.out.println(p[i].getRole() + ": " + p[i].get_name() + " is " + p[i].get_age() + 
				   " years old and has a phone number of " + p[i].get_phone() + ". Employee ID number: " + p[i].get_id());

		p[i].give_money(15.25);
		System.out.println(p[i].get_name() + " makes $" + p[i].show_money() + " an hour.");

		ch.add_to_array(p[i].get_name());
	    }
	System.out.println("\nIn " + ch.get_name() + " at " + ch.get_address() + ":");
	ch.show_people();
	System.out.println("");


	System.out.println("Teachers:");


	for(i = 0; i < t.length; i++)
	    {
		System.out.println("Grade " + t[i].getGrade() + " " + t[i].getCert() + " teacher: " + t[i].get_name() + " is " 
				   + t[i].get_age() + " years old and has a phone number of " 
				   + t[i].get_phone() + ". Employee ID number: " + t[i].get_id());
		t[i].give_money(10.25);
		System.out.println(t[i].get_name() + " makes $" + t[i].show_money() + " an hour.");

		sc.add_to_array(t[i].get_name());
	    }
	    System.out.println("");


	    System.out.println("Children:");


	for(i = 0; i < k.length; i++)
	    {
		System.out.println(k[i].get_name() + ": is " + k[i].get_age() + " years old and has a phone number of " 
				   + k[i].get_phone() + ". Favorite candy is: " + k[i].get_fav_candy());
		sc.add_to_array(k[i].get_name());
	    }	
	System.out.println("\nIn " + sc.get_name() + " at " + sc.get_address() + ":");
	sc.show_people();

	*/

    }



    public void mouseDragged(MouseEvent ev)
    {
	i_x = ev.getX();
	i_y = ev.getY();
	repaint();
    }


    public void mouseMoved(MouseEvent ev) {}

    public void paint(Graphics g) {
	Graphics2D g2 = (Graphics2D)g;
	g2.drawImage(imageField, 0, 0, this);
	g2.drawImage(image, imageX, imageY, this);
    }

    
}
