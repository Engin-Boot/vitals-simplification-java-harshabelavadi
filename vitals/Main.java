package vitals;

public class Main {


    public static void main(String[] args) {
    	TestVitals testVitals = new TestVitals();
    	//testVitals.vitalsAreOk(190, 78, 50);
    	//testVitals.vitalsAreOk(160, 95, 23);
    	assert(testVitals.vitalsAreOk(100, 95, 70) == true); // All parameters are normal
    	assert(testVitals.vitalsAreOk(80, 96, 40) == true); // All parameters are normal
    	assert(testVitals.vitalsAreOk(50, 95, 70) == false); // BPM is Low
    	assert(testVitals.vitalsAreOk(100, 50, 70) == false); // SPO2 is Low
    	assert(testVitals.vitalsAreOk(100, 95, 25) == false); // RespiratoryRate is Low
    	assert(testVitals.vitalsAreOk(160, 95, 70) == false); // BPM is High
    	assert(testVitals.vitalsAreOk(100, 95, 125) == false); // RespiratoryRate is High
    	assert(testVitals.vitalsAreOk(160, 95, 170) == false); // BPM and RespiratoryRate are High
    	assert(testVitals.vitalsAreOk(20, 20, 70) == false); // BPM and SPO2 are Low
    	assert(testVitals.vitalsAreOk(20, 20, 25) == false); // BPM, SPO2 and RespiratoryRate are Low
    	assert(testVitals.vitalsAreOk(170, 20, 70) == false); // BPM is high and SPO2 is Low
    	assert(testVitals.vitalsAreOk(170, 20, 125) == false); // BPM is high, SPO2 is Low and RespiratoryRate is High
    	assert(testVitals.vitalsAreOk(170, 95, 125) == false); // BPM is high and RespiratoryRate is High
    	assert(testVitals.vitalsAreOk(100, 25, 125) == false); // SPO2 is Low and RespiratoryRate is High
    	assert(testVitals.vitalsAreOk(25, 20, 125) == false); // BPM is Low, SPO2 is Low and RespiratoryRate is High
    	assert(testVitals.vitalsAreOk(25, 95, 125) == false); // BPM is Low and RespiratoryRate is High
    	assert(testVitals.vitalsAreOk(170, 25, 25) == false); // BPM is High, SPO2 is Low and RespiratoryRate is Low
    	assert(testVitals.vitalsAreOk(170, 95, 25) == false); // BPM is High and RespiratoryRate is Low
    	assert(testVitals.vitalsAreOk(100, 25, 25) == false); // SPO2 and RespiratoryRate are Low        
        System.out.println("Testing Done!");
    }
}
