public class Clinica {
    public static void main(String[] args) {
        // Creando pacientes
        Animal perro = new Animal("Firulais", "Perro");
        Animal gato = new Animal("Mishito Ramirez", "Gato");
        Animal perico = new Animal("Locutor Martinez", "Perico");
        Animal gato2 = new Animal("Misifus", "Gato");

        // Creando veterinarios
        Veterinario doc1 = new Veterinario("Dr. Fernando Monzon", "101");
        Veterinario doc2 = new Veterinario("Dra. Isabel Guerra", "022");

        // Asignando y tratando pacientes
        doc1.asignarPaciente(perro);
        doc2.asignarPaciente(gato);
        doc1.tratarPaciente();
        doc2.tratarPaciente();
        doc1.asignarPaciente(perico);
        doc1.asignarPaciente(gato2);
    }
}
