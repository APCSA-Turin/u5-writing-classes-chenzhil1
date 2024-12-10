package U5T7_StaticMethods4;

public class Test {
    public static void main(String[] args) {
        System.out.println("1. No Clinics set up yet:");
        System.out.println("Total clinics setup: " + Clinic.getTotalClinics());
        System.out.println("Total vaccines given out: " + Clinic.getTotalVaccineCount());
        
        System.out.println("\n2. Set up two Clinics:");
        Clinic queens = new Clinic();
        Clinic bronx = new Clinic();
        System.out.println("Clinic in Queens has vaccinated: " + queens.getClinicVaccineCount());
        System.out.println("Clinic in Bronx has vaccinated: " + bronx.getClinicVaccineCount());
        System.out.println("Total clinics setup: " + Clinic.getTotalClinics());
        System.out.println("Total vaccines given out: " + Clinic.getTotalVaccineCount());
        
        System.out.println("\n3. Making some Person objects...");
        Person mary = new Person("Mary");
        Person bob = new Person("Bob");
        Person chris = new Person("Chris");
        Person charles = new Person("Charles");
        Person julie = new Person("Julie");
        Person bill = new Person("Bill");
        Person sam = new Person("Sam");
        Person angela = new Person("Angela");

        System.out.println("\n4. All Persons are currently unvaccinated:");
        System.out.println(mary.getName() + ": " + mary.isVaccinated());
        System.out.println(bob.getName() + ": " + bob.isVaccinated());
        System.out.println(charles.getName() + ": " + charles.isVaccinated());
        System.out.println(julie.getName() + ": " + julie.isVaccinated());
        System.out.println(chris.getName() + ": " + chris.isVaccinated());
        System.out.println(bill.getName() + ": " + bill.isVaccinated());
        System.out.println(sam.getName() + ": " + sam.isVaccinated());
        System.out.println(angela.getName() + ": " + angela.isVaccinated());

        System.out.println("\n5. Mary, Bob, and Chris get vaccinated");
        System.out.println("at the Queens clinic, all successful:");
        System.out.println(queens.vaccinate(mary));
        System.out.println(queens.vaccinate(bob));
        System.out.println(queens.vaccinate(chris));

        System.out.println("\n6. CLINIC STATS SO FAR");
        System.out.println("Clinic in Queens has vaccinated: " + queens.getClinicVaccineCount());
        System.out.println("Clinic in Queens most RECENTLY vaccinated: " + queens.mostRecentlyVaccinated().getName());
        System.out.println("Clinic in Bronx has vaccinated: " + bronx.getClinicVaccineCount());
        System.out.println("Total clinics setup: " + Clinic.getTotalClinics());
        System.out.println("Total vaccines given out: " + Clinic.getTotalVaccineCount());

        System.out.println("\n7. Charles, Julie, Sam, and Angela get vaccinated");
        System.out.println("at the Bronx clinic, all successful:");
        System.out.println(bronx.vaccinate(charles));
        System.out.println(bronx.vaccinate(julie));
        System.out.println(bronx.vaccinate(sam));
        System.out.println(bronx.vaccinate(angela));

        System.out.println("\n8. CLINIC STATS SO FAR");
        System.out.println("Clinic in Queens has vaccinated: " + queens.getClinicVaccineCount());
        System.out.println("Clinic in Queens most RECENTLY vaccinated: " + queens.mostRecentlyVaccinated().getName());
        System.out.println("Clinic in Bronx has vaccinated: " + bronx.getClinicVaccineCount());
        System.out.println("Clinic in Bronx most RECENTLY vaccinated: " + bronx.mostRecentlyVaccinated().getName());
        System.out.println("Total clinics setup: " + Clinic.getTotalClinics());
        System.out.println("Total vaccines given out: " + Clinic.getTotalVaccineCount());

        System.out.println("\n9. All Persons EXCEPT Bill are vaccinated:");
        System.out.println(mary.getName() + ": " + mary.isVaccinated());
        System.out.println(bob.getName() + ": " + bob.isVaccinated());
        System.out.println(charles.getName() + ": " + charles.isVaccinated());
        System.out.println(julie.getName() + ": " + julie.isVaccinated());
        System.out.println(chris.getName() + ": " + chris.isVaccinated());
        System.out.println(bill.getName() + ": " + bill.isVaccinated() + " <---");
        System.out.println(sam.getName() + ": " + sam.isVaccinated());
        System.out.println(angela.getName() + ": " + angela.isVaccinated());

        System.out.println("\n10. Julie forgets she was already vaccinated");
        System.out.println("and tries to get a vaccine at Bronx clinic;");
        System.out.println("it is unsuccessful:");
        System.out.println(bronx.vaccinate(julie));

        System.out.println("\n11. Because Julie's second vaccine was");
        System.out.println("unsuccessful, vaccine stats are unchanged:");
        System.out.println("Clinic in Bronx has vaccinated: " + bronx.getClinicVaccineCount());
        System.out.println("Clinic in Bronx most RECENTLY vaccinated: " + bronx.mostRecentlyVaccinated().getName());
        System.out.println("Total vaccines given out: " + Clinic.getTotalVaccineCount());


        System.out.println("\n12. Bill successfully gets vaccinated at the Bronx clinic:");
        System.out.println(bronx.vaccinate(bill));

        System.out.println("\n13. CLINIC STATS SO FAR");
        System.out.println("Clinic in Queens has vaccinated: " + queens.getClinicVaccineCount());
        System.out.println("Clinic in Queens most RECENTLY vaccinated: " + queens.mostRecentlyVaccinated().getName());
        System.out.println("Clinic in Bronx has vaccinated: " + bronx.getClinicVaccineCount());
        System.out.println("Clinic in Bronx most RECENTLY vaccinated: " + bronx.mostRecentlyVaccinated().getName());
        System.out.println("Total clinics setup: " + Clinic.getTotalClinics());
        System.out.println("Total vaccines given out: " + Clinic.getTotalVaccineCount());

        System.out.println("\n14. Brooklyn clinic set, and two new Persons,");
        System.out.println("Jenna and Kirk, successfully get vaccinated there");
        Clinic brooklyn = new Clinic();
        Person jenna = new Person("Jenna");
        Person kirk = new Person("Kirk");
        brooklyn.vaccinate(jenna);
        brooklyn.vaccinate(kirk);

        System.out.println("\n15. ------ FINAL STATS ------");
        System.out.println("Clinic in Queens has vaccinated: " + queens.getClinicVaccineCount());
        System.out.println("Clinic in Queens most RECENTLY vaccinated: " + queens.mostRecentlyVaccinated().getName());
        System.out.println("Clinic in Bronx has vaccinated: " + bronx.getClinicVaccineCount());
        System.out.println("Clinic in Bronx most RECENTLY vaccinated: " + bronx.mostRecentlyVaccinated().getName());
        System.out.println("Clinic in Brooklyn has vaccinated: " + brooklyn.getClinicVaccineCount());
        System.out.println("Clinic in Brooklyn most RECENTLY vaccinated: " + brooklyn.mostRecentlyVaccinated().getName());
        System.out.println("Total clinics setup: " + Clinic.getTotalClinics());
        System.out.println("Total vaccines given out: " + Clinic.getTotalVaccineCount());
        
    }
}
