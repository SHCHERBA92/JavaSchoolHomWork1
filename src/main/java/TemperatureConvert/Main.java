package TemperatureConvert;

public class Main {
    public static void main(String[] args) {


        ConvertorTemp TempCelsia = new ConvertorTemp("36.6C");
        TempCelsia.universityConvert();
        ConvertorTemp TempKelvin = new ConvertorTemp("200.6K");
        TempKelvin.universityConvert();
        ConvertorTemp TempFarengate = new ConvertorTemp("76.8F");
        TempFarengate.universityConvert();

    }
}


