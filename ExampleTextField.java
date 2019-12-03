/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author ilckom
 */
import java.awt.*;
import javax.swing.*;
public class ExampleTextField extends JFrame{
    private JTextField txt1;
    private JPasswordField pss1;
    private JTextArea txtA1;
    public ExampleTextField(){
        Container b = getContentPane();
        setLayout(new FlowLayout());
        //Penggunaan Text Field
        txt1 = new JTextField(10);
        b.add(txt1);
        //Penggunaan Password Field
        pss1 = new JPasswordField(10);
        b.add(pss1);
        //Penggunaan Text Area
        txtA1 = new JTextArea(5,20);
        b.add(txtA1);
        setSize(300,1600);
        show();
    }
    public static void main (String[] args){
        ExampleTextField a = new ExampleTextField();
    }
}
