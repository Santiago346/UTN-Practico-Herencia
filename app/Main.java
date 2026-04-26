package app;

import model.ClienteEmpresa;
import model.ClientePersonaFisica;
import model.ClientePremium;
import model.Rubro;
import model.Cliente;

public class Main {

        public static void main(String[] args) {

                Cliente cliente1 = new ClientePersonaFisica(
                                1,
                                "Juan",
                                "Pérez",
                                "12345678",
                                "Calle Falsa 123",
                                "1122334455",
                                "juan@gmail.com",
                                "10/05/2010",
                                "12345678",
                                "10/05/1990",
                                "Ingeniero",
                                250000);

                Cliente cliente2 = new ClienteEmpresa(
                                2,
                                "Empresa SA",
                                "Empresa SA",
                                "30-12345678-9",
                                "Av. Siempre Viva 742",
                                "1144556677",
                                "contacto@empresa.com",
                                "10/05/2010",
                                "Empresa SA",
                                "30-12345678-9",
                                Rubro.COMERCIO,
                                "Carlos Gómez");

                Cliente cliente3 = new ClientePremium(
                                3,
                                "Ana",
                                "López",
                                "20333444556",
                                "Av. Libertador 1000",
                                "1199887766",
                                "ana@gmail.com",
                                "10/05/2010",
                                1000000,
                                "Ejecutivo VIP",
                                "Acceso a sala preferencial");

                System.out.println("CLIENTE PERSONA FÍSICA");
                System.out.println(cliente1);
                System.out.println("Calificación: " + cliente1.calcularCalificacion());

                System.out.println("CLIENTE EMPRESA");
                System.out.println(cliente2);
                System.out.println("Calificación: " + cliente2.calcularCalificacion());

                System.out.println("CLIENTE PREMIUM");
                System.out.println(cliente3);
                System.out.println("Calificación: " + cliente3.calcularCalificacion());
        }
}