import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;

/**
 * This is a city class that will model police, teachers, and children in City halls and School. Will display graphics that will allow the user to see information about buildings, and people. Will be able to drag and drop the people.
 */
public class City extends JComponent implements MouseMotionListener, MouseListener
{
    /**
	 * 
	 */
	int i_x = 0, i_y = 0;
   // Image i_1, i_3;
    JFrame frame;
    ArrayList<String> outside = new ArrayList<String>();
    JLabel kid;
    JLabel teacher;
    JLabel police;
    JLabel city_hall;
    JLabel school;
    boolean drag = false;

/** 
 * Creates a city.
 */
    public static void main(String[] args)
    {
    	City c = new City();	
    }

/** 
 * Calls init.
 */
    public City()
    {
    	init();
   	}

    
    private void init()
    {
    frame = new JFrame("City of Everton");
   	frame.getContentPane().setBackground(new Color(26, 124, 58));
   	frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
  	frame.setSize(500, 500);
   	frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	
	System.out.println("Welcome to the city of Everton!\n");

	show_city();
	frame.setVisible(true);
    }
   
    
     /** 
     * Sets the location that the person is being dragged to and repaints as they are dragged.
     */  
        
    public void mouseDragged(MouseEvent ev)
    {
    	
    	if(drag == true)
    	{
    		JComponent j = (JComponent)ev.getSource();
    		j.setLocation(j.getX()+ev.getX(), j.getY()+ev.getY());
    		repaint();
    	}
		
    }

    
    /** 
     * Sets drag to false
     */  
        
    public void mouseReleased(MouseEvent ev)
    {
    	drag = false;
    }
    
    /** 
     * Sets drag to true depending on the source of the click
     */  
        
    public void mousePressed(MouseEvent ev)
    {
    	if(ev.getSource() == police)
    	{
    		drag = true;
    	}
    	else if(ev.getSource() == teacher)
    	{
    		drag = true;
    	}
    	
    	else if(ev.getSource() == kid)
    	{
    		drag = true;
    	}
    	
    }
    
    
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseMoved(MouseEvent ev) {}
    public void paint(Graphics g) {}
    
    
     private void show_city()
    {
    	Police p = new Police("Steve Ericson", 37, "124-9765");
        p.setRole(Police.PoliceRole.Patrol);
        
        Teacher te = new Teacher("Samantha Johnson", 28, "328-6475");
    	te.setCert(Teacher.TeacherCert.Math);      	

    	Kid k = new Kid("Faith Law", 10, "235-9876", "Candy Corn");

    	City_Hall ch = new City_Hall("City Hall", "612 N Drive dr");
    	School sc = new School("Everton Elementary", "254 W Arrow st");	
    	
    	
    	outside.add(p.get_name());
    	outside.add(te.get_name());
    	outside.add(k.get_name());
    	    	
    	
    	try
        {
    	
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/child_m.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(85, 85, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	kid = new JLabel(icon);
    	JButton b = new JButton("Info");
    	b.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
          		System.out.println("\n" + k.get_name() + " is " + k.get_age() + " years old and has a phone number of " 
          				   + k.get_phone() + ". Favorite candy is: " + k.get_fav_candy());
          		 }
              });
    	
    	frame.add(kid);
    	frame.getContentPane().add(b);
        }
    catch(Exception e) {;}	
    	

    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/teacher_f.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	teacher = new JLabel(icon);
    	JButton bt = new JButton("Info");    	
    	bt.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\nGrade " + te.getGrade() + " " + te.getCert() + " teacher: " + te.get_name() + " is " 
       				   + te.get_age() + " years old and has a phone number of " 
       				   + te.get_phone() + ". Employee ID number: " + te.get_id());
       		te.give_money(10.25);
       		System.out.println(te.get_name() + " makes $" + te.show_money() + " an hour.");
       		   }
    	});
              
    	frame.add(teacher);
    	frame.getContentPane().add(bt);
        }
    catch(Exception e) {;}    	
    	
    	
    	
    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/police_in_building_1.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	police = new JLabel(icon);
    	JButton bto = new JButton("Info");
    	
  	bto.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\n" + p.getRole() + ": " + p.get_name() + " is " + p.get_age() + 
       				   " years old and has a phone number of " + p.get_phone() + ". Employee ID number: " + p.get_id());
       		p.give_money(15.25);
       		System.out.println(p.get_name() + " makes $" + p.show_money() + " an hour.");
       		   }
    	});
              
    	frame.add(police);
    	frame.getContentPane().add(bto);
        }
    catch(Exception e) {;}
    	
    	
    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/CityHall.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	city_hall = new JLabel(icon);
    	JButton bton = new JButton("Info");
    	
	bton.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\n" + ch.get_name() + " at " + ch.get_address() + ". \nIn building: ");
            	  ch.show_people();
                }
    	});
              
    	frame.add(city_hall);
    	frame.getContentPane().add(bton);
        }
    catch(Exception e) {;}
    	
    	
    	
    	try
        {		
    	Toolkit t = Toolkit.getDefaultToolkit();
    	URL imgurl = getClass().getResource("/images/New Piskel.gif");
    	Image img = t.getImage(imgurl);
    	img = img.getScaledInstance(100, 100, Image.SCALE_DEFAULT);

    	ImageIcon icon = new ImageIcon(img);
    	school = new JLabel(icon);
    	JButton bt = new JButton("Info");
    	
   	bt.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent ae) {
            	  System.out.println("\n" + sc.get_name() + " at " + sc.get_address() + ". \nIn building: ");
            	  sc.show_people();
                }
    	});
              
    	frame.add(school);
    	frame.getContentPane().add(bt);
        }
    catch(Exception e) {;}
   
 
   
    	JButton button = new JButton("Outside");
    	
    	frame.add(button);
    	System.out.println("");
       	button.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent ae) {
                	  for(String holder : outside)
                		    System.out.println("Outside: " + holder);
                    }
        	});  
   
   
       police.addMouseListener(this);
       police.addMouseMotionListener(this);
       
       teacher.addMouseListener(this);
       teacher.addMouseMotionListener(this);
       
       kid.addMouseListener(this);
       kid.addMouseMotionListener(this);
    	 
      
   
    
    
    }
    
    

    
}