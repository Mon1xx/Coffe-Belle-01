package com.cibertec.entidad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFMenuData extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFMenuData frame = new JFMenuData();
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
	public JFMenuData() {
		setTitle("Coffe Belle");
		setIconImage(Toolkit.getDefaultToolkit().getImage(JFMenuData.class.getResource("/img/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 519);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 648, 22);
		contentPane.add(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setFont(new Font("Century Gothic", Font.BOLD, 14));
		menuBar.add(mnMantenimiento);
		
		JMenuItem mntmUsuarios = new JMenuItem("Usuarios");
		mntmUsuarios.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnMantenimiento.add(mntmUsuarios);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnMantenimiento.add(mntmClientes);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mntmProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Productos dialog = new Productos();
			        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			        dialog.setVisible(true);
			}
		});
		mntmProductos.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		mnMantenimiento.add(mntmProductos);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setFont(new Font("Century Gothic", Font.BOLD, 14));
		menuBar.add(mnVentas);
		
		JMenu mnAlmacen = new JMenu("Almacen");
		mnAlmacen.setFont(new Font("Century Gothic", Font.BOLD, 14));
		menuBar.add(mnAlmacen);
		
		JMenu mnReportes = new JMenu("Reportes");
		mnReportes.setFont(new Font("Century Gothic", Font.BOLD, 14));
		menuBar.add(mnReportes);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JFMenuData.class.getResource("/img/logo.png")));
		lblNewLabel.setBounds(45, 32, 522, 458);
		contentPane.add(lblNewLabel);
	}
}
