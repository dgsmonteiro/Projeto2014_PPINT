package telas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.util.ResourceBundle;

public class TelaPagamentoCredito extends JFrame implements ActionListener {

	private Container contentPane;
	private JTextField txtValor;
	private JTextField txtCpf;
	private JTextField txtTitularDoCartao;
	private JTextField txtNumeroCartao;
	private JTextField txtValidadeCartao;
	private JTextField txtCodigoCartao;
	private JPanel panel;
	private JLabel lblValor;
	private JLabel lblCpf;
	private JLabel lblTitular;
	private JLabel lblNumeroDoCartao;
	private JLabel lblValidadeDoCartao;
	private JLabel lblCadigoDoCartao;
	private JComboBox<String> cbxBandeira;
	private JLabel lblBandeira;
	private JButton btnPagar;
	private ResourceBundle bn;

	public TelaPagamentoCredito(ResourceBundle bn, String nome, String cpf) {
		this.bn = bn;
		setBounds(100, 100, 270, 285);
		contentPane = getContentPane();
      		
		panel = new JPanel();
		panel.setLayout(null);
		contentPane.add(panel);
		
		lblValor = new JLabel(bn.getString("TelaPagamentoCredito.label.text"));
		lblValor.setBounds(10, 23, 46, 14);
		panel.add(lblValor);
		
		lblCpf = new JLabel(bn.getString("TelaPagamentoCredito.label_1.text"));
		lblCpf.setBounds(10, 48, 46, 14);
		panel.add(lblCpf);
		
		lblTitular = new JLabel(bn.getString("TelaPagamentoCredito.label_2.text"));
		lblTitular.setBounds(10, 73, 46, 14);
		panel.add(lblTitular);
		
		txtValor = new JTextField();
		txtValor.setText(bn.getString("TelaPagamentoCredito.textField.text")); 
		txtValor.setColumns(10);
		txtValor.setBounds(66, 20, 168, 20);
		panel.add(txtValor);
		
		txtCpf = new JTextField();
		txtCpf.setText(cpf); 
		txtCpf.setColumns(10);
		txtCpf.setBounds(66, 45, 168, 20);
		panel.add(txtCpf);
		
		txtTitularDoCartao = new JTextField();
		txtTitularDoCartao.setText(nome); 
		txtTitularDoCartao.setColumns(10);
		txtTitularDoCartao.setBounds(66, 70, 168, 20);
		panel.add(txtTitularDoCartao);
		
		lblNumeroDoCartao = new JLabel(bn.getString("TelaPagamentoCredito.lblNmeroDoCarto.text"));
		lblNumeroDoCartao.setBounds(10, 123, 100, 14);
		panel.add(lblNumeroDoCartao);
		
		lblValidadeDoCartao = new JLabel(bn.getString("TelaPagamentoCredito.lblValidadeDoCarto.text"));
		lblValidadeDoCartao.setBounds(10, 149, 100, 14);
		panel.add(lblValidadeDoCartao);
		
		lblCadigoDoCartao = new JLabel(bn.getString("TelaPagamentoCredito.lblCdigoDoCarto.text"));
		lblCadigoDoCartao.setBounds(10, 174, 100, 14);
		panel.add(lblCadigoDoCartao);
		
		cbxBandeira = new JComboBox<String>();
		cbxBandeira.addItem("Visa");
		cbxBandeira.addItem("Master Card");
		cbxBandeira.addItem("Elo");
		cbxBandeira.setBounds(120, 95, 114, 20);
		panel.add(cbxBandeira);
		
		lblBandeira = new JLabel(bn.getString("TelaPagamentoCredito.lblBandeira.text"));
		lblBandeira.setBounds(10, 98, 100, 14);
		panel.add(lblBandeira);
		
		txtNumeroCartao = new JTextField();
		txtNumeroCartao.setText(bn.getString("TelaPagamentoCredito.txtNmeroCarto.text")); 
		txtNumeroCartao.setBounds(120, 120, 114, 20);
		panel.add(txtNumeroCartao);
		txtNumeroCartao.setColumns(10);
		
		txtValidadeCartao = new JTextField();
		txtValidadeCartao.setText(bn.getString("TelaPagamentoCredito.txtValidadeCarto.text")); 
		txtValidadeCartao.setBounds(120, 146, 114, 20);
		panel.add(txtValidadeCartao);
		txtValidadeCartao.setColumns(10);
		
		txtCodigoCartao = new JTextField();
		txtCodigoCartao.setText(bn.getString("TelaPagamentoCredito.txtCdigoCarto.text")); 
		txtCodigoCartao.setBounds(120, 171, 114, 20);
		panel.add(txtCodigoCartao);
		txtCodigoCartao.setColumns(10);
		
		btnPagar = new JButton(bn.getString("TelaPagamentoCredito.btnPagar.text"));
		btnPagar.setBounds(145, 202, 89, 23);
		panel.add(btnPagar);
	}

	
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
