package TemperatureConvert;

public class ConvertorTemp {
    private String startTemperature;

    public ConvertorTemp(String startTemperature) {
        this.startTemperature = startTemperature;
    }

    public void universityConvert()
    {
        try {
            if (this.startTemperature.contains("C") || this.startTemperature.contains("c")
                    || this.startTemperature.contains("С") || this.startTemperature.contains("с"))
            {
                Double startTempDobl = Double.parseDouble(this.startTemperature.substring(0,this.startTemperature.indexOf("C")));
                Double resKelvin = startTempDobl + 273.15;
                Double resFarengeit = (startTempDobl * (9.0/5.0)) + 32;

                System.out.println(this.startTemperature + " => " + String.valueOf(resKelvin + "K") + "\n" +
                        this.startTemperature + " => " + String.valueOf(resFarengeit + "F"));
            }
            else if (this.startTemperature.contains("K") || this.startTemperature.contains("k"))
            {
                Double startTempDobl = Double.parseDouble(this.startTemperature.substring(0,this.startTemperature.indexOf("K")));
                Double resCelsia = startTempDobl - 273.15;
                Double resFarengeit = (resCelsia * (9.0/5.0)) + 32;

                System.out.println(this.startTemperature + " => " + String.valueOf(resCelsia + "C") + "\n" +
                        this.startTemperature + " => " + String.valueOf(resFarengeit + "F"));
            }
            else if (this.startTemperature.contains("F") || this.startTemperature.contains("f"))
            {
                Double startTempDobl = Double.parseDouble(this.startTemperature.substring(0,this.startTemperature.indexOf("F")));
                Double resCelsia = (startTempDobl - 32)*(5.0/9.0);
                Double resKelvin = resCelsia + 273.15;

                System.out.println(this.startTemperature + " => " + String.valueOf(resCelsia + "C") + "\n" +
                        this.startTemperature + " => " + String.valueOf(resKelvin + "K"));
            }
            else {
                System.out.println("Не верно задан формат числа");
                System.out.println("""
                    \t\tПример :
                    \t\t\t 36.6C - Для Цельсия
                    \t\t\t 273.3K - Для Кельвина
                    \t\t\t 73.2F - Для Фаренгейта""");
            }
        }catch (NumberFormatException numberFormatException)
        {
            System.err.println(numberFormatException.getLocalizedMessage());
            System.err.println("Не верно задан формат числа");
            System.err.println("""
                    \t\tПример :
                    \t\t\t 36.6C - Для Цельсия
                    \t\t\t 273.3K - Для Кельвина
                    \t\t\t 73.2F - Для Фаренгейта""");
        }
        catch (NullPointerException exception)
        {
            System.err.println(exception.getLocalizedMessage());
            System.err.println("Не была указана температура");
        }catch (ArithmeticException arithmeticException)
        {
            System.err.println(arithmeticException.getLocalizedMessage());
        }

    }
}
