package modelos;
public class Usuarios {
    private String nombre;
    private String apellido;
    private String usuario;
    private int password;
    private String roll;
    
    
    public Usuarios(){}
        
    
    public Usuarios(String nombre, String apellido, String usuario, int password, String roll
    ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.roll = roll;
    }

   
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario(){
        return this.usuario;
    }
    public void setPassword(int password){
        this.password = password;
    }
    public int getPassword(){
        return this.password;
    } 
    public void setRoll(String roll){
        this.roll = roll;
    }
    public String getRoll(){
        return this.roll;
    }  
}