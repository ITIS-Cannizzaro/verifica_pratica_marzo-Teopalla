import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Pallavicini
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			//aggiungere, togliere casi a seconda delle proprie scelte
			case 1:
				MinimoDiArray();
				break;
			case 2:
				ParoleMisteriose();
				break;
			case 3:
				StampaPari();
				break;
			case 4:

				break;
			case 5:
				StampaZigZag(); 
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		// Modificare il menù secondo le proprie scelte
		System.out.println("1 - MinimoDiArray");
		System.out.println("2 ParoleMisteriose");
		System.out.println("3 StampaPari");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 StampaZigZag");
	}
	static void swap(int h[], int a, int b) 
	{
		int temp= h[a];
		h[a]=h[b];
		h[b]= temp;
	}

	// Accordino:  giusto! 2pt
	static void MinimoDiArray()
	{
		int[]a= new int [10];
		int numeroMinimo = 0;
		for(int i=0; i<a.length; i++)
		{
			a[i]= (int)((Math.random())*11)-5;
		}

		for(int i=0; i<a.length; i++)
		{
			System.out.println(i + " il valore dell'array �: " + a[i]);
		}

		for(int i=0; i<a.length; i++)
		{

			if (a[i]<numeroMinimo)
			{
				numeroMinimo=a[i];
				System.out.println("la posizione �: " + i);
			}

		}
		System.out.println(" il valore minimo �: " + numeroMinimo );

	}
	// Accordino:  ci sei andato vicino ma hai sbagliato diverse cose: 1pt
	static void  StampaPari() 
	{
		int[]a= new int [20];
		int valoriCrescenti= 1;
		for(int i=0; i<a.length; i++)
		{
			a[i]= (int)((Math.random())*101); // Accordino:  tra 1 e 100, dovevi fare +1
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(i + " i valori dell'array sono: " + a[i]);
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if (a[i]%2 == 0)
				{
					if (a[i]>a[j])// Accordino:  così li ordini in modo descrescente
						swap(a, valoriCrescenti, j); // Accordino: perché valoricrescent??? devi scambiare i e j  
				}

			}
			System.out.println(a[i]);// Accordino:  non puoi stampare mentre ordini, devi farlo dopo!
		}
	}
	// Accordino:  va bene ma ti dovevi fermare a metà dell'array: 3pt
	static void  StampaZigZag() 
	{
		int[]a= new int [10];
		int valoriDalbasso=0;
		for(int i=0; i<a.length; i++)
		{
			a[i]= (int)((Math.random())*11);
		}

		for(int i=0; i<a.length; i++)
		{
			System.out.println(i + " il valore dell'array �: " + a[i]);
		}
		for(int i=0; i<a.length; i++)
		{
			valoriDalbasso=(a[a.length-1-i]);
			System.out.println(a[i] + " , " + valoriDalbasso);
		}
	}
	
	// Accordino:  manca un ciclo, così devi beccare non solo la parola ma anche la posizione: 0.5pt
	static void ParoleMisteriose()
	{

		String []a= {"mi", "auguro", "di", "prendere", "sei"};// Accordino:  hai preso più di sei, congratuluazioni!
		System.out.println("ti sfido! trova almeno una delle 5 parole che ho pensato, hai 3 tentativi");
		for(int i=0; i<a.length; i++)// Accordino:  così i tentativi sono 5 (quanto la lunghezza l'array)
		{
			System.out.println("inserisci la tua risposta"); // Accordino:  manca il ciclo che controlla tutte le parole dell'array, non solo una!s
			if (a[i].equals(in.nextLine()))
			{
				System.out.println("bravo piccolo campione, hai vinto");
				return;
			}
			System.out.println("mi dispiace hai sbagliato");
		}

	}
}