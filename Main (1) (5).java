import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MovingBannerPanel extends JPanel implements ActionListener {
    private int xCoordinate = 0;
    private final String bannerText = "Moving Banner Example";
    private Timer timer;

    public MovingBannerPanel() {
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(bannerText, xCoordinate, getHeight() / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        xCoordinate++;
        if (xCoordinate > getWidth()) {
            xCoordinate = 0 - g.getFontMetrics().stringWidth(bannerText);
        }
        repaint();
    }
}

public class MovingBannerApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Banner Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);

        MovingBannerPanel bannerPanel = new MovingBannerPanel();
        frame.add(bannerPanel);

        frame.setVisible(true);
    }
}