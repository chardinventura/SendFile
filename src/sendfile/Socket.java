package sendfile;

import java.io.IOException;
import java.io.ObjectOutputStream;

import file.File;

public class Socket extends java.net.Socket{

	public Socket() {
		// TODO Auto-generated constructor stub
	}
	
	public Socket(String ip, int puerto) throws IOException {
		super(ip, puerto);
	}
	
	public void sendFile(String filePath) throws IOException {
		
		File file = new File(filePath);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(getOutputStream());
		objectOutputStream.writeObject(file);
		objectOutputStream.close();
	}
}
