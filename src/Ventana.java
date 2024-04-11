import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JTextField txtContra;
	private JTextField txtConfimarContra;
	private JTextField txtNombreUsu;
	private JTextField txtContra2;
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel = new JPanel();
	private JTextField txtCorreRecu;
	private JTextField txtConfirCorreo;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 504, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 488, 80);
		frame.setJMenuBar(menuBar);
		
		JMenu JmnuCuenta = new JMenu("Cuenta");
		menuBar.add(JmnuCuenta);
		
		JMenuItem JmnuLogin = new JMenuItem("Login");
		JmnuLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				login(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuCuenta.add(JmnuLogin);
		
		JMenuItem JmnuRegistro = new JMenuItem("Registro");
		JmnuRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				registro(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuCuenta.add(JmnuRegistro);
		
		JMenuItem JmnuRecuperar = new JMenuItem("Recuperar cuenta");
		JmnuRecuperar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				recuperar(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuCuenta.add(JmnuRecuperar);
		
		JMenu JmnuUsuarios = new JMenu("Usuarios");
		menuBar.add(JmnuUsuarios);
		
		JMenuItem JmnuAlta = new JMenuItem("Alta");
		JmnuAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				alta(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuUsuarios.add(JmnuAlta);
		
		JMenuItem JmnuBaja = new JMenuItem("Baja");
		JmnuBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				baja(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuUsuarios.add(JmnuBaja);
		
		JMenuItem JmnuConsultar = new JMenuItem("Consultar");
		JmnuConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				consulta(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuUsuarios.add(JmnuConsultar);
		
		JMenu JmnuAyuda = new JMenu("Ayuda");
		menuBar.add(JmnuAyuda);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("¿Cómo crear un usuario?");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				ayuda1(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuAyuda.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("¿Cómo acceder al sistema?");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				ayuda2(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuAyuda.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				ayuda3(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		JmnuAyuda.add(mntmNewMenuItem_2);
		
		this.login(frame);
	}
	
	private void login(JFrame frame) {
		frame.repaint();
		frame.revalidate();
		
		panel_1.setBackground(new Color(105, 105, 105));
		panel_1.setBounds(0, 0, 488, 729);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Iniciar sesión");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(163, 120, 180, 38);
		panel_1.add(lblTitulo);
		
		JLabel lblNombreUsu = new JLabel("Ingrese el nombre de usuario");
		lblNombreUsu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombreUsu.setOpaque(true);
		lblNombreUsu.setBackground(new Color(0, 0, 0));
		lblNombreUsu.setForeground(new Color(255, 255, 255));
		lblNombreUsu.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreUsu.setBounds(104, 192, 282, 28);
		panel_1.add(lblNombreUsu);
		
		txtNombreUsu = new JTextField();
		txtNombreUsu.setBounds(104, 218, 282, 46);
		panel_1.add(txtNombreUsu);
		txtNombreUsu.setColumns(10);
		
		JLabel lblContra2 = new JLabel("Ingrese su contraseña");
		lblContra2.setOpaque(true);
		lblContra2.setHorizontalAlignment(SwingConstants.CENTER);
		lblContra2.setForeground(Color.WHITE);
		lblContra2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContra2.setBackground(Color.BLACK);
		lblContra2.setBounds(104, 291, 282, 28);
		panel_1.add(lblContra2);
		
		txtContra2 = new JTextField();
		txtContra2.setColumns(10);
		txtContra2.setBounds(104, 317, 282, 46);
		panel_1.add(txtContra2);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "No se puede acceder", "Error",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogin.setBounds(139, 408, 191, 38);
		panel_1.add(btnLogin);
		
		JButton bntSinCuenta = new JButton("¿No tiene cuenta?");
		bntSinCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				registro(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		bntSinCuenta.setFont(new Font("Tahoma", Font.BOLD, 13));
		bntSinCuenta.setBounds(139, 457, 192, 23);
		panel_1.add(bntSinCuenta);
		
		JButton btnNewButton = new JButton("¿Olvidó su contraseña?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				recuperar(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(139, 491, 193, 23);
		panel_1.add(btnNewButton);
	}
	
	private void registro(JFrame frame) {
		frame.repaint();
		frame.revalidate();
		
		panel.setBackground(new Color(75, 0, 130));
		panel.setBounds(0, 0, 488, 700);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Registrarse");
		lblTitulo.setForeground(new Color(222, 184, 135));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(153, 79, 183, 43);
		panel.add(lblTitulo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(58, 185, 157, 43);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Ingresa tu nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNombre.setForeground(new Color(240, 248, 255));
		lblNombre.setBounds(58, 162, 138, 22);
		panel.add(lblNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(257, 185, 157, 43);
		panel.add(txtApellido);
		
		JLabel lblApellido = new JLabel("Ingresa tu apellido");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setForeground(new Color(240, 248, 255));
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblApellido.setBounds(276, 162, 138, 22);
		panel.add(lblApellido);
		
		JLabel lblCorreo = new JLabel("Correo electrónico");
		lblCorreo.setForeground(new Color(240, 248, 255));
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCorreo.setBounds(104, 257, 132, 14);
		panel.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(104, 281, 267, 43);
		panel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblContra = new JLabel("Contraseña");
		lblContra.setForeground(new Color(240, 248, 255));
		lblContra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContra.setBounds(104, 340, 132, 14);
		panel.add(lblContra);
		
		txtContra = new JTextField();
		txtContra.setColumns(10);
		txtContra.setBounds(104, 361, 267, 43);
		panel.add(txtContra);
		
		JLabel lblConfirmarContra = new JLabel("Confirmas contraseña");
		lblConfirmarContra.setForeground(new Color(240, 248, 255));
		lblConfirmarContra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblConfirmarContra.setBounds(104, 414, 148, 14);
		panel.add(lblConfirmarContra);
		
		txtConfimarContra = new JTextField();
		txtConfimarContra.setColumns(10);
		txtConfimarContra.setBounds(104, 439, 267, 43);
		panel.add(txtConfimarContra);
		
		JCheckBox checkTerminos = new JCheckBox("Acepto los términos y condiciones vendo mi alma al diablo");
		checkTerminos.setFont(new Font("Tahoma", Font.BOLD, 13));
		checkTerminos.setForeground(new Color(240, 248, 255));
		checkTerminos.setContentAreaFilled(false);
		checkTerminos.setBounds(51, 537, 406, 23);
		panel.add(checkTerminos);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCorreo.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtApellido.getText().isEmpty() || txtContra.getText().isEmpty() || txtConfimarContra.getText().isEmpty() || checkTerminos.isSelected() == false) {
					JOptionPane.showMessageDialog(null, "Hace falta llenar algún campo", "Error",JOptionPane.ERROR_MESSAGE);
				} if(txtCorreo.getText().isEmpty() == false && txtCorreo.getText().isEmpty() == false && txtApellido.getText().isEmpty() == false && txtContra.getText().isEmpty() == false && (txtContra.getText().equals(txtConfimarContra.getText()) ) && txtConfimarContra.getText().isEmpty()== false && checkTerminos.isSelected()) {
					JOptionPane.showMessageDialog(null, "Se ha registrado con éxito", "Bien",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnRegistrarse.setBackground(new Color(218, 165, 32));
		btnRegistrarse.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegistrarse.setBounds(185, 604, 133, 38);
		panel.add(btnRegistrarse);
		
		JButton btnYaCuenta = new JButton("¿Ya tiene cuenta?");
		btnYaCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				login(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		
		btnYaCuenta.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnYaCuenta.setBounds(171, 653, 157, 23);
		panel.add(btnYaCuenta);
	}
	
	private void recuperar(JFrame frame) {
		frame.repaint();
		frame.revalidate();
		
		panel_2.setBackground(new Color(255, 128, 128));
		panel_2.setBounds(0, 0, 488, 701);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperar contraseña");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setBounds(106, 96, 273, 35);
		panel_2.add(lblNewLabel);
		
		txtCorreRecu = new JTextField();
		txtCorreRecu.setBounds(90, 227, 308, 40);
		panel_2.add(txtCorreRecu);
		txtCorreRecu.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese su dirección de correo");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(90, 199, 210, 22);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirme su dirección de correo");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(90, 305, 216, 22);
		panel_2.add(lblNewLabel_1_1);
		
		txtConfirCorreo = new JTextField();
		txtConfirCorreo.setColumns(10);
		txtConfirCorreo.setBounds(90, 333, 308, 40);
		panel_2.add(txtConfirCorreo);
		
		JButton btnRecuperar = new JButton("Recuperar");
		btnRecuperar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRecuperar.setBounds(163, 424, 162, 46);
		panel_2.add(btnRecuperar);
		
		JButton btnRegreso = new JButton("Regresar");
		btnRegreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				login(frame);
				frame.getContentPane().repaint();
				frame.getContentPane().revalidate();
			}
		});
		btnRegreso.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnRegreso.setBounds(178, 487, 128, 23);
		panel_2.add(btnRegreso);
	}
	
	private void alta(JFrame frame) {
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 255));
		panel_3.setBounds(0, 0, 488, 700);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Dar de alta a usuario");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_2.setBounds(116, 101, 254, 36);
		panel_3.add(lblNewLabel_2);
	}
	
	private void baja(JFrame frame) {
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 128, 255));
		panel_4.setBounds(0, 0, 488, 700);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Dar de baja a usuario");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_3.setBounds(116, 101, 254, 36);
		panel_4.add(lblNewLabel_3);
	}
	
	private void consulta(JFrame frame) {
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(128, 128, 255));
		panel_5.setBounds(0, 0, 488, 700);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Consultar un usuario");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_4.setBounds(116, 101, 254, 36);
		panel_5.add(lblNewLabel_4);
	}
	
	private void ayuda1(JFrame frame) {
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 128, 255));
		panel_6.setBounds(0, 0, 488, 700);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("¿Cómo crear usuario?");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_5.setBounds(116, 101, 254, 36);
		panel_6.add(lblNewLabel_5);
	}
	
	private void ayuda2(JFrame frame) {
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(128, 128, 255));
		panel_7.setBounds(0, 0, 488, 700);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("¿Cómo acceder al sistema?");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_6.setBounds(80, 102, 326, 36);
		panel_7.add(lblNewLabel_6);
	}
	
	private void ayuda3(JFrame frame) {
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(128, 128, 255));
		panel_8.setBounds(0, 0, 488, 700);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_7.setBounds(24, 94, 435, 36);
		panel_8.add(lblNewLabel_7);
	}
}
