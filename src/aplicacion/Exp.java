package aplicacion;


public class Exp {
    private int codEmp;
    private String nomEmp;
    private String apeEmp;
    private int edadEmp;
    private String direEmp;
    private String telEmp;
    private String generoEmp;
    private String nivelEmp;
    private String interesesEmp;
    private double salarioEmp;
    private String clase;
    private String area;

    public Exp() {
        
    }

    public Exp(int codEmp, String nomEmp, String apeEmp, int edadEmp, String direEmp, String telEmp, String generoEmp, String nivelEmp, String interesesEmp, double salarioEmp, String area) {
        this.codEmp = codEmp;
        this.nomEmp = nomEmp;
        this.apeEmp = apeEmp;
        this.edadEmp = edadEmp;
        this.direEmp = direEmp;
        this.telEmp = telEmp;
        this.generoEmp = generoEmp;
       
        this.interesesEmp = interesesEmp;
       
       
    }

    public int getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(int codEmp) {
        this.codEmp = codEmp;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    public String getApeEmp() {
        return apeEmp;
    }

    public void setApeEmp(String apeEmp) {
        this.apeEmp = apeEmp;
    }

    public int getEdadEmp() {
        return edadEmp;
    }

    public void setEdadEmp(int edadEmp) {
        this.edadEmp = edadEmp;
    }

    public String getDireEmp() {
        return direEmp;
    }

    public void setDireEmp(String direEmp) {
        this.direEmp = direEmp;
    }

    public String getTelEmp() {
        return telEmp;
    }

    public void setTelEmp(String telEmp) {
        this.telEmp = telEmp;
    }

    public String getGeneroEmp() {
        return generoEmp;
    }

    public void setGeneroEmp(String generoEmp) {
        this.generoEmp = generoEmp;
    }

    public String getNivelEmp() {
        return nivelEmp;
    }

    public void setNivelEmp(String nivelEmp) {
        this.nivelEmp = nivelEmp;
    }

    public String getInteresesEmp() {
        return interesesEmp;
    }

    public void setInteresesEmp(String interesesEmp) {
        this.interesesEmp = interesesEmp;
    }

    public double getSalarioEmp() {
        return salarioEmp;
    }

    public void setSalarioEmp(double salarioEmp) {
        this.salarioEmp = salarioEmp;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
