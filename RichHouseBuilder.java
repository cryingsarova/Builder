public class RichHouseBuilder implements HouseBuilder{


    @Override
    public void buildBasement() {
        System.out.println("--------");
        System.out.println("  |$$$$|");
        System.out.println("  ------");
    }

    @Override
    public void buildRoof() {
        System.out.println();
        System.out.println("   $$   ");
        System.out.println("  roof  ");
        System.out.println(" roooof ");
        System.out.println("roooooof");
    }

    @Override
    public void buildFloor(int number) {
        for(int i = 0; i< number-1; i++) {
            System.out.println("--------");
            System.out.println("|  o   |");
        }
        System.out.println("--------");
        System.out.print("|  o   |");
    }

    @Override
    public void setStatyes(int number) {
        for(int i =0; i< number;i++){
            System.out.print("..0");
        }
        System.out.println();
    }
}
