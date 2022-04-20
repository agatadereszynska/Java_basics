public class MatematyczneDzialania {
    public static void main(String[] args) {
        /*1*/
        int x = 3;
        /*2*/
        int y;
        /*3*/
        System.out.println(x++); // zwiększa wartość o 1, pokaże 3, najpierw wyświetli x, a potem doda 1
        /*4*/
        System.out.println(++x); // zwiększa wartość o 1, pokaże 5, najpierw doda, a potem wyświetli
        /*5*/
        System.out.println(x); // 5
        /*6*/
        y = x++; // y=5 (6 w pamięci)
        /*7*/
        System.out.println(y); // 5
        /*8*/
        y = ++x; // 7
        /*9*/
        System.out.println(y); // 7
        /*10*/
        System.out.println(++y); // 8
    }
}