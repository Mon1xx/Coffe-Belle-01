package com.cibertec.entidad;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Productos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtPrecio;
	private JTextField txtEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Productos dialog = new Productos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Productos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Productos.class.getResource("/img/logo.png")));
		setTitle("Productos");
		setBounds(100, 100, 624, 617);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 235, 215));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnIngresar = new JButton("Ingresar");
			btnIngresar.setFont(new Font("Century Gothic", Font.BOLD, 12));
			btnIngresar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnIngresar.setBounds(456, 36, 89, 23);
			contentPanel.add(btnIngresar);
		}
		{
			JButton btnModificar = new JButton("Modificar");
			btnModificar.setFont(new Font("Century Gothic", Font.BOLD, 12));
			btnModificar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnModificar.setBounds(456, 98, 89, 23);
			contentPanel.add(btnModificar);
		}
		{
			JButton btnEliminar = new JButton("Eliminar");
			btnEliminar.setForeground(new Color(255, 0, 0));
			btnEliminar.setFont(new Font("Century Gothic", Font.BOLD, 12));
			btnEliminar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnEliminar.setBounds(456, 159, 89, 23);
			contentPanel.add(btnEliminar);
		}
		{
			JButton btnListar = new JButton("Listar");
			btnListar.setFont(new Font("Century Gothic", Font.BOLD, 12));
			btnListar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnListar.setBounds(456, 217, 89, 23);
			contentPanel.add(btnListar);
		}
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setFont(new Font("Century Gothic", Font.BOLD, 12));
			lblNombre.setBounds(32, 101, 69, 14);
			contentPanel.add(lblNombre);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setFont(new Font("Century Gothic", Font.PLAIN, 11));
			txtCodigo.setBounds(111, 60, 140, 20);
			contentPanel.add(txtCodigo);
			txtCodigo.setColumns(10);
		}
		{
			JLabel lblCodigo = new JLabel("C\u00F3digo");
			lblCodigo.setFont(new Font("Century Gothic", Font.BOLD, 12));
			lblCodigo.setBounds(32, 63, 46, 14);
			contentPanel.add(lblCodigo);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Tama\u00F1o");
			lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 12));
			lblNewLabel_2.setBounds(32, 142, 69, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblPrecio = new JLabel("Precio");
			lblPrecio.setFont(new Font("Century Gothic", Font.BOLD, 12));
			lblPrecio.setBounds(32, 184, 46, 14);
			contentPanel.add(lblPrecio);
		}
		{
			JLabel lblEstado = new JLabel("Estado");
			lblEstado.setFont(new Font("Century Gothic", Font.BOLD, 12));
			lblEstado.setBounds(32, 226, 46, 14);
			contentPanel.add(lblEstado);
		}
		{
			JButton btnNewButton_4 = new JButton("Buscar");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_4.setFont(new Font("Century Gothic", Font.BOLD, 11));
			btnNewButton_4.setBounds(280, 57, 89, 23);
			contentPanel.add(btnNewButton_4);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setFont(new Font("Century Gothic", Font.PLAIN, 11));
			txtNombre.setBounds(111, 101, 140, 20);
			contentPanel.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(111, 181, 86, 20);
			contentPanel.add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		
		JComboBox comboBoxTamaño = new JComboBox();
		comboBoxTamaño.setModel(new DefaultComboBoxModel(new String[] {"Peque\u00F1o", "Mediano", "Grande"}));
		comboBoxTamaño.setBounds(111, 138, 86, 22);
		contentPanel.add(comboBoxTamaño);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(111, 223, 86, 20);
		contentPanel.add(txtEstado);
		txtEstado.setColumns(10);
		
		JLabel lblTipoDeProducto = new JLabel("Tipo de Producto");
		lblTipoDeProducto.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblTipoDeProducto.setBounds(32, 24, 100, 14);
		contentPanel.add(lblTipoDeProducto);
		
		JComboBox comboBoxTipo = new JComboBox();
		comboBoxTipo.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		comboBoxTipo.setModel(new DefaultComboBoxModel(new String[] {"Bebidas", "Snacks", "Postres", "Caf\u00E9 en grano", "Promociones"}));
		comboBoxTipo.setBounds(159, 21, 86, 22);
		contentPanel.add(comboBoxTipo);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(32, 335, 544, 217);
		contentPanel.add(txtResultado);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Productos.class.getResource("/img/coffebellepng.png")));
		lblNewLabel.setBounds(227, 91, 206, 240);
		contentPanel.add(lblNewLabel);
	}
}
