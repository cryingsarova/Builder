public class PoorHouseBuilder implements HouseBuilder{


    @Override
    public void buildBasement() {
        System.out.println("--------");
        System.out.println("  |    |");
        System.out.println("  ------");
    }

    @Override
    public void buildRoof() {
        System.out.println();
        System.out.println("  roof  ");
        System.out.println(" roooof ");
        System.out.println("roooooof");
    }

    @Override
    public void buildFloor(int number) {
        for(int i = 0; i< number; i++) {
            System.out.println("--------");
            System.out.println("|      |");
        }
    }

    @Override
    public void setStatyes(int number) {

    }
}
