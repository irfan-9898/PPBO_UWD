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
import javax.swing.JFrame;
public class ExampleJFrame {
private JFrame contohFrame;
public ExampleJFrame(){
    contohFrame = new JFrame("contoh JFrame");
}
public void launchFrame(){
    contohFrame.setSize(400,200);
    contohFrame.setResizable(false);
    contohFrame.setVisible(true);
}
    public static void main(String[] args) {
    ExampleJFrame a = new ExampleJFrame();
    a.launchFrame();
    }
}