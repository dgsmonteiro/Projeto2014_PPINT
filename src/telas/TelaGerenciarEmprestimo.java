package telas;

import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.border.LineBorder;

import negocios.Automovel;
import negocios.Modelo;

import java.sql.SQLException;
import java.util.ResourceBundle;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaGerenciarEmprestimo extends JFrame implements ActionListener{

	private Container contentPane;
	private JTextField txtCpf;
	private JTextField txtNome;
	private JTextField txtCategoria;
	private JTextField txtModelo;
	//private JTextField txtVeculo;
	private JTextField txtPlaca;
	private JTextField txtDatahoraEmprestimo;
	private JTextField txtPrevisoDevoluo;
	private JComboBox<String> cbxTipoTarifa;
	private JTextField txtTipoTarifa;
	private JTable table;
	private JPanel panel;
	private JLabel lblCpf;
	private JLabel lblNome;
	private JLabel lblCategoria;
	private JLabel lblModelo;
//	private JLabel lblVeculo;
	private JLabel lblPlaca;
	private JLabel lblDatahoraEmprestimo;
	private JLabel lblPrevisoDevoluo;
	private JLabel lblTipoTarifa;
	private JButton btnOk;
	private JButton btnEfetivarEmprestimo;
	private Panel panel_1;
	private JLabel lblAcessrios;
	private ResourceBundle bn;
	private double km;
	private Automovel auto;
	private double valor;

	public TelaGerenciarEmprestimo(ResourceBundle bn, String categoria, String modelo, Automovel objAutomovel,final double livre,final double controlado) 
	{
		auto = objAutomovel;
		this.bn = bn;
		setVisible(true);
		setTitle(bn.getString("TelaGerenciarEmprestimo.this.title"));
		setBounds(100, 100, 591, 311);
		contentPane = getContentPane();   		
		panel = new JPanel();
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblCpf = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblCpf.text"));
		lblCpf.setBounds(10, 32, 130, 14);
		panel.add(lblCpf);
		
		lblNome = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblNome.text"));
		lblNome.setBounds(10, 57, 130, 14);
		panel.add(lblNome);
		
		lblCategoria = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblCategoria.text"));
		lblCategoria.setBounds(10, 82, 130, 14);
		panel.add(lblCategoria);
		
		lblModelo = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblModelo.text"));
		lblModelo.setBounds(10, 107, 130, 14);
		panel.add(lblModelo);
		
		/*lblVeculo = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblVeculo.text"));
		lblVeculo.setBounds(10, 132, 130, 14);
		panel.add(lblVeculo);*/
		
		lblPlaca = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblPlaca.text"));
		lblPlaca.setBounds(10, 157, 130, 14);
		panel.add(lblPlaca);
		
		
		
		
		
		
		
		
		lblDatahoraEmprestimo = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblDatahoraEmprestimo.text"));
		lblDatahoraEmprestimo.setBounds(10, 182, 130, 14);
		panel.add(lblDatahoraEmprestimo);
		
		lblPrevisoDevoluo = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblPrevisoDevoluo.text"));
		lblPrevisoDevoluo.setBounds(10, 207, 130, 14);
		panel.add(lblPrevisoDevoluo);
		
		lblTipoTarifa = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblTipoTarifa.text"));
		lblTipoTarifa.setBounds(10, 232, 130, 14);
		panel.add(lblTipoTarifa);
		
		txtCpf = new JTextField();
	
		txtCpf.setBounds(150, 29, 140, 20);
		panel.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtNome = new JTextField();
	
		txtNome.setBounds(150, 54, 140, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setText(categoria);
		txtCategoria.setEnabled(false);
		txtCategoria.setBounds(150, 79, 140, 20);
		panel.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setText(modelo);
		txtModelo.setEnabled(false);
		txtModelo.setBounds(150, 104, 140, 20);
		panel.add(txtModelo);
		txtModelo.setColumns(10);
		
	/*	txtVeculo = new JTextField();
		
		txtVeculo.setBounds(150, 129, 140, 20);
		panel.add(txtVeculo);
		txtVeculo.setColumns(10);*/
		
		txtPlaca = new JTextField();
		txtPlaca.setText(objAutomovel.getPlaca());
		txtPlaca.setBounds(150, 154, 140, 20);
		txtPlaca.setEnabled(false);
	
	
		panel.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		txtDatahoraEmprestimo = new JTextField();
		
		txtDatahoraEmprestimo.setBounds(150, 179, 140, 20);
		panel.add(txtDatahoraEmprestimo);
		txtDatahoraEmprestimo.setColumns(10);
		
		txtPrevisoDevoluo = new JTextField();
	
		txtPrevisoDevoluo.setBounds(150, 204, 140, 20);
		panel.add(txtPrevisoDevoluo);
		txtPrevisoDevoluo.setColumns(10);
		

		
		cbxTipoTarifa = new JComboBox<String>();	
		cbxTipoTarifa.addItem("Livre");
		cbxTipoTarifa.addItem("Controlado");
	
		cbxTipoTarifa.setBounds(150, 229, 100, 20);
		panel.add(cbxTipoTarifa);
		
		

	
		
		txtTipoTarifa = new JTextField();
		txtTipoTarifa.setBounds(280, 229, 40, 20);
		panel.add(txtTipoTarifa);
		txtTipoTarifa.setColumns(10);
		
		btnOk = new JButton(bn.getString("TelaGerenciarEmprestimo.btnOk.text"));
		btnOk.setBounds(300, 28, 89, 23);
		panel.add(btnOk);
		
		btnEfetivarEmprestimo = new JButton(bn.getString("TelaGerenciarEmprestimo.btnEfetivarEmprestimo.text"));
		btnEfetivarEmprestimo.setBounds(379, 228, 162, 23);
		panel.add(btnEfetivarEmprestimo);
		
		panel_1 = new Panel();
		panel_1.setBounds(317, 82, 224, 104);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblAcessrios = new JLabel(bn.getString("TelaGerenciarEmprestimo.lblAcessrios.text_1"));
		lblAcessrios.setBounds(10, 11, 75, 14);
		panel_1.add(lblAcessrios);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Cadeira de Bebê", null},
				{"Navegador GPS", null},
				{"Motorista", null},
			},
			new String[] {
				"Acessório", "Incluir"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(94);
		table.getColumnModel().getColumn(1).setPreferredWidth(56);
		table.setBounds(20, 36, 194, 48);
		panel_1.add(table);
		
		btnOk.addActionListener(this);
		btnEfetivarEmprestimo.addActionListener(this);

	
	
	
	
	
	cbxTipoTarifa.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent actionEvent){
			if(cbxTipoTarifa.getSelectedIndex() == 0)
			{
			
				txtTipoTarifa.setText(""+ livre);
			}
			
			else{
				
				txtTipoTarifa.setText(""+ controlado);
				
			}
			
			
			} 

		
	});
	
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			
			
			if(txtCpf.getText().equals("")){				
				JOptionPane.showMessageDialog(null, "Digite um cpf");
			}else{
				negocios.Cliente cliente = new negocios.Cliente();
				try {
					cliente = cliente.consultar(txtCpf.getText());
				
			txtCpf.setText(cliente.getCpf()); 	
			txtNome.setText(cliente.getNome());
	
			} catch (SQLException e1) {					
					e1.printStackTrace();
			}
			
			}
			
			
			
			
			
	
		} else if (e.getSource() == btnEfetivarEmprestimo) {
			String cpf = txtCpf.getText();
			String nome = txtNome.getText();
			if (cbxTipoTarifa.getSelectedIndex()==1){
				km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a quantidade de Km a ser utilizada: "));
				valor = km*Double.parseDouble(txtTipoTarifa.getText());
				System.out.println(valor);
			}
			
				negocios.Emprestimo obj = new negocios.Emprestimo();
			TelaPagamento frame = new TelaPagamento(bn, cpf,nome, valor);
			frame.setVisible(true);
         dispose();
		}
		
	}
	
	
	
	public  double tarifa(String index, String modelo)
	{			
		 Modelo mod = new Modelo();
		 double tar=0;
		 	//System.out.println("modelo é" + modelo);
		try {
			int p= mod.getC(modelo);	
			
			 mod.consultar(p);
			// System.out.println("código dele é " + p );
			 	
			 if (index.equals("Livre")){
				
					tar = mod.getTarifaKmLivre();
			 }
			
			 else{
				tar = mod.getTarifaKmControlado();
				 
			 }
		
			

					
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}		
		
		return tar;
	}

	
}
