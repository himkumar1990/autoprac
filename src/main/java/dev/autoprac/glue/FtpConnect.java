package dev.autoprac.glue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketException;
import java.util.regex.Pattern;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class FtpConnect {

	public static void main(String[] args) throws IOException {
		FTPClient ftpClient = new FTPClient();
		Pattern pattern = Pattern.compile("first\\.txt");
		try (FileOutputStream os = new FileOutputStream(new File("target/result"))) {
			try {
				ftpClient.connect("localhost");
				ftpClient.login("intdoc", "intdoc");
				FTPFile file[] = ftpClient.listFiles("/");

				for (FTPFile f : file) {
					boolean matches = pattern.matcher(f.getName()).matches();
					if (matches) {
						ftpClient.retrieveFile(f.getName(), os);
					}
				}
				System.out.println(ftpClient.getReplyString());
				System.out.println(ftpClient.getReplyCode());

			} catch (SocketException exp) {
				System.out.println(exp.toString());
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (ftpClient.isConnected())
					ftpClient.disconnect();
			}
		}
	}
}
