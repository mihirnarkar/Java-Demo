import javax.swing.*;
import java.awt.*;

class MainApplicationNew extends JPanel {

    private int x = 10;
    private int direction = 1;

    public MainApplicationNew() {
        Timer timer = new Timer(10, e -> {
            if (x + 50 >= getWidth()) {
                direction = -1;
            } else if (x <= 0) {
                direction = 1;
            }
            x += direction;
            repaint();
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, getHeight() / 2 - 25, 50, 50);
    }
}


public class MainApplication {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Moving Circle");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new MainApplicationNew());
            frame.setVisible(true);
        });
    }
}

