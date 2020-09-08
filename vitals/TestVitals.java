package vitals;

public class TestVitals implements Alerts{

    boolean vitalsAreOk(float bpm, float spo2, float respRate) {
    	boolean bmpOk = isBpmOk(bpm);
    	boolean spo2Ok = isSpo2Ok(spo2);
    	boolean respRateOk = isRespRateOk(respRate);
    	return bmpOk && spo2Ok && respRateOk;
    }
	
    boolean isBpmOk(float bpm)
    {
    	if (bpm < 70 || bpm > 150)
    	{
    		alertVital("BPM", bpm);
    		return false;
    	}
        return true;  
    }

    boolean isSpo2Ok(float spo2)
    {
    	if (spo2 < 90)
    	{
    		alertVital("SPO2", spo2);
    		return false;
    	}
        return true;
    }

    boolean isRespRateOk(float respRate)
    {
    	if (respRate < 30 || respRate > 95)
    	{
    		alertVital("Respiratory Rate", respRate);
    		return false;
    	}
        return true; 
    }
    
	@Override
	public void alertVital(String vital, float val) {
		System.out.println(vital+ ": " +val);
	}	
}
