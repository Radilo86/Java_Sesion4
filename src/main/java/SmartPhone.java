public class SmartPhone extends SmartDevice{
    // atributo
    String companya;

    // Constructor heredando atributos de SmartDevice y el propio de SmartPhone
    public SmartPhone(String pantalla, Boolean conexionSatelite, int precio, String companya) {
        super(pantalla, conexionSatelite, precio);
        this.companya = companya;
    }
    // Constructor vacio
    public SmartPhone() {
    }
    // Metodos Getter & Setter
    public String getCompanya() {
        return companya;
    }

    public void setCompanya(String companya) {
        this.companya = companya;
    }
    // Metodo ToString
    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla='" + pantalla + '\'' +
                ", conexionSatelite=" + conexionSatelite +
                ", precio=" + precio +
                ", companya='" + companya + '\'' +
                '}';
    }
}
