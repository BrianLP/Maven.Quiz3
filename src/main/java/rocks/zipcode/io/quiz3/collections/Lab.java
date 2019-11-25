package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labname;
    LabStatus labStatus;
    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.labname=labName;
        this.labStatus=LabStatus.INCOMPLETE;
    }

    public String getName() {
        return this.labname;
    }

    public void setStatus(LabStatus labStatus) {
        this.labStatus=labStatus;
    }

    public LabStatus getStatus() {
        return this.labStatus;
    }

}
