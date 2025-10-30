import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentRegistration extends JFrame implements ActionListener {
    // Components
    JTextField nameField, regField;
    JRadioButton maleBtn, femaleBtn;
    JCheckBox cbJava, cbPython, cbCpp;
    JComboBox<String> deptBox;
    JButton submitBtn;

    StudentRegistration() {
        setTitle("Student Registration Form");
        setLayout(new GridLayout(8, 2, 10, 10));
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components setup
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Register No:"));
        regField = new JTextField();
        add(regField);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        maleBtn = new JRadioButton("Male");
        femaleBtn = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(maleBtn);
        bg.add(femaleBtn);
        genderPanel.add(maleBtn);
        genderPanel.add(femaleBtn);
        add(genderPanel);

        add(new JLabel("Department:"));
        String[] dept = {"CSE", "IT", "ECE", "EEE", "AIML"};
        deptBox = new JComboBox<>(dept);
        add(deptBox);

        add(new JLabel("Languages Known:"));
        JPanel langPanel = new JPanel();
        cbJava = new JCheckBox("Java");
        cbPython = new JCheckBox("Python");
        cbCpp = new JCheckBox("C++");
        langPanel.add(cbJava);
        langPanel.add(cbPython);
        langPanel.add(cbCpp);
        add(langPanel);

        add(new JLabel("")); // spacer
        submitBtn = new JButton("Submit");
        add(submitBtn);

        submitBtn.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Gather data
        String name = nameField.getText();
        String reg = regField.getText();
        String gender = maleBtn.isSelected() ? "Male" : (femaleBtn.isSelected() ? "Female" : "Not Selected");
        String dept = (String) deptBox.getSelectedItem();

        StringBuilder langs = new StringBuilder();
        if (cbJava.isSelected()) langs.append("Java ");
        if (cbPython.isSelected()) langs.append("Python ");
        if (cbCpp.isSelected()) langs.append("C++ ");

        // Open second frame
        new DisplayFrame(name, reg, gender, dept, langs.toString());
    }
}

class DisplayFrame extends JFrame {
    DisplayFrame(String name, String reg, String gender, String dept, String langs) {
        setTitle("Student Details");
        setLayout(new GridLayout(6, 1, 10, 10));
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new JLabel("Name: " + name));
        add(new JLabel("Register No: " + reg));
        add(new JLabel("Gender: " + gender));
        add(new JLabel("Department: " + dept));
        add(new JLabel("Languages Known: " + langs));

        setVisible(true);
    }
}

public class complusoryques {
    public static void main(String[] args) {
        new StudentRegistration();
    }
}
