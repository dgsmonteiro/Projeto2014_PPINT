package telas;

import java.awt.Container;

import javax.swing.Action;
import javax.swing.ComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JComboBox;

import negocios.Automovel;
import negocios.Modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
public class ModeloComboModel extends AbstractListModel<Object> implements ComboBoxModel<Object>{
	private List<Modelo> listModelo;
	private Modelo selectedModelo;
	private final static in FIRSTINDEX = 0;
	
	
}
*/
public class TelaManterAutomovel extends JFrame implements ActionListener {

	private Container contentPane;
	private static JTextField txtPlaca;
	private static JTextField txtChassi;
	private static JTextField txtModelo;
	private static JTextField txtFabricante;
//	private static JTextField txtAgencia;
	private static JTextField txtAno;
	//private static JTextField txtEstado;
	private static JTextField txtKm;
	private static JTextField txtDescrio;
	private static JTextField txtGrupo;
	private static JTextField txtTarifaKmLivre;
	private static JTextField txtTarifaKmControlado;
	private static JTextField txtObservaes;
	private static JTextField txtStatus;
	private JPanel panel;
	private JLabel lblPlaca;
	private JButton btnConsultar;
	private JLabel lblChassi;
	private JLabel lblModelo;
	private JLabel lblFabricante;
	private JLabel lblAno;
	private JLabel lblEstado;
	private JLabel lblKm;
	private JLabel lblAgncia;
	private JLabel lblStatus;
	private JLabel lblDescrio;
	private static JComboBox<String> cbxAgencia;
	private static JComboBox<String> cbxStatus;
	private static JComboBox<String> cbxModelo;
	private static JComboBox<String> cbxEstado;
	
	
	private JButton btnNovoModelo;
	private JLabel lblGrupo;
	private JLabel lblTarifaKmLivre;
	private JLabel lblTarifakmControlado;
	private JLabel lblObservaes;
	private JButton btnExcluir;
	private JButton btnLimpar;
	private JButton btnAlterar;
	private JButton btnCadastrar;
	private ResourceBundle bn;

	public TelaManterAutomovel(ResourceBundle bn) throws SQLException {
		this.bn = bn;
		setTitle(bn.getString("TelaManterAutomovel.this.title")); 
		setBounds(100, 100, 556, 364);
		contentPane = getContentPane();
      		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblPlaca = new JLabel(bn.getString("TelaManterAutomovel.lblPlaca.text"));
		lblPlaca.setBounds(297, 15, 46, 14);
		panel.add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setText(""); 
		txtPlaca.setBounds(335, 12, 86, 20);
		panel.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		btnConsultar = new JButton(bn.getString("TelaManterAutomovel.btnConsultar.text"));
		btnConsultar.setBounds(431, 11, 89, 23);
		panel.add(btnConsultar);
		
		lblChassi = new JLabel(bn.getString("TelaManterAutomovel.lblChassi.text"));
		lblChassi.setBounds(10, 49, 71, 14);
		panel.add(lblChassi);
		
		lblStatus = new JLabel("Status");
		lblStatus.setBounds(270, 199, 80, 14);
		panel.add(lblStatus);
		

		
		lblModelo = new JLabel(bn.getString("TelaManterAutomovel.lblModelo.text"));
		lblModelo.setBounds(10, 19, 71, 14);
		panel.add(lblModelo);
		
		lblFabricante = new JLabel(bn.getString("TelaManterAutomovel.lblFabricante.text"));
		lblFabricante.setBounds(10, 99, 71, 14);
		panel.add(lblFabricante);
		
		lblAno = new JLabel(bn.getString("TelaManterAutomovel.lblAno.text"));
		lblAno.setBounds(10, 124, 71, 14);
		panel.add(lblAno);
		
		lblEstado = new JLabel(bn.getString("TelaManterAutomovel.lblEstado.text"));
		lblEstado.setBounds(10, 149, 71, 14);
		panel.add(lblEstado);
		
		lblKm = new JLabel(bn.getString("TelaManterAutomovel.lblKm.text"));
		lblKm.setBounds(10, 174, 71, 14);
		panel.add(lblKm);
		
		lblAgncia = new JLabel(bn.getString("TelaManterAutomovel.lblAgncia.text"));
		lblAgncia.setBounds(10, 199, 71, 14);
		panel.add(lblAgncia);
		
		lblDescrio = new JLabel(bn.getString("TelaManterAutomovel.lblDescrio.text"));
		lblDescrio.setBounds(10, 224, 71, 14);
		panel.add(lblDescrio);
		
		

		
		
		txtChassi = new JTextField();
		txtChassi.setText(""); 
		txtChassi.setBounds(91, 46, 140, 20);
		panel.add(txtChassi);
		txtChassi.setColumns(10);
		
		
		Automovel aut = new Automovel();
		ArrayList<String> m = new ArrayList<String>();
		m = aut.consultaNome();
		
		cbxModelo = new JComboBox<String>();
		cbxModelo.setBounds(91, 16, 140, 20);

		for(int i=0;i < m.size(); i++ ){
		cbxModelo.addItem(m.get(i));
		}
	
		panel.add(cbxModelo);
		
		
		txtFabricante = new JTextField();
		txtFabricante.setText(""); 
		txtFabricante.setBounds(91, 96, 140, 20);
		panel.add(txtFabricante);
		txtFabricante.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setText(""); 
		txtAno.setBounds(91, 126, 140, 20);
		panel.add(txtAno);
		txtAno.setColumns(10);	
		
	
		
		cbxEstado = new JComboBox<String>();
		cbxEstado.setBounds(91, 146, 140, 20);
		cbxEstado.addItem("SP");
		cbxEstado.addItem("RJ"); 
		panel.add(cbxEstado);
		
		txtKm = new JTextField();
		txtKm.setText(""); 
		txtKm.setBounds(91, 171, 140, 20);
		panel.add(txtKm);
		txtKm.setColumns(10);
		
		
		
		
		cbxAgencia = new JComboBox<String>();
		cbxAgencia.setBounds(91, 196, 140, 20);
		cbxAgencia.addItem("AG1");
		cbxAgencia.addItem("AG2"); 
		panel.add(cbxAgencia);
		
		
		
		cbxStatus = new JComboBox<String>();
		cbxStatus.setBounds(320, 199, 100, 30);
		cbxStatus.addItem("Disponível");
		cbxStatus.addItem("Indisponível"); 
		cbxStatus.addItem("Manutenção"); 
		panel.add(cbxStatus);
		
		
		
		

		
		txtDescrio = new JTextField();
		txtDescrio.setText(""); 
		txtDescrio.setBounds(91, 221, 140, 20);
		panel.add(txtDescrio);
		txtDescrio.setColumns(10);
		
		/*btnNovoModelo = new JButton(bn.getString("TelaManterAutomovel.btnNovoModelo.text"));
		btnNovoModelo.setBounds(254, 70, 116, 23);
		panel.add(btnNovoModelo);*/
		
		lblGrupo = new JLabel(bn.getString("TelaManterAutomovel.lblGrupo.text"));
		lblGrupo.setBounds(318, 99, 52, 14);
		panel.add(lblGrupo);
		
		txtGrupo = new JTextField();
		txtGrupo.setText(""); 
		txtGrupo.setBounds(380, 96, 140, 20);
		panel.add(txtGrupo);
		txtGrupo.setColumns(10);
		
		lblTarifaKmLivre = new JLabel(bn.getString("TelaManterAutomovel.lblTarifaKmLivre.text"));
		lblTarifaKmLivre.setBounds(270, 124, 89, 14);
		panel.add(lblTarifaKmLivre);
		
		txtTarifaKmLivre = new JTextField();
		txtTarifaKmLivre.setText(""); 
		txtTarifaKmLivre.setBounds(380, 121, 140, 20);
		panel.add(txtTarifaKmLivre);
		txtTarifaKmLivre.setColumns(10);
		
		lblTarifakmControlado = new JLabel(bn.getString("TelaManterAutomovel.lblTarifakmControlado.text"));
		lblTarifakmControlado.setBounds(241, 149, 129, 14);
		panel.add(lblTarifakmControlado);
		
		txtTarifaKmControlado = new JTextField();
		txtTarifaKmControlado.setText(""); 
		txtTarifaKmControlado.setBounds(380, 146, 140, 20);
		panel.add(txtTarifaKmControlado);
		txtTarifaKmControlado.setColumns(10);
		
		/*lblObservaes = new JLabel(bn.getString("TelaManterAutomovel.lblObservaes.text"));
		lblObservaes.setBounds(270, 199, 80, 14);
		panel.add(lblObservaes);
		
		txtObservaes = new JTextField();
		txtObservaes.setText(""); 
		txtObservaes.setBounds(380, 171, 140, 67);
		panel.add(txtObservaes);
		txtObservaes.setColumns(10);*/
		
		btnExcluir = new JButton(bn.getString("TelaManterAutomovel.btnExcluir.text"));
		btnExcluir.setBounds(431, 266, 89, 23);
		panel.add(btnExcluir);
		
		btnLimpar = new JButton(bn.getString("TelaManterAutomovel.btnLimpar.text"));
		btnLimpar.setBounds(318, 266, 89, 23);
		panel.add(btnLimpar);
		
		btnAlterar = new JButton(bn.getString("TelaManterAutomovel.btnAlterar.text"));
		btnAlterar.setBounds(205, 266, 89, 23);
		panel.add(btnAlterar);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(78, 266, 102, 23);
		panel.add(btnCadastrar);
		
		btnAlterar.addActionListener(this);
		btnCadastrar.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnExcluir.addActionListener(this);

		btnConsultar.addActionListener(this); 
		cbxModelo.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent actionEvent){
				
				String index= (String) cbxModelo.getSelectedItem();
			//	System.out.println(index);
				carMod(index);
			}

		
		
			
			
		});

	}

	
	public void actionPerformed(ActionEvent e) {
		
		


		

		
			

			if (e.getSource() == btnConsultar) {
				if(txtPlaca.getText().equals("")){				
					JOptionPane.showMessageDialog(null, "Digite placa");
				}else{

			negocios.Automovel automovel = new negocios.Automovel();
			

			try {
				automovel = automovel.consultar(txtPlaca.getText());
				cbxAgencia.setSelectedItem(automovel.getAgencia()); 
				txtAno.setText(automovel.getAno());
				txtChassi.setText(automovel.getChassi());
				cbxEstado.setSelectedItem(automovel.getEstado());		
				txtKm.setText(""+automovel.getKm());
				txtPlaca.setText(automovel.getPlaca());
				btnCadastrar.setEnabled(false);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
				}
			
	
	}  else if (e.getSource() == btnLimpar) {
		limpar();
	}
		
		

	 else if (e.getSource() == btnExcluir) {
							
				if(txtPlaca.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Realize consulta");
					
				
				}else{
			
			negocios.Automovel automovel = new negocios.Automovel();
			try {
				automovel.excluir(txtPlaca.getText());
			} catch (SQLException e1) {
				
				e1.printStackTrace();
				
				
			}
			//JOptionPane.showMessageDialog(null,"Exclusão realizada!");
			
			limpar();
				}
			} else if (e.getSource() == btnAlterar) {
				
				 if (txtPlaca.getText().trim().isEmpty()){					
					JOptionPane.showMessageDialog(null,"Realize consulta");
				}
				
			else if (txtAno.getText().equals("")){					
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				}
				
				else if (txtChassi.getText().trim().isEmpty()){					
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				}				
				
		
				
				else if (txtKm.getText().trim().isEmpty()){					
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				}					
					else {
					
				
				
				
				negocios.Automovel automovel = new negocios.Automovel();
				try {
					automovel.alterar((String)cbxAgencia.getSelectedItem(),txtAno.getText(),
							txtChassi.getText(),(String)cbxEstado.getSelectedItem(),Double.parseDouble(txtKm.getText()), txtPlaca.getText());
					
			
			
					
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null,"Alteração realizada!");
				limpar();
			}
			}else	if (e.getSource() == btnCadastrar) {
				
				
				 if(txtPlaca.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				}
				

				
				else if(txtAno.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				}
				
				else if(txtChassi.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				}
				
				else if(txtKm.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				}
				
		
			
				
				else{
			negocios.Automovel aut = new negocios.Automovel();
			
			
				try {
					aut.incluir(txtPlaca.getText(),(String)cbxAgencia.getSelectedItem(),txtAno.getText(),txtChassi.getText(), (String)cbxEstado.getSelectedItem(), Double.parseDouble(txtKm.getText()),(String)cbxModelo.getSelectedItem());						
					
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null,"Não foi cadastrado");
					e1.printStackTrace();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null,"ERRO");
					e1.printStackTrace();
				}
				
			
				limpar();
				} 
			}
				
				
	}
	
	
	public  void carMod(String modelo){
	
	
	negocios.Automovel obj = new negocios.Automovel();



	try {
		 Modelo mod = new Modelo();
		 mod = obj.consultarMod(modelo);
	
		
		txtDescrio.setText(mod.getDescricao());
		txtFabricante.setText(mod.getFabricante());
		txtGrupo.setText(mod.getGrupo());		
		txtTarifaKmLivre.setText(""+mod.getTarifaKmLivre());
		txtTarifaKmControlado.setText(""+mod.getTarifaKmControlado());
		txtDescrio.setEnabled(false);
		txtFabricante.setEnabled(false);
		txtGrupo.setEnabled(false);
		txtTarifaKmLivre.setEnabled(false);
		txtTarifaKmControlado.setEnabled(false);
	
	} catch (SQLException e1) {
		
		e1.printStackTrace();
	}
	
	
}

	

	

	public static void limpar(){
		
		
		txtAno.setText("");
		txtChassi.setText("");
		cbxEstado.setSelectedIndex(0);
		cbxAgencia.setSelectedIndex(0);
		txtKm.setText("");
		txtPlaca.setText("");
		txtPlaca.setEnabled(true);
		
	}
	
	
	
	
}
