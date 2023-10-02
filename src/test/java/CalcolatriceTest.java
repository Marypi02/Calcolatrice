public class CalcolatriceTest {

    Calcolatrice calcolatrice;

    public final void setUp(){
        calcolatrice = new Calcolatrice();
    }

    public void TestSomma(){
        System.out.println("somma corretta" + calcolatrice.somma(11, 1)+ "12?");
    }

    public void TestMoltiplicazione(){
        System.out.println("moltiplicazione corretta" +calcolatrice.moltiplicazione(10, 2)+ "20?");
    }
}
