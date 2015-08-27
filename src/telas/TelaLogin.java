package telas;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.util.ResourceBundle;

public class TelaLogin extends JFrame implements ActionListener {

	private Container contentPane;
	private JTextField txtUsurio;
	private JPasswordField txtSenha;
	private JPanel panel;
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JLabel lblAgncia;
	private JComboBox<String> comboBox;
	private JButton btnOk;
	private JButton btnCancelar;
	private ResourceBundle bn;

	public TelaLogin(ResourceBundle bn) {
		this.bn = bn;
		
		contentPane = getContentPane();

		panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel);

		lblUsuario = new JLabel(bn.getString("TelaLogin.lblUsuario.text"));
		lblUsuario.setBounds(10, 25, 75, 14);
		panel.add(lblUsuario);

		lblSenha = new JLabel(bn.getString("TelaLogin.lblSenha.text"));
		lblSenha.setBounds(10, 50, 75, 14);
		panel.add(lblSenha);

		lblAgncia = new JLabel(bn.getString("TelaLogin.lblAgncia.text"));
		lblAgncia.setBounds(10, 75, 75, 14);
		panel.add(lblAgncia);

		txtUsurio = new JTextField();
		txtUsurio.setBounds(95, 22, 110, 20);
		panel.add(txtUsurio);
		txtUsurio.setColumns(10);

		txtSenha = new JPasswordField(); 
		txtSenha.setBounds(95, 47, 110, 20);
		panel.add(txtSenha);
		txtSenha.setColumns(10);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(95, 72, 110, 20);
		panel.add(comboBox);

		comboBox.addItem("São Paulo");
		comboBox.addItem("Rio de Janeiro");
		comboBox.addItem("Espirito Santo");

		btnOk = new JButton(bn.getString("TelaLogin.btnOk.text"));
		btnOk.setBounds(10, 123, 89, 23);
		panel.add(btnOk);

		btnCancelar = new JButton(bn.getString("TelaLogin.btnCancelar.text"));
		btnCancelar.setBounds(116, 123, 89, 23);
		panel.add(btnCancelar);

		btnOk.addActionListener(this);
		btnCancelar.addActionListener(this);
		
		
		setTitle(bn.getString("TelaLogin.this.title"));
		setBounds(100, 100, 241, 208);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			Login acesso = null;
			try {
				acesso = new Login();

				String usuario = txtUsurio.getText();
				String senha = txtSenha.getText();
				if (acesso.busca(usuario, senha)){
					TelaPrincipal frame = new TelaPrincipal(bn);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!","Dados Inválidos", JOptionPane.ERROR_MESSAGE);

				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		} else if (e.getSource() == btnCancelar) {
			dispose();
		}

	}
}
