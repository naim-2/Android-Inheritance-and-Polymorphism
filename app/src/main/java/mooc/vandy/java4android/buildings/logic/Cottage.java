package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
       extends House {

    // TODO - Put your code here.
    private boolean mSecondFloor;


    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
        mSecondFloor = false;
    }

    //set parameter of second floor
    public Cottage(int dimension, int lotLength, int lotWidth, String owner,boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);
        this.mSecondFloor = secondFloor;
    }

    //return if it has second floor
    public boolean hasSecondFloor() {
        return mSecondFloor;
    }

    //output statements
    @Override
    public String toString() {
        String result = "Owner: ";
        if (super.getOwner() != null)
            result += getOwner();
        else
            result += "n/a";
        if (super.hasPool())
            result += "; has a pool";
        if(this.calcLotArea() > this.calcBuildingArea())
            result += "; has a big open space";
        if (this.hasSecondFloor())
            result += "; is a two story cottage";
        else
            result += "; is a cottage";
        return result;
    }
}

