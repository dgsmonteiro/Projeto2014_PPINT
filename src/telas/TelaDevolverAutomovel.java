package telas;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.util.ResourceBundle;
import java.awt.Panel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDevolverAutomovel extends JFrame implements ActionListener {

	private Container contentPane;
	private JTextField txtValorPago;
	private JTextField txtAdicionais;
	private JTextField txtTotal;
	private JTable table;
	private JPanel panel;
	private JLabel lblNmeroDoEmprestimo;
	private JButton btnOk;
	private JLabel lblValorPago;
	private JLabel lblAdicionais;
	private JLabel lblTotal;
	private JButton btnConfirmar;
	private Panel panel_1;
	private JLabel lblDadosDoEmprestimo;
	private ResourceBundle bn;

	public TelaDevolverAutomovel(ResourceBundle bn) {
		this.bn = bn;
		setTitle(bn.getString("TelaDevolverAutomovel.this.title"));
		setBounds(100, 100, 450, 394);
		contentPane = getContentPane();
      		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNmeroDoEmprestimo = new JLabel(bn.getString("TelaDevolverAutomovel.lblNmeroDoEmprestimo.text"));
		lblNmeroDoEmprestimo.setBounds(10, 11, 140, 14);
		panel.add(lblNmeroDoEmprestimo);
		
		btnOk = new JButton(bn.getString("TelaDevolverAutomovel.btnOk.text"));
		btnOk.setBounds(270, 7, 89, 23);
		panel.add(btnOk);
		
		lblValorPago = new JLabel(bn.getString("TelaDevolverAutomovel.lblValorPago.text"));
		lblValorPago.setBounds(218, 228, 89, 14);
		panel.add(lblValorPago);
		
		lblAdicionais = new JLabel(bn.getString("TelaDevolverAutomovel.lblAdicionais.text"));
		lblAdicionais.setBounds(218, 253, 89, 14);
		panel.add(lblAdicionais);
		
		lblTotal = new JLabel(bn.getString("TelaDevolverAutomovel.lblTotal.text"));
		lblTotal.setBounds(218, 278, 89, 14);
		panel.add(lblTotal);
		
		txtValorPago = new JTextField();
		txtValorPago.setText(bn.getString("TelaDevolverAutomovel.txtValorPago.text")); 
		txtValorPago.setBounds(317, 225, 86, 20);
		panel.add(txtValorPago);
		txtValorPago.setColumns(10);
		
		txtAdicionais = new JTextField();
		txtAdicionais.setText(bn.getString("TelaDevolverAutomovel.txtAdicionais.text")); 
		txtAdicionais.setBounds(317, 250, 86, 20);
		panel.add(txtAdicionais);
		txtAdicionais.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setText(bn.getString("TelaDevolverAutomovel.txtTotal.text")); 
		txtTotal.setBounds(317, 275, 86, 20);
		panel.add(txtTotal);
		txtTotal.setColumns(10);
		
		btnConfirmar = new JButton(bn.getString("TelaDevolverAutomovel.btnConfirmar.text"));
		btnConfirmar.setBounds(288, 306, 115, 23);
		panel.add(btnConfirmar);
		
		panel_1 = new Panel();
		panel_1.setBounds(10, 38, 404, 182);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Descri\u00E7\u00E3o", "Item"
			}
		));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 33, 384, 138);
		panel_1.add(table);
		
		lblDadosDoEmprestimo = new JLabel(bn.getString("TelaDevolverAutomovel.lblDadosDoEmprestimo.text_1"));
		lblDadosDoEmprestimo.setBounds(10, 11, 141, 14);
		panel_1.add(lblDadosDoEmprestimo);
		
		btnOk.addActionListener(this);
		btnConfirmar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
	
		} else if (e.getSource() == btnConfirmar) {
			TelaPagamento frame = new TelaPagamento(bn);
			frame.setVisible(true);
			//chamar a tela principal e enviar o bn como parâmetro
		}
	}

}
