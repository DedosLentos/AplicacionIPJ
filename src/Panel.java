package aplicacion;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Panel extends JFrame {

	private JPanel contentPane;
	public static JTextField idPersona;
	public static JTextField nombre;
	public static JTextField apellido;
	public static JTextField dptoResidencia;
	public static JTextField cantHijos;
	public static JTextField fechaNac;
	public static JTextField muestraDatos;

	public static void main(String[] args) {
		
		PanelLog log = new PanelLog();
		log.setVisible(true);
		
		Panel menu = new Panel();
		menu.setVisible(false);

	}
	Persona [] personaArray = new Persona [5];
	
	public Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IdPersona");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		idPersona = new JTextField();
		idPersona.setBounds(106, 8, 163, 20);
		contentPane.add(idPersona);
		idPersona.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(10, 39, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(106, 36, 163, 20);
		contentPane.add(nombre);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(10, 69, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		apellido = new JTextField();
		apellido.setColumns(10);
		apellido.setBounds(106, 66, 163, 20);
		contentPane.add(apellido);
		
		JLabel lblNewLabel_3 = new JLabel("Dpto. Residencia");
		lblNewLabel_3.setBounds(10, 97, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		dptoResidencia = new JTextField();
		dptoResidencia.setColumns(10);
		dptoResidencia.setBounds(106, 94, 163, 20);
		contentPane.add(dptoResidencia);
		
		JLabel lblNewLabel_4 = new JLabel("Cant. Hijos");
		lblNewLabel_4.setBounds(10, 125, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		cantHijos = new JTextField();
		cantHijos.setColumns(10);
		cantHijos.setBounds(106, 122, 163, 20);
		contentPane.add(cantHijos);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha Nac.");
		lblNewLabel_5.setBounds(10, 153, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		fechaNac = new JTextField();
		fechaNac.setColumns(10);
		fechaNac.setBounds(106, 150, 163, 20);
		contentPane.add(fechaNac);
		
		JButton btnNewButton = new JButton("Ingresar Persona");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Persona[] personaArray = new Persona[5];
				
				int idPersonaVar=0;
				String nombreVar=null;
				String apellidoVar=null;
				String dptoResidenciaVar=null;
				byte cantHijosVar=0;
				//LocalDate fechaNacimientoVar=null;
				
				idPersonaVar=Integer.parseInt(idPersona.getText());
				nombreVar=(nombre.getText());
				apellidoVar=(apellido.getText());
				dptoResidenciaVar=(dptoResidencia.getText());
				cantHijosVar=Byte.parseByte(cantHijos.getText());
				//fechaNacimientoVar=LocalDate.parse(fechaNac.getText());
				
				int indice = Integer.parseInt(idPersona.getText());
				//while (indice < 5) {
				
				personaArray[indice]= new Persona (idPersonaVar, nombreVar, apellidoVar, 
						dptoResidenciaVar, cantHijosVar);
				//indice++;
				//}
				
				idPersona.setText("");
				nombre.setText("");
				apellido.setText("");
				dptoResidencia.setText("");
				cantHijos.setText("");
				//fechaNac.setText("");
				
				
				//System.out.println(P1.toString());
				//String datosPersona=P1.toString();
				
							
				//String []P1partes = datosPersona.split(",");
				
				
				//System.out.println(datosPersona);
				
				
				//JTextField muestraDatos;																																																																																																																					
				//muestraDatos.setText(datosPersona);
				
			}
		});
		btnNewButton.setBounds(134, 186, 115, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Mostrar Personas");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int indice = Integer.parseInt(idPersona.getText());
				Persona datosPersona=personaArray[indice];
				System.out.println(datosPersona);
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(45, 460, 128, 23);
		contentPane.add(btnNewButton_1);
		
		muestraDatos = new JTextField();
		muestraDatos.setBounds(10, 230, 397, 219);
		contentPane.add(muestraDatos);
		muestraDatos.setColumns(10);
		
		JButton salir = new JButton("Salir");
		salir.addMouseListener(new MouseAdapter() {
			@Override
			//programacion de boton de salir
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		salir.setBounds(280, 460, 89, 23);
		contentPane.add(salir);
		
		JLabel lblNewLabel_6 = new JLabel("(Ingrese un valor del 0 al 4)");
		lblNewLabel_6.setBounds(273, 11, 134, 14);
		contentPane.add(lblNewLabel_6);
	}
}