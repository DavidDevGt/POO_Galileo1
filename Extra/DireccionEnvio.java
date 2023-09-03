import java.util.Arrays;
import java.util.List;

public class DireccionEnvio {
    private String nombreCliente;
    private String departamento;
    private String direccionExacta;
    private int edadCliente;

    public DireccionEnvio() {
    }

    // setters
    public void setNombreCliente(String nuevoNombre) {
        this.nombreCliente = nuevoNombre;
    }

    public void setEdadCliente(int nuevaEdad) {
        if (nuevaEdad >= 18) {
            this.edadCliente = nuevaEdad;
        } else {
            System.out.println("Error: Debes tener mas de 18 años");
        }
    }

    public void setDepartamento(String nuevoDepartamento) {

        List<String> departamentosGuatemala = Arrays.asList("Guatemala", "Alta Verapaz", "Baja Verapaz",
                "Chimaltenango", "Chiquimula", "El Progreso", "Escuintla", "Huehuetenango", "Izabal", "Jalapa",
                "Jutiapa", "Petén", "Quetzaltenango", "Quiché", "Retalhuleu", "Sacatepéquez", "San Marcos",
                "Santa Rosa", "Sololá", "Suchitepéquez", "Totonicapán", "Zacapa");

        if (departamentosGuatemala.contains(nuevoDepartamento)) {
            this.departamento = nuevoDepartamento;
        } else {
            System.out.println("Error: No se encontro el departamento.");
        }
    }

    public void setDireccionExacta(String nuevaDireccion) {
        if (nuevaDireccion.length() > 12) {
            this.direccionExacta = nuevaDireccion;
        } else {
            System.out.println("Error: Ingresa una dirección valida.");
        }
    }

    // getters
    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public int getEdadCliente() {
        return this.edadCliente;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getDireccionExacta() {
        return this.direccionExacta;
    }

    // main (si lo hice en un monolito, porfa explicanos esa class para arrays de Java con foreachs)
    public static void main(String[] args) {
        DireccionEnvio direccion = new DireccionEnvio();

        direccion.setNombreCliente("Pedro Pascal");
        direccion.setEdadCliente(28);
        direccion.setDepartamento("Zacapa");
        direccion.setDireccionExacta("2 Calle 10-30 Zona 18, Ciudad de Guatemala");
        System.out.println("Nombre del cliente: " + direccion.getNombreCliente());
        System.out.println("Edad del cliente: " + direccion.getEdadCliente());
        System.out.println("Departamento: " + direccion.getDepartamento());
        System.out.println("Dirección exacta: " + direccion.getDireccionExacta());

        // esto daria error
        direccion.setEdadCliente(15);
        direccion.setDepartamento("No existe");
        direccion.setDireccionExacta("Calle 1");
    }

}