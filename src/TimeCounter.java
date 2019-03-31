import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class TimeCounter extends JTextField {
    private double value;

    TimeCounter() {
        setPreferredSize(new Dimension(80, 50));
        Random random = new Random();
        NumberFormat formatter = new DecimalFormat("#0.00");
        value = random.nextDouble()*20;
        setText(formatter.format(value));
    }
}
