public class Foreman {

    public void buildRichHouse(String configuration){
        switch (configuration) {
            case "standart": {
                RichHouseBuilder houseBuilder = new RichHouseBuilder();
                houseBuilder.buildRoof();
                houseBuilder.buildFloor(3);
                houseBuilder.setStatyes(2);
                houseBuilder.buildBasement();
                break;
            }
            case "comfort": {
                RichHouseBuilder houseBuilder = new RichHouseBuilder();
                houseBuilder.buildRoof();
                houseBuilder.buildFloor(4);
                houseBuilder.setStatyes(5);
                houseBuilder.buildBasement();
                break;
            }
        }
    }

    public void buildPoorHouse(String configuration){
        switch (configuration) {
            case "standart": {
                PoorHouseBuilder houseBuilder = new PoorHouseBuilder();
                houseBuilder.buildRoof();
                houseBuilder.buildFloor(1);
                houseBuilder.buildBasement();
                break;
            }
            case "comfort": {
                PoorHouseBuilder houseBuilder = new PoorHouseBuilder();
                houseBuilder.buildRoof();
                houseBuilder.buildFloor(2);
                houseBuilder.buildBasement();
                break;
            }
        }
    }
}
