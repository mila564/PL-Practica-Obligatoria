package especificacion;

import java.util.List;

public class LlamadaProcedimientoExp extends ExpBasico{
    private List<Identificador> identificadores;

    public LlamadaProcedimientoExp(List<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

    public List<Identificador> getIdentificadores() {
        return identificadores;
    }

    public void setIdentificadores(List<Identificador> identificadores) {
        this.identificadores = identificadores;
    }

    @Override
    public String toString() {
        String lista = "";
        lista = this.getIdentificadores().get(0).toString();
        if (this.getIdentificadores().size() > 1){
            lista += '(';
            List<Identificador> sublista = this.getIdentificadores().subList(1, this.getIdentificadores().size());
            for (Identificador id : sublista){
                lista = id.toString() + ",";
            }
            lista += ')';
        }
        return lista;
    }
}
