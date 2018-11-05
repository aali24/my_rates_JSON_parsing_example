import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RatesTester {

    RatesFileReader testFileReader;
    RatesParser testRatesParser;

    @Before

    public void Setups(){
        JSONObject fullJSONFile = new JSONObject();
        testFileReader = new RatesFileReader("resources/rates.json");
    }

    @Test
    public void TestJSONFile(){
//        Assert.assertEquals();
    }

}
