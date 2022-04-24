package practicaHarry;

public class NewtonScamander {
    String casa="",genero="",nombre="",bogart="",patronus="";

    public NewtonScamander() {
        this.casa = "Hufflepuff";
        this.genero = "Masculino";
        this.nombre = "Newton Scamander";
        this.bogart = "Tener que trabajar en una oficina";
        this.patronus = "Puercoespin";
    }

    public String getCasa() {return casa;}

    public String getGenero() {return genero;}

    public String getNombre() {return nombre;}

    public String getBogart() {return bogart;}

    public String getPatronus() {return patronus;}

    public boolean setCasa( String casa) {
        if (!casa.isEmpty()){
            this.casa=casa;
            return true;
        }
        return false;
    }
    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero=genero;
            return true;
        }
        return false;
    }
    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }
        return false;
    }
    public boolean setBogart(String bogart){
        if (!bogart.isEmpty()){
            this.bogart=bogart;
            return true;
        }
        return false;
    }
    public boolean setPatronus(String patronus){
        if (!patronus.isEmpty()){
            this.patronus=patronus;
            return true;
        }
        return false;
    }

    public String showMessage() {
        return  " casa='" + casa  +
                "\n genero='" + genero +
                "\n nombre='" + nombre +
                "\n bogart='" + bogart  +
                "\n patronus='" + patronus + "\n" +
                "***************************";
    }
}
