package exercise9b;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

/**
 *
 * @author mngonk01
 */
public class JavaConversion {
    static JFrame f;
    static Container content;
    static JButton j1;
    static JTextField t1,t2,t3,t4,t5,t6;
    static JRadioButton r1,r2,r3,r4;
    static JLabel rs;
    static ButtonGroup bg;
    
    public static void main(String[] args) 
    {
         f = new JFrame("This is example");
            f.setBounds(50,100,250,350);
            f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
            content = f.getContentPane();
            content.setBackground(Color.CYAN);
    FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
    content.setLayout(fl);
    t1=new JTextField(20);
    content.add(t1); 
    
    bg=new ButtonGroup();
    r1=new JRadioButton("Area");
    bg.add(r1);
    content.add(r1);
    
    r2=new JRadioButton("Volume");
    bg.add(r2);    
    content.add(r2);
    
    r3=new JRadioButton("Mass");
    bg.add(r3);        
    content.add(r3);
    
    r4=new JRadioButton("Pressure");
    bg.add(r4);        
    content.add(r4);  
    
        j1=new JButton("Click here");
    content.add(j1);
    
        t2=new JTextField(20);
    content.add(t2); 
    t2.setEditable(false);
    
        t3=new JTextField(20);
    content.add(t3);
    t3.setEditable(false);
    
        t4=new JTextField(20);
    content.add(t4); 
    t4.setEditable(false);
    
        t5=new JTextField(20);
    content.add(t5); 
    t5.setEditable(false);
    
        t6=new JTextField(20);
    content.add(t6); 
    t6.setEditable(false);
    
    
    f.setVisible(true);

   

            f.setVisible(true);
            j1.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
            {
                if(t1.getText().equals(""))
                    JOptionPane.showMessageDialog(null, "Fill text box",
                                                  "error",
                                                  JOptionPane.ERROR_MESSAGE);
                    else
                    {
                        double r,m;
                        if(r1.isSelected()==true)
                        {
                            r = Double.parseDouble(t1.getText());
                            
                            
                            t2.setText("1 in2:6.4516  Result: " + String.valueOf(r*6.4516)+ "cm2");
                            t3.setText("1 ft2: 0.0929 Result: " + String.valueOf(r*0.0929)+"m2");
                            t4.setText("1 yd2: 0.8361 Result: " + String.valueOf(r*0.8361)+"m2");
                            t5.setText("1 acre:4046.9 Result: " + String.valueOf(r*4046.9)+"m2");
                            t6.setText("1 mile2:2.590 Result: " + String.valueOf(r=r*7)+"Km2");
                        }
                        else if(r2.isSelected()==true)
                        {
                             r = Double.parseDouble(t1.getText());
                            
                            
                            t2.setText("1 in3: 16.387  Result=" + String.valueOf(r*16.387)+ "cm3");
                            t3.setText("1 ft3: 28.3286 Result=" + String.valueOf(r=r*3)+ " dm3");
                            t4.setText("1 pint: 0.5683 Result=" + String.valueOf(r*0.5683)+ "I");
                            t5.setText("1yd3: 0.7646   Result=" + String.valueOf(r*0.7646 )+ "m3");
                            t6.setText("1fl oz:28.413 Result=" + String.valueOf(r*28.413)+ "ml");
                        }
                        else if(r3.isSelected()==true)
                        {
                             r = Double.parseDouble(t1.getText());
                            
                            
                            t2.setText("1 grain:64.9351 Result:" + String.valueOf(r*64.9351 )+ "mg");
                            t3.setText("1 oz: 28.35     Result:" + String.valueOf(r*28.35)+ "g");
                            t4.setText("1 grain: 0.3240 Result=" + String.valueOf(r*0.3240)+"metric carats");
                            t5.setText("1 stone:6.3503  Result=" + String.valueOf(r*6.3503)+"kg");
                            t6.setText("1 ton:	1.016   Result=" + String.valueOf(r*1.016)+"k");
                        }
                        else if(r4.isSelected()==true)
                        {
                             r = Double.parseDouble(t1.getText());
                            
                            
                            t2.setText("1pascal:1           Result=" + String.valueOf(r*1));
                            t3.setText("1hectopascal:100    Result=" + String.valueOf(r*100));
                            t4.setText("1atmosphere:101,325 Result=" + String.valueOf(r*101.325));
                            t5.setText("1bar:100,000        Result=" + String.valueOf(r*100.000));
                            t6.setText("1millibar:100       Result=" + String.valueOf(r*100));
                        }
                    }
            }
            });
       
        f.setResizable(false);
    }
    
}