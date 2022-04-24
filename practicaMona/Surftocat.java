package practicaMona;

public class Surftocat extends Mona{
    public Surftocat(){
        setId(138);
        setNombre("Surftocat");
        setCreador("James Kang");
    }

    @Override
    public String seDivierte(){
        return "Empieza a surfear";
    }
}
