package telas;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

public class TelaManterCliente extends JFrame implements ActionListener {

	private Container contentPane;
	private static JTextField txtCpf;
	private static JTextField txtNome;
	private static JTextField txtRG;
	private static JTextField txtDataDeNascimento;
	private static JTextField txtTelefoneResidencial;
	private static JTextField txtTelefoneCelular;
	private static JTextField txtEmail;
	private static JTextField txtRegistroCnh;
	private static JTextField txtEstadoCnh;
	private static JTextField txtValidade;
	private static JTextField txtHabilitao;
	private static JTextField txtCEP;
	private static JTextField txtLogradouro;
	private static JTextField txtNumero;
	private static JTextField txtBairro;
	private static JTextField txtComplemento;
	private static JTextField txtCidade;
	private JPanel panel;
	private JLabel lblCpf;
	private JButton btnConsultar;
	private JLabel lblNome;
	private JLabel lblRg;
	private JLabel lblDataNascimento;
	private JLabel lblTelResidencial;
	private JLabel lblTelCelular;
	private JLabel lblSexo;
	private JLabel lblEmail;
	private JLabel lblRegistroCnh;
	private JLabel lblEstadoCnh;
	private JLabel lblValidade;
	private JLabel lblHabilitacao;
	private static JComboBox<String> cbxSexo;
	private JSeparator separator;
	private JLabel lblCep;
	private JLabel lblLogradouro;
	private JLabel lblComplemento;
	private JLabel lblNumero;
	private JLabel lbEstado;
	private static JComboBox<String> cbxEstado;
	private JLabel lblCidade;
	
	private JLabel lblBairro;
	private JButton btnExcluir;
	private JButton btnLimpar;
	private JButton btnAlterar;
	private JButton btnCadastrar;
	private ResourceBundle bn;
	

	public TelaManterCliente(ResourceBundle bn) {
		this.bn = bn;
		setTitle(bn.getString("TelaManterCliente.this.title")); 
		setBounds(100, 100, 609, 529);
		contentPane = getContentPane();
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblCpf = new JLabel(bn.getString("TelaManterCliente.lblCpf.text"));
		lblCpf.setBounds(309, 25, 37, 14);
		panel.add(lblCpf);

		btnConsultar = new JButton(bn.getString("TelaManterCliente.btnConsultar.text"));
		btnConsultar.setBounds(484, 21, 89, 23);
		panel.add(btnConsultar);
		
		lblNome = new JLabel(bn.getString("TelaManterCliente.lblNome.text"));
		lblNome.setBounds(10, 69, 46, 14);
		panel.add(lblNome);
		
		lblRg = new JLabel(bn.getString("TelaManterCliente.lblRg.text"));
		lblRg.setBounds(10, 94, 46, 14);
		panel.add(lblRg);
		
		lblDataNascimento = new JLabel(bn.getString("TelaManterCliente.lblNewLabel.text"));
		lblDataNascimento.setBounds(10, 119, 118, 14);
		panel.add(lblDataNascimento);
		
		lblTelResidencial = new JLabel(bn.getString("TelaManterCliente.lblNewLabel_1.text"));
		lblTelResidencial.setBounds(10, 144, 118, 14);
		panel.add(lblTelResidencial);
		
		lblTelCelular = new JLabel(bn.getString("TelaManterCliente.lblNewLabel_2.text"));
		lblTelCelular.setBounds(10, 169, 118, 14);
		panel.add(lblTelCelular);
		
		lblSexo = new JLabel(bn.getString("TelaManterCliente.lblNewLabel_3.text"));
		lblSexo.setBounds(10, 194, 118, 14);
		panel.add(lblSexo);
		
		lblEmail = new JLabel(bn.getString("TelaManterCliente.lblEmail.text"));
		lblEmail.setBounds(10, 219, 118, 14);
		panel.add(lblEmail);
		
		lblRegistroCnh = new JLabel(bn.getString("TelaManterCliente.lblRegistroCnh.text"));
		lblRegistroCnh.setBounds(289, 69, 79, 14);
		panel.add(lblRegistroCnh);
		
		lblEstadoCnh = new JLabel(bn.getString("TelaManterCliente.lblEstado.text"));
		lblEstadoCnh.setBounds(289, 94, 79, 14);
		panel.add(lblEstadoCnh);
		
		lblValidade = new JLabel(bn.getString("TelaManterCliente.lblValidade.text"));
		lblValidade.setBounds(289, 119, 94, 14);
		panel.add(lblValidade);
		
		lblHabilitacao = new JLabel(bn.getString("TelaManterCliente.lblHabilitao.text"));
		lblHabilitacao.setBounds(289, 144, 100, 14);
		panel.add(lblHabilitacao);
		
		txtNome = new JTextField();
		//txtNome.setText(bn.getString("TelaManterCliente.textField_1.text")); 
		txtNome.setBounds(102, 66, 140, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		txtRG = new JTextField();
		//txtRG.setText(bn.getString("TelaManterCliente.textField_2.text")); 
		txtRG.setBounds(102, 91, 140, 20);
		panel.add(txtRG);
		txtRG.setColumns(10);
		
		txtDataDeNascimento = new JTextField();
		//txtDataDeNascimento.setText(bn.getString("TelaManterCliente.txtDataDeNascimento.text")); 
		txtDataDeNascimento.setColumns(10);
		txtDataDeNascimento.setBounds(102, 116, 140, 20);
		panel.add(txtDataDeNascimento);
		
		txtTelefoneResidencial = new JTextField();
		//txtTelefoneResidencial.setText(bn.getString("TelaManterCliente.txtTelefoneResidencial.text")); 
		txtTelefoneResidencial.setColumns(10);
		txtTelefoneResidencial.setBounds(102, 141, 140, 20);
		panel.add(txtTelefoneResidencial);
		
		txtTelefoneCelular = new JTextField();
		//txtTelefoneCelular.setText(bn.getString("TelaManterCliente.txtTelefoneCelular.text")); 
		txtTelefoneCelular.setColumns(10);
		txtTelefoneCelular.setBounds(102, 166, 140, 20);
		panel.add(txtTelefoneCelular);
		
		txtEmail = new JTextField();
		//txtEmail.setText(bn.getString("TelaManterCliente.txtEmail.text")); 
		txtEmail.setColumns(10);
		txtEmail.setBounds(102, 216, 140, 20);
		panel.add(txtEmail);
		
		txtRegistroCnh = new JTextField();
		//txtRegistroCnh.setText(bn.getString("TelaManterCliente.txtRegistroCnh.text")); 
		txtRegistroCnh.setColumns(10);
		txtRegistroCnh.setBounds(377, 66, 140, 20);
		panel.add(txtRegistroCnh);
		
		txtEstadoCnh = new JTextField();
		//txtEstadoCnh.setText(bn.getString("TelaManterCliente.txtEstado.text")); 
		txtEstadoCnh.setColumns(10);
		txtEstadoCnh.setBounds(377, 91, 140, 20);
		panel.add(txtEstadoCnh);
		
		txtValidade = new JTextField();
		//txtValidade.setText(bn.getString("TelaManterCliente.txtValidade.text")); 
		txtValidade.setColumns(10);
		txtValidade.setBounds(377, 116, 140, 20);
		panel.add(txtValidade);
		
		txtHabilitao = new JTextField();
		//txtHabilitao.setText(bn.getString("TelaManterCliente.txtHabilitao.text")); 
		txtHabilitao.setColumns(10);
		txtHabilitao.setBounds(377, 141, 140, 20);
		panel.add(txtHabilitao);
		
		cbxSexo = new JComboBox<String>();
		cbxSexo.setBounds(102, 191, 140, 20);
		cbxSexo.addItem("M");
		cbxSexo.addItem("F"); 
		panel.add(cbxSexo);
		
		separator = new JSeparator();
		separator.setBounds(35, 269, 513, 2);
		panel.add(separator);
		
		lblCep = new JLabel(bn.getString("TelaManterCliente.lblCep.text"));
		lblCep.setBounds(10, 318, 46, 14);
		panel.add(lblCep);
		
		lblLogradouro = new JLabel(bn.getString("TelaManterCliente.lblLogradouro.text"));
		lblLogradouro.setBounds(10, 346, 89, 14);
		panel.add(lblLogradouro);
		
		lblComplemento = new JLabel(bn.getString("TelaManterCliente.lblComplemento.text"));
		lblComplemento.setBounds(10, 374, 89, 14);
		panel.add(lblComplemento);
		
		lblCidade = new JLabel(bn.getString("TelaManterCliente.lblCidade.text"));
		lblCidade.setBounds(400, 300, 69, 14);
		panel.add(lblCidade);
		
	
		lblNumero = new JLabel(bn.getString("TelaManterCliente.lblNewLabel_4.text"));
		lblNumero.setBounds(474, 346, 28, 14);
		panel.add(lblNumero);
		
		
		txtCEP = new JTextField();
		txtCEP.setText(bn.getString("TelaManterCliente.textField_3.text")); 
		txtCEP.setBounds(52, 315, 140, 20);
		panel.add(txtCEP);
		txtCEP.setColumns(10);
		
		lbEstado = new JLabel(bn.getString("TelaManterCliente.lblN.text"));
		lbEstado.setBounds(202, 318, 46, 14);
		panel.add(lbEstado);
		
		cbxEstado = new JComboBox<String>();
		cbxEstado.setToolTipText(bn.getString("TelaManterCliente.comboBox_1.toolTipText")); 
		cbxEstado.setBounds(258, 315, 59, 20);
		cbxEstado.addItem("SP");
		cbxEstado.addItem("RJ"); 
		panel.add(cbxEstado);
		
		

	
		
		
		txtCidade = new JTextField();
		//txtLogradouro.setText(bn.getString("TelaManterCliente.textField_4.text")); 
		txtCidade.setBounds(393, 315, 155, 20);
		panel.add(txtCidade);
		txtCidade.setColumns(10);

		txtLogradouro = new JTextField();
	
		txtLogradouro.setBounds(87, 343, 362, 20);
		panel.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		txtNumero = new JTextField();
	 
		txtNumero.setBounds(500, 343, 48, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		lblBairro = new JLabel(bn.getString("TelaManterCliente.lblBairro.text"));
		lblBairro.setBounds(393, 374, 46, 14);
		panel.add(lblBairro);
		
		txtBairro = new JTextField();
		
		txtBairro.setBounds(449, 371, 99, 20);
		panel.add(txtBairro);
		txtBairro.setColumns(10);
		
		txtComplemento = new JTextField();
		
		txtComplemento.setBounds(87, 371, 281, 20);
		panel.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		btnExcluir = new JButton(bn.getString("TelaManterCliente.btnExcluir.text"));
		btnExcluir.setBounds(459, 429, 89, 23);
		panel.add(btnExcluir);
		
		btnLimpar = new JButton(bn.getString("TelaManterCliente.btnLimpar.text"));
		btnLimpar.setBounds(350, 429, 89, 23);
		panel.add(btnLimpar);
		
		btnAlterar = new JButton(bn.getString("TelaManterCliente.btnAlterar.text"));
		btnAlterar.setBounds(237, 429, 89, 23);
		panel.add(btnAlterar);
		
		btnCadastrar = new JButton(bn.getString("TelaManterCliente.btnCadastrar.text"));
		btnCadastrar.setBounds(102, 429, 109, 23);
		panel.add(btnCadastrar);
		
		btnCadastrar.addActionListener(this);
		btnAlterar.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnConsultar.addActionListener(this);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(388, 22, 86, 20);
		panel.add(txtCpf);

		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		
		
		if (e.getSource() == btnConsultar) {
			
			if(txtCpf.getText().equals("")){				
				JOptionPane.showMessageDialog(null, "Digite um cpf");
			}else{
				negocios.Cliente cliente = new negocios.Cliente();
				try {
					cliente = cliente.consultar(txtCpf.getText());
				
			txtBairro.setText(cliente.getBairro()); 
			txtCEP.setText(cliente.getCep());
			txtCidade.setText(cliente.getCidade());
			txtRegistroCnh.setText(cliente.getCnh());
			txtComplemento.setText(cliente.getComplemento());
			txtDataDeNascimento.setText(cliente.getDataNascimento());
			txtEmail.setText(cliente.getEmail());
			txtLogradouro.setText(cliente.getLogradouro());
			txtNome.setText(cliente.getNome());
			txtNumero.setText(cliente.getNum());
			txtRegistroCnh.setText(cliente.getCnh());
			txtHabilitao.setText(cliente.getPrimeiraCNH());
			txtRG.setText(cliente.getRg());
			cbxSexo.setSelectedItem(cliente.getSexo());			
			txtTelefoneCelular.setText(cliente.getCelular());
			txtTelefoneResidencial.setText(cliente.getTelefone());
			cbxEstado.setSelectedItem(cliente.getUf());		
			txtEstadoCnh.setText(cliente.getUfCNH());
			txtValidade.setText(cliente.getValidadeCNH());
			txtCpf.setEnabled(false);
			btnCadastrar.setEnabled(false);
			} catch (SQLException e1) {					
					e1.printStackTrace();
			}
			
			}
		}  else if (e.getSource() == btnLimpar) {
			limpar();
		} else if (e.getSource() == btnExcluir) {
				txtCpf.setEnabled(true);				
				if (txtCpf.getText().equals("")){					
					 JOptionPane.showMessageDialog(null, "ERRO");
				}else{
					negocios.Cliente cliente = new negocios.Cliente();					
					try {
						cliente.excluir(txtCpf.getText());
					} catch (SQLException e1) {							
						e1.printStackTrace();						
					}
					//JOptionPane.showMessageDialog(null,"Exclusão realizada!");						
					limpar();
				}	
				
				} else if (e.getSource() == btnAlterar) {
					
					if(txtCpf.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Realize consulta");
						
					
					} 
					else if(txtBairro.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					
					}
					else if(txtCEP.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtCidade.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtRegistroCnh.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					
					else if(txtCpf.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtDataDeNascimento.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtEmail.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtLogradouro.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtNome.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtNumero.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtHabilitao.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtRG.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					
					
					
					
					else if(txtTelefoneResidencial.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					else if(txtEstadoCnh.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					}
					
					
					else if(txtValidade.getText().trim().isEmpty()){				
						JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
						
					} else{
					negocios.Cliente cliente = new negocios.Cliente();
					try {
						cliente.alterar(txtBairro.getText(),txtCEP.getText(),txtCidade.getText(),
								txtRegistroCnh.getText(),txtComplemento.getText(),txtCpf.getText(), txtDataDeNascimento.getText(),
								txtEmail.getText(),txtLogradouro.getText(),txtNome.getText(),txtNumero.getText(),
								txtHabilitao.getText(),txtRG.getText(),(String)cbxSexo.getSelectedItem(),txtTelefoneCelular.getText(),
								txtTelefoneResidencial.getText(),(String)cbxEstado.getSelectedItem(),txtEstadoCnh.getText(),
								txtValidade.getText());
						
						
						btnExcluir.setEnabled(true);
						btnAlterar.setEnabled(true);
						btnConsultar.setEnabled(true);
				
						
					} catch (SQLException e1) {
					
						e1.printStackTrace();
					}
					//JOptionPane.showMessageDialog(null,"Alteração realizada!");
					limpar();
				
					}
		
		
					}else	if (e.getSource() == btnCadastrar) {
			
			if(txtBairro.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			
			}
			else if(txtCEP.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtCidade.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtRegistroCnh.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			
			else if(txtCpf.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtDataDeNascimento.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtEmail.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtLogradouro.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtNome.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtNumero.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtHabilitao.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtRG.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			
			
			
			
			else if(txtTelefoneResidencial.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			else if(txtEstadoCnh.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			
			else if(txtValidade.getText().trim().isEmpty()){				
				JOptionPane.showMessageDialog(null,"Preencha os campos vazios");
				
			}
			
			
		
			
			else{
		negocios.Cliente cliente = new negocios.Cliente();
		
		
			try {
				cliente.incluir(txtBairro.getText(),txtCEP.getText(),txtCidade.getText(),
				txtRegistroCnh.getText(),txtComplemento.getText(),txtCpf.getText(),txtDataDeNascimento.getText(),
				txtEmail.getText(),txtLogradouro.getText(),txtNome.getText(),txtNumero.getText(),
				txtHabilitao.getText(),txtRG.getText(),(String)cbxSexo.getSelectedItem(),txtTelefoneCelular.getText(),
				txtTelefoneResidencial.getText(),(String)cbxEstado.getSelectedItem(),txtEstadoCnh.getText(),
				txtValidade.getText());						
				
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
		
			
	
	public static void limpar(){
		
		txtBairro.setText(""); 
		txtCEP.setText("");
		txtCidade.setText("");
		txtRegistroCnh.setText("");
		txtComplemento.setText("");
		txtCpf.setText("");
		txtDataDeNascimento.setText("");
		txtEmail.setText("");
		txtLogradouro.setText("");
		txtNome.setText("");
		txtNumero.setText("");
		txtHabilitao.setText("");
		txtRG.setText("");
		cbxSexo.setSelectedIndex(0);
		cbxEstado.setSelectedIndex(0);
		txtTelefoneCelular.setText("");
		txtTelefoneResidencial.setText("");
		txtEstadoCnh.setText("");
		txtValidade.setText("");
		txtCpf.setEnabled(true);

		

	
	}
	
	
	
}