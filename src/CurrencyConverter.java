import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter {
    private JTextField textAmount;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton btnConvert;
    private JPanel main;
    private JButton button1;
    private JButton btnClear;


    public static void main(String[] args) {
        JFrame frame = new JFrame("CurrencyConverter");
        frame.setContentPane(new CurrencyConverter().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CurrencyConverter() {
    button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            double result;
            double amount = Integer.parseInt(textAmount.getText());
            String choice1 = comboBox1.getSelectedItem().toString();
            String choice2 = comboBox2.getSelectedItem().toString();


            //for Nepali Currency
            if (choice1 == "Nepali" && choice2 == "Nepali") {
                result = amount;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Nepali" && choice2 == "USD") {
                result = amount * 0.0075;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Nepali" && choice2 == "KWD") {
                result = amount * 0.0023;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Nepali" && choice2 == "Indian") {
                result = amount * 0.62;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Nepali" && choice2 == "Pound") {
                result = amount * 0.0063;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }


            //For USD Currency
            if (choice1 == "USD" && choice2 == "Nepali") {
                result = amount * 132;
                JOptionPane.showMessageDialog(null, "Your amount will be" + "\n" + result);
            }
            if (choice1 == "USD" && choice2 == "USD") {
                result = amount;
                JOptionPane.showMessageDialog(null, "Your Amount will be " + "\n" + result);
            }
            if (choice1 == "USD" && choice2 == "KWD") {
                result = amount * 0.31;
                JOptionPane.showMessageDialog(null, "Your Amount Will be " + "\n" + result);
            }
            if (choice1 == "USD" && choice2 == "Indian") {
                result = amount * 82.75;
                JOptionPane.showMessageDialog(null, "Your Amount will be " + "\n" + result);
            }
            if (choice1 == "USD" && choice2 == "Pound") {
                result = amount * 0.83;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }

            //For KWD Currency
            if (choice1 == "KWD" && choice2 == "Nepali") {
                result = amount * 432.39;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "KWD" && choice2 == "USD") {
                result = amount * 3.26;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "KWD" && choice2 == "KWD") {
                result = amount;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "KWD" && choice2 == "Indian") {
                result = amount * 270.00;
                JOptionPane.showMessageDialog(null, "Your amount will be" + "\n" + result);
            }
            if (choice1 == "KWD" && choice2 == "Pound") {
                result = amount * 2.72;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }

            //For Indian Currency
            if (choice1 == "Indian" && choice2 == "Nepali") {
                result = amount *1.60;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Indian" && choice2 == "USD") {
                result = amount *0.012;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Indian" && choice2 == "KWD") {
                result = amount *0.0037;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Indian" && choice2 == "Indian") {
                result = amount;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Indian" && choice2 == "Pound") {
                result = amount *0.010;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }

            // For Pound Currency\
            if (choice1 == "Pound" && choice2 == "Nepali") {
                result = amount *159.29;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Pound" && choice2 == "USD") {
                result = amount *1.20;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Pound" && choice2 == "KWD") {
                result = amount *0.37;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Pound" && choice2 == "Indian") {
                result = amount*99.46;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
            if (choice1 == "Pound" && choice2 == "Pound") {
                result = amount;
                JOptionPane.showMessageDialog(null, "Your Amount will be" + "\n" + result);
            }
        }
    });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAmount.setText("");
                comboBox1.setSelectedItem(String.valueOf("Nepali"));
                comboBox2.setSelectedItem(String.valueOf("USD"));
            }
        });
    }
}
