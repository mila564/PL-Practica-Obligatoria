package especificacion;

import java.util.List;

public class ExpConParentesis extends ExpBasico{
    private List<Exp> listaExp;

    public ExpConParentesis(List<Exp> listaExp) {
        this.listaExp = listaExp;
    }

    public List<Exp> getListaExp() {
        return listaExp;
    }

    public void setListaExp(List<Exp> listaExp) {
        this.listaExp = listaExp;
    }

    @Override
    public String toString() {
        String lista = "(";
        for (Exp e: this.getListaExp()){
            lista += e.toString();
        }
        lista += ")";
        return lista;
    }
}
