public class Source {
    public static void main(String[] args) {
        int value = 74;
        System.out.println(howMuchILoveYou(value).equals("a little"));
    }
    public static String howMuchILoveYou(int nb_petals) {
        String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};
        return arr[nb_petals%6];
    }
}
