package Nov.ex_07112024_OOPs_SingleInheritance.Real;

public class TestCase1 extends Common_BaseTest{
    TestCase1 (){
        System.out.println("DC - Child");
    }

    void testcasse(){
        startBrowser();
        closeBrowser();
        readExcelFile();
    }
}
