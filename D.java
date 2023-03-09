package sol;

public class D {
    public static void main(String[] args) {
        int[] cordinates = { 0, 0 };
        String s = "NNNNEEENE";
        int countN = 0;
        int countE = 0;
        int countW = 0;
        int countS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'N')
                countN++;
            if (s.charAt(i) == 'E')
                countE++;
            if (s.charAt(i) == 'W')
                countW++;
            if (s.charAt(i) == 'S')
                countS++;
        }
        int vertical = Math.abs(countN - countS);
        int horizontal = Math.abs(countE - countW);
        System.out.println(vertical);
        System.out.println(horizontal);
        System.out.print(Math.sqrt(Math.pow(Math.abs(cordinates[0] - (horizontal + cordinates[0])), 2)
                + Math.pow(Math.abs(cordinates[1] - (vertical + cordinates[1])), 2)));

    }
}
