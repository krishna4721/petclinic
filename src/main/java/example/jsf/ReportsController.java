package example.jsf;

import org.springframework.samples.petclinic.dao.Clinic;
import org.springframework.samples.petclinic.dao.ClinicReporting;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

/**
 * @Author Paul Bakker - paul.bakker@luminis.eu
 */
@Named
@RequestScoped
public class ReportsController {
    @Inject
    ClinicReporting clinicReporting;
    
    public int getVisits() {
        return clinicReporting.countVisitsAtDate(new Date());
    }
}
