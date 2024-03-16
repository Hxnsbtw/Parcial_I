class LibroTextoUniajc extends LibroTexto {
    private String facultad;

    public LibroTextoUniajc(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Facultad: " + facultad);
    }
}