public class StringProcessor {
    public static String repeat(String source, int n){
        StringBuilder temp = new StringBuilder();

        return temp.repeat(source, n).toString();
    }

    public static int countOf(String source, String target){
        int count = 0;
        int index = 0;
        while(index >= 0 && index < source.length() - target.length()){
            index = source.indexOf(target, index);

            if(index >= 0){
                index++;
                count++;
            }
        }
        return count;
    }

    public static String replace(String source){
        return source.replace("1", "один").replace("2", "два").replace("3", "три");
    }

    public static void removeEvery2(StringBuilder source){
        for(int i = source.length()-1; i >= 1; i--){
            if(i % 2 == 1){
                source.deleteCharAt(i);
            }
        }
    }
}
