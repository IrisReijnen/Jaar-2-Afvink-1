import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HiWorld extends JFrame implements ActionListener {

    private JTextField textField;
    private JLabel label;
    private JButton button;

    public static void main(String[] args) {
        HiWorld frame = new HiWorld();
        frame.setSize(500,500);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        label = new JLabel("Input 1");

        window.add(label);
        textField = new JTextField("Geef hier input");
        textField.setBackground(Color.WHITE);
        button = new JButton("Klik");
        window.setBackground(Color.GRAY);
        window.add(textField);
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event){
        System.out.println("Hello World");
    }
}
