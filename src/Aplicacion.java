package aplicacion;
import java.time.LocalDate;

public class Aplicacion {

	


		public int idPersona;
		public String nombre;
		public String apellido;
		public String dptoResidencia;
		private int cantHijos;
		private LocalDate fechaNac;
		int[]array=new int[5];

		public int getCantHijos() {
			return cantHijos;
		}
		public void setCantHijos(int cantHijos) {
			this.cantHijos = cantHijos;
		}
		public LocalDate getFechaNacimiento() {
			return fechaNac;
		}
		public void setFechaNacimiento(LocalDate fechaNac) {
			this.fechaNac = fechaNac;
		}
		public  Aplicacion(){
		}


		public Aplicacion (int idPersona, String nombre, String apellido, String dptoResidencia, int cantHijos,LocalDate fechaNac) {
			
			this.idPersona = idPersona;
			this.nombre = nombre;
			this.apellido = apellido;
			this.dptoResidencia = dptoResidencia;
			this.cantHijos = cantHijos;
			this.fechaNac = fechaNac;
			
		}
		@Override
		public String toString() {
			return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", dptoResidencia="
					+ dptoResidencia + ", cantHijos=" + cantHijos + ", fechaNacimiento=" + fechaNac + "]";
		}
	
			
		}
	






