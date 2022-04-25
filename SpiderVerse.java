public class SpiderVerse {
    public static void main(String[] args) {
        Screen s=new Screen();
        Dialog d=new Dialog();
        SpiderManMiles milles=new SpiderManMiles();
        SuperiorSpiderMan superior=new SuperiorSpiderMan();
        SpDr spdr=new SpDr();
        s.setVisible(true);
        milles.costume(s);
        milles.getSpiderDescription(s);
        milles.spiderCamouflage(s);
        milles.venomBlasts(s);
        if(d.confirm("Next Spiderfriend?","Next")==0) {
            superior.costume(s);
            superior.getSpiderDescription(s);
            superior.talons(s);
            superior.waldoes(s);
        }
        if(d.confirm("Next Spiderfriend?","Next")==0) {
            spdr.costume(s);
            spdr.getSpiderDescription(s);
            spdr.geneticBound(s);

        }
    }
}
