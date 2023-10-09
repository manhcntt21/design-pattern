/**
 * @author manhdt14
 * created in 1/26/2023 6:54 PM
 */
public class HouseDirector {
    public static void main(String[] args) {
        HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
        House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(woodHouse);
    }
}
