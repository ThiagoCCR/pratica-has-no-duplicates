public class App {
    public static void main(String[] args) throws Exception {

        String[] firstArr = { "a", "b", "c", "d" };
        String[] secondArr = { "e", "f", "g", "z" };
        boolean hasNoDuplicates = true;

        for(int i= 0;i < firstArr.length; i++) {
            for(int j = 0; j < secondArr.length; j++) {
                if (firstArr[i] == secondArr[j]) {
                    System.out.println(firstArr[i]);
                    hasNoDuplicates= false;
                }
            }
        }

        if(hasNoDuplicates){
            System.out.println("There was no duplicated characters");
        }
    }
}
