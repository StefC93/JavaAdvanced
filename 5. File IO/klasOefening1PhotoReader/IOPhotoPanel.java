package klasOefening1PhotoReader;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class IOPhotoPanel extends JPanel implements Runnable {

	private byte[] photoData;
	private int x;
	private int y;

	private int tellerX;
	private int tellerY;

	public IOPhotoPanel() {

	}

	public IOPhotoPanel(byte[] photoData) {
		this.photoData = photoData;
	}

	public void setPhotoData(byte[] photoData) {
		this.photoData = photoData;
	}

	public void paint(Graphics g) {

		// van byte array naar image
		ByteArrayInputStream bin = new ByteArrayInputStream(photoData);
		try {
			BufferedImage img = ImageIO.read(bin);

			g.drawImage(img, 0, 0, 520, 472, this);
			g.setColor(Color.BLUE);
			((Graphics2D) g).fillArc(x, y, 10, 10, 0, 360);
		} catch (IOException e) {
			System.out.println("Image could not be processed!");
			e.printStackTrace();
		}

	}

	public void start() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			x += tellerX;
			y += tellerY;

			if (x > 800) {
				tellerX = -1;
			}
			if (x < 0) {
				tellerX = 1;
			}
			if (y > 600) {
				tellerY = -1;
			}
			if (y < 0) {
				tellerY = 1;
			}
			repaint();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
