import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class rectanguloColor extends JPanel implements Runnable {
  private int pause;

  private Color[] colores = { 
    Color.black, Color.blue, Color.cyan, 
    Color.darkGray, Color.gray, Color.green,
    Color.lightGray, Color.magenta, 
    Color.orange, Color.pink, Color.red, 
    Color.white, Color.yellow 
  };

  private Color cColor = nuevoColor(); //Color.gray;

  private Color nuevoColor() {
    return colores[
      (int)(Math.random() * colores.length)
    ];
  }


  public void paintComponent(Graphics  g) {
    super.paintComponent(g);
    g.setColor(cColor);
    Dimension s = getSize();
    g.fillRect(0, 0, s.width, s.height);
  }

  public rectanguloColor(int pause) {
    this.pause = pause;
  }

  public void run() {
    while(true) {
      cColor = nuevoColor();
      repaint();
      try {
        Thread.sleep((int) (Math.random()*pause));
      } catch(InterruptedException e) {}
    } 
  }

} 

public class ColoresAzar extends JFrame {
  public ColoresAzar(int pause, int grid) {
    setTitle("========================");


    Container cp = getContentPane();
    cp.setLayout(new GridLayout(grid, grid));

    for (int i = 0; i < grid * grid; i++){
      rectanguloColor rColor = new rectanguloColor(pause);
      cp.add(rColor);
      
      new Thread(rColor).start() ;     
    }


    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }   

  public static void main(String[] args) {
    int pause = 500;
    int grid = 8;

    JFrame frame = new ColoresAzar(pause, grid);
    frame.setSize(500, 400);
    frame.setVisible(true);  

    JFrame frame2 = new ColoresAzar(pause, grid);
    frame2.setSize(300, 400);
    frame2.setVisible(true); 
  }
}