package org.nagesh;

import org.openqa.selenium.Alert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class rds_ops extends JFrame  {

    public  JPanel rdsPane;
    public  JLabel store_num_label;
    public  JTextField store_num;
    public  JTextField reg_num;
    public  JTextField bus_date;
    public  JButton getTransactionDataButton;
    public  JButton getRedeemableGCButton;
    public  JButton getRedeemableStoreCreditButton;
    public  JButton getReasonCodesAndButton;
    public  JButton getDiscountCodesAndButton;
    public   JSeparator seperatro;
    public  JButton findCommonItemsButton;
    public   JTextField second_store_num;

    public static String store_num1;
    public static String store_num2;
    public static String register_num;
    public static String business_data;




    public rds_ops() {
        bus_date.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (bus_date.getText().equals("01-JAN-24")) {
                    bus_date.setText("");
                    bus_date.setForeground(Color.BLACK);}
                super.focusGained(e);

            }

            @Override
            public void focusLost(FocusEvent e) {
                if (bus_date.getText().equals("")) {
                    bus_date.setText("01-JAN-24");
                    bus_date.setForeground(Color.BLACK);

                }
                super.focusLost(e);
            }
        });

    }

    public void createUIComponents() {

        // TODO: place custom component creation code here
        setContentPane(rdsPane);
        setTitle("RDS operations");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();


        getTransactionDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                store_num1 = store_num.getText();
                store_num2 = second_store_num.getText();
                register_num = reg_num.getText();
                business_data = bus_date.getText()+"%";

                if(!(store_num1.equals("")) && !(register_num.equals("")) ){

                    rds_test.verify();
                    rds_test.getTransactionData();
                    //System.out.println("f value in ops"+rds_test.f);
                    if(rds_test.f){
                        JOptionPane.showMessageDialog(rdsPane, "File Downloaded in downloads");
                    }
                    else{
                        JOptionPane.showMessageDialog(rdsPane, "No data found");
                    }

                }
                else{
                    JOptionPane.showMessageDialog(rdsPane, "Please enter Store and Register number");
                }

            }
        });


        getRedeemableGCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        getRedeemableStoreCreditButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rds_test.getredeemableStoreCredit();

            }
        });

        getReasonCodesAndButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        getDiscountCodesAndButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        findCommonItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }

}
