
package pkg30.pkg11.pkg18;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.*;

public class Controller {
    Cube cube;
    JFrame frame;
    static JSlider pitchSlider;
    static JSlider headingSlider;
    public Controller(Cube cube, JFrame frame){
        this.cube = cube;
        this.frame = frame;
        this.pitchSlider = Drawer.pitchSlider;
        this.headingSlider = Drawer.headingSlider;
        pitchSlider.addChangeListener(new ChangeListener(){
            public void stateChanged (ChangeEvent e){
                int step = pitchSlider.getValue();
                step -=360;
                cube.rotate(step/360, 0, 0);
                frame.repaint();
            }
        });
        headingSlider.addChangeListener(new ChangeListener(){
            public void stateChanged (ChangeEvent e){
                int step = headingSlider.getValue();
                step +=360;
                cube.rotate(0, step/360, 0);
                frame.repaint();
            }
        });
    }
}
