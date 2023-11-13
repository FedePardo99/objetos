package clase;

public class Fecha {

		int dia,mes,anio;

		public Fecha(int dia, int mes, int anio) {
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
		}

		public void imprimir() {
			System.out.println(this.dia+"/"+this.mes+"/"+this.anio);
		}
		
		
		public void imprimirTexto() {
			String[] aux= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
			System.out.println(this.dia+" de "+aux[this.mes-1]+" de "+this.anio);
		}
		
		public boolean esBisiesto() {
			if(this.anio%4==0 && !(this.anio%100==0)) {
				return true;
			}
			if(this.anio%400==0) {
				return true;
			}
			return false;
		}
		public static boolean esBisiesto(int anio) {
			if(anio%4==0 && anio%100!=0) {
				return true;
			}
			if(anio%400==0) {
				return true;
			}
			return false;
		}	
		 public boolean esValida() {
			 if(this.mes<1 || this.mes>12) {
				 return false;
			 }
			 if(this.dia<1 || this.dia>this.diasDelMes()) {
				 return false;
			 }
			 return true;
		 }
		 public void avanzarDia() {
			 if(this.dia==31 && this.mes==12) {
				 this.dia=1;
				 this.mes=1;
				 this.anio+=1; 
			 }
			 if(this.dia==this.diasDelMes()) {
				 this.dia=1;
				 this.mes+=1;
			 } 
			 this.dia+=1;
		 }
		 public boolean antesQue(Fecha otra) {
			 if(this.anio<otra.anio) {
				 return true;
			 }
			 if(this.anio>otra.anio) {
				return false; 
			 }
			 if(this.mes<otra.mes) {
				 return true;
			 }
			 if(this.mes>otra.mes) {
				 return false;
			 }
			 if(this.dia<otra.dia) {
				 return true;
			 }
			 if(this.dia>otra.dia) {
				 return false;
			 }
			 return false;
		 }
		 public int diasDelMes() {
				if(this.mes==1 || this.mes==3 || this.mes==5 || this.mes==7 || this.mes==8 ||  this.mes==10 ||  this.mes==12) {
					return 31;
				}
				if( this.mes==4 ||  this.mes==6 ||  this.mes==9 ||  this.mes==11) {
					return 30;
				}
				return esBisiesto(this.anio)?29:28;
			}
		 
		 public int diaDelAnio() {
			 int aux=0;
			 for(int m=1;m<this.mes;m++) {
				 aux+=diasDelMes();
			 }
			 return aux+this.dia;
		 }
		 public int numSerie() {
			 int cont=0;
			 for(int a=1900; a<this.anio;a++) {
				 cont=cont+365+(esBisiesto(a)?1:0);
			 }
			 return cont+this.diaDelAnio();
		 }
		 public int diasDeDiferenciaCon(Fecha otra) {
			int diferenciaDias = otra.numSerie()-this.numSerie();
			if(diferenciaDias >= 0) {
				return diferenciaDias;			
			}
			return diferenciaDias * -1;
			
		 }
	}


