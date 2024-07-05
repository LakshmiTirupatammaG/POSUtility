package org.nagesh;

import org.openqa.selenium.Alert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rds_ops extends JFrame {

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

                if(store_num1 !=null && register_num !=null && business_data !=null){
                    rds_test.verify();
                    rds_test.getTransactionData();

                }
                else {
                    JOptionPane.showMessageDialog(rdsPane ,"Please enter Store ,Register and Business Date");
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
