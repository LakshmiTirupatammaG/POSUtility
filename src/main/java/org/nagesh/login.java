package org.nagesh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    static String Username;
    static String password;

    public static void getinput(){
        JFrame jframe = new JFrame("Login");

        // Create username label and text field
        JLabel usernameLabel = new JLabel("Enter Username");
        JTextField textField = new JTextField(10);

        // Create a panel to hold username elements
        JPanel usernamePanel = new JPanel();
        usernamePanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Set flow layout for username panel
        usernamePanel.add(usernameLabel);
        usernamePanel.add(textField);

        // Create password label and password field
        JLabel passwordLabel = new JLabel("Enter password");
        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setEchoChar('*');  // Set echo character (optional)

        // Create a panel to hold password elements
        JPanel passwordPanel = new JPanel();
        passwordPanel.setLayout(new FlowLayout(FlowLayout.LEFT));  // Set flow layout for password panel
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        // Create login button
        JButton loginButton = new JButton("Login");

        // Main panel to hold username and password panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical stacking

        // Add username and password panels to main panel
        mainPanel.add(usernamePanel);
        mainPanel.add(passwordPanel);

        // Add login button to main panel (optional - you can place it elsewhere)
        mainPanel.add(loginButton);

        jframe.getContentPane().add(mainPanel);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //start chrome


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Username = textField.getText();
                password = String.valueOf(passwordField.getPassword());
                rds_ops object = new rds_ops();
                object.createUIComponents();
                jframe.dispose();
                rds_test.setup();


            }
        });




    }
}
