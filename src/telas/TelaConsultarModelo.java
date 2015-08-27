package telas;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Panel;

import javax.swing.JButton;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.border.LineBorder;

import negocios.Automovel;
import negocios.Modelo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConsultarModelo extends JFrame implements ActionListener {

	private Container contentPane;

	private JLabel lblCategoria;
	private JLabel lblModelo;
	public Connection conn = null;
	private JComboBox<String> cbxCategoria;
	private JComboBox<String> cbxModelo;
	private JTextField txtDescricao;
	private JTextField txtDisponivel;
	private JTextField txtTarifaKmLivre;
	private JTextField txtTarifaKmControlado;
	private JLabel lblDisponivel;
	private JLabel lblTarifaKmLivre;
	private JLabel lblTarifaKmControlado;

	private JLabel lblValor;
	private JButton btnProsseguir;
	private ResourceBundle bn;

	public TelaConsultarModelo(ResourceBundle bn) throws SQLException {
		this.bn = bn;
		setTitle(bn.getString("TelaConsultarModelo.this.title")); //$NON-NLS-1$ //$NON-NLS-2$
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		((JComponent) contentPane).setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		lblTarifaKmLivre = new JLabel(bn.getString("TelaConsultarModelo.lblTarifaLivre.text"));
		lblTarifaKmLivre.setBounds(10, 170, 100, 100);
		panel.add(lblTarifaKmLivre);

		lblTarifaKmControlado = new JLabel(bn.getString("TelaConsultarModelo.lblTarifaControlado.text"));
		lblTarifaKmControlado.setBounds(150,140, 150, 150);
		panel.add(lblTarifaKmControlado);		
		
		txtTarifaKmLivre = new JTextField();
		txtTarifaKmLivre .setBounds(10, 230, 30, 30);
		panel.add(txtTarifaKmLivre);
			
		txtTarifaKmControlado = new JTextField();
		txtTarifaKmControlado .setBounds(150, 230, 30, 30);
		panel.add(txtTarifaKmControlado );
			
		
		lblModelo = new JLabel(bn.getString("TelaConsultarModelo.lblModelo.text"));
		lblModelo.setBounds(10, 36, 100, 14);
		panel.add(lblModelo);
		

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
		cbxCategoria.setBounds(120, 8, 250, 20);
		panel.add(cbxCategoria);
				
		dao.AcessoBD bd = new dao.AcessoBD();
		dao.ModeloDAO mod = new dao.ModeloDAO();
		conn = bd.obtemConexao();
		conn.setAutoCommit(false);
		String mod1 = (String) cbxCategoria.getSelectedItem();
		cbxModelo = new JComboBox<String>();
		ArrayList<String> m = new ArrayList<String>();
		m = mod.carregarPorCategoria(conn, mod1);
		//cbxModelo = new JComboBox<String>();
		cbxModelo.setBounds(380, 201, 140, 20);
		for(int i=0;i < m.size(); i++ ){
			cbxModelo.addItem(m.get(i));
		}
		cbxModelo.setBounds(120, 33, 250, 20);
		panel.add(cbxModelo);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(10, 116, 404, 85);
		panel.add(txtDescricao);
	

	
		lblDisponivel = new JLabel(bn.getString("TelaConsultarModelo.lblDisponvel.text"));
		lblDisponivel.setBounds(8, 75, 60, 30);
		panel.add(lblDisponivel);
		
		txtDisponivel = new JTextField();
		txtDisponivel.setBounds(78, 77, 50,30);
		panel.add(txtDisponivel);
		
	
		
		btnProsseguir = new JButton(bn.getString("TelaConsultarModelo.btnProsseguir.text"));
		btnProsseguir.setBounds(299, 279, 115, 23);
		panel.add(btnProsseguir);
		btnProsseguir.addActionListener(this);
		btnProsseguir.setEnabled(false);
		cbxCategoria.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent actionEvent){
				
				//System.out.println(cbxCategoria.getSelectedItem());
				String index= (String) cbxCategoria.getSelectedItem();
				carAut(index);
			}	
		});
		
			cbxModelo.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent actionEvent){
				if(cbxModelo.getSelectedItem() != null)
				{
				
				String index= (String) cbxModelo.getSelectedItem();
			
				carMod(index);
				 if (txtDisponivel.getText().equals("0")){
				
						btnProsseguir.setEnabled(false);
					}
				
				}
				
				
				} 
	
			
		});
	}
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == btnProsseguir) 
		{
			Automovel  objA = new Automovel();
			String modelo= (String) cbxModelo.getSelectedItem();
			String categoria= (String) cbxCategoria.getSelectedItem();
			negocios.Automovel obj = new negocios.Automovel();
			double livre = Double.parseDouble(txtTarifaKmLivre.getText());
			double controlado = Double.parseDouble(txtTarifaKmControlado.getText());

			try 
			{
				objA = obj.aleatorio(modelo);
			} 
			catch (SQLException e1) 
			{
				e1.printStackTrace();
			}
				
			TelaGerenciarEmprestimo frame = new TelaGerenciarEmprestimo(bn, categoria,modelo, objA, livre,controlado);
			frame.setVisible(true);			
		} 
	}
	
	public  void carAut(String categoria){
		cbxModelo.removeAllItems();
		cbxModelo.enable();
		negocios.ConsultarModelo objcon = new negocios.ConsultarModelo();
		ArrayList<String> r = new ArrayList<String>();
	
		try 
		{
			r = objcon.consultaCategoria(categoria);	
			
	
			 
			if ( r.size() == 0)
			{						
				cbxModelo.disable();	
				btnProsseguir.setEnabled(false);
		
			}else 
			{						
				for(int i=0;i < r.size(); i++ )
				{
					cbxModelo.addItem(r.get(i));	
					btnProsseguir.setEnabled(true);
				}		
			}
		} 
		catch (Exception e1) {		
			//e1.printStackTrace();
		}	
	}

	public  void carMod(String modelo)
	{				
		negocios.Automovel obj = new negocios.Automovel();	      

		try {
			 Modelo mod = new Modelo();
			 mod = obj.consultarMod(modelo);		
			
			txtDescricao.setText(mod.getDescricao());
			txtTarifaKmControlado.setText(""+ mod.getTarifaKmControlado());
			txtTarifaKmLivre.setText(""+ mod.getTarifaKmLivre());
			txtDisponivel.setText(""+mod.disponibilidade(modelo));

			/*int d= Integer.parseInt(txtDisponivel.getText());
			if(d<=0){

						btnProsseguir.setEnabled(false);
			
					}*/
					
		} catch (SQLException e1) {
			
			//e1.printStackTrace();
		}		
	}

	
}
