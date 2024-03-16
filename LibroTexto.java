class LibroTexto extends Libro {
    private String cursoAsociado;

    public LibroTexto(String titulo, String autor, String cursoAsociado) {
        super(titulo, autor);
        this.cursoAsociado = cursoAsociado;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Curso: " + cursoAsociado);
    }
}