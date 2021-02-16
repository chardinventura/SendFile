import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main {

	static String filePath;
	static Socket socket;

	public static void main(String[] args){

		Ventana ventana = new Ventana();

		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setMultiSelectionEnabled(false);

		ventana.getSeleccionarJButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if(jFileChooser.showOpenDialog(ventana) == JFileChooser.APPROVE_OPTION) {
					ventana.getEnviarJButton().setEnabled(true);
					ventana.getFileNombreJLabel().setText(jFileChooser.getSelectedFile().getName());;
					filePath = jFileChooser.getSelectedFile().getPath();
				}else
					ventana.getEnviarJButton().setEnabled(false);
			}
		});

		ventana.getEnviarJButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					socket = new Socket(ventana.getIpJTextField().getText(), Integer.parseInt(ventana.getPuertoJTextField().getText()));
					ventana.getIndicadorJLabel().setVisible(true);
					ventana.setEnabled(false);
					
					socket.sendFile(filePath);
					ventana.getIndicadorJLabel().setVisible(false);
					ventana.setEnabled(true);
					JOptionPane.showMessageDialog(ventana, "El archivo se ha enviado con exito");
					
				} catch (ConnectException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(ventana, "No se pudo realizar la conexion con el servidor");
				} catch (UnknownHostException e) {
					System.out.printf("Host no encontrado -> %s", ventana.getIpJTextField().getText());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		ventana.setVisible(true);
	}
}
