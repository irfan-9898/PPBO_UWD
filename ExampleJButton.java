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
class ExampleJButton extends JFrame{
    private JButton btn1, btn2;
    public ExampleJButton(){
        Container b = getContentPane();
        //contoh penggunaan button
        btn1 = new JButton ("Oke");
        btn2 = new JButton ("Cancel");
        b.add(btn1);b.add(btn2);
        setLayout(new FlowLayout());
        setSize(300,100);
        show();
    }
    public static void main(String[] args){
        ExampleJButton a = new ExampleJButton();
    }
}
