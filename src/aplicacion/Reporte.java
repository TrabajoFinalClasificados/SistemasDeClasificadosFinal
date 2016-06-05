package aplicacion;


public class Reporte {
    private String fecha;
    private String nomEmp;
    private double totalVen;

    public Reporte() {
    }

    public Reporte(String fecha, String nomEmp, double totalVen) {
        this.fecha = fecha;
        this.nomEmp = nomEmp;
        this.totalVen = totalVen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public double getTotalVen() {
        return totalVen;
    }

    public void setTotalVen(double totalVen) {
        this.totalVen = totalVen;
    }
    
    
}
