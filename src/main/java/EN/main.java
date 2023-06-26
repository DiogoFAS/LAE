package EN;

public class main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        LisbonWeather lisbonWeather = new LisbonWeather();

        System.out.println(lisbonWeather.time);

        Weather.checkAndSet(lisbonWeather, "time", "Night");

        System.out.println(lisbonWeather.time);
    }
}
