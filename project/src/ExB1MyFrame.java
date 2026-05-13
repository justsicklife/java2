import javax.swing.JFrame;

public class ExB1MyFrame extends JFrame {
    public ExB1MyFrame() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExB1MyFrame frame = new ExB1MyFrame();
    }
}
