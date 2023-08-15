public class Veterinario {
    private String nombre;
    private String id;
    private Animal paciente;

    public Veterinario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.paciente = null;
    }

    public void asignarPaciente(Animal animal) {
        if (this.paciente == null) {
            this.paciente = animal;
            System.out.println("El paciente " + animal.getNombre() + " ha sido asignado a " + nombre);
        } else {
            System.out.println(nombre + " ya tiene un paciente asignado.");
        }
    }

    public void tratarPaciente() {
        if (this.paciente != null) {
            System.out.println(nombre + " ha tratado al paciente " + paciente.getNombre());
            this.paciente = null;
        } else {
            System.out.println(nombre + " no tiene pacientes asignados en este momento.");
        }
    }
}
