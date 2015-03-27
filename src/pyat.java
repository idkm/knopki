import javax.swing.*;
import java.awt.*;

/**
 * Created by kirillov.mv on 27.03.2015.
 */
public class pyat extends JFrame{
    JButton b1,b2,b3,b4;

        public pyat(String s) {
            super(s);
            setLayout(new FlowLayout());
            b1 = new JButton("knopka1");
            b2 = new JButton("knopka2");
            b3 = new JButton("knopka3");
            b4 = new JButton("knopka4");
            add(b1);
            add(b2);
            add(b3);
            add(b4);

            setVisible(true);
            setResizable(false);
            setLocationRelativeTo(null);

    }
}
