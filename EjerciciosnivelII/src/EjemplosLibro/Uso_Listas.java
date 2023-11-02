package EjemplosLibro;
import java.util.*;
public class Uso_Listas {
	
	public static ArrayList <Auto> listadoAutos = new ArrayList <Auto>();
	public static Stack<Auto> pilaAutos = new Stack <Auto>();
	public static LinkedList <Auto> colaAutos = new LinkedList <Auto>();
	public static HashMap <Integer, String> miDiccionario = new HashMap <Integer, String>();
	
	
	public static void main(String[] args) {
		
		miDiccionario .put(35750989, "Lucia Barrionuevo");
		miDiccionario .put(36474789, "Luca Piedrabuena");
		miDiccionario .put(41222838, "Lara Paredes");
		miDiccionario .put(42525252, "Ara Alala");
		miDiccionario .put(44065794, "Sofia Jamanca");
		
		Iterator it = miDiccionario.keySet().iterator();
		while(it.hasNext()){
		 Integer key = (Integer) it.next();
		 System.out.println("DNI: " + key + " -> Nombre: " + miDiccionario.get(key));
		}
		
		Auto auto1 = new Auto("VW01", "VW", "VENTO", "2.5", "NAFTA");
		Auto auto2 = new Auto("VW01", "VW", "GOL TREND", "1.6", "NAFTA");
		Auto auto3 = new Auto("FO01", "FORD", "FOCUS", "2.0", "DIESEL");
		Auto auto4 = new Auto("PE01", "PEUGEOT", "208", "1.5", "ELECTRICO");
		Auto auto5 = new Auto("CH01", "CHEVROLET", "CRUZE", "2.0", "HIBRIDO");
		
		listadoAutos.add(auto1);
		listadoAutos.add(auto2);
		listadoAutos.add(auto3);
		listadoAutos.add(auto4);
		listadoAutos.add(auto5);
		
		pilaAutos.push(auto1);
		pilaAutos.push(auto2);
		pilaAutos.push(auto3);
		pilaAutos.push(auto4);
		pilaAutos.push(auto5);
		
		colaAutos.offer(auto1);
		colaAutos.offer(auto2);
		colaAutos.offer(auto3);
		colaAutos.offer(auto4);
		colaAutos.offer(auto5);
		
	//System.out.println(listadoAutos.size());
//		System.out.println(pilaAutos.size());
//		System.out.println(colaAutos.size());
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(colaAutos.poll().resumenAuto());
		}
		

//		System.out.println(listadoAutos.size());//no se eliminan
//		System.out.println(pilaAutos.size());
//		System.out.println(colaAutos.size());//son mostrados y eliminados
	}		
		
	}


class Auto
{
	private String codigo;
	private String marca;
	private String modelo;
	private String motor;
	private String combustible;
	
	public Auto(String codigo, String marca, String modelo, String motor, String combustible)
	{
		this.codigo = codigo;
		this.modelo = modelo;
		this.marca = marca;
		this.motor = motor;
		this.combustible = combustible;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public String resumenAuto()
	{
		return getMarca() + " - " + getModelo() + " - " + getMotor() + " - " + getCombustible();
	}
}
