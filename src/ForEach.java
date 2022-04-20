public class ForEach {
    public static void main(String[] args) {
        int [] tablica = new int[10];
        int i;
        for (i = 0; i< tablica.length; i+=2){
            tablica[i] = i+1;

        }
for (int zmienna:tablica){
    System.out.println(zmienna);
}
    }
}
