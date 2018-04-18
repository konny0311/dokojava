import java.awt.FlowLayout;
import javax.swing.*;
public class GuiTrial {
  public static void main(String[] args) {
    JFrame frame = new JFrame("はじめてのGUI");
    JLabel label = new JLabel("hellow world");
    JButton button = new JButton("押してください");
    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(label);
    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
