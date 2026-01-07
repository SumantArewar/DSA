Public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 1;
        int d;

        // Operators & it's Types

        //Arithmetic Operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a++);
        System.out.println(a--);

        //Relational Operators
        System.out.println(a == b);
        System.out.println(a =! b);
        System.out.println(a => b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a < b);


        //Logical Operators
        System.out.println((a > b) && (b > c)); // true
        System.out.println((a < b) && (b < c)); // false

        System.out.println((a > b) || (b < c)); // true

        System.out.println(!(a > b)); // false

        //Assignment Operators
        d = a;
        System.out.println(d);
        d += b;
        System.out.println(d);
        d -= b;
        System.out.println(d);
        d *= b;
        System.out.println(d);
        d /= b;
        System.out.println(d);

        //Unary Operators
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);

        int x = a++;
        int y = ++b;

        System.out.println(x);
        System.out.println(y);

        System.out.println(a);
        System.out.println(b);

        //Bitwise Operators
        System.out.println(a | b);
        System.out.println(a & b);
        System.out.println(a ^ b);

        System.out.println(a << 1);
        System.out.println(a << 2);

        System.out.println(b >> 1);
        System.out.println(b >> 2);
    }
}