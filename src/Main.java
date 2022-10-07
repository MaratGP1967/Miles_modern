public class Main {
    public static void main(String[] args) {
        //ТЗ - за каждые 20 рублей, потраченные на билет, начисляется 1 миля
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);

        System.out.println(miles);
    }
}