package javaProblems;

public class Problems104 {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double squareArea(double width) {
        return width * width;
    }

    public static double sqhereArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double celsiusToKevin(double celsius) {
        return celsius + 273.15;
    }

    public static double kevinToCelsius(double kevin) {
        return kevin - 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * (9 / 5)) + 32;
    }

    public static String checkGrade(int score) {
        if (score > 100 || score < 0) return "Inavalid score";
        if (score >= 80) return "A";
        if (score >= 70) return "B";
        if (score >= 60) return "C";
        if (score >= 50) return "D";
        return "F";
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String checkBMI(double weight, double height) {
        double BMI = calculateBMI(weight, height);
        if (BMI < 18.5) return "Underweight";
        if (BMI >= 18.5 && BMI <= 24.9) return "Normal weight";
        if (BMI >= 25 && BMI <= 29.9) return "Overweight";
        return "Obesity";
    }


    public static boolean checkName(String name) {
        if (name.equals("WeLoveKK")) return true;
        return false;
    }

    public static boolean checkOddOrEven(int number) {
        if (number % 2 == 0) return true;
        return false;
    }

    public static boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) return true;
        return false;
    }
}
