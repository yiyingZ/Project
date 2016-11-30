/**
 * 
 */
package converter;

import java.awt.EventQueue;

/**
 * @author yiying zhang
 * @version 1.0
 */
public class Main {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterGUI frame = new ConverterGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
