public class PetlaFor1  {
    public static void main(String[] args) {
        int [] tablicaCyfr = new int[5];
        tablicaCyfr = new int[] {1,2,3,4,5};
        System.out.println(tablicaCyfr[2]);
        String [] tablicaPieskow = new String[4];
        tablicaPieskow = new String[] {"Azor", "Boss", "King", "Kudłaty"};
//System.out.println(tablicaPieskow[2]);
        for (int i = 0; i < tablicaPieskow.length; i++ ){
            System.out.println(tablicaPieskow[i]);
        }
    }
}


