import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class question extends JFrame implements ActionListener {
    JTextField t1, t2, resultField;
    JButton addBtn, subBtn, mulBtn, divBtn, clearBtn;

    public question() {
        setTitle("Simple Calculator");
        setSize(350, 250);
        setLayout(new GridLayout(6, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components
        add(new JLabel("First Number:"));
        t1 = new JTextField();
        add(t1);

        add(new JLabel("Second Number:"));
        t2 = new JTextField();
        add(t2);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        addBtn = new JButton("Add");
        subBtn = new JButton("Subtract");
        mulBtn = new JButton("Multiply");
        divBtn = new JButton("Divide");
        clearBtn = new JButton("Clear");

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);
        add(clearBtn);

        // Button Listeners
        addBtn.addActionListener(this);
        subBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == clearBtn) {
                t1.setText("");
                t2.setText("");
                resultField.setText("");
                return;
            }

            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double res = 0;

            if (e.getSource() == addBtn) {
                res = num1 + num2;
            } else if (e.getSource() == subBtn) {
                res = num1 - num2;
            } else if (e.getSource() == mulBtn) {
                res = num1 * num2;
            } else if (e.getSource() == divBtn) {
                if (num2 == 0)
                    throw new ArithmeticException("Division by zero!");
                res = num1 / num2;
            }

            resultField.setText(String.valueOf(res));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "⚠️ Please enter valid numbers!");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, "⚠️ " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new question();
    }
}
