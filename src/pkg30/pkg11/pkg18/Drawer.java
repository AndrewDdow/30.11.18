
package pkg30.pkg11.pkg18;

import java.awt.Dimension;
import javax.swing.AbstractButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Drawer extends JFrame{
    static JSlider headingSlider = new JSlider(0, 360, 0);;
    static JSlider pitchSlider = new JSlider(SwingConstants.VERTICAL, -360, 0, 0);;
    double c = -300; //our view point (0,0,-200)
    
    public Drawer (Cube c){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = this.getContentPane();
        
        pane.setLayout(new BorderLayout());

        pane.add(headingSlider, BorderLayout.SOUTH);

        pane.add(pitchSlider, BorderLayout.EAST);
        
        JPanel renderPanel = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(Color.black);
                g2.fillRect(0, 0, getWidth(), getHeight());
                g2.translate(getWidth()/2, getHeight()/2);
                Setka(g);
                c.PerspecProekcDraw(g2);
                //c.draw(g2);
                
                
            }
        };
        
        final JButton button = new JButton("Perspective");
//          button.setVerticalTextPosition(AbstractButton.CENTER);
//          button.setHorizontalTextPosition(AbstractButton.CENTER);
//          button.setPreferredSize(new Dimension(200, 100));
            renderPanel.add(button);
            
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                     
                }
            });
        
        pane.add(renderPanel, BorderLayout.CENTER);
        this.setSize(800, 800);
        this.setVisible(true);
    }
    public void Setka(Graphics g){
        g.setColor(Color.white);
        g.drawLine(0,getHeight()/2, 0,-getHeight()/2);
        g.drawLine(getWidth()/2, 0, -getWidth()/2, 0);
        g.drawOval(-getWidth()/4, -getHeight()/4, getWidth()/2, getHeight()/2);
    }
    
}
