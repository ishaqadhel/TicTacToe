package games;

import java.awt.EventQueue;

public class Main {
	/**
	 * Launch the application.
	 * Created By BME MEMBARA
	 * @author Ishaq Adheltyo & Bill Harit Yafi
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
