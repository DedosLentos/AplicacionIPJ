package aplicacion;

public class DatosUsuario {
	
		public DatosUsuario( ) {
			
		}
		String usuario1="";
		String pass1="";
		
		public int probarPass() {
			usuario1=PanelLog.usuarioTxt.getText();
			pass1=PanelLog.passTxt.getText();
			if (usuario1.equals("user")&&pass1.equals("1234")) {
				return 1;
			}else {
				return 0;
			}
			
			
		}
		//public DeditosLentos {
			//usuario1=PanelLog.usuarioTxt.getText();
			//pass1=PanelLog.passTxt.getText();
			//if (usuario1.equals("user")&&pass1.equals("1234")) {
			//	return 1;
			//}else {
			//	return 0;
		}
}
