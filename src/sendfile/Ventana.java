package sendfile;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JPanel laminaJPanel;
	private JLabel ipJLabel;
	private JTextField ipJTextField;
	private JLabel puertoJLabel;
	private JTextField puertoJTextField;
	private JLabel fileJLabel;
	private JLabel fileNombreJLabel;
	private JButton seleccionarJButton;
	private JButton enviarJButton;
	private JLabel indicadorJLabel;

	public Ventana() {
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Send File");
		setSize(350, 180);
		laminaJPanel = (JPanel)getContentPane();
		laminaJPanel.setLayout(null);
		
		inicializarComponentes();
	}
	
	private void inicializarComponentes() {
		
		ipJLabel = new JLabel("IP: ");
		ipJTextField = new JTextField("10.0.0.");
		puertoJLabel = new JLabel("PUERTO: ");
		puertoJTextField = new JTextField("7788");
		fileJLabel = new JLabel("File: ");
		fileNombreJLabel = new JLabel("Nombre File");
		seleccionarJButton = new JButton("Seleccionar");
		enviarJButton = new JButton("Enviar");
		indicadorJLabel = new JLabel("Enviando");
		
		ipJTextField.setSize(100, ipJTextField.getPreferredSize().height);
		ipJTextField.setLocation(getWidth()/4-ipJTextField.getWidth()/2, 10);
		ipJLabel.setSize(ipJLabel.getPreferredSize().width, ipJLabel.getPreferredSize().height);
		ipJLabel.setLocation(ipJTextField.getX()-ipJLabel.getPreferredSize().width, ipJTextField.getY()+1);
		
		puertoJTextField.setSize(100, puertoJTextField.getPreferredSize().height);
		puertoJTextField.setLocation(getWidth()/2+puertoJTextField.getWidth()/2, 10);
		puertoJLabel.setSize(puertoJLabel.getPreferredSize().width, puertoJLabel.getPreferredSize().height);
		puertoJLabel.setLocation(puertoJTextField.getX()-puertoJLabel.getPreferredSize().width, puertoJTextField.getY()+1);
		
		fileJLabel.setSize(fileJLabel.getPreferredSize().width, fileJLabel.getPreferredSize().height);
		fileJLabel.setLocation(ipJTextField.getX()-fileJLabel.getPreferredSize().width, getHeight()/2-fileJLabel.getHeight()/2);
		fileNombreJLabel.setSize(fileNombreJLabel.getPreferredSize().width, fileNombreJLabel.getPreferredSize().height);
		fileNombreJLabel.setLocation(fileJLabel.getX()+fileJLabel.getWidth(), fileJLabel.getY());
		
		seleccionarJButton.setSize(seleccionarJButton.getPreferredSize().width, seleccionarJButton.getPreferredSize().height);
		seleccionarJButton.setLocation(puertoJTextField.getX()+puertoJTextField.getWidth()-seleccionarJButton.getWidth(), fileJLabel.getY()-3);
		enviarJButton.setSize(enviarJButton.getPreferredSize().width, enviarJButton.getPreferredSize().height);
		enviarJButton.setLocation(seleccionarJButton.getX()+seleccionarJButton.getWidth()-enviarJButton.getWidth(), seleccionarJButton.getY()+seleccionarJButton.getHeight()+5);
		enviarJButton.setEnabled(false);
		
		indicadorJLabel.setSize(indicadorJLabel.getPreferredSize().width, indicadorJLabel.getPreferredSize().height);
		indicadorJLabel.setLocation(getWidth()/2-indicadorJLabel.getWidth()/2-14, enviarJButton.getY()+enviarJButton.getHeight()-indicadorJLabel.getHeight());
		indicadorJLabel.setVisible(false);
		
		laminaJPanel.add(ipJLabel);
		laminaJPanel.add(ipJTextField);
		laminaJPanel.add(puertoJLabel);
		laminaJPanel.add(puertoJTextField);
		laminaJPanel.add(fileJLabel);
		laminaJPanel.add(fileNombreJLabel);
		laminaJPanel.add(seleccionarJButton);
		laminaJPanel.add(enviarJButton);
		laminaJPanel.add(indicadorJLabel);
	}

	public JPanel getLaminaJPanel() {
		return laminaJPanel;
	}

	public void setLaminaJPanel(JPanel laminaJPanel) {
		this.laminaJPanel = laminaJPanel;
	}

	public JLabel getIpJLabel() {
		return ipJLabel;
	}

	public void setIpJLabel(JLabel ipJLabel) {
		this.ipJLabel = ipJLabel;
	}

	public JTextField getIpJTextField() {
		return ipJTextField;
	}

	public void setIpJTextField(JTextField ipJTextField) {
		this.ipJTextField = ipJTextField;
	}

	public JLabel getPuertoJLabel() {
		return puertoJLabel;
	}

	public void setPuertoJLabel(JLabel puertoJLabel) {
		this.puertoJLabel = puertoJLabel;
	}

	public JTextField getPuertoJTextField() {
		return puertoJTextField;
	}

	public void setPuertoJTextField(JTextField puertoJTextField) {
		this.puertoJTextField = puertoJTextField;
	}

	public JLabel getFileJLabel() {
		return fileJLabel;
	}

	public void setFileJLabel(JLabel fileJLabel) {
		this.fileJLabel = fileJLabel;
	}

	public JLabel getFileNombreJLabel() {
		return fileNombreJLabel;
	}

	public void setFileNombreJLabel(JLabel fileNombreJLabel) {
		this.fileNombreJLabel = fileNombreJLabel;
	}

	public JButton getSeleccionarJButton() {
		return seleccionarJButton;
	}

	public void setSeleccionarJButton(JButton seleccionarJButton) {
		this.seleccionarJButton = seleccionarJButton;
	}

	public JButton getEnviarJButton() {
		return enviarJButton;
	}

	public void setEnviarJButton(JButton enviarJButton) {
		this.enviarJButton = enviarJButton;
	}

	public JLabel getIndicadorJLabel() {
		return indicadorJLabel;
	}

	public void setIndicadorJLabel(JLabel indicadorJLabel) {
		this.indicadorJLabel = indicadorJLabel;
	}
}
