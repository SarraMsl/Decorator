package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dec.Caramel;
import dec.Chantilly;
import dec.Chocolat;
import dec.Lait;
import dec.Sucre;
import decorateur_coffee.Colombia;
import decorateur_coffee.Deca;
import decorateur_coffee.Espresso;
import decorateur_coffee.Sumatra;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import dec.Caramel;
import dec.Chantilly;
import dec.Chocolat;
import dec.Lait;
import dec.Sucre;
import decorateur_coffee.Boisson;
import decorateur_coffee.Colombia;
import decorateur_coffee.Deca;
import decorateur_coffee.Espresso;
import decorateur_coffee.Sumatra;
import java.awt.FlowLayout;

public class Coffeeshop extends JFrame {

	private JPanel contentPane;
	private Boisson boisson;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Coffeeshop frame = new Coffeeshop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Coffeeshop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 673);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\houda\\Desktop\\s2 gl\\coffeeshop1.jpg"));
		lblNewLabel.setBounds(10, 11, 301, 229);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Boissons:");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBounds(10, 237, 156, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Suppl\u00E9ments:");
		lblNewLabel_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1.setBounds(10, 338, 219, 41);
		contentPane.add(lblNewLabel_1_1);
		
		JButton jButtonEspresso = new JButton("Espresso");
		jButtonEspresso.setBounds(38, 293, 89, 23);
		contentPane.add(jButtonEspresso);
		
		JButton jButtonDeca = new JButton("Deca");
		jButtonDeca.setBounds(170, 293, 89, 23);
		contentPane.add(jButtonDeca);
		
		JButton jButtonSumatra = new JButton("Sumatra");
		jButtonSumatra.setBounds(299, 293, 89, 23);
		contentPane.add(jButtonSumatra);
		
		JButton jButtonColombia = new JButton("Colombia");
		jButtonColombia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButtonColombia.setBounds(431, 293, 89, 23);
		contentPane.add(jButtonColombia);
		
		JButton jButtonIngLait = new JButton("Lait");
		jButtonIngLait.setBounds(38, 390, 89, 23);
		contentPane.add(jButtonIngLait);
		
		JButton jButtonIngChocola = new JButton("Chocola");
		jButtonIngChocola.setBounds(170, 390, 89, 23);
		contentPane.add(jButtonIngChocola);
		
		JButton jButtonIngChantilly = new JButton("Chantilly");
		jButtonIngChantilly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jButtonIngChantilly.setBounds(299, 390, 89, 23);
		contentPane.add(jButtonIngChantilly);
		
		JButton jButtonIngCaramel = new JButton("Caramel");
		jButtonIngCaramel.setBounds(431, 390, 89, 23);
		contentPane.add(jButtonIngCaramel);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Commande:");
		lblNewLabel_1_1_1.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1_1_1.setBounds(66, 501, 178, 41);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton jButtonIngSucre = new JButton("Sucre");
		jButtonIngSucre.setBounds(241, 456, 89, 23);
		contentPane.add(jButtonIngSucre);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 69, 19));
		panel.setBounds(0, 539, 575, 54);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel jLableldescription = new JLabel("Description:");
		jLableldescription.setForeground(new Color(255, 255, 255));
		jLableldescription.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		panel.add(jLableldescription);
		
		JLabel jLablelprix = new JLabel("Prix:");
		jLablelprix.setForeground(new Color(255, 255, 255));
		jLablelprix.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		panel.add(jLablelprix);
		
		JLabel lblDa = new JLabel("DA");
		lblDa.setForeground(Color.WHITE);
		lblDa.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		panel.add(lblDa);
jButtonEspresso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson=new Espresso();
				jLableldescription.setText(boisson.getDescription());
				jLablelprix.setText(""+boisson.cout());
			}
		});
jButtonDeca.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boisson=new Deca();
				jLableldescription.setText(boisson.getDescription());
				jLablelprix.setText(""+boisson.cout());
			}
		});

jButtonSumatra.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boisson=new Sumatra();
		jLableldescription.setText(boisson.getDescription());
		jLablelprix.setText(""+boisson.cout());
	}
});

jButtonColombia.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boisson=new Colombia();
		jLableldescription.setText(boisson.getDescription());
		jLablelprix.setText(""+boisson.cout());
	}
});
jButtonIngChocola.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boisson=new Chocolat(boisson);
		jLableldescription.setText(boisson.getDescription());
		jLablelprix.setText(""+boisson.cout());
	}
});

jButtonIngLait.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boisson=new Lait(boisson);
		jLableldescription.setText(boisson.getDescription());
		jLablelprix.setText(""+boisson.cout());
	}
});
jButtonIngSucre.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boisson=new Sucre(boisson);
		jLableldescription.setText(boisson.getDescription());
		jLablelprix.setText(""+boisson.cout());
	}
});
jButtonIngChantilly.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boisson=new Chantilly(boisson);
		jLableldescription.setText(boisson.getDescription());
		jLablelprix.setText(""+boisson.cout());
	}
});
jButtonIngCaramel.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boisson=new Caramel(boisson);
		jLableldescription.setText(boisson.getDescription());
		jLablelprix.setText(""+boisson.cout());
	}
});
	}
}
