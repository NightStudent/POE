// Changed IDE because Processing was not working with me, or I was being dumb. 
// Also Eclipse has a proper darkmode that works.

import javax.swing.*;

import java.awt.event.*;  
//import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.GroupLayout;
// These are here in case i need to grab new imports.

class Task{
		
	//I mixed the class names up so this is the POE Part2 and UnitTest is unit test
	public static void addTask(){
	
		//Declarations
		String tName; //task name
		int tNum = 0; //Task's number
		String tDescrip; //Task Description
		int chaCount = 50; // charatcer count
		String devFName; // devoloper first name
		String devSName; // devoloper surname
		String tHour; //Number of hours to complete task.
		int total; //Total number of of hours of the tasks
		String tID; // task ID
		String tStatus; //task Status
		String sizer; // string size to convert into an int
		
		sizer = JOptionPane.showInputDialog("Enter size");
        int size = Integer.parseInt(sizer);      
    	   
       while (tNum < size)
       {tNum++;
          
        tName = JOptionPane.showInputDialog("Enter task name.");
        tDescrip = JOptionPane.showInputDialog("Enter Task Description.");
       
        
        devFName = JOptionPane.showInputDialog("Enter Dev First Name.");
        devSName = JOptionPane.showInputDialog("Enter dev Surname.");
        tHour = JOptionPane.showInputDialog("Enter task lenght in hours");  
        //intergar hours and Task hours
        int inTHour = Integer.parseInt(tHour); 
       // total = inTHour + total;
        tStatus = JOptionPane.showInputDialog("Enter task status.");

        JOptionPane.showMessageDialog(null, "Task Name: tName "
        		+ "\n Task Number is:+ tNum "
        		+ "\n Task Description: + tDescrip "
        		+ "\n Time: + tHour  "
        		+ "\n Status: + tStatus"
        		+ "Devoloper: + devFName + devSName"
        		+ "ID: + tID");
        // I tried to have a full report on a single page but the escape esqueences and varibvles were not working together.
        // I could not find anything online to help and the tutor's advice did not yield the desired results.
        }

return;
	
}
	
	public static void showReport() {
	
	JOptionPane.showMessageDialog(null,"Coming soon, needs more work.");
	
	// still needs to loop back
	// Shows a message currently, may be updated. 
	
	return;
}
	
	
	public static void main(String[]args)
	 { 

		//Declarations
		//int numTask; //number of tasks
		//int taskIDNum; // The task's number
		//String tDescrip; //Task Description
	 	//String devDetail; //details on the devoloper
		//double taskHours; //Number of hours to complete task.
		//String tID; // task ID
		//String taskSatus; 
	//	double taskHrTotal; //Total number of of hpurs of the tasks
		//int size;
		
		JFrame cPanel;  
		cPanel = new JFrame();
	      //creating a central control for all three parts of this task
	      
       JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
       
   
		JRadioButton option1 = new JRadioButton("1) Add Tasks");
		JRadioButton option2 = new JRadioButton("2) Review Report");
		JRadioButton option3 = new JRadioButton("3) Quit");
		
		option1.setBounds(20,30,150,30);
		option2.setBounds(20,70,150,30);
		option3.setBounds(20,120,150,30);
		ButtonGroup cButton = new ButtonGroup();
		cButton.add(option1);
		cButton.add(option2);
		cButton.add(option3);
		cPanel.add(option1);
		cPanel.add(option2);
		cPanel.add(option3);
		cPanel.setSize(250,250);
		cPanel.setLayout(null);
		cPanel.setVisible(true);
		
		option1.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	    	addTask();         
	    }  
	    }
	    ); 
		
	    option2.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	    	showReport();         
	    }  
	    }
	    ); 
		//reference JavaPoint
	    
	    
	// Reference JavaPoint Radio

	    option3.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	    	cPanel.dispose(); //Ends program
	    	
//Using a method failed to run so I did this.   
// reference StackHpwTo quit    
	    }  
	    }
	    ); 
      
	    
	 }
}

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class UnitTest
{
    Task testTasks = new Task();
    
    public UnitTest() {
    }

     @Test
    public void testCreateTaskID() 
    {
        String expected = "LO:1:BYN";
        String actual = testTasks.createTaskID("Add login Feature", 1, "Robyn");
        assertEquals(expected,actual);
                    
    }

    
    @Test
    public void testReturnTotalHours() 
    {
        
    }

    @Test
    public void testPrintTaskDetails() 
    {
        
        int expected = 80;
        int actual = testTasks.returnTotalHours(2, 40);
        assertEquals(expected,actual);
    }

    @Test
    public void testAddSlackTime() 
    {
        // TestingLoops
        int expected = 40;
        int actual = testTasks.addSlackTime(2, 20, 10);
        assertEquals(expected,actual);
    }


