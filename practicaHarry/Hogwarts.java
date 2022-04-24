package practicaHarry;

public class Hogwarts {
    public static void main(String[] args) {
        NewtonScamander Newt=new NewtonScamander();
        GinevraWeasley Ginny=new GinevraWeasley();
        SiriusBlack Sirius=new SiriusBlack();
        ChoChag Cho=new ChoChag();
        HermioneJeanGranger Hermione=new HermioneJeanGranger();
        System.out.println(Newt.showMessage());
        System.out.println(Ginny.showMessage());
        System.out.println(Sirius.showMessage());
        System.out.println(Cho.showMessage());
        System.out.println(Hermione.showMessage());
    }
}
