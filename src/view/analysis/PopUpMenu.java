package view.analysis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class PopUpMenu {
	
	     JFrame jFrame = new JFrame();
	     int result = JOptionPane.showConfirmDialog(jFrame, 
	    		 "Choose where you want to save the analysis");{

	        if (result == 0)
	            System.out.println("You pressed Yes");
	        else if (result == 1)
	            System.out.println("You pressed NO");
	        else
	            System.out.println("You pressed Cancel");
	     }

	}
	
//	 final JFrame frame = new JFrame("Popup Menu Demo");
//
//     // build poup menu
//     final JPopupMenu popup = new JPopupMenu();
//     // New project menu item
//     JMenuItem menuItem = new JMenuItem("New Project...");
//     
//     public PopUpMenu(){
//    
//	     menuItem.setMnemonic(KeyEvent.VK_P);
//	     menuItem.getAccessibleContext().setAccessibleDescription(
//	             "New Project");
//	     menuItem.addActionListener(new ActionListener() {
//	
//	         public void actionPerformed(ActionEvent e) {
//	             JOptionPane.showMessageDialog(frame, "New Project clicked!");
//	         }
//	     });
//	     popup.add(menuItem);
//	     // New File menu item
//	     menuItem = new JMenuItem("New File...");
//	     menuItem.setMnemonic(KeyEvent.VK_F);
//	     menuItem.addActionListener(new ActionListener() {
//	
//	         public void actionPerformed(ActionEvent e) {
//	             JOptionPane.showMessageDialog(frame, "New File clicked!");
//	         }
//	     });
//	     popup.add(menuItem);
//	
//	     // add mouse listener
//	     frame.addMouseListener(new MouseAdapter() {
//	
//	         @Override
//	         public void mousePressed(MouseEvent e) {
//	             showPopup(e);
//	         }
//	
//	         @Override
//	         public void mouseReleased(MouseEvent e) {
//	             showPopup(e);
//	         }
//	
//	         private void showPopup(MouseEvent e) {
//	             if (e.isPopupTrigger()) {
//	                 popup.show(e.getComponent(),
//	                         e.getX(), e.getY());
//	             }
//	         }
//	     });
//	
//	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	     frame.setSize(300, 200);
//	     frame.setVisible(true);
//     
//     }
	
	

 

