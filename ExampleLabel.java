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
public class ExampleLabel extends JFrame{
    JLabel label1;
    FlowLayout fl;
    public ExampleLabel(){
        Container b = getContentPane();
        //Penggunaan label
        label1 = new JLabel("Praktikum GUI");
        b.add(label1);
        setLayout(new FlowLayout());
        setSize(300,100);
        show();
    }
    public static void main (String[] args){
        ExampleLabel a= new ExampleLabel();
    }
}
