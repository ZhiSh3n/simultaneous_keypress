package program;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;

class Canvas extends JComponent {
	
	// Initialize coordinates and dimensions of the user (square).
	public static int x = 300;
	public static int y = 200;
	public static int w = 50;
	public static int h = 50;

	// Start animation thread which
	// cycles repaint() every 10 milliseconds.
    public Canvas() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {Thread.sleep(10);} catch (Exception ex) {}
                }
            }
        });
        animationThread.start();
    }

    // Code for what is actually drawn goes here.
    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        // Draw the user.
        gg.setColor(Color.BLACK);
        gg.drawRect(x, y, 50, 50);
        
        // Iterate through keyList;
        // for each key, perform corresponding movement.
        for (int i = 0; i < MoveCircle.keyList.size(); i++) {
        	switch (MoveCircle.keyList.get(i)) {
        		case KeyEvent.VK_W:
        			y -= 2;
        			break;
        		case KeyEvent.VK_A:
        			x -= 2;
        			break;
        		case KeyEvent.VK_S:
        			y += 2;
        			break;
        		case KeyEvent.VK_D:
        			x += 2;
        			break;
        		case KeyEvent.VK_SPACE:
        			break;
        	}
        }
    }
}
