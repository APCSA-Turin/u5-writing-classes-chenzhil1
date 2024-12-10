package U5T7_StaticMethods4;

public class Clinic {
    private static int clinicAmount = 0;
    private static int totalVaccine = 0;
    private int vaccines;
    private Person mostRecently;

    public Clinic() {
        clinicAmount ++;
    }
    public static int getTotalClinics() {
        return clinicAmount;
    }

    public static int getTotalVaccineCount() {
        return totalVaccine;
    }

    public int getClinicVaccineCount() {
        return vaccines;
    }

    public Person mostRecentlyVaccinated() {
        return mostRecently;
    }

    public boolean vaccinate(Person person) {
        if(!person.isVaccinated()) {
            person.updateStatus();
            mostRecently = person;
            totalVaccine ++;
            vaccines ++;
            return true;
        }
        return false;
    } 


}
