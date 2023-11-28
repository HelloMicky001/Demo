//public class Main_1 {
//
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlaneGame extends JFrame implements ActionListener, KeyListener {

    private Timer timer;
    private int planeX, planeY, planeSpeed;
    private boolean[] keys;

    public PlaneGame() {
        setTitle("飞机大战");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        planeX = 400;
        planeY = 500;
        planeSpeed = 5;

        keys = new boolean[256];

        timer = new Timer(1000 / 60, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PlaneGame().setVisible(true);
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        movePlane();
        repaint();
    }

    private void movePlane() {
        if (keys[KeyEvent.VK_LEFT] && planeX > 0) {
            planeX -= planeSpeed;
        }
        if (keys[KeyEvent.VK_RIGHT] && planeX < getWidth() - 50) {
            planeX += planeSpeed;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawPlane(g);
    }

    private void drawPlane(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(planeX, planeY, 50, 50);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
}