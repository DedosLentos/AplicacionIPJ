package aplicacion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JTree;

/**
 *
 * @author facun
 */
public class menu extends javax.swing.JFrame {

   
    public menu() {
    	setTitle("Alta de Usuario");
   
    	setBackground(Color.WHITE);
    	getContentPane().setFont(new Font("Arial", Font.PLAIN, 20));
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\titof\\OneDrive\\Escritorio\\Cod2.png"));
    	
    	JMenuBar menuBar = new JMenuBar();
    	setJMenuBar(menuBar);
    	
    	JButton btnNewButton_1 = new JButton("Borrar ");
    	btnNewButton_1.addMouseListener(new MouseAdapter() {
    		@Override
    		public void mouseClicked(MouseEvent e) {
    			textIDUsuario.setText(String.valueOf(""));
				textNombre.setText("");
				textApellido.setText("");
				textDepartamento.setText("");
				textHijos.setText(String.valueOf(""));
				textNacimiento.setText(" ");
			
			
    		}
    	});
    	btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 15));
    	menuBar.add(btnNewButton_1);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblIDUsuario = new javax.swing.JLabel();
        lblIDUsuario.setFont(new Font("Arial", Font.PLAIN, 20));
        lblNombre = new javax.swing.JLabel();
        lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
        lblApellido = new javax.swing.JLabel();
        lblApellido.setFont(new Font("Arial", Font.PLAIN, 20));
        lblDepto = new javax.swing.JLabel();
        lblDepto.setFont(new Font("Arial", Font.PLAIN, 20));
        textIDUsuario = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textApellido = new javax.swing.JTextField();
        textDepartamento = new javax.swing.JTextField();
        darAlta = new javax.swing.JButton();
        darAlta.setFont(new Font("Arial", Font.PLAIN, 15));
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIDUsuario.setText("ID:");

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblDepto.setText("Departamento:");

        textIDUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUsuarioActionPerformed(evt);
            }
        });

        darAlta.setText("Dar de alta");
        darAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaActionPerformed(evt);
            }
        });

        jTable1.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"idUsuario", "Nombre", "Apellido", "Departamento", "Cantidad de Hijos", "Fecha de Nacimiento"
        	}
        ));
        jScrollPane1.setViewportView(jTable1);
        
        JLabel lblHijos = new JLabel("Cant. Hijos:");
        lblHijos.setFont(new Font("Arial", Font.PLAIN, 20));
        
        JLabel lblNac = new JLabel("Fecha. Nac:");
        lblNac.setFont(new Font("Arial", Font.PLAIN, 20));
        
        textHijos = new JTextField();
        textHijos.setColumns(10);
        
        textNacimiento = new JTextField();
        textNacimiento.setColumns(10);
        
        JButton btnNewButton = new JButton("Salir");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.exit(0);
        	}
        });
        btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 496, GroupLayout.PREFERRED_SIZE)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(darAlta, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        			.addGap(180))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(btnNewButton)
        			.addContainerGap())
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(lblIDUsuario)
        					.addGap(36))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(lblApellido)
        						.addComponent(lblNombre)
        						.addComponent(lblDepto)
        						.addComponent(lblNac)
        						.addComponent(lblHijos))
        					.addGap(26)))
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(textDepartamento, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        					.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addComponent(textIDUsuario, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addComponent(textNacimiento, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        					.addComponent(textHijos, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)))
        			.addGap(160))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(41)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblIDUsuario)
        				.addComponent(textIDUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(19)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNombre)
        				.addComponent(textNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblApellido)
        				.addComponent(textApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(20)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblDepto)
        				.addComponent(textDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(11)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textHijos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblHijos))
        			.addGap(24)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNac)
        				.addComponent(textNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(15)
        			.addComponent(darAlta, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(btnNewButton)
        			.addGap(4))
        );
        getContentPane().setLayout(groupLayout);

        pack();
    }// </editor-fold>                        

    private void idUsuarioActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void darAltaActionPerformed(java.awt.event.ActionEvent evt) {  
    			Aplicacion p1=new Aplicacion();
    			int idUsuario=0;
    			LocalDate nacimiento= LocalDate.now();
    			String nombre="";
    			String apellido="";
    			String departamento="";
    			int hijos=0;
    			String resultado="";
    			
    	
				if(textIDUsuario.getText().equals("")|| textNacimiento.getText().equals("") || textNombre.getText().equals("") || textApellido.getText().equals("")||textDepartamento.getText().equals("")|| textHijos.getText().equals("")) {
				         
					JOptionPane.showMessageDialog(this, "Verifique la información");    
	
                                
				}else {
				
					
		
				
				String data[]= {textIDUsuario.getText(),textNombre.getText(),textApellido.getText(),textDepartamento.getText(),textHijos.getText(),textNacimiento.getText()};
				DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();  
				JOptionPane.showMessageDialog(this, "Dado de alta satisfactoriamente");
				
				tblModel.addRow(data);
				textIDUsuario.setText("");
				textNombre.setText("");
				textApellido.setText("");
				textDepartamento.setText("");
				textHijos.setText("");
				textNacimiento.setText("");	
				
    }                                }
			
			

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create display  */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables                    
    private javax.swing.JTextField textApellido;
    private javax.swing.JButton darAlta;
    private javax.swing.JTextField textDepartamento;
    private javax.swing.JTextField textIDUsuario;
    private javax.swing.JLabel lblIDUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDepto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textNombre;
    private JTextField textHijos;
    private JTextField textNacimiento;
}
