public class SpiderManMiles extends Spider implements MilesPowers{
    public SpiderManMiles(){
        setTierra(1610);
        setName("practicaMultiverse.Spider-Man");
        setIdentity("Miles Gonzalo Morales");
        setDescription("Miles Morales first appeared in Ultimate Comics: Fallout #4, which was" +
                " published in August 2011, in which he foils an assault by Kangaroo a short time after " +
                "Peter Parker's death. He wears a practicaMultiverse.Spider-Man costume similar " +
                "to Parker's, but considers changing it when spectators tell him it is in \"bad taste\".");
    }

    @Override
    public void costume(Screen screen){
        screen.cls();
        screen.repaint();
        screen.showImage("./milles.jpg");
        screen.setBounds(0,0,520,700);
    }

    @Override
    public void venomBlasts(Screen screen) {
        screen.out("*Is able to generate and manipulate a form of bio-electricity that his body produces\n");
    }

    @Override
    public void spiderCamouflage(Screen screen) {
        screen.out("*Can blend into his surroundings, allowing him to sneak up on his enemies or, in some cases, flee from them.\n");
    }
}
