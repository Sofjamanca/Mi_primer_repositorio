package EjemplosLibro;

public enum DiaSem {
	//tener valores constantes dentro de el
	LUNES(1, "primer dia de la semana"),
	MARTES(2, "dia de clases"),
	MIERCOLES(3, "juega fulminense"),
	JUEVES(4, "gana boca"),
	VIERNES(5, "el mejor dia"),
	SABADO(6, "se juega fulbito"),
	DOMINGO(7, "se duerme tarde");
	
	private int numDia;
	private String comentarioDia;
	
	private DiaSem (int a, String b)
	{
		this.numDia = a;
		this.comentarioDia = b;
	}
	
	public int getNumDia()
	{
		return this.numDia;
	}
	
	public String getComentarioDia()
	{
		return this.comentarioDia;
	}
	
	
	
}

enum Depositos{
	
	DEPOSITO_1,
	DEPOSITO_2,
	DEPOSITO_3;
}

class Calendario
{
	private DiaSem dia = DiaSem.DOMINGO;
	private int numDia = DiaSem.DOMINGO.getNumDia();
	private String comentario = DiaSem.DOMINGO.getComentarioDia(); 
	
}

