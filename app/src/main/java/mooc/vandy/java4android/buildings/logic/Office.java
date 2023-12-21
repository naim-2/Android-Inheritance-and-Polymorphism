package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
       extends Building {

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth){
        super(length, width, lotLength, lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
        mParkingSpaces = 0;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        this(length, width, lotLength, lotWidth, businessName);
        mBusinessName = null;
        mParkingSpaces = parkingSpaces;
    }

    //getters methods
    public String getBusinessName() {
        return mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public static int getTotalOffices() {
        return 10;
    }

    //setters methods
    public void setBusinessName(String businessName) {
        this.mBusinessName = businessName;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.mParkingSpaces = parkingSpaces;
    }

    @Override
    public String toString() {
        String result = "Business: ";
        if(this.getBusinessName()!= null) {
            result += mBusinessName;
        }else{
            result += "unoccupied";
        }
        if(this.getParkingSpaces()>0){
            result += "; has "+ mParkingSpaces + " parking spaces";
        }
        return result+" (total offices: " + sTotalOffices + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Office)) return false;
        Office office = (Office) o;
        return (getParkingSpaces() == office.getParkingSpaces()) && (calcBuildingArea() == office.calcBuildingArea());
    }
}
