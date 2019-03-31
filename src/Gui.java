import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class Gui {


    private JFrame jFrame;
    private JPanel container;
    private TimeCounter timeCounter1;
    private TimeCounter timeCounter2;
    private TimeCounter timeCounter3;


    public Gui() {
        initializeGui();
    }

    private void initializeGui() {
        container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        container.setPreferredSize(new Dimension(20, 400));

        timeCounter1 = new TimeCounter();
        timeCounter2 = new TimeCounter();
        timeCounter3 = new TimeCounter();

        container.add(new JLabel("Timer 1"));
        container.add(timeCounter1);

        container.add(new JLabel("Timer 2"));
        container.add(timeCounter2);

        container.add(new JLabel("Timer 3"));
        container.add(timeCounter3);

        jFrame = new JFrame();
        jFrame.add(container);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("MineSweeper");
        jFrame.setSize(200, 300);
        jFrame.setVisible(true);

        FrequentEvents frequentEvents = new FrequentEvents();
        frequentEvents.start();
    }

    class FrequentEvents extends Thread {
        public void run() {
            while (true) {
                NumberFormat formatter = new DecimalFormat("#0.00");
                try {
                    Thread.sleep(1000);

                    // Notify event here and update the TimeCounter following an Observer pattern

                    // ----------------------------------------------------
                    // Delete FROM HERE
                    double value1 = new Double(timeCounter1.getText().replace(",", "."));
                    double value2 = new Double(timeCounter2.getText().replace(",", "."));
                    double value3 = new Double(timeCounter3.getText().replace(",", "."));

                    value1 += 10;
                    value2 += 10;
                    value3 += 10;

                    timeCounter1.setText(formatter.format(value1));
                    timeCounter2.setText(formatter.format(value2));
                    timeCounter3.setText(formatter.format(value3));
                    // Till HERE
                    // ----------------------------------------------------
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


