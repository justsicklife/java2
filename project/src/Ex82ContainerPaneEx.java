import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex82ContainerPaneEx extends JFrame{
    Ex82ContainerPaneEx() {
        setTitle("ContentPane 과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground((Color.ORANGE));
        getContentPane().setLayout(new FlowLayout());

        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex82ContainerPaneEx();
    }
}
