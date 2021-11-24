package managementsystem;

public class databaseConnection {
    private String jpatientname;
    private String jaddress;
    private int jcno;
    private String jgender;
    private String jbg;
    private String jpatientill;
    private String jchdoc;
    
    public databaseConnection(String PatientName, String Address, int ContactNo, 
            String Gender, String BloodGroup, String PatientIllness, String ChooseDoctor)
            {
                this.jpatientname = PatientName;
                this.jaddress = Address;
                this.jcno = ContactNo;
                this.jgender = Gender;
                this.jbg = BloodGroup;
                this.jpatientill = PatientIllness;
                this.jchdoc = ChooseDoctor;
            }

    databaseConnection(String string, String string0, int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getPatientName()
    {
        return jpatientname;
    }
    public String getAddress()
    {
        return jaddress;
    }
    public int getContactNo()
    {
        return jcno;
    }
    public String getGender()
    {
        return jgender;
    }
    public String getBloodGroup()
    {
        return jbg;
    }
    public String getPatientIllness()
    {
        return jpatientill;
    }
    public String getChooseDoctor()
    {
        return jchdoc;
    }
}
