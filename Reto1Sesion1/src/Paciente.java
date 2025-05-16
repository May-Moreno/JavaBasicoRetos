public class Paciente {
        // Atributos
        private String nombre;
        private int edad;
        private String numeroExpediente;

        // Métodos setters
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNumeroExpediente(String numeroExpediente) {
            this.numeroExpediente = numeroExpediente;
        }

        // Método para mostrar la información del paciente
        public void mostrarInformacion() {
            System.out.println("Paciente: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Expediente: " + numeroExpediente);
        }

}
