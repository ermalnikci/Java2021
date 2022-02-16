package homework;

public class homework2 {

        /**
         * Homework 2:
         * Refer for formula : https://www.rapidtables.com/convert/temperature/index.html
         *
         *°C to °F
         *°C to K
         *
         * °F to °C
         * °F to K
         *
         * K to °C
         * K to °F
         *
         */

        public static void main(String[] args) {

            /**
             * Convert deg-Celsius into deg-Fahrenheit
             *
             * Using this formula:
             * T(°F) = T(°C) * 9/5 + 32
             * fTemp = cTemp * 9/5 + 32
             * cTemp = 19
             */

            double cTemp = 19;
            double fTemp = cTemp * 9/5 + 32;
            System.out.println(cTemp + "°C is equal to " + fTemp + "°F");

            /**
             * Convert deg-Celsius into Kelvin
             *
             * Using this formula:
             * T(K) = T(°C) + 273.15
             * kTemp = cTemp + 273.15
             * cTemp = 19
             * using the same variable for Celsius
             */

            double kTemp = cTemp + 273.15;
            System.out.println("\n" + cTemp + "°C is equal to " + kTemp + " K");

            /**
             * Convert deg-Fahrenheit into deg-Celsius
             * Using this formula:
             * T(°C) = (T(°F) - 32) * 5/9
             * cTemp = (fTemp - 32) * 5/9
             * fTemp = 66.2
             */

            double previus_fTemp = 66.2;
            double formula_cTemp = (fTemp - 32) * 5/9;
            System.out.println("\n" + previus_fTemp + "°F is equel to " + formula_cTemp + "°C" );

            /**
             * Convert deg-Fahrenheit into Kelvin
             * Using this formula:
             * T(K) = (T(°F) + 459.67)* 5/9
             * kTemp = (fTemp + 459.67)* 5/9
             * fTemp = 66.2
             */

            double kTempfrom_fTemp = (fTemp + 459.67)* 5/9;
            System.out.println("\n" + fTemp + "°F is equel to " + kTempfrom_fTemp + " K" );

            /**
             * Convert Kelvin into deg-Celsius
             * Using this formula:
             * T(°C) = T(K) - 273.15
             * cTemp = kTemp - 273.15
             * kTemp = 292.15
             */

            double cTempFrom_kTemp = kTemp - 273.15;
            System.out.println("\n" + kTemp + "K is equel to " + cTempFrom_kTemp + "°C" );

            /**
             * Convert Kelvin into deg-Fahrenheit
             * Using this formula :
             * T(°F) = T(K) * 9/5 - 459.67
             * fTemp = kTemp * 9/5 - 459.67
             * kTemp = 292.15
             */

            double fTempfrom_Kelvin = kTemp * 9/5 - 459.67;
            System.out.println("\n" + kTemp + "K is equel to " + fTempfrom_Kelvin + "°F");



        }


}