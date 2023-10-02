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

    public void TestSottrazione(){
        System.out.println("sottrazione corretta" + calcolatrice.sottrazione(5, 3)+ "==2");
    }

    public void TestDivisione(){
        System.out.println("divisione corretta" + calcolatrice.divisione(10, 2)+ "==5");
    }

    public void TestDivisionePerZero(){
        System.out.println("divisione corretta" + calcolatrice.divisione(10, 0)+ "==0");
    }
}
