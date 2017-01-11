import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

/**
 * This is a city class that will model police, teachers, and children in City halls and School.
 */
public class City extends JComponent implements MouseMotionListener
{
    /**
	 * 
	 */
	int i_x, i_y;
    Image i_1, i_3;
    JFrame frame;

    public static void main(String[] args)
    {
    	City c = new City();	
    }

    public City()
    {
    	display();
   	}

    private void init(Image _i, Image _i_2)
    {    	
   i_1 = _i;
   i_3 = _i_2;

    frame = new JFrame("Everton");
   	frame.getContentPane().setBackground(new Color(26, 124, 58));
   	frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
  	frame.setSize(500, 500);
   	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	
	System.out.println("Welcome to the city of Everton!\n");

	show_city();
    }

    
    
    
    
    
    
    public void mouseDragged(MouseEvent ev)
    {
	i_x = ev.getX();
	i_y = ev.getY();
	repaint(); //USE ELFE IF FOR DRAGGING
    }

    
    
    
    
    

    public void mouseMoved(MouseEvent ev) {}

    public void paint(Graphics g) {
	Graphics2D g2 = (Graphics2D)g;
	g2.drawImage(i_3, i_x, i_y, this);
	g2.drawImage(i_1, i_x, i_y, this);
    }
    
    
    
    
    
    
    
    private void display()
    {
    	String person = "/images/child_m.gif";
    	String police_i = "/images/police_in_building_1.gif";
    	    	   	
    	Image image = Toolkit.getDefaultToolkit().getImage(City.class.getResource(person));
    	image = image.getScaledInstance(85, 85, Image.SCALE_DEFAULT);
    	    	    	
    	    	    	
    	Image image_3 = Toolkit.getDefaultToolkit().getImage(City.class.getResource(police_i));
    	image_3 = image_3.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    		
    	init(image, image_3);
    		
    	frame.setVisible(true);
    		
    	addMouseMotionListener(this);
    }
    
 
    
    	
    	
    private void show_city()
    {
    	Police p = new Police("Steve Ericson", 37, "124-9765");
        p.setRole(Police.PoliceRole.Patrol);



    	Teacher te = new Teacher("Samantha Johnson", 28, "328-6475");
    	te.setCert(Teacher.TeacherCert.Math);      	

    	Kid k = new Kid("Faith Law", 10, "235-9876", "Candy Corn");

    	City_Hall ch = new City_Hall("City Hall", "612 N Drive dr");
    	School sc = new School("Everton Elementary", "254 W Arrow st");
    	
    	ch.show_people();
       	
    	sc.show_people();
    	
    	
    	
    	try
        {
    	
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/child_m.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(85, 85, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	JButton b = new JButton(icon);
    	b.setBorderPainted(false);
    	b.setContentAreaFilled(false);
    	b.setFocusPainted(false);
    	b.setOpaque(false);
    	
    	b.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
          		System.out.println("\n" + k.get_name() + ": is " + k.get_age() + " years old and has a phone number of " 
          				   + k.get_phone() + ". Favorite candy is: " + k.get_fav_candy());
          		sc.add_to_array(k.get_name());
                }
              });
    	
    	frame.add(b);
        }
    catch(Exception e) {;}	
    	

    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/teacher_f.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	JButton bt = new JButton(icon);
    	bt.setBorderPainted(false);
    	bt.setContentAreaFilled(false);
    	bt.setFocusPainted(false);
    	bt.setOpaque(false);
    	
    	bt.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\nGrade " + te.getGrade() + " " + te.getCert() + " teacher: " + te.get_name() + " is " 
       				   + te.get_age() + " years old and has a phone number of " 
       				   + te.get_phone() + ". Employee ID number: " + te.get_id());
       		te.give_money(10.25);
       		System.out.println(te.get_name() + " makes $" + te.show_money() + " an hour.");
       		sc.add_to_array(te.get_name());
                }
    	});
              
    	
    	frame.add(bt);
        }
    catch(Exception e) {;}
    	
    	
    	
    	
    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/police_in_building_1.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	JButton bto = new JButton(icon);
    	bto.setBorderPainted(false);
    	bto.setContentAreaFilled(false);
    	bto.setFocusPainted(false);
    	bto.setOpaque(false);
    	
    	bto.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\n" + p.getRole() + ": " + p.get_name() + " is " + p.get_age() + 
       				   " years old and has a phone number of " + p.get_phone() + ". Employee ID number: " + p.get_id());
       		p.give_money(15.25);
       		System.out.println(p.get_name() + " makes $" + p.show_money() + " an hour.");
       		ch.add_to_array(p.get_name());
                }
    	});
              
    	
    	frame.add(bto);
        }
    catch(Exception e) {;}
    	
    	
    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/CityHall.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	JButton bton = new JButton(icon);
    	bton.setBorderPainted(false);
    	bton.setContentAreaFilled(false);
    	bton.setFocusPainted(false);
    	bton.setOpaque(false);
    	
    	bton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\n" + ch.get_name() + " at " + ch.get_address() + ".");
                }
    	});
              
    	
    	frame.add(bton);
        }
    catch(Exception e) {;}
    	
    	
    	
    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/New Piskel.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	JButton bt = new JButton(icon);
    	bt.setBorderPainted(false);
    	bt.setContentAreaFilled(false);
    	bt.setFocusPainted(false);
    	bt.setOpaque(false);
    	
    	bt.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\n" + sc.get_name() + " at " + sc.get_address() + ".");
                }
    	});
              
    	
    	frame.add(bt);
        }
    catch(Exception e) {;}
    }
   
    
    
    
    
    
    

    
}