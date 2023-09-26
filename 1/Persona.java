public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    public Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(numero);
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public setApellido(String apellido){
        this.apellido = apellido;
    }
    public String toString(){
        return "id: "+id+" nombre: "+nombre+" apellido: "+apellido;
    }
}