package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    ArrayList<Lab> labs = new ArrayList<>();
    String labName;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {

    }

    public Lab getLab(String labName) {
        Lab labfinder = null;
        for (Lab lab : labs) {
            if (lab.getName() == labName) {
                labfinder = lab;
            }

        }
        return labfinder;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (this.getLab(labName) == null) {
            throw new UnsupportedOperationException();
        }
        getLab(labName).labStatus = labStatus;
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(lab);

    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).labStatus;
    }

    @Override
    public String toString() {
        String status = "";

        for (int i = this.labs.size()-1; i <= 0; i--){
            status += labs.get(i).labname + " > " + labs.get(i).labStatus+"\n";
        }
        return status;
    }
}


