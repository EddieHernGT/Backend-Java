package practicaMona;

public class YogiCat extends Mona{
    public YogiCat(int id, String creador){
        setId(id);
        setNombre("YogiCat");
        setCreador("Joao Ribeiro");
    }

    @Override
    public String seDivierte(){
        return "Empieza a meditar";
    }
}
