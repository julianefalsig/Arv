import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthCareApp {

    public static void main(String[] args) {
        HealthCarePerson healthCarePerson = new Nurse();
        healthCarePerson.setName("johnny");

        Doctor doc = new Doctor();
        doc.setName("Henning");

        HealthCarePerson nurse = new Nurse();
        // dette kan normalt ikke lade sig gøre, men nu kan det fordi vi har defineret nurse med en HealthCarePerson. De nedarver.
        nurse.setName("rachel");

        List<HealthCarePerson> hcps = new ArrayList<>();
        hcps.addAll(Arrays.asList(healthCarePerson, doc, nurse));

        for(int i=0; i< hcps.size(); i++){
            System.out.println(hcps.get(i).getName() + ", " + hcps.get(i).getClass());

        }

/*
        HealthCarePerson[] hcps = new HealthCarePerson[3];
        hcps[0] = doc;
        hcps[1] = nurse;

 */
    }
}
