package changeVariables;

public class ChangeVariablesSolution {
    public static void main(String[] args) {
        /* Question: changing the values of two variables without using a third variable */

        int a = 30;
        int b = 50;

        System.out.println("İlk Değerler a:" +a +" b:"+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Son Değerler a:" +a +" b:"+b);




    }
}
