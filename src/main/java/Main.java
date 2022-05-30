
import java.util.HashMap;
import java.util.Map;



public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 1, 10};
        int compVal = 6;

        String rota = "abcdefg";
        int rotAmount = 3;

        System.out.println(aboveBelow(arr, compVal));

        System.out.println(rotateRight(rota, rotAmount));

    }


    static public HashMap<String, Integer> aboveBelow(int[] arr, int compVal) {
        int above = 0;
        int below = 0;
     HashMap aboveBelow = new HashMap();

        for (int j : arr) {
            if (j > compVal) {
                above++;
            } else {
                below++;
            }
            aboveBelow.put("Above", above);
            aboveBelow.put("Below", below);

        }
        return aboveBelow;

    }

    static public String initRotate(String str, int rotation){

        return str.substring(rotation) + str.substring(0, rotation);
    }

    static public String rotateRight(String str, int rotationAmount) {
        return initRotate(str, str.length() - rotationAmount);
    }
}
