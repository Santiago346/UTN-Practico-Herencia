package app;
import java.time.LocalDate;

import modelo.ClienteEmpresa;
import modelo.ClientePersonaFisica;
import modelo.ClientePremium;

public class Main {

    public static void main(String[] args) {

        ClientePersonaFisica cliente1 = new ClientePersonaFisica(
                1,
                "Juan",
                "Pérez",
                "12345678",
                "Calle Falsa 123",
                "1122334455",
                "juan@gmail.com",
                LocalDate.now(),
                "12345678",
                LocalDate.of(1990, 5, 10),
                "Ingeniero",
                250000.50);

        ClienteEmpresa cliente2 = new ClienteEmpresa(
                2,
                "Empresa SA",
                "Empresa SA",
                "30-12345678-9",
                "Av. Siempre Viva 742",
                "1144556677",
                "contacto@empresa.com",
                LocalDate.now(),
                "Empresa SA",
                "30-12345678-9",
                "Tecnología",
                "Carlos Gómez");

        ClientePremium cliente3 = new ClientePremium(
                3,
                "Ana",
                "López",
                "20333444556",
                "Av. Libertador 1000",
                "1199887766",
                "ana@gmail.com",
                LocalDate.now(),
                1000000.0,
                "Ejecutivo VIP",
                "Acceso a sala preferencial");

        System.out.println("CLIENTE PERSONA FÍSICA");
        System.out.println(cliente1);

        System.out.println("CLIENTE EMPRESA");
        System.out.println(cliente2);

        System.out.println("CLIENTE PREMIUM");
        System.out.println(cliente3);
    }
}