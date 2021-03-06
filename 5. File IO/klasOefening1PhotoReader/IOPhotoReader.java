package klasOefening1PhotoReader;

import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;

public class IOPhotoReader {

	public static void main(String[] args) {
		IOPhotoReader reader = new IOPhotoReader();
		byte[] photoData = reader.readPhoto();

		if (photoData != null) {
			IOPhotoPanel panel = new IOPhotoPanel(photoData);

			JFrame frame = new JFrame();
			frame.setLayout(new BorderLayout());
			frame.getContentPane().add(panel, BorderLayout.SOUTH);
			frame.setSize(800, 600);
			frame.setVisible(true);

			panel.start();
		}

	}

	byte[] readPhoto() {
		Path path = Paths.get("5. File IO/Capture.PNG");

		FileInputStream fin = null;
		try {
			fin = new FileInputStream(path.toFile());

			int photoLength = (int) path.toFile().length();
			byte[] fileData = new byte[photoLength];

			fin.read(fileData, 0, photoLength);

			System.out.println("Ingelezen " + fileData.length + " bytes");
			return fileData;

		} catch (FileNotFoundException e) {
			System.out.println("Fout bij het inlezen van foto " + path.getFileName().toString());
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (fin != null) {
					fin.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
