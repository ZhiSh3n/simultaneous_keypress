Simultaneous KeyListener
==========================
Created by: Zachary Yong

One disadvantage of using KeyListener for receiving keyboard events is that it is not very good at processing simultaneous key-presses. This repository contains an example of how to go about allowing KeyListener to process simultaneous key-presses.

## Files
* [Draw.java](src/program/Draw.java)
	* Run the program from this class.
	* Create a JFrame; add a graphics component and a key listener. 
* [Canvas.java](src/program/Canvas.java)
	* Contains the graphics component and the animation thread.
	* Code intended for displaying in the JFrame should be put here. 
	* Processes the list of currently-pressed-keys for respective actions.
* [MoveCircle.java](src/program/MoveCircle.java)
	* Contains methods for adding key codes when keys are pressed and removing key codes when keys are released.
	
## How it works
When using KeyListener, it is necessary to create a buffer list in which we store key-presses that have not yet been released. We alternate this key-input session with a drawing session, so we are able to respond effectively to simultaneous key-pressed.

Controls are: W, A, S, D