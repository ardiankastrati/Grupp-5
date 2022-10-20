package common;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddWindow implements ActionListener {

    JFrame addWindowFrame = new JFrame();
    JLabel addUserText = new JLabel("Name: ");
    ImageIcon topIcon = new ImageIcon("Icon.png");

    JButton addButton;
    JButton clearButton;
    public JTextField addUserField;

    public ArrayList<String> Users = new ArrayList<String>();

    AddWindow() {



        addUserField = new JTextField();
        addUserField.setBounds(60,20,200,25);
        addUserField.setBackground(Color.white);
        addUserField.setFont(new Font("Serif",Font.PLAIN,20));
        addUserField.setEditable(true);

        addButton = new JButton("Add");
        addButton.setBounds(275,20,70,25);
        addButton.setFont(new Font("Serif",Font.PLAIN,15));
        addButton.setFocusable(false);
        addButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.setBounds(350,20,70,25);
        clearButton.setFont(new Font("Serif",Font.PLAIN,15));
        clearButton.setFocusable(false);
        clearButton.addActionListener(this);

        addUserText.setBounds(5,17,100,25);
        addUserText.setFont(new Font("Serif",Font.PLAIN,20));

        addWindowFrame.add(addButton);
        addWindowFrame.add(clearButton);
        addWindowFrame.add(addUserText);
        addWindowFrame.add(addUserField);

        addWindowFrame.setTitle("Add new competitor");
        addWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowFrame.setSize(512,100);
        addWindowFrame.setLocationRelativeTo(null);
        addWindowFrame.setLayout(null);
        addWindowFrame.setVisible(true);
        addWindowFrame.setIconImage(topIcon.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addButton){
            String textToAdd = addUserField.getText();
            Users.add(textToAdd);
            /*for(int i=0;i < Users.size();i++){
                System.out.println(Users.get(i));
            }*/
            addWindowFrame.dispose();
            MyFrame mainWindow = new MyFrame();
        }
        if (e.getSource()==clearButton){
            addUserField.setText("");
        }

    }
}
