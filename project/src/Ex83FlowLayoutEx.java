import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex83FlowLayoutEx  extends JFrame{
    public Ex83FlowLayoutEx() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane().setLayout(new FlowLayout(FlowLayout.LEFT,30,40));

        add(new JButton("add"));
        add(new JButton("sub"));
        add(new JButton("mul"));
        add(new JButton("div"));
        add(new JButton("Calculate"));
        
        setSize(300,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex83FlowLayoutEx();
    }
}
