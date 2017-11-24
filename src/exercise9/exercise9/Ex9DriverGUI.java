package exercise9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex9DriverGUI extends JFrame {
  private static final String[] UNITS = {"Celsius", "Fahrenheit", "Kelvin"};
  private static final int WIDTH = 300;
  private static final int HEIGHT = 150;
  
  private JTextField fromText;
  private JComboBox<String> fromCombo;
  private JButton convertButton;
  private JTextField toText;
  private JComboBox toCombo;
  
  // constructor
  public Ex9DriverGUI() {
    super("Unit converter");
    
    fromText = new JTextField(15);
    fromCombo = new JComboBox<String>(UNITS);
    convertButton = new JButton("Convert");
    toText = new JTextField(15);
    toText.setEditable(false);
    toCombo = new JComboBox<String>(UNITS);
    
    setLayout(new GridLayout(3, 1));
    
    JPanel topPanel = new JPanel(new FlowLayout());
    topPanel.add(fromText);
    topPanel.add(fromCombo);
    
    JPanel middlePanel = new JPanel(new FlowLayout());
    middlePanel.add(convertButton);
    
    JPanel bottomPanel = new JPanel(new FlowLayout());
    bottomPanel.add(toText);
    bottomPanel.add(toCombo);
    
    add(topPanel);
    add(middlePanel);
    add(bottomPanel);
    
    convertButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        Ex9Converter converter = new Ex9Converter();
        double valueFrom, result;
        int fromIndex, toIndex;
        
        try {
          valueFrom = Double.parseDouble(fromText.getText());
          fromIndex = fromCombo.getSelectedIndex();
          toIndex = toCombo.getSelectedIndex();
          
          if (fromIndex == 0) {
            if (toIndex == 0) {
              result = valueFrom;
            } else if (toIndex == 1) {
              result = converter.c2f(valueFrom);
            } else {
              result = converter.c2k(valueFrom);
            }
          } else if (fromIndex == 1) {
            if (toIndex == 0) {
              result = converter.f2c(valueFrom);
            } else if (toIndex == 1) {
              result = valueFrom;
            } else {
              result = converter.f2k(valueFrom);
            }
          } else {
            if (toIndex == 0) {
              result = converter.k2c(valueFrom);
            } else if (toIndex == 1) {
              result = converter.k2f(valueFrom);
            } else {
              result = valueFrom;
            }
          }
          
          toText.setText(String.valueOf(result));
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Value must be numeric", "Error", JOptionPane.ERROR_MESSAGE);
          fromText.requestFocus();
          return;
        }
      }
    });
    
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setResizable(false);
    setVisible(true);
  }
  
  // main method
  public static void main(String[] args) {
    new Ex9DriverGUI();
  }
}
