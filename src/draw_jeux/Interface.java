package draw_jeux;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JButton;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Interface {


	private JFrame frame;
	private JTextField textField;
	public static String msgClientr;
	public static String msgServeurr;
	
	//methode pour l'interface graphique
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		msgClientr=Serveurchat.getMsgClient();
		msgServeurr=Serveurchat.getMsgServeur();
		
	}
	public void recuperationmsg () {
		
	
	}

	public Interface() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[434px,grow]", "[200][][]"));
		
		JLabel lblNewLabel = new JLabel("message : "+msgClientr);
		frame.getContentPane().add(lblNewLabel, "cell 0 0");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "cell 0 1,growx");
		textField.setColumns(10);
		
		JButton btnEnvoyer = new JButton("Envoyer");
		frame.getContentPane().add(btnEnvoyer, "cell 0 2,growx,aligny top");
	}
	}