package clase;

public class Agenda {

	private Persona[] contactos;
	private String[] telefonos;

	public Agenda(int tam) {
		if (tam < 0) {
			throw new RuntimeException("tamanio invalido para los arreglos.");
		}

		this.contactos = new Persona[tam];
		this.telefonos = new String[tam];

	}

	public void guardar(Persona contacto, String telefono) {

		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contactos[i] = contacto;
				telefonos[i] = telefono;
				return;
			}

		}
		Persona[] auxp = new Persona[contactos.length + 1];
		String[] auxt = new String[auxp.length];
		for (int i = 0; i < contactos.length; i++) {
			auxp[i] = contactos[i];
			auxt[i] = telefonos[i];
		}

		auxp[contactos.length] = contacto;
		auxt[telefonos.length] = telefono;

		contactos = auxp;
		telefonos = auxt;

	}

	public void eliminarContacto(Persona contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contacto.mismaPersona(contactos[i])) {
				this.contactos[i] = null;
				this.telefonos[i] = null;
			}
		}
	}

	public boolean pertenece(Persona contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contacto.mismaPersona(contactos[i])) {
				return true;
			}
		}
		return false;
	}

	public String dameTelefono(Persona contacto) {
		for (int i = 0; i < contactos.length; i++) {
			if (contacto.mismaPersona(contactos[i])) {
				return telefonos[i];
			}
		}
		return "";

	}

	public void mostrarContactos() {
		for (int i = 0; i < contactos.length; i++) {
			System.out.println(contactos[i]);

		}
	}

	public void mostrarTelefonos() {
		for (int i = 0; i < telefonos.length; i++) {
			System.out.println(telefonos[i]);
		}
	}

}
