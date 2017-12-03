package hello;

import wersja_alternatywna.Samochod;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Pozdrowienia z Krakowa");
		System.out.println("Pierwsza wersja");
		System.out.println("Druga wersja");
		System.out.println("Trzecia wersja");
		
		System.out.println("Wersja alternatywna");
		Samochod s = new Samochod("Volkswagen", "Golf", 2011, 1.6, 105);
		System.out.println(s);

		System.out.println("Czwarta wersja");
		System.out.println("Piąta wersja");
		System.out.println("Szósta wersja");
	}

}
