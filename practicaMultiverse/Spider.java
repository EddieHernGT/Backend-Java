import java.awt.*;

public class Spider implements SpiderPowers {
    int tierra;
    String name,identity,description;
    public  Spider(){
        this.tierra=616;
        this.name="Spider-man";
        this.identity="Peter Parker";
        this.description="This is the Spider-man from the original universe";
    }

    @Override
    public void costume(Screen screen) {
        screen.cls();
        screen.repaint();
        screen.showImage("spider.jpg");
        screen.setBounds(0,0,500,400);
    }

    @Override
    public void webShoot(Screen screen) {
        screen.out("*Is able to shoot a web\n");
    }

    @Override
    public void superStrength(Screen screen) {
        screen.out("*Is able to stop a moving truck\n");
    }

    @Override
    public void spiderSense(Screen screen) {
        screen.out("*Is able to feel the danger\n");
    }

    public String getName() { return name; }

    public String getIdentity() { return identity; }

    public String getDescription() { return description; }

    public boolean setTierra(int tierra){
        if(tierra>=0){
            this.tierra=tierra;
            return true;
        }
        return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name=name;
            return true;
        }
        return false;
    }

    public boolean setIdentity(String identity){
        if(!identity.isEmpty()){
            this.identity=identity;
            return true;
        }
        return false;
    }

    public boolean setDescription(String description){
        if (!description.isEmpty()){
            this.description=description;
            return true;
        }
        return false;
    }

    public void getSpiderDescription(Screen screen){
        screen.out( "\n"+getName() + "\n" + "Identity: " + getIdentity() + "\n" +
                getDescription() +  "\n" + "Powers:" + "\n", "Arial",14, Color.black);
        this.webShoot(screen);
        this.superStrength(screen);
        this.spiderSense(screen);
    }
}
