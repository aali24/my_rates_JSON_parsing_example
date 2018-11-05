import org.json.simple.JSONObject;

public class RatesParser {

    JSONObject rates;

    public RatesParser(String filePath){
        RatesFileReader ratesFile = new RatesFileReader(filePath);
        rates = ratesFile.getFullJSONFile();
    }

    private Object getJSONValue(String key){ return  rates.get(key); }

    public String getJSONSuccess(){ return getJSONValue("success").toString(); }

    public int getTimestamp(){ return getJSONValue("timestamp").hashCode(); }

    public String getBase(){ return getJSONValue("base").toString(); }

    public String getDate(){ return getJSONValue("date").toString(); }

    private JSONObject getRatesJSONObject(){
        return (JSONObject) rates.get("rates") ;
    }

    public float getRate(String rateKey){
        return (Float) getRatesJSONObject().get(rateKey);
    }

}


