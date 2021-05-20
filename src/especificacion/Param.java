package especificacion;

public class Param {
    private PalabraReservada type;
    private Identificador id;

    public Param(PalabraReservada type, Identificador id) {
        this.type = type;
        this.id = id;
    }

    public PalabraReservada getType() {
        return type;
    }

    public void setType(PalabraReservada type) {
        this.type = type;
    }

    public Identificador getId() {
        return id;
    }

    public void setId(Identificador id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String linea = "";
        linea += this.getType().toString() + " " + this.getId().toString();
        return linea;
    }
}
