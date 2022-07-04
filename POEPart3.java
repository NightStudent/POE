
// Changed IDE because Processing was not working with me, or I was being dumb. 
// Also Eclipse has a proper darkmode that works.

//ST10033578 POE Part 3.1
//Having different versions made for enjoyable progression.

import javax.swing.*;
import java.awt.event.*;  
//import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Arrays;
import javax.swing.GroupLayout;

// These are here in case i need to grab new imports.

public class POEPart3{

        String [] tName ={"BLANK", "BLANK", "BLANK", "BLANK"}; //task name
	    private int tNum = 0; //Task's number
	    String sizer;
		String [] devFName = {"Mike", "Edward", "Samantha", "Glenda"}; // devoloper first name
		String [] devSName = {"Smith", "Harrison", "Paulson", "Oberholzer"}; // devoloper surname{"BLANK", "BLANK", "BLANK", "BLANK", "BLANK"};
		String [] tHour = {"5", "8", "2", "1"}; //Number of hours to complete task.
		String [] tID = {"Mi:Sm:5", "ED:Ha:8", "Sa:Pa:2", "Gl:Ob:11"}; // task ID
		String [] tStatus = {"To DO", "Doing", "Done", "To Do"}; //task Status
		int [] inTHour = {5, 6, 2, 11,};
		String sName;
    	// search name, the name the user wishes to search 
		int sCount;
		// intergar used to keep track of all counters and elements.
		
	//Part 2
	//I mixed the class names up so this is the POE Part2 and UnitTest is unit test
	public void addTask(){
	
	
		
			sizer = JOptionPane.showInputDialog("Enter the number of times you wish to create a kanban");
        int size = Integer.parseInt(sizer); 
        // converts sizer into an int.
    	   
       while (tNum < size)
       {
    
       
       tName[tNum] = JOptionPane.showInputDialog("Enter task name.");
    //JOptionPane.showMessageDialog(null,tName); //test code  	  
    //tDescrip[tNum] = JOptionPane.showInputDialog("Enter Task Description.");        
      devFName[tNum] = JOptionPane.showInputDialog("Enter dev first name.");
      devSName[tNum] = JOptionPane.showInputDialog("Enter dev Surname.");
      tHour[tNum] = JOptionPane.showInputDialog("Enter task lenght in hours");  
    //intergar hours and Task hours
    //inTHour[tNum] = Integer.parseInt(tHour[tNum]); 
      tID[tNum] = JOptionPane.showInputDialog("Enter task ID");  
      tStatus[tNum] = JOptionPane.showInputDialog("Enter task status.");
    //Commented out parts that are not needed for aprt3
    //tNum used to tell code which element is being used
 
  	
      JOptionPane.showMessageDialog(null, "Task Name: " + tName[tNum]  + "\n Time: " + tHour[tNum] + "\n Status: "+ tStatus[tNum] + "\n Devoloper: "+ devFName[tNum] + devSName[tNum] + "\n ID: "+ tID[tNum]);
   	
      tNum++;  	
     	// Chnanged tNum to the end
     	// as to all tNum be used in the editing of arrays
  

       }
 return;
   
	}
	
    //Part 3
	public void showReport() {
		
		
		JFrame fPanel;  
		fPanel = new JFrame();
     // fPanel for filter panel
		
		JRadioButton option1 = new JRadioButton("1) Filter: Done Tasks");
		JRadioButton option2 = new JRadioButton("2) Filter: Longest Duration");
		JRadioButton option3 = new JRadioButton("3) Filter: Search Task Name");
		JRadioButton option4 = new JRadioButton("4) Filter: Search Devoloper");
		JRadioButton option5 = new JRadioButton("5) Filter: Delete Task");
		JRadioButton option6 = new JRadioButton("6) Filter: Display full Report");
		JRadioButton option7 = new JRadioButton("7) Back");
      //Asks user which filter option they wish to use.
		
		option1.setBounds(20,30,150,30);
		option2.setBounds(20,70,150,30);
		option3.setBounds(20,120,150,30);
		option4.setBounds(20,160,150,30);
		option5.setBounds(20,200,150,30);
		option6.setBounds(20,240,150,30);
		option7.setBounds(20,280,150,30);

		//Instruction to action listener
		ButtonGroup fButton = new ButtonGroup();
		fButton.add(option1);
		fButton.add(option2);
		fButton.add(option3);
		fPanel.add(option1);
		fPanel.add(option2);
		fPanel.add(option3);
		fPanel.add(option4);
		fPanel.add(option5);
		fPanel.add(option6);
		fPanel.add(option7);


		fPanel.setSize(500,500);
		fPanel.setLayout(null);
		fPanel.setVisible(true);
		
		option1.addActionListener(new ActionListener()
		    {  
		    public void actionPerformed(ActionEvent e)
			    {  
			        
		    	Arrays.sort(tStatus);
		    	sName = tStatus + "" + (Arrays.binarySearch(devFName, sCount));
			        
			    }  
		    }
	    ); 
		
	    option2.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
	    }  
	    }
	    ); 
		
		
	    option3.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	     	
	    	sName = JOptionPane.showInputDialog("Enter task you wish to seacrh for");
	    	Arrays.sort(tName);
	    	sName = devSName + "" + (Arrays.binarySearch(devFName, sCount));
	        JOptionPane.showMessageDialog(null,"Devoloper: " + devFName [sCount] + devSName[sCount] + " \n Task Name" + tName + "\n Status: " + tStatus[sCount]);
	
	    }  
	    }
	    ); 
		
	    option4.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	       
	    	sName = JOptionPane.showInputDialog("Enter name you wish to seacrh for");
	    	Arrays.sort(devSName);
	    	sName = devSName + " found at index" + (Arrays.binarySearch(devFName, sCount));
	        JOptionPane.showMessageDialog(null,"Devoloper: " + devFName [sCount] + devSName[sCount] + " \n Task Name" + tName + "\n Status: " + tStatus[sCount]);
	    	
	    }  
	    }
	    ); 
	    
	    option5.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
	    	
	    }  
	    }
	    ); 
	    
	    option6.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	    	sName = JOptionPane.showInputDialog("Enter which task you wish to delete");
	    	Arrays.sort(tName);
	    	sName = devSName + "" + (Arrays.binarySearch(tName, sCount));
	    	tName[sCount] = null;

	    }  
	    }
	    ); 
	    
	    option7.addActionListener(new ActionListener()
	    {  
	    public void actionPerformed(ActionEvent e)
	    {  
	    	fPanel.dispose(); //Ends program
	    	
	    }  
	    }
	    ); 
		
		
		
		
	return;
}
	
	
	    
	    
	    
	    
	    
	    
	public static void main(String[]args)
	 { 
		
		
		
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

