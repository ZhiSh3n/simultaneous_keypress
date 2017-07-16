package program;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

class MoveCircle implements KeyListener {
	
	// Make an arrayList for storing keys pressed. 
	// You can use other types of lists too.
	public static ArrayList<Integer> keyList = new ArrayList<Integer>();

	// When a key is pressed, only add its keyCode to the arrayList if the keyCode
	// doesn't yet exist and if the keyCode corresponds to an accepted value.
    @Override
    public void keyPressed(final KeyEvent event) {
    	if (!MoveCircle.keyList.contains(KeyEvent.VK_W) && (event.getKeyCode() == KeyEvent.VK_W)) {
    		keyList.add(event.getKeyCode());
        }
    	if (!MoveCircle.keyList.contains(KeyEvent.VK_S) && (event.getKeyCode() == KeyEvent.VK_S)) {
    		keyList.add(event.getKeyCode());
        }
    	if (!MoveCircle.keyList.contains(KeyEvent.VK_A) && (event.getKeyCode() == KeyEvent.VK_A)) {
    		keyList.add(event.getKeyCode());
        }
    	if (!MoveCircle.keyList.contains(KeyEvent.VK_D) && (event.getKeyCode() == KeyEvent.VK_D)) {
    		keyList.add(event.getKeyCode());
        }
    	if (!MoveCircle.keyList.contains(KeyEvent.VK_SPACE) && (event.getKeyCode() == KeyEvent.VK_SPACE)) {
    		keyList.add(event.getKeyCode());
        }
    }

    // ArrayList.remove() accepts either an object or an element index.
    // Unfortunately, our object is an integer, so we will have to iterate
    // through our arrayList and remove it this way.
    @Override
    public void keyReleased(final KeyEvent event) {
    	for (int i = 0; i < keyList.size(); i++) {
    		if (keyList.get(i) == event.getKeyCode()) {
    			keyList.remove(i);
    		}
    	}
    }
    
    @Override
    public void keyTyped(final KeyEvent event) {
        // Empty!
    }
}