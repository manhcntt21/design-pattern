import components.impl.HouseType;

/**
 * @author manhdt14
 * created in 1/26/2023 6:47 PM
 */
public abstract class HouseBuilder {
    String builderName;
    House house = new House();
    HouseType houseType;

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
        house.setHouseType(houseType);
    }

    public abstract HouseBuilder addWalls();
    public abstract HouseBuilder addRoof();
    public abstract HouseBuilder addWindows();

    public House build() {
        System.out.println("Build the house!");
        // Very simple build -- just return the house!
        // We've added all the parts...
        // In a real build, we'd have to nail and screw everything together of course.
        // And add wiring and so on.
        return house;
    }
}
