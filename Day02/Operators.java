package Day02;

class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 1;
        int d;

        // Operators & it's Types

        //Arithmetic Operators
        System.out.println(a + b); // 10 + 5 = 15
        System.out.println(a - b); // 10 - 5 = 5
        System.out.println(a * b); // 10 * 5 = 50
        System.out.println(a / b); // 10 / 5 = 2
        System.out.println(a % b); // 10 % 5 = 0
        System.out.println(a++); // 10
        System.out.println(a--); // 11

        //Relational Operators
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a > b); // true
        System.out.println(a < b); // false


        //Logical Operators
        System.out.println((a > b) && (b > c)); // true
        System.out.println((a < b) && (b < c)); // false

        System.out.println((a > b) || (b < c)); // true

        System.out.println(!(a > b)); // false

        //Assignment Operators
        d = a;
        System.out.println(d); //10
        d += b;
        System.out.println(d); //15
        d -= b;
        System.out.println(d); //10
        d *= b;
        System.out.println(d); //50
        d /= b;
        System.out.println(d); //10

        //Unary Operators
        System.out.println(a++); //10
        System.out.println(a); //11
        System.out.println(++b); //6
        System.out.println(b); //6

        int x = a++;
        int y = ++b;

        System.out.println(x); //11
        System.out.println(y); //7

        System.out.println(a); //12
        System.out.println(b); //7

        //Bitwise Operators
        System.out.println(a | b); //15
        System.out.println(a & b); //4
        System.out.println(a ^ b); //11
        System.out.println(~a); //

        System.out.println(a << 1); //24
        System.out.println(a << 2); //48

        System.out.println(b >> 1); //3
        System.out.println(b >> 2); //1
    }
}