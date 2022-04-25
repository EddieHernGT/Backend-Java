public class SuperiorSpiderMan extends Spider implements SuperiorPowers{
    public SuperiorSpiderMan(){
        setTierra(616);
        setName("Spider-Man");
        setIdentity("Otto Gunther Octavius");
        setDescription(" Otto Octavius has implanted his mind into Peter's body, determined to " +
                "prove himself the \"Superior\" Spider-Man by being both a better superhero and " +
                "person than Parker ever could be. ");
    }

    @Override
    public void costume(Screen screen){
        screen.cls();
        screen.repaint();
        screen.showImage("superior.jpg");
        screen.setBounds(0,0,1000,600);
    }

    @Override
    public void talons(Screen screen) {
        screen.out("Retractable talons on his hands and feet of the suit for combative purposes.");
    }

    @Override
    public void waldoes(Screen screen) {
        screen.out("Four mechanical spider-arms to the back of the costume to increase his combative capabilities.");
    }
}
