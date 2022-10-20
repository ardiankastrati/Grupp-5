package common;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JFrame mainWindow;

    JMenuBar menuBar;

    JMenu mainMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem newOption;
    JMenuItem quitOption;

    JMenuItem addUserOption;
    JMenuItem exportExcelOption;
    JMenuItem importExcelOption;

    JTextField totalField;
    JTextField scoreField;
    JTextField resultField;

    JLabel totalLabel;
    JLabel addContestantLabel;
    JLabel chooseDiscLabel;
    JLabel scoreInputLabel;
    JLabel disciplineScoreLabel;

    JButton addResultButton;
    JButton clearResultButton;

    JComboBox<String> discDropDown;
    JComboBox<String> nameDropDown;

    ImageIcon topIcon = new ImageIcon("Icon.png");
    Font myFontBig = new Font("Serif",Font.PLAIN,35);
    Font myFontMedium = new Font("Serif",Font.PLAIN,20);
    Font myFontSmall = new Font("Serif",Font.PLAIN,15);

    MyFrame() {

        //<editor-fold desc="Drop down menu instancing">
        //The following section handles the creation of the dropdown menu for Disciplines.
        discDropDown = new JComboBox<String>();

        discDropDown.setFont(myFontSmall);
        discDropDown.addItem("Decathlon 100 meter Sprint");
        discDropDown.addItem("Decathlon 110 meter Hurdles");
        discDropDown.addItem("Decathlon 400 meter Sprint");
        discDropDown.addItem("Decathlon 1500 meter Sprint");
        discDropDown.addItem("Decathlon Discus throw");
        discDropDown.addItem("Decathlon High Jump");
        discDropDown.addItem("Decathlon Javelin Throw");
        discDropDown.addItem("Decathlon Long Jump");
        discDropDown.addItem("Decathlon Pole Vault");
        discDropDown.addItem("Decathlon Shot Put");
        discDropDown.setSize(256,25);
        discDropDown.setLocation(150,88);
        discDropDown.setBackground(Color.white);

        //The name dropdown is to be populated from an array that can be populated by the user.
        nameDropDown = new JComboBox<String>();

        nameDropDown.setFont(myFontSmall);
        nameDropDown.addItem("Adam");
        nameDropDown.addItem("Ardian");
        nameDropDown.addItem("Somayeh");
        nameDropDown.addItem("Jacob");
        nameDropDown.setBounds(150,40,256,25);
        nameDropDown.setBackground(Color.white);


        //</editor-fold>

        //<editor-fold desc="Menu instancing">
        //This creates the bar for the menu.
        menuBar = new JMenuBar();

        //The following sets up the main menu and it's subcategories.
        mainMenu = new JMenu("Main");
        mainMenu.setMnemonic(KeyEvent.VK_M); //This sets the keyboard shortcut for accessing the menu! M for Main in this case.

        newOption = new JMenuItem("New");
        quitOption = new JMenuItem("Quit");
        quitOption.setMnemonic(KeyEvent.VK_Q);
        newOption.setMnemonic(KeyEvent.VK_N);

        //The following sets up the edit menu and it's subcategories.
        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        addUserOption = new JMenuItem("Add competitor");
        exportExcelOption = new JMenuItem("Export to excel");
        importExcelOption = new JMenuItem("Import from excel");
        addUserOption.setMnemonic(KeyEvent.VK_A);
        exportExcelOption.setMnemonic(KeyEvent.VK_X);
        importExcelOption.setMnemonic(KeyEvent.VK_I);
        addUserOption.addActionListener(this); //Adds action listener to addUserOption to allow for actions upon pressing this.

        //This sets up the help menu.
        helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H);


        //</editor-fold>

        //<editor-fold desc="Main window instancing">
        mainWindow = new JFrame(); //Creates a new JFrame.
        mainWindow.setTitle("Decathlon calculator"); //Sets the title of the window.
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This sets the default operation when pressing the upper right "X".
        mainWindow.setResizable(false); //Stops the user from resizing the window at will.
        mainWindow.setSize(512,425); //Sets the size of the window.
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setLayout(null);
        mainWindow.setIconImage(topIcon.getImage()); //This sets the Icon on the top left side to topIcon.
        mainWindow.setBackground(Color.white); //Sets the default background color of the window.
        //</editor-fold>

        //<editor-fold desc="Field instancing">
        //The following field displays the total number of accumulated points for the user while not being editable.
        totalField = new JTextField();
        totalField.setBounds(280,300,200,50);
        totalField.setBackground(Color.white);
        totalField.setFont(myFontBig);
        totalField.setEditable(false); //This should be off, it controls if the user should be able to edit the field displaying the total score.
        //This sets up the field for input of scores.
        scoreField = new JTextField();
        scoreField.setBounds(150,140,256,25);
        scoreField.setBackground(Color.white);
        scoreField.setFont(myFontMedium);
        scoreField.setEditable(true);

        //This sets up an un-editable text field to display the score in the current Discipline.
        resultField = new JTextField();
        resultField.setBounds(150,185,256,25);
        resultField.setBackground(Color.white);
        resultField.setFont(myFontMedium);
        resultField.setEditable(false);
        //</editor-fold>

        //<editor-fold desc="Button instancing">
        //The following handles the creation of the button to add the result to the total.
        addResultButton = new JButton("Add");
        addResultButton.setBounds(335,225,70,25);
        addResultButton.setFont(myFontSmall);
        addResultButton.setFocusable(false); //Makes button not focusable, it just looks bad when focused!

        //The following handles the creation of the button to clear the entered information.
        clearResultButton = new JButton("Clear");
        clearResultButton.setBounds(260,225,70,25);
        clearResultButton.setFont(myFontSmall);
        clearResultButton.setFocusable(false);
        //</editor-fold>

        //<editor-fold desc="Label instancing">
        //The following lines handle the creation of the JLabels.
        totalLabel = new JLabel("Total");
        addContestantLabel = new JLabel("Name:");
        chooseDiscLabel = new JLabel("Discipline:");
        scoreInputLabel = new JLabel("Score:");
        disciplineScoreLabel = new JLabel("Result:");

        //The following code sets up the "Result text"
        totalLabel.setFont(myFontBig);
        totalLabel.setSize(150,100);
        totalLabel.setLocation(175,275);

        //This sets up the add contestant text.
        addContestantLabel.setFont( myFontMedium);
        addContestantLabel.setSize(150,100);
        addContestantLabel.setLocation(25,0);

        //This sets up the choose Discipline text.
        chooseDiscLabel.setFont(myFontMedium);
        chooseDiscLabel.setSize(150,100);
        chooseDiscLabel.setLocation(25,50);

        //This sets up the Score text.
        scoreInputLabel.setFont(myFontMedium);
        scoreInputLabel.setSize(150,100);
        scoreInputLabel.setLocation(25,100);

        //This sets up the Discipline result text.
        disciplineScoreLabel.setFont(myFontMedium);
        disciplineScoreLabel.setSize(150,100);
        disciplineScoreLabel.setLocation(25,150);
        //</editor-fold>

        //<editor-fold desc="Adding elements section.">

        //Adding the options to the Edit menu.
        editMenu.add(addUserOption);
        editMenu.add(exportExcelOption);
        editMenu.add(importExcelOption);

        //Adding the options to the Main menu.
        mainMenu.add(newOption);
        mainMenu.add(quitOption);

        //Adding the menus to the JBar.
        menuBar.add(mainMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        //Adding the menu bar to the window.
        mainWindow.add(menuBar);

        //Adding Field components to window.
        mainWindow.add(scoreField);
        mainWindow.add(nameDropDown);
        mainWindow.add(resultField);

        //Adding button components to window.
        mainWindow.add(addResultButton);
        mainWindow.add(clearResultButton);

        //Adds dropdown menus to the window.
        mainWindow.add(discDropDown);

        //Adding Label components to window.
        mainWindow.add(disciplineScoreLabel);
        mainWindow.add(scoreInputLabel);
        mainWindow.add(totalField);
        mainWindow.add(totalLabel);
        mainWindow.add(chooseDiscLabel);
        mainWindow.add(addContestantLabel);

        mainWindow.setJMenuBar(menuBar);
        mainWindow.setVisible(true); //Makes the window visible.
        //</editor-fold>






    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addUserOption) {
            mainWindow.dispose();
            AddWindow addMenu = new AddWindow();
        }

    }
}
