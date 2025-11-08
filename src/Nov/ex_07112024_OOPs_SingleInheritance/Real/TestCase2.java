package Nov.ex_07112024_OOPs_SingleInheritance.Real;

public class TestCase2 extends Common_BaseTest{
    TestCase2(){
        System.out.println("DC - Child");
    }

    void testcasse2(){
        startBrowser();
        System.out.println("TC2 executing");
        closeBrowser();
        readExcelFile();
    }
}
