package especificacion;

import java.util.LinkedList;
import java.util.List;

public class DeclaracionVariable extends Sent{
    private PalabraReservada type;
    private List<Identificador> lid;

    public DeclaracionVariable(PalabraReservada type, List<Identificador> lid) {
        this.type = type;
        this.lid = lid;
    }

    public PalabraReservada getType() {
        return type;
    }

    public void setType(PalabraReservada type) {
        this.type = type;
    }

    public List<Identificador> getLid() {
        return lid;
    }

    public void setLid(List<Identificador> lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        String lista = "";
        if (lid.size() > 1) {
            List<Identificador> sublista = lid.subList(0, lid.size() - 1);
            for (Identificador id: sublista){
                lista += id.toString() + ", ";
            }
        }
        lista += lid.get(lid.size() - 1).toString();

        return "<DIV STYLE=\"text-indent: 0.5cm>" + type.toString() + " " + lista + ";</DIV>";
    }
}
