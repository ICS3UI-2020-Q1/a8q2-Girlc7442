import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;

  JLabel firstLabel;
  JLabel secondLabel;
  JLabel resultLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField thirdInput;

  JButton addBtn;
  JButton subBtn;
  JButton multBtn;
  JButton divBtn;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
    //initialize the main JPanel
    mainPanel = new JPanel();
    //disable layout helpers
    mainPanel.setLayout(null);

    //initialize the labels
    firstLabel = new JLabel("First Number");
    secondLabel = new JLabel("Second Number");
    resultLabel = new JLabel("Result");

    //set location and bounds
    firstLabel.setBounds(50,25,200,25);
    secondLabel.setBounds(50,75,200,25);
    resultLabel.setBounds(50,125,200,25);

    //initialize the text fields
    firstInput = new JTextField();
    secondInput = new JTextField();
    thirdInput = new JTextField();

    //set location and bounds
    firstInput.setBounds(300,25,200,25);
    secondInput.setBounds(300,75,200,25);
    thirdInput.setBounds(300,125,200,25);

    //initialize the buttons
    addBtn = new JButton("Add");
    subBtn = new JButton("Sub");
    multBtn = new JButton("Mul");
    divBtn = new JButton("Div");

    //add an action listener to the buttons 
    addBtn.addActionListener(this);
    subBtn.addActionListener(this);
    multBtn.addActionListener(this);
    divBtn.addActionListener(this);

    //set the action command on the buttons
    addBtn.setActionCommand("Add");
    subBtn.setActionCommand("Sub");
    multBtn.setActionCommand("Mul");
    divBtn.setActionCommand("Div");

    //set location and bounds
    addBtn.setBounds(50,200,100,25);
    subBtn.setBounds(175,200,100,25);
    multBtn.setBounds(300,200,100,25);
    divBtn.setBounds(425,200,100,25);

    //add the buttons to the main panel
    mainPanel.add(addBtn);
    mainPanel.add(subBtn);
    mainPanel.add(multBtn);
    mainPanel.add(divBtn);

    //add the text fields to the main panel
    mainPanel.add(firstInput);
    mainPanel.add(secondInput);
    mainPanel.add(thirdInput);

    //add the labels to the main panel
    mainPanel.add(firstLabel);
    mainPanel.add(secondLabel);
    mainPanel.add(resultLabel);

    //add the panel to the window
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    //perform the operation requested
    if(command.equals("Add")){
      //get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      
      //change the string into an integer
      double a = Double.parseDouble(firstText);
      double b = Double.parseDouble(secondText);
     
      //display the added result
      thirdInput.setText("" + (a + b));
    }else if(command.equals("Sub")){
      //get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      
      //change the string into an integer
      double a = Double.parseDouble(firstText);
      double b = Double.parseDouble(secondText);
     
      //display the subtracted result
      thirdInput.setText("" + (a - b));
    }else if(command.equals("Mul")){
      //get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      
      //change the string into an integer
      double a = Double.parseDouble(firstText);
      double b = Double.parseDouble(secondText);
      
      //display the multiplied result
      thirdInput.setText("" + (a * b));
    }else if(command.equals("Div")){
      //get the text from each text box
      String firstText = firstInput.getText();
      String secondText = secondInput.getText();
      
      //change the string into an integer
      double a = Double.parseDouble(firstText);
      double b = Double.parseDouble(secondText);
      
      //display the division result
      thirdInput.setText("" + (a / b));
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
