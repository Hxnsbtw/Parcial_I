public class Prueba {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Java for Beginners", "John Doe");
        libro1.setPropietario("Hans Alberto Mera");
        libro1.setPrecio(20000);
        libro1.mostrarInformacion();

        System.out.println();

        LibroTexto libro2 = new LibroTexto("Mathematics for High School", "Jane Smith", "Ing. Sistemas");
        libro2.setPropietario("Hans Alberto Mera");
        libro2.setPrecio(109100);
        libro2.mostrarInformacion();

        System.out.println();

        LibroTextoUniajc libro3 = new LibroTextoUniajc("Programming Fundamentals", "Alice Johnson", "Ing. Industrial", "Engenieria");
        libro3.setPropietario("Hans Alberto Mera");
        libro3.setPrecio(506200);
        libro3.mostrarInformacion();

        System.out.println();

        Novela libro4 = new Novela("The Great Gatsby", "F. Scott Fitzgerald", "Romantica");
        libro4.setPropietario("Hans Alberto Mera");
        libro4.setPrecio(300100);
        libro4.mostrarInformacion();
    }
}