public class AreAnagrams {

    public static void main(String[] args) {
        System.out.println(areAnograms("mamm#", "amm#m"));
        System.out.println(areAnograms("mary", "army"));
        System.out.println(areAnograms("dada", "adde"));
        System.out.println(areAnograms("debit card", "bad credit"));
        System.out.println(areAnograms("neural", "unreal"));
    }
    
    private static boolean areAnograms(String a, String b) {
        String copyA = a.replaceAll("\\s", "").toLowerCase();
        String copyB = b.replaceAll("\\s", "").toLowerCase();
        
        boolean result = true;
        if (copyA.length() != copyB.length()) {
            result = false;
        } else {
            char[] charArray = copyA.toCharArray();
            for (char c : charArray) {
                int index = copyB.indexOf(c);
 
                if(index != -1) {
                    copyB = copyB.substring(0, index)+copyB.substring(index+1, copyB.length());
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
