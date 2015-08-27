package telas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.util.ResourceBundle;

public class TelaPagamentoDebito extends JFrame implements ActionListener {

	private Container contentPane;
	private JTextField txtValor;
	private JTextField txtCpf;
	private JTextField txtTitular;
	private JTextField txtAgncia;
	private JTextField txtContaCorrente;
	private JTextField txtBanco;
	private JTextField txtTelefone;
	private JPanel panel;
	private JLabel lblValor;
	private JLabel lblCpf;
	private JLabel lblTitular;
	private JLabel lblBanco;
	private JLabel lblAgncia;
	private JLabel lblContaCorrente;
	private JLabel lblTelefone;
	private JComboBox<String> cbxBanco;
	private JButton btnPagar;
	private ResourceBundle bn;

	public TelaPagamentoDebito(ResourceBundle bn,String nome, String cpf,String valor) {
		this.bn = bn;
		setBounds(100, 100, 270, 285);
		contentPane = getContentPane();
      		
		panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel);
		
		lblValor = new JLabel(bn.getString("TelaPagamentoDebito.label.text")); 
		lblValor.setBounds(10, 23, 46, 14);
		panel.add(lblValor);
		
		lblCpf = new JLabel(bn.getString("TelaPagamentoDebito.label_1.text")); 
		lblCpf.setBounds(10, 48, 46, 14);
		panel.add(lblCpf);
		
		lblTitular = new JLabel(bn.getString("TelaPagamentoDebito.label_2.text")); 
		lblTitular.setBounds(10, 73, 46, 14);
		panel.add(lblTitular);
		
		txtValor = new JTextField();
		txtValor.setText(valor); 
		txtValor.setColumns(10);
		txtValor.setBounds(66, 20, 168, 20);
		panel.add(txtValor);
		
		txtCpf = new JTextField();
		txtCpf.setText(cpf); 
		txtCpf.setColumns(10);
		txtCpf.setBounds(66, 45, 168, 20);
		panel.add(txtCpf);
		
		
	
		
		txtTitular = new JTextField();
		txtTitular.setText(nome); 
		txtTitular.setColumns(10);
		txtTitular.setBounds(66, 70, 168, 20);
		panel.add(txtTitular);
		
		lblBanco = new JLabel(bn.getString("TelaPagamentoDebito.lblBanco.text")); 
		lblBanco.setBounds(10, 98, 100, 14);
		panel.add(lblBanco);
		
		txtBanco = new JTextField();
		txtBanco .setText(""); 
		txtBanco .setColumns(10);
		txtBanco .setBounds(70, 98, 40, 20);
		panel.add(txtBanco);
		
		
		lblAgncia = new JLabel(bn.getString("TelaPagamentoDebito.lblAgncia.text")); 
		lblAgncia.setBounds(10, 123, 100, 14);
		panel.add(lblAgncia);
		
		lblContaCorrente = new JLabel(bn.getString("TelaPagamentoDebito.lblContaCorrente.text"));
		lblContaCorrente.setBounds(10, 148, 100, 14);
		panel.add(lblContaCorrente);
		
		lblTelefone = new JLabel(bn.getString("TelaPagamentoDebito.lblTelefone.text"));
		lblTelefone.setBounds(10, 173, 100, 14);
		panel.add(lblTelefone);
		
		//cbxBanco = new JComboBox<String>();
		//cbxBanco.addItem("Banco do Brasil");
		//cbxBanco.addItem("Caixa Economica Federal");
		//cbxBanco.setBounds(120, 95, 114, 20);
		//panel.add(cbxBanco);
		
		txtAgncia = new JTextField();
		//txtAgncia.setText(bn.getString("TelaPagamentoDebito.txtAgncia.text")); 
		txtAgncia.setBounds(120, 120, 114, 20);
		panel.add(txtAgncia);
		txtAgncia.setColumns(10);
		
		txtContaCorrente = new JTextField();
		//txtContaCorrente.setText(bn.getString("TelaPagamentoDebito.txtContaCorrente.text")); 
		txtContaCorrente.setBounds(120, 145, 114, 20);
		panel.add(txtContaCorrente);
		txtContaCorrente.setColumns(10);
		
		txtTelefone = new JTextField();
		//txtTelefone.setText(bn.getString("TelaPagamentoDebito.txtTelefone.text")); 
		txtTelefone.setBounds(120, 170, 114, 20);
		panel.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		btnPagar = new JButton(bn.getString("TelaPagamentoDebito.btnPagar.text"));
		btnPagar.setBounds(145, 201, 89, 23);
		panel.add(btnPagar);
		btnPagar.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnPagar) {
			
			sistemasExternos.PagamentoDebito obj = null;
			try {
				obj = new sistemasExternos.PagamentoDebito();
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			
			String cpf = txtCpf.getText();
			String titular  = txtTitular.getText();
			String banco = txtBanco.getText();
			String agencia = txtAgncia.getText();
			String contacorrente = txtContaCorrente.getText();
				
			try {
				
				
				if(obj.busca(cpf,titular,banco,agencia,contacorrente)){
					
					
					setVisible(false);
					int emprestimo = 76;
					JOptionPane.showMessageDialog(null, "Emprestimo Efetuado! /n Número do Emprestimo: " + emprestimo);
					emprestimo++;
				}
				
		
			} catch (Exception e1) {
			
				e1.printStackTrace();
			}
			

			
			
		}
		}

		
	}


