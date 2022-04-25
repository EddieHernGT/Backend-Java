public class SpDr extends Spider implements SpDrPowers{
    public SpDr(){
        setTierra(15512);
        setName("SP//dr");
        setIdentity("Peni Parker");
        setDescription("Peni Parker is a soldier that protects New York City with the help " +
                "of her SP//dr Suit and the spider that bonds them.");
    }

    @Override
    public void costume(Screen screen){
        screen.cls();
        screen.repaint();
        screen.showImage("./spdr.jpg");
        screen.setBounds(0,0,1000,600);
    }

    @Override
    public void geneticBound(Screen screen) {
        screen.out("Shares a genetic bond with a radioactive spider that helps her operate a bionic armor");
    }
}
