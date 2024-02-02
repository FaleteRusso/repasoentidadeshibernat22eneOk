package com.corenetworks.repasoentidadeshibernat22ene;

import com.corenetworks.repasoentidadeshibernat22ene.modelo.Barco;
import com.corenetworks.repasoentidadeshibernat22ene.modelo.Patron;
import com.corenetworks.repasoentidadeshibernat22ene.modelo.Salida;
import com.corenetworks.repasoentidadeshibernat22ene.modelo.Socio;
import com.corenetworks.repasoentidadeshibernat22ene.servicio.IPatronServicio;
import com.corenetworks.repasoentidadeshibernat22ene.servicio.ISocioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Repasoentidadeshibernat22eneApplication implements CommandLineRunner {
@Autowired
private ISocioServicio servicio;
private IPatronServicio servicioPatron;
	public static void main(String[] args) {

		SpringApplication.run(Repasoentidadeshibernat22eneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Socio s1= new Socio("12345676B","Falete Russo","Vallejkas");
		Barco b1 =new Barco("1234CDS",21,"Aguasclaras",35);
				Barco b2 =new Barco("3476GHN",34,"Crusant",46);
				b1.setSocio(s1);
				b2.setSocio(s1);
				List<Barco>barcos= new ArrayList<>();
				barcos.add(b1);
				barcos.add(b2);
				s1.setB1(barcos);
		System.out.println("-----------INSERTAR UNO----------");
				System.out.println(servicio.insertar(s1));

		 */
		System.out.println("------Consultar uno----------");
		System.out.println(servicio.mostrarUno("12345676B"));
		Patron p1 =new Patron("12344321D","Carmen Calva","acenida amonal");
		Salida s1=new Salida(1, LocalDate.now(), LocalTime.now());
		s1.setPatron(p1);
		Salida s2=new Salida(2, LocalDate.now(), LocalTime.now());
		s1.setPatron(p1);
		List<Salida>salidas=new ArrayList<>();
		salidas.add(s1);
		salidas.add(s2);
		p1.setS1(salidas);
		System.out.println(servicioPatron.insert(p1));

	}
}
