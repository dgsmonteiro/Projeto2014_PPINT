package telas;

import java.awt.Component;
import java.awt.Container;

import negocios.Modelo; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.sql.SQLException;
import java.util.ResourceBundle;

public class TelaManterModelo extends JFrame implements ActionListener {

	private Container contentPane;
	private static JTextField txtCodigo;
	private static JTextField txtModelo;
	private static JTextField txtFabricante;
	private static  JComboBox<String> cbxCategoria;
	private static JTextField txtTarifaKmLivre;
	private static JTextField txtTarifaKmControlado;
	private static  JTextField txtDescrio;
	private JPanel panel;
	private JLabel lblCodigo;
	private JLabel lblModelo;
	private JLabel lblFabricante;
	private JLabel lblGrupo;
	private JLabel lblTarifaKmLivre;
	private JLabel lblTarifaKmControlado;
	private JLabel lblDescrio;
	private JButton btnExcluir;
	private JButton btnLimpar;
	private JButton btnAlterar;
	private JButton btnCadastrar;
	private JButton btnConsultar;
	private ResourceBundle bn;

	public TelaManterModelo(ResourceBundle bn) {
		setBounds(100, 100, 590, 294);
		contentPane = getContentPane();
      		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblCodigo = new JLabel(bn.getString("TelaManterModelo.lblCodigo.text"));
		lblCodigo.setBounds(10, 25, 50, 25);
		panel.add(lblCodigo);
		
		lblModelo = new JLabel(bn.getString("TelaManterModelo.lblModelo.text"));
		lblModelo.setBounds(10, 75, 76, 14);
		panel.add(lblModelo);
		
		lblFabricante = new JLabel(bn.getString("TelaManterModelo.lblFabricante.text"));
		lblFabricante.setBounds(10, 100, 76, 14);
		panel.add(lblFabricante);
		
		txtCodigo = new JTextField();
		
		txtCodigo.setBounds(60, 25, 86, 20);
		panel.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		
		txtModelo = new JTextField();
	
		txtModelo.setBounds(96, 72, 140, 20);
		panel.add(txtModelo);
		txtModelo.setColumns(10);
		
		txtFabricante = new JTextField();

		txtFabricante.setBounds(96, 97, 140, 20);
		panel.add(txtFabricante);
		txtFabricante.setColumns(10);
		
		lblGrupo = new JLabel(bn.getString("TelaManterModelo.lblGrupo.text"));
		lblGrupo.setBounds(265, 50, 123, 14);
		panel.add(lblGrupo);
		
		lblTarifaKmLivre = new JLabel(bn.getString("TelaManterModelo.lblTarifaKmLivre.text"));
		lblTarifaKmLivre.setBounds(265, 75, 123, 14);
		panel.add(lblTarifaKmLivre);
		
		lblTarifaKmControlado = new JLabel(bn.getString("TelaManterModelo.lblTarifaKmControlado.text"));
		lblTarifaKmControlado.setBounds(265, 100, 123, 14);
		panel.add(lblTarifaKmControlado);
		
		cbxCategoria = new JComboBox<String>();
		cbxCategoria.addItem("A – Econômico");
		cbxCategoria.addItem("C – Econômico com Ar");
		cbxCategoria.addItem("F – Intermediário");
		cbxCategoria.addItem("G – Intermediário Wagon Especial");
		cbxCategoria.addItem("H – Executivo");
		cbxCategoria.addItem("I – Utilitário");
		cbxCategoria.addItem("K – Executivo Luxo");
		cbxCategoria.addItem("M – Intermediário Wagon");
		cbxCategoria.addItem("N – Pick-up;");
		cbxCategoria.addItem("P – 4 x 4 Especial");
		cbxCategoria.addItem("R – Minivan");
		cbxCategoria.addItem("U – Furgão");
		cbxCategoria.addItem("Y – Blindado");
		cbxCategoria.setBounds(398, 47, 140, 20);
		panel.add(cbxCategoria);
		
		
		txtTarifaKmLivre = new JTextField();
	
		txtTarifaKmLivre.setBounds(398, 72, 140, 20);
		panel.add(txtTarifaKmLivre);
		txtTarifaKmLivre.setColumns(10);
		
		txtTarifaKmControlado = new JTextField();
		txtTarifaKmControlado.setBounds(398, 97, 140, 20);
		panel.add(txtTarifaKmControlado);
		txtTarifaKmControlado.setColumns(10);
		
		lblDescrio = new JLabel(bn.getString("TelaManterModelo.lblDescrio.text"));
		lblDescrio.setBounds(10, 147, 76, 14);
		panel.add(lblDescrio);
		
		txtDescrio = new JTextField();
		txtDescrio.setBounds(96, 128, 442, 55);
		panel.add(txtDescrio);
		txtDescrio.setColumns(10);
		
		btnExcluir = new JButton(bn.getString("TelaManterModelo.btnExcluir.text"));
		btnExcluir.setBounds(449, 194, 89, 23);
		panel.add(btnExcluir);
		
		btnLimpar = new JButton(bn.getString("TelaManterModelo.btnLimpar.text"));
		btnLimpar.setBounds(350, 194, 89, 23);
		panel.add(btnLimpar);
		
		btnAlterar = new JButton(bn.getString("TelaManterModelo.btnAlterar.text"));
		btnAlterar.setBounds(251, 194, 89, 23);
		panel.add(btnAlterar);
		
		btnCadastrar = new JButton(bn.getString("TelaManterModelo.btnCadastrar.text"));
		btnCadastrar.setBounds(147, 194, 95, 23);
		panel.add(btnCadastrar);
		
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(170, 25, 89, 23);
		panel.add(btnConsultar);	
		
		btnLimpar.addActionListener(this);
		btnCadastrar.addActionListener(this);
		btnAlterar.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnConsultar.addActionListener(this);
	
		
		
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnConsultar) {
			if(txtCodigo.getText().equals("")){				
				JOptionPane.showMessageDialog(null, "Digite um código");
			}else{
				
			negocios.Modelo modelo = new negocios.Modelo();

				try {
					modelo = modelo.consultar(Integer.parseInt(txtCodigo.getText()));
					txtCodigo.setText(""+modelo.getCodigo()); 
					txtDescrio.setText(modelo.getDescricao());
					txtFabricante.setText(modelo.getFabricante());
					cbxCategoria.setSelectedItem(modelo.getGrupo());
					txtModelo.setText(modelo.getModelo());
					txtTarifaKmControlado.setText(""+ modelo.getTarifaKmControlado());
					txtTarifaKmLivre.setText(""+ modelo.getTarifaKmLivre());
					btnCadastrar.setEnabled(false);
					
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				
					
				}
					
				}
		}else if (e.getSource() == btnLimpar) {
			limpar();
		}
			 else
					if (e.getSource() == btnExcluir) {
						
						if (txtCodigo.getText().equals("")){					
							 JOptionPane.showMessageDialog(null, "ERRO");
						}else{
						
						
					negocios.Modelo modelo = new negocios.Modelo();
					try {
						modelo.excluir(Integer.parseInt(txtCodigo.getText()));
						//JOptionPane.showMessageDialog(null,"Exclusão realizada!");
					} catch (SQLException e1) {
						
						e1.printStackTrace();
						
						
					}
						}
					
					
					limpar();
					
					
					}

			else	if (e.getSource() == btnCadastrar) {
				
				if (validaNumero(txtCodigo)==true){
					JOptionPane.showMessageDialog(null,"Apenas números para código");
					
				}
				
				else if (validaNumero(txtTarifaKmLivre)==true){
					JOptionPane.showMessageDialog(null,"Apenas números para tarifa");
					
				}
				
				else if (validaNumero(txtTarifaKmControlado)==true){
					JOptionPane.showMessageDialog(null,"Apenas números para tarifa");
					
				}
				
				if(txtCodigo.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}
				
				
				else if(txtDescrio.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					
					}
					
				else if(txtFabricante.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}				
				
		
				
				else if(txtModelo.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}				
				else if(txtTarifaKmLivre.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}				
				else if(txtTarifaKmControlado.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}	else{ 													
				
				negocios.Modelo modelo = new negocios.Modelo();
				
				
				try {
					modelo.incluir(Integer.parseInt(txtCodigo.getText()),txtDescrio.getText(),txtFabricante.getText(), (String)cbxCategoria.getSelectedItem(),txtModelo.getText(), Double.parseDouble(txtTarifaKmLivre.getText()), Double.parseDouble(txtTarifaKmControlado.getText()));
				
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null,"Não foi cadastrado");
					e1.printStackTrace();
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null,"ERRO");
					e1.printStackTrace();
				}
				
				
				limpar();
				}
				
				
				
			} else if (e.getSource() == btnAlterar) {	
				
				
				
				if(txtCodigo.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Realize consulta");
					
				
				}
				
				
				else if(txtDescrio.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					
					}
					
				else if(txtFabricante.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}				
				
				else if(txtModelo.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}				
				else if(txtTarifaKmLivre.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}				
				else if(txtTarifaKmControlado.getText().trim().isEmpty()){				
					JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
					
				
				}	else{ 	
					
			
				negocios.Modelo modelo = new negocios.Modelo();
				try {
					modelo.alterar(Integer.parseInt(txtCodigo.getText()),txtDescrio.getText(),txtFabricante.getText(),(String)cbxCategoria.getSelectedItem(),
							txtModelo.getText(),Double.parseDouble(txtTarifaKmControlado.getText()),Double.parseDouble(txtTarifaKmLivre.getText()));
					
					
					btnExcluir.setEnabled(true);
					btnAlterar.setEnabled(true);
					btnConsultar.setEnabled(true);
			
				JOptionPane.showMessageDialog(null,"Alteração realizada!");
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
			
				limpar();
			}
			}
	
			
			
		
	} 
	
	
	
	public static boolean validaNumero(JTextField numero){
		boolean t=false;
		long valor;
		
		if (numero.getText().length()!= 0){
			try{
				valor = Long.parseLong(numero.getText());
				t=false;
			}
			catch(NumberFormatException ex){
				t=true;
				numero.grabFocus();
			}
			
		}
		
		return t;
		
	}
		

		
		public static void limpar(){		
	
		txtCodigo.setText("");
		txtModelo.setText("");
		txtFabricante.setText("");
		txtTarifaKmLivre.setText("");
		txtTarifaKmControlado.setText("");
		txtDescrio.setText("");
		txtCodigo.setEnabled(true);
	
	
	}
	
	
}
