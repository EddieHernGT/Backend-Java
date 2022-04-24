package practicaMona;

public class Mona {
    int id=0;
    String nombre="", creador="";
    public Mona(){
        this.id=1;
        this.nombre="Original";
        this.creador="Simon";
    }
    public String seDivierte(){
        return "Empieza a nadar";
    }

    public int getId() {return id;}

    public String getNombre() {return nombre;}

    public String getCreador() {return creador;}


    public boolean setId(int id){
        if(id>0){
            this.id=id;
            return true;
        }
        return false;
    }
    public  boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }
        return false;
    }
    public  boolean setCreador(String creador){
        if(!creador.isEmpty()){
            this.creador=creador;
            return true;
        }
        return false;
    }

    public void aTexto() {
        System.out.println(
                "id=#" + id +
                " nombre=" + nombre + '\n' +
                " creador=" + creador + '\n' +
                        seDivierte() +'\n'+
                        "*******************************");
    }
}
