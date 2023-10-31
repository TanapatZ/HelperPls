package work1;

public class stAndSw {

    public static double swOperate(double a, double b, String z) {
        return switch (z) {
            case "sum", "+" ->
                a + b;
            case "muinus", "-" ->
                a - b;
            case "times", "x" ->
                a * b;
            case "divide", "/" ->
                a / b;
            default ->
                throw new IllegalArgumentException();
        };

    }

    public static int random() {
        return (int) (Math.random() * 10 + 5);
    }

    public static String spwithspace(String s) {
        StringBuilder a = new StringBuilder();
        boolean foundChar = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {

                if (s.charAt(i + 1) != ' ' && foundChar) {
                    a.append('\n');
                }
                continue;
            }

            if (!foundChar) {
                foundChar = true;
            }
            a.append(s.charAt(i));

        }

//       int x = 0 ;
//        boolean foundChar = false;
//        while(x< s.length()){
//            if(s.charAt(x) == ' '){
//                if (x<=s.length()&&s.charAt(x+1)!=' '&&foundChar) {
//                    a.append("\n");
//                }
//            x++;
//            continue;
//            }
//            
//            if(!foundChar)foundChar = true;
//            a.append(s.charAt(x));
//            x++;
//        }
//
//       
        return a.toString();
    }
}
