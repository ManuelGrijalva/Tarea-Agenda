package Vista;

import Modelo.Contacto;
import Servicio.Agenda;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Mario", "123456789");
        agenda.agregarContacto("Link", "987654321");
        agenda.agregarContacto("Peach", "456789123");
        agenda.agregarContacto("Zelda", "234567890");
        agenda.agregarContacto("Bowser", "345678901");
        agenda.agregarContacto("Luigi", "567890123");
        agenda.agregarContacto("Toad", "678901234");
        agenda.agregarContacto("Yoshi", "789012345");
        agenda.agregarContacto("Wario", "890123456");
        agenda.agregarContacto("Daisy", "901234567");
        agenda.agregarContacto("Rosalina", "012345678");
        agenda.agregarContacto("Donkey", "112345678");
        agenda.agregarContacto("Diddy", "212345678");
        agenda.agregarContacto("Koopa", "312345678");
        agenda.agregarContacto("Goomba", "412345678");

        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBuscando el contacto de Link:");
        Contacto contacto = agenda.buscarContacto("Link");
        if (contacto != null) {
            System.out.println("Nombre: " + contacto.getNombre() + ", Teléfono: " + contacto.getTelefono());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un par de contactos
        System.out.println("\nEliminando el contacto de Peach.");
        agenda.eliminarContacto("Peach");
        System.out.println("Eliminando el contacto de Mario.");
        agenda.eliminarContacto("Mario");

        // Mostrar contactos después de la eliminación
        System.out.println("\nContactos en la agenda después de eliminar a Peach y Mario:");
        agenda.mostrarContactos();
    }
}