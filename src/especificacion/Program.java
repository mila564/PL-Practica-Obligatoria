package especificacion;

import java.util.List;

public class Program {
    private List<Part> subprogramas;
    private String nombrePrograma;

    public Program(List<Part> subprogramas, String nombrePrograma) {
        this.subprogramas = subprogramas;
        this.nombrePrograma = nombrePrograma;
    }

    public List<Part> getSubprogramas() {
        return subprogramas;
    }

    public void setSubprogramas(List<Part> subprogramas) {
        this.subprogramas = subprogramas;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }

    @Override
    public String toString() {
        String lista = "";
        lista += "<!DOCTYPE html>";
        lista += "<html>";
        lista += "<head>";
        lista += "<title>" + this.getNombrePrograma() + "</title>";
        lista += "<style>";
        lista += ".cte {color:rgb(19,189,72);}";
        lista += ".ident {color:rgb(55, 40, 244);}";
        lista += ".palres {color:rgb(0, 0, 0); font-weight: bold;}";
        lista += "</style>";
        lista += "</head>";
        lista += "<body>";
        lista += "<a name= \"inicio\">";
        lista += "<h1>Programa: " + this.getNombrePrograma() + "</h1>";
        lista += "<h2>Funciones y procedimientos</h2>";
        lista += "</a>";
        lista += "<ul>";
        for(Part p: this.getSubprogramas()){
            lista += "<li><a href=\"#" + p.getIdentificador().getTexto() + "\">";
            lista += p.getCabecera();
            lista += "</li>";
        }
        lista += "</ul>";
        for (Part p : this.getSubprogramas()){
            lista += p.toString();
        }
        lista += "</body>";
        lista += "</html>";
        return lista;
    }
}
