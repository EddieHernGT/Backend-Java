package practicaMona;

public class Hulatocat extends Mona{
    public Hulatocat(){
        setId(137);
        setNombre("Surftocat");
        setCreador("Haley Carroll");
    }

    @Override
    public String seDivierte(){
        return "Empieza a tocar el hula";
    }
}
