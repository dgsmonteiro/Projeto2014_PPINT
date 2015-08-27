package telas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TelaIdiomas extends JFrame implements ActionListener {
   //Criando todos os elementos da Tela de Idiomas
	private Container cont;
	private JPanel painel;
	private JButton btnPortugues;
	private JButton btnEspanol;
	private JButton btnEnglish;
	private Icon iconPort;
	private Icon iconEng;
	private Icon iconEsp;
	private JLabel lblPortugues;
	private JLabel lblEspanol;
	private JLabel lblEnglish;
	private ResourceBundle bn;

   //O método Main só existe nessa classe
	public static void main(String[] args) {
      
		TelaIdiomas frame = new TelaIdiomas();

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Quando fecha essa tela, encerra o programa


	}

   //Método Construtor
	public TelaIdiomas() {
		
		setBounds(100, 100, 450, 300);//definindo tamanho e localização da Tela
		cont = getContentPane();
		painel = new JPanel();//instanciando a classe Jpanel
		painel.setLayout(null);//painel sem Layout
  		cont.add(painel);//adicionando o painel no centro do Container


		iconPort = new ImageIcon(getClass().getResource("Português.JPG"));//instanciando ImageIcon com a imagem do botão
		btnPortugues = new JButton(iconPort); //imageIcon como parâmetro do botão
		btnPortugues.setBounds(297, 100, 66, 49);//definindo tamanho e localização do botão
		painel.add(btnPortugues); //adicionando botão no painel

      //criando e adicionando os demais botões da mesma forma comentada acima
		iconEsp = new ImageIcon(getClass().getResource("Espanõl.JPG"));
		btnEspanol = new JButton(iconEsp);
		btnEspanol.setBounds(179, 100, 66, 49);
		painel.add(btnEspanol);

		iconEng = new ImageIcon(getClass().getResource("English.JPG"));
		btnEnglish = new JButton(iconEng);
		btnEnglish.setBounds(66, 100, 66, 49);
		painel.add(btnEnglish);
      
      //criando e adicionando as Labels
		lblEnglish = new JLabel("English");
		lblEnglish.setBounds(76, 160, 46, 14);
		painel.add(lblEnglish);

		lblEspanol = new JLabel("Español");
		lblEspanol.setBounds(189, 160, 46, 14);
		painel.add(lblEspanol);

		lblPortugues = new JLabel("Português");
		lblPortugues.setBounds(302, 160, 71, 14);
		painel.add(lblPortugues);

      //adicionando ação aos botões
		btnPortugues.addActionListener(this);
		btnEspanol.addActionListener(this);
		btnEnglish.addActionListener(this);
		
	      setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPortugues) {
         //chamando a tela principal e enviando o idioma como parâmetro
			bn = ResourceBundle.getBundle("telas.telas_pt_BR", new Locale("pt", "BR"));
			TelaLogin tela = new TelaLogin(bn);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			dispose();
		} else if (e.getSource() == btnEspanol) {
         //chamando a tela principal e enviando o idioma como parâmetro
			bn = ResourceBundle.getBundle("telas.telas_es_ES", new Locale("es", "ES"));
			TelaLogin tela = new TelaLogin(bn);
			dispose();
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		} else if (e.getSource() == btnEnglish){
         //chamando a tela principal e enviando o idioma como parâmetro
			bn = ResourceBundle.getBundle("telas.telas_en_US", Locale.US);
			TelaLogin tela = new TelaLogin(bn);
         
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}

	}
}
