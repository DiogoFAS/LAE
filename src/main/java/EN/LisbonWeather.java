package EN;

public class LisbonWeather extends Weather {

    @ValidText(values = {"Day", "Night"})
    public String time;

    @ValidText(values = {"Sunny"})
    public String desc;
}
