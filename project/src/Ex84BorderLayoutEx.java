import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex84BorderLayoutEx extends JFrame{
    public Ex84BorderLayoutEx() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout((new BorderLayout(30,20)));

        add(new JButton("Calculate"),BorderLayout.CENTER);
        add(new JButton("add"),BorderLayout.NORTH);
        add(new JButton("sub"),BorderLayout.SOUTH);
        add(new JButton("mul"),BorderLayout.EAST);
        add(new JButton("div"),BorderLayout.WEST);

        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Ex84BorderLayoutEx();
    }
}
