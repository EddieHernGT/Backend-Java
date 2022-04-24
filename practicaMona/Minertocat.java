package practicaMona;

public class Minertocat extends  Mona{
    public Minertocat(int id, String Nombre){
        setId(id);
        setNombre(Nombre);
        setCreador("James Kang");
    }

    @Override
    public String seDivierte(){
        return "Empieza a minar oro";
    }
}
