package practicaMona;

public class AdventureCat extends Mona{
    public AdventureCat(){
        setId(68);
        setNombre("Adventure Cat");
        setCreador("Jon Rohan");
    }

    @Override
    public String seDivierte(){
        return "Adventure time!!";
    }
}
