package especificacion;

import java.util.LinkedList;
import java.util.List;

public class LlamadaProcedimientoSent extends Sent{
    private LinkedList<Identificador> identificadores;

    public LlamadaProcedimientoSent(LinkedList<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

    public LinkedList<Identificador> getIdentificadores() {
        return identificadores;
    }

    public void setIdentificadores(LinkedList<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

    @Override
    public String toString() {
        String lista = "";
        lista = this.getIdentificadores().get(0).toString();
        lista += '(';
        List<Identificador> sublista = this.getIdentificadores().subList(1, this.getIdentificadores().size());
        for (Identificador id : sublista){
            lista = id.toString() + ",";
        }
        lista += ')';
        return "<DIV>" + lista + ";</DIV>";
    }
}
