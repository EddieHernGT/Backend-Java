public class SpiderVerse{
    public static void main(String[] args) {
        Screen s = new Screen();
        Dialog d = new Dialog();
        SpiderManMiles milles = new SpiderManMiles();
        SuperiorSpiderMan superior = new SuperiorSpiderMan();
        SpDr spdr = new SpDr();
        s.setVisible(true);
        do {
            milles.costume(s);
            milles.getSpiderDescription(s);
            milles.spiderCamouflage(s);
            milles.venomBlasts(s);
        }while (d.confirm("Next practicaMultiverse.Spider-friend?", "Next") == 1);
        do {
            superior.costume(s);
            superior.getSpiderDescription(s);
            superior.talons(s);
            superior.waldoes(s);
        } while (d.confirm("Next practicaMultiverse.Spider-friend?", "Next") == 1);
        do {
            spdr.costume(s);
            spdr.getSpiderDescription(s);
            spdr.geneticBound(s);
        } while (d.confirm("This is the las practicaMultiverse.Spider-friend, do you want to go?", "Exit") == 1);
        s.setVisible(false);
    }

}

