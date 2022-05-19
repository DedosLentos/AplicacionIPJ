package aplicacion;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Persona extends JFrame {

	private JPanel contentPane;
	public static JTextField usuarioTxt;
	public static JTextField passTxt;

	public Persona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel usuario = new JLabel("Usuario");
		usuario.setBounds(37, 27, 46, 14);
		contentPane.add(usuario);
		
		usuarioTxt = new JTextField();
		usuarioTxt.setBounds(138, 24, 165, 20);
		contentPane.add(usuarioTxt);
		usuarioTxt.setColumns(10);
		
		JLabel pass = new JLabel("Password");
		pass.setBounds(37, 70, 46, 14);
		contentPane.add(pass);
		
		passTxt = new JTextField();
		passTxt.setColumns(10);
		passTxt.setBounds(138, 67, 165, 20);
		contentPane.add(passTxt);
		
		//ver por que agrego esta linea... crea una instancia de DatosUsuario?
		final DatosUsuario data= new DatosUsuario();
		
		JButton entrar = new JButton("Entrar");
		entrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(data.probarPass()==1) {
					JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
					Panel panel = new Panel();
					panel.setVisible(true);
					dispose();
					}
					else {
					JOptionPane.showMessageDialog(null, "Error, verifique los datos");
					}
				
			}
		});
		entrar.setBounds(75, 186, 89, 23);
		contentPane.add(entrar);
		
		JButton salir = new JButton("Salir");
		salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
				
			}
		});
		salir.setBounds(254, 186, 89, 23);
		contentPane.add(salir);
	}

	public Persona(int idPersonaVar, String nombreVar, String apellidoVar, String dptoResidenciaVar,
			byte cantHijosVar) {
		// TODO Auto-generated constructor stub
	}
}
