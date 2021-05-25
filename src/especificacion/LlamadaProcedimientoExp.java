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
        if (this.getIdentificadores().size() == 1) {
            lista += "<A HREF=\"#" + this.getIdentificadores().get(0).getTexto() + "\">" + this.getIdentificadores().get(0).getTexto() + "</A>";
        }
        else if (this.getIdentificadores().size() == 2) {
            lista += "<A HREF=\"#" + this.getIdentificadores().get(0).getTexto() + "\">" + this.getIdentificadores().get(0).getTexto() + "</A>";
            lista += '(';
            lista += "<A HREF=\"#" + this.getIdentificadores().get(1).getTexto() + "\">" + this.getIdentificadores().get(1).getTexto() + "</A>";
            lista += ')';
        }
        else {
            lista += "<A HREF=\"#" + this.getIdentificadores().get(0).getTexto() + "\">" + this.getIdentificadores().get(0).getTexto() + "</A>";
            lista += '(';
            for (Identificador id : this.getIdentificadores().subList(1, this.getIdentificadores().size() - 1)) {
                lista += "<A HREF=\"#" + id.getTexto() + "\">" + id.getTexto() + "</A>" + ",";
            }
            lista += "<A HREF=\"#" + this.getIdentificadores().get(this.getIdentificadores().size() - 1).getTexto() + "\">" + this.getIdentificadores().get(this.getIdentificadores().size() - 1).getTexto() + "</A>";
            lista += ')';
        }
        return lista;
    }
}
