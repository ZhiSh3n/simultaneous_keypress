package program;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.BitSet;
import java.awt.Shape;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Draw extends JPanel {
	
	public static void main(String[] args) {
		// make a new frame
		JFrame frame = new JFrame("simultaneous_keylistener");
		
		// exit program when closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // set frame size and center it
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        
        // no resizing allowed
        frame.setResizable(false); 
        
        // add canvas and set visible
        frame.add(new Canvas());
        frame.setVisible(true);
        
        // add keylistener 
        frame.addKeyListener(new MoveCircle());
	}

}	