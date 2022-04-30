public class BonusMilesService {

    public int calculate(int price) {
        int milePrice = 20; // стоимость одной мили
        int mile = price / milePrice;

        return mile;

    }
}
