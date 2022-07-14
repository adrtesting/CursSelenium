package curs8;

public class StaticExample {
	
	public static String nume;
	public static String departament = "QA";

	public static void main(String[] args) {
		
		//JVM - pas1: incarca prima data Static - care nu este asociat cu obiectul ci cu Clasa
		//JVM - pas2: incarca obiectele (StaticExample persoana1 = new StaticExample());
		//nume este asociat cu StaticExample nu cu persoana1 care este obiectul
		//Staticexample.main() DbConn.openConnection()
		
		//person1
		StaticExample persoana1 = new StaticExample();
		persoana1.nume = "Oana ";
		System.out.println(persoana1.nume + departament);
		
		//person2
		StaticExample persoana2 = new StaticExample();
		persoana2.nume = "Ioana ";
		System.out.println(persoana2.nume + departament);
		
		//person3
		departament = "Dev";
		StaticExample persoana3 = new StaticExample();
		persoana3.nume = "Matei ";
		System.out.println(persoana3.nume + departament);
		
		System.out.println("----------------------------------");
		System.out.println(persoana1.nume + departament);
		System.out.println(persoana2.nume + departament);
		System.out.println(persoana3.nume + departament);
	}

}
