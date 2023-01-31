package DefensaFinalViernes;
public class ABinarioZona {
	private NodoZona raiz;
	public ABinarioZona() {
		raiz=null;
	}
	public NodoZona getRaiz() {
		return raiz;
	}
	public void setRaiz(NodoZona raiz) {
		this.raiz = raiz;
	}
	/*public void crear(NodoABruta r) {
		if(r !=null) {
			System.out.print("Ingrese numero de rutas: ");
			r.setNro(Leer.datoInt());
			System.out.print("Ingrese lugar de la ruta: ");
			r.setLugar(Leer.dato());
			System.out.print("Ingrese zona de la ruta: ");
			r.setZona(Leer.dato());
			System.out.print("--> "+r.getNro()+" Tendra izquierda? s/n -->");
			String resp = Leer.dato();
			if(resp.equals("s")) {
				NodoABruta nue = new NodoABruta();
				r.setIzq(nue);
				crear(r.getIzq());
			}
			System.out.print("--> "+r.getNro()+" Tendra derecha? s/n -->");
			resp = Leer.dato();
			if(resp.equals("s")) {
				NodoABruta nue = new NodoABruta();
				r.setDer(nue);
				crear(r.getDer());
			}
		}
	}
	public void preOrden(NodoABruta r) {
		if(r!=null) {
			System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );
			preOrden(r.getIzq());
			preOrden(r.getDer());
		}		
	}
	public void inOrden(NodoABruta r) {
		if (r != null) {
			inOrden(r.getIzq());
			System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );
			inOrden(r.getDer());
		}
	}

	public void posOrden(NodoABruta r) {
		if (r != null) {
			posOrden(r.getIzq());
			posOrden(r.getDer());
			System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );
		}
	}
	public int contar(NodoABruta r) {
		if(r!=null) {
			return contar(r.getIzq()) + contar(r.getDer()) + 1;
		}
		return 0;
	}
	public void mostraHojas(NodoABruta r) {
		if(r!=null) {
			mostraHojas(r.getIzq());
			mostraHojas(r.getDer());
			if(r.getDer() == null && r.getIzq() == null)
				System.out.print("[ "+r.getNro()+" ~ "+r.getLugar()+" ~ "+r.getZona()+" ]" );

		}

	}*/
	public void crear() {
		String resp;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		NodoZona x = new NodoZona();
		System.out.println("Dato Raiz-->");
		System.out.print("Ingrese nombre de la zona: ");
		x.setNombre(Leer.dato());
		System.out.println("Ingrese datos avenida: ");
		PilaAC avenida = new PilaAC();
		System.out.print("Ingrese el numero de avenidas: ");
		avenida.llenar(Leer.datoInt());
		x.setAvenidas(avenida);
		System.out.println();
		System.out.println("Ingrese datos de calles: ");
		PilaAC calle = new PilaAC();
		System.out.print("Ingrese el numero de avenidas: ");
		calle.llenar(Leer.datoInt());
		x.setCalles(calle);
		setRaiz(x);
		nivel.adicionar(getRaiz());
		while(!nivel.esvacia()) {
			while(!nivel.esvacia()) {
				x = nivel.eliminar();
				System.out.print(x.getNombre()+" Tendra Izquierda ? s/n -->");
				resp =Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S")) {
					NodoZona y = new NodoZona();
					System.out.print("Dato-->");
					System.out.println();


					System.out.print("Ingrese nombre de la zona: ");
					y.setNombre(Leer.dato());
					System.out.println("Ingrese datos avenoda: ");
					avenida = new PilaAC();
					System.out.print("Ingrese el numero de avenidas: ");
					avenida.llenar(Leer.datoInt());
					y.setAvenidas(avenida);
					System.out.println();
					System.out.println("Ingrese datos de calles: ");
					calle = new PilaAC();
					System.out.print("Ingrese el numero de avenidas: ");
					calle.llenar(Leer.datoInt());
					y.setCalles(calle);


					x.setIzq(y);
					desc.adicionar(y);
				}
				else
					x.setIzq(null);
				System.out.print(x.getNombre() + " Tendra Derecha ? s/n ");
				resp = Leer.dato();
				if (resp.compareTo("s") == 0 || resp.equals("S")) {
					NodoZona y = new NodoZona();
					System.out.print("Dato-->");
					System.out.println();

					System.out.print("Ingrese nombre de la zona: ");
					y.setNombre(Leer.dato());
					System.out.println("Ingrese datos avenoda: ");
					avenida = new PilaAC();
					System.out.print("Ingrese el numero de avenidas: ");
					avenida.llenar(Leer.datoInt());
					y.setAvenidas(avenida);
					System.out.println();
					System.out.println("Ingrese datos de calles: ");
					calle = new PilaAC();
					System.out.print("Ingrese el numero de avenidas: ");
					calle.llenar(Leer.datoInt());
					y.setCalles(calle);


					x.setDer(y);
					desc.adicionar(y);
				} else
					x.setDer(null);
			}
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());

		}

	}
	void mostrar() {
		NodoZona x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				System.out.println("---------------------------------->>>");
				System.out.println();
				System.out.println("Nombre de la Zona:--> "+x.getNombre());
				System.out.println("Avenidas--->");
				x.getAvenidas().mostrar();
				System.out.println("Calles--->");
				x.getCalles().mostrar();
				System.out.println();
				System.out.println();
				System.out.println("---------------------------------->>>");
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}
	}
	/*public int nro() {
		int c = 0;
		NodoABruta x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				c = c + 1;
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}
		return c;
	}*/
	/*
	 * public int nro() {
		int c = 0;
		NodoABruta x;
		Pila nivel = new Pila();
		Pila desc = new Pila();

		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				c = c + 1;
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}
		return c;
	}
	 */
	public void mostrarZ(String aveCalle) {
		NodoZona x;
		Pila nivel = new Pila();
		Pila desc = new Pila();
		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				if(verificar(x.getAvenidas(),aveCalle) || verificar(x.getCalles(),aveCalle)) 
					System.out.println("NOMBRE DE LA ZONA---->>"+x.getNombre());

				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}

	}
	/*
	 * public static void llevarLosAprovadosAlPrincipio(PilaEx q) {
		PilaEx aux = new PilaEx();
		PilaEx R = new PilaEx();
		while(!q.esvacia()) {
			Examen x=q.eliminar();
			if(x.getNota()>=51) {
				R.adicionar(x);
			}
			else {
				aux.adicionar(x);
			}
		}
		q.vaciar(R);
		q.vaciar(aux);
		q.mostrar();
	}
	 */
	public boolean verificar(PilaAC avenidas, String aveCalle) {
		boolean sw = false;
		PilaAC aux = new PilaAC();
		while(!avenidas.esvacia()) {
			AvenidaCalle x = avenidas.eliminar();
			if(x.getNombre().equals(aveCalle))
				sw = true;

			aux.adicionar(x);
		}
		avenidas.vaciar(aux);
		return sw;
	}
	int Mayor() {
		NodoZona x;
		int may=0;
		Pila nivel = new Pila();
		Pila desc = new Pila();
		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				int nro = cantidad(x.getAvenidas()) + cantidad(x.getCalles());
				if(nro>may)
					may=nro;
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());

		}
		return may;

		/*while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				int nro = cantidad(x.getAvenidas()) + cantidad(x.getCalles());
				if(nro==may)
					System.out.println("NOMBRE DE LA ZONA---->>"+x.getNombre());
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());
		}*/


	}
	public int cantidad(PilaAC avenidas) {
		int c=0;
		PilaAC aux = new PilaAC();
		while(!avenidas.esvacia()) {
			AvenidaCalle  x=avenidas.eliminar();
			c=c+1;
			aux.adicionar(x);
		}
		avenidas.vaciar(aux);
		return c;
	}
	public void mostrarMayor(int Mayor) {
		NodoZona x;
		//int may=0;
		Pila nivel = new Pila();
		Pila desc = new Pila();
		nivel.adicionar(raiz);
		while (!nivel.esvacia()) {
			while (!nivel.esvacia()) {
				x = nivel.eliminar();
				int nro = cantidad(x.getAvenidas()) + cantidad(x.getCalles());
				if(nro==Mayor)
					System.out.println("NOMBRE DE LA ZONA---->>"+x.getNombre());
				if (x.getIzq() != null)
					desc.adicionar(x.getIzq());
				if (x.getDer() != null)
					desc.adicionar(x.getDer());
			}
			System.out.println();
			while (!desc.esvacia())
				nivel.adicionar(desc.eliminar());

		}

	}
}
