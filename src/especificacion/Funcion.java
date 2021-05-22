package especificacion;

import java.util.List;

public class Funcion extends Part{
    private PalabraReservada tipoDevuelto;

    public Funcion(PalabraReservada tipoDevuelto){
        super();
        this.tipoDevuelto = tipoDevuelto;
    }
    public Funcion(PalabraReservada tipoDevuelto, Identificador identificador, List<Param> listParam, Blq cuerpo) {
        super(identificador, listParam, cuerpo);
        this.tipoDevuelto = tipoDevuelto;
    }

    public PalabraReservada getTipoDevuelto() {
        return tipoDevuelto;
    }

    public void setTipoDevuelto(PalabraReservada tipoDevuelto) {
        this.tipoDevuelto = tipoDevuelto;
    }

    @Override
    public String toString() {
        String linea = "<HR/>";
        linea += "<A NAME=\""+getIdentificador().getTexto()+"\">";
        linea += "<SPAN CLASS=\"palres\">funcion</SPAN>";
        linea += " ";
        linea += tipoDevuelto.toString();
        linea += " ";
        linea += identificador.toString();
        linea += " ";
        linea += "(";
        List<Param> sublista = this.getListParam();
        if (sublista.size() != 0){
            sublista = this.getListParam().subList(0, this.getListParam().size() - 1);
            for (Param param: sublista) {
                linea += param.toString();
                linea += ", ";
            }
            linea += getListParam().get(getListParam().size()-1).toString();
        }
        linea += ")";
        linea += "</A>";
        linea += "<BR>";
        linea += this.getCuerpo().toString();
        linea += "<A HREF=\"#" + this.getIdentificador().getTexto() + "\">Inicio de rutina</A>";
        linea += "<BR>";
        linea += "<A HREF=\"#inicio\">Inicio de programa</A>";
        linea += "<BR>";
        return linea;
    }
    public String getCabecera(){
        String cabecera ="";
        cabecera += this.getTipoDevuelto();
        cabecera += " ";
        cabecera += this.getIdentificador() + " ";
        cabecera += "(";
        List<Param> sublista = this.getListParam();
        if (sublista.size() != 0){
            sublista = this.getListParam().subList(0, this.getListParam().size() - 1);
            for (Param param: sublista) {
                cabecera += param.toString();
                cabecera += ", ";
            }
            cabecera += getListParam().get(getListParam().size()-1).toString();
        }
        cabecera += ")";
        return cabecera;
    }
}
