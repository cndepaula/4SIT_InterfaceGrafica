//package Interface_Grafica;

import javax.swing.*; //pacote com ferramentas gráficas
import java.awt.*; //pacote com ferrametnas gráficas
import java.awt.event.*; // pacote para tratar eventos(cliques na tela)

public class Exercicio01_tinyIG extends JPanel{
	/*
	 
	 by: Cauan de Paula - 4SIT.
	
	 */
	//herança sobre a classe jpanel para poder programar as interfaces
		// criando os objetos gráficos;
		JLabel lb1, lb2, lb3, lb4, lb5, lb6; //label é uma ferramenta que permite acrescentar texto ou imagem à janela
		JButton bt1, bt2, bt3; //botões para janela
		ImageIcon img1, img2, img3;//imagem
		
	public Exercicio01_tinyIG (){
		InicializarComponentes();//configurações de cada objeto gráfico
		DefinirEventos();// programação de cada objeto (clique)
		
	}

	public void InicializarComponentes(){//método para configurar objetos gráficos
		 setLayout(null);
		 lb1 = new JLabel("EARTH");
		 Color azul = new Color(30,155,255);
		 lb1.setForeground(azul);//troca a cor do texto
		 lb2 = new JLabel("SUN");
		 lb2.setForeground(Color.orange);//troca a cor do texto
		 lb3 = new JLabel("SOLAR SYSTEM");
		 lb3.setForeground(Color.LIGHT_GRAY);//troca a cor do texto
		 img1 = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\spotify.png");
		 img2 = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\twitter.png");
		 img3 = new ImageIcon("C:\\Users\\C.Vinicius\\Desktop\\IG - Imagens\\youtube.png");
		 lb4 = new JLabel(img1);
		 lb5 = new JLabel(img2);
		 lb6 = new JLabel(img3);
		 bt1 = new JButton("go to earth");
		 bt2 = new JButton("get tan");
		 bt3 = new JButton("explore space");
		 
		//setBounds posiciona em (posição x, posição y, comprimento, altura);
		 lb1.setBounds(60, 115, 100, 30);
		 lb2.setBounds(228, 115, 100 ,30);
		 lb3.setBounds(345, 115, 100, 30);
		 lb4.setBounds(30, 35, 100, 100);
		 lb5.setBounds(190, 35, 100, 100);
		 lb6.setBounds(340, 35, 100, 100);
		
		 bt1.setBounds(25, 155, 110, 25);
		 bt2.setBounds(202, 155, 75, 25);
		 bt3.setBounds(330, 155, 120, 25);
		 //trocando cores
		 bt1.setBackground(azul);
		 bt2.setBackground(Color.orange);
		 bt3.setBackground(Color.LIGHT_GRAY);
		 
		 add(lb1);
		 add(lb2);
		 add(lb3);
		 add(lb4);
		 add(lb5);
		 add(lb6);
		 add(bt1);
		 add(bt2);
		 add(bt3);
	}
	public void DefinirEventos(){//método para programar objetos gráficos
		bt1.addActionListener(new ActionListener(){//nas linhas 35 e 36 está sendo habilitado a opção do botão receber um clique e dentro das {} está a programação que deve acontecer quando o botão for clicado
			public void actionPerformed(ActionEvent arg0){	
				JOptionPane.showMessageDialog(null, "você agora está na terra.");	
				}	
		});
		
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){	
				JOptionPane.showMessageDialog(null, "você queimou.");
				System.exit(0);	
				}	
		});
		
		bt3.addActionListener(new ActionListener(){//nas linhas 35 e 36 está sendo habilitado a opção do botão receber um clique e dentro das {} está a programação que deve acontecer quando o botão for clicado
			public void actionPerformed(ActionEvent arg0){	
				JOptionPane.showMessageDialog(null, "crie e explore seu próprio universo.");	
				}	
		});
		
	}

	public static void main(String args[]){
		 JFrame frame = new JFrame("window with a Universe."); //declara a classe para criar uma janela
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//método para fechar a janela
		 frame.getContentPane().add(new exer01_IntGra()).setBackground(Color.DARK_GRAY); //adiciona o construtor na janela
		 frame.setBounds(450, 200, 500, 300);// define tamanho e posição da janela
		 frame.setVisible(true);//define se a janela irá ser visivel ou não
	}
	}

