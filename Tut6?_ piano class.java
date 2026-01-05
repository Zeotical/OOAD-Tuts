import javax.swing.*; 

import javax.swing.event.*; 

import java.awt.event.*; 

import java.awt.*; 

 import javax.sound.midi.*;

public class Piano implements ChangeListener, KeyListener { 
boolean isPlaying = false;
int keypress;
Synthesizer midiSynth;
MidiChannel[] mChannels;
Piano(){ 

JFrame frame = new JFrame("Pea-Air-Know"); 

JButton[] w = new JButton[7]; 

JButton[] b = new JButton[6]; 

JLayeredPane panel = new JLayeredPane(); 

frame.add(panel); 

frame.addKeyListener(this);
frame.setFocusable(true);
 

for (int i = 0; i < 7; i++) { 

w[i] = new JButton(); 

w[i].setBackground(Color.WHITE); 

w[i].setLocation(i * 70, 0); 

w[i].setSize(70, 300); 

panel.add(w[i], 0, -1); 

w[i].setName("w"+Integer.toString(i));
w[i].addChangeListener(this);

} 

 

for (int i = 0; i < 6; i++) { 

if (i==2) 

continue; 

b[i] = new JButton(); 

b[i].setBackground(Color.BLACK); 

b[i].setLocation(35 + i * 70, 0); 

b[i].setSize(70, 150); 

panel.add(b[i], 1, -1); 

b[i].setName("b"+Integer.toString(i));

b[i].addChangeListener(this);


} 

 

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

frame.setSize(500, 320); 

frame.setResizable(false); 

frame.setVisible(true); 

try {

    midiSynth = MidiSystem.getSynthesizer();

    midiSynth.open();

    mChannels = midiSynth.getChannels();

    }
    catch (MidiUnavailableException e){}
}



public void stateChanged(ChangeEvent e) {
    JButton temp = (JButton) e.getSource();
    String btnName = temp.getName();
    if (temp.getModel().isPressed()) {
        System.out.println(btnName + " pressed");

        isPlaying = true;
        switch (btnName) {
            case "w0":
                keypress = 60;
                mChannels[0].noteOn(60, 127);
                break;
            case "b0":
                keypress = 61;
                mChannels[0].noteOn(61, 127);
                break;
            case "w1":
                keypress = 62;
                mChannels[0].noteOn(62, 127);
                break;
            case "b1":
                keypress = 63;
                mChannels[0].noteOn(63, 127);
                break;
            case "w2":
                keypress = 64;
                mChannels[0].noteOn(64, 127);
                break;
            case "w3":
                keypress = 65;
                mChannels[0].noteOn(65, 127);
                break;
            case "b3":
                keypress = 66;
                mChannels[0].noteOn(66, 127);
                break;
            case "w4":
                keypress = 67;
                mChannels[0].noteOn(67, 127);
                break;
            case "b4":
                keypress = 68;
                mChannels[0].noteOn(68, 127);
                break;
            case "w5":
                keypress = 69;
                mChannels[0].noteOn(69, 127);
                break;
            case "b5":
                keypress = 70;
                mChannels[0].noteOn(70, 127);
                break;
            case "w6":
                keypress = 71;
                mChannels[0].noteOn(71, 127);
                break;
        }
    } else {
        if (isPlaying)
            mChannels[0].noteOff(keypress);
        isPlaying = false;
    }
}// end of stateChanged


public void keyTyped(KeyEvent e) {} 

public void keyPressed(KeyEvent e) { 

char c = e.getKeyChar(); 

System.out.println(c + " pressed"); 

if(!isPlaying){ 

isPlaying=true; 

switch(c){ 

case 'z': 

keypress=60; 

mChannels[0].noteOn(60, 127); 

break; 

case 's': 

keypress=61; 

mChannels[0].noteOn(61, 127); 

break; 

case 'x': 

keypress=62; 

mChannels[0].noteOn(62, 127); 

break; 

case 'd': 

keypress=63; 

mChannels[0].noteOn(63, 127); 

break; 

case 'c': 

keypress=64; 

mChannels[0].noteOn(64, 127); 

break; 

case 'v': 

keypress=65; 

mChannels[0].noteOn(65, 127); 

break; 

case 'g': 

keypress=66; 

mChannels[0].noteOn(66, 127); 

break; 

case 'b': 

keypress=67; 

mChannels[0].noteOn(67, 127); 

break; 

case 'h': 

keypress=68; 

mChannels[0].noteOn(68, 127); 

break; 

case 'n': 

keypress=69; 

mChannels[0].noteOn(69, 127); 

break; 

case 'j': 

keypress=70; 

mChannels[0].noteOn(70, 127); 

break; 

case 'm': 

keypress=71; 

mChannels[0].noteOn(71, 127); 

break; 

} 

} 

} 

public void keyReleased(KeyEvent e) { 

mChannels[0].noteOff(keypress); 

isPlaying=false; 


} 



public static void main(String[] args) { 

new Piano();	 

}



// @Override
// public void keyPressed(KeyEvent e) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
// }



// @Override
// public void keyReleased(KeyEvent e) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
// }



// @Override
// public void keyTyped(KeyEvent e) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
// } 

} 

 
