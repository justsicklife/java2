import java.awt.Container;

import javax.swing.JFrame;

public class Ex86NullContainerEx extends JFrame{
    public Ex86NullContainerEx() {
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container containerPane = getContentPane();
        
    }
}
