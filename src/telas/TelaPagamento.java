package telas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.util.ResourceBundle;

public class TelaPagamento extends JFrame implements ActionListener {

	private Container contentPane;
	private JTextField txtValor;
	private JTextField txtCpf;
	private JTextField txtTitularCarto;
	private JPanel panel;
	private JLabel lblValor;
	private JLabel lblCpf;
	private JLabel lblTitular;
	private JButton btnCrdito;
	private JButton btnDbito;
	private ResourceBundle bn;

	
	public TelaPagamento(ResourceBundle bn, String cpf, String nome, double valor) {
		this.bn = bn;
		setTitle(bn.getString("TelaPagamento.this.title")); 
		setBounds(100, 100, 270, 201);
		contentPane = getContentPane();
      		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblValor = new JLabel(bn.getString("TelaPagamento.lblValor.text"));
		lblValor.setBounds(10, 23, 46, 14);
		panel.add(lblValor);
		
		lblCpf = new JLabel(bn.getString("TelaPagamento.lblCpf.text"));
		lblCpf.setBounds(10, 48, 46, 14);
		panel.add(lblCpf);
		
		lblTitular = new JLabel(bn.getString("TelaPagamento.lblTitular.text"));
		lblTitular.setBounds(10, 73, 46, 14);
		panel.add(lblTitular);
		
		txtValor = new JTextField();
		txtValor.setText("" + valor); 
		txtValor.setBounds(66, 20, 168, 20);
		panel.add(txtValor);
		txtValor.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setText(cpf); 
		txtCpf.setBounds(66, 45, 168, 20);
		panel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtTitularCarto = new JTextField();
		txtTitularCarto.setText(nome); 
		txtTitularCarto.setBounds(66, 70, 168, 20);
		panel.add(txtTitularCarto);
		txtTitularCarto.setColumns(10);
		
		btnCrdito = new JButton(bn.getString("TelaPagamento.btnCrdito.text"));
		btnCrdito.setBounds(10, 115, 89, 23);
		panel.add(btnCrdito);
		
		btnDbito = new JButton(bn.getString("TelaPagamento.btnDbito.text"));
		btnDbito.setBounds(145, 115, 89, 23);
		panel.add(btnDbito);
		
		btnCrdito.addActionListener(this);
		btnDbito.addActionListener(this);
		
	}
		
		public void actionPerformed(ActionEvent e) {
			String cpf= txtCpf.getText();
			String nome = txtTitularCarto.getText();
			String valor = txtValor.getText();
			if (e.getSource() == btnDbito) {
			
				TelaPagamentoDebito frame = new TelaPagamentoDebito(bn, nome, cpf, valor);
				frame.setVisible(true);
				dispose();
				
			} else if (e.getSource() == btnCrdito) {
				TelaPagamentoCredito frame = new TelaPagamentoCredito(bn, nome, cpf);
				frame.setVisible(true);
				dispose();
				
			}
			
		}
	

}
