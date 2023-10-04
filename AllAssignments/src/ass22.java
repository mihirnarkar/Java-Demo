
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MovingCircleFrame extends JFrame {

    private int x = 10;
    private int direction = 1;

    private MovingCircleFrame() {
        setTitle("Moving Circle");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel to draw the circle
        JPanel circlePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(x, getHeight() / 2 - 25, 50, 50);
            }
        };

        Timer timer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (x + 50 >= getWidth()) {
                    direction = -1;
                } else if (x <= 0) {
                    direction = 1;
                }
                x += direction;
                circlePanel.repaint();
            }
        });

        timer.start();

        add(circlePanel);
    }

    public static void ass2(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MovingCircleFrame().setVisible(true);
            }
        });
    }
}

