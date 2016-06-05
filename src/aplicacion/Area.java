package aplicacion;


public class Area {
    private int codArea;
    private String nomArea;
    private String telArea;
    private int cantEmp;
  
   
    public Area() {
    }

    public Area(int codArea, String nomArea, String telArea, int cantEmp, String edificio, int nivel) {
        this.codArea = codArea;
        this.nomArea = nomArea;
        this.telArea = telArea;
        this.cantEmp = cantEmp;
      
        
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }

    public String getTelArea() {
        return telArea;
    }

    public void setTelArea(String telArea) {
        this.telArea = telArea;
    }

    public int getCantEmp() {
        return cantEmp;
    }

    public void setCantEmp(int cantEmp) {
        this.cantEmp = cantEmp;
    }

   
  
    
}
