public class Main {
    public static void main(String[] args) {
// Arithmetic operators
        int sum1=100+40;
        int sum2=50+20;
        int sum3=sum1+sum2;
        System.out.println(sum3);
        int sum4=sum3-sum1;
        int sum5=sum1*sum4;
        int sum6=sum5/sum2;
        System.out.println(sum4);
        System.out.println(sum5);
        System.out.println(sum6);

        //Assignment operators
        /*are used to assign values to varribles we use the asssignment
        * operator = to assign value to variable*/
        int x=10;
        x +=5;// the addition operator adds a value to a varible
        x%=2;
        System.out.println("x= "+x);

        //Jva comparison Operators
        /*the return value for comparison
        * is either true or false. These values are
        * known as boolean values*/
        int y=5;
        int z=3;
        System.out.println(y>z);//returns true because 5 is higher than 3
        int a=4;
        int b=6;
        System.out.println(a==b);//(==) equals to
        System.out.println(a!=b);//(!=) not equal
        System.out.println(y<=b);//(<=) less than or equal to

        //Java logical operators
        /*you can also test for true or false values
         with logical operators
        * */

        //logical and && (Returns TRUE if both stament are true)
        int c=5;
        System.out.println(c>3 && c<10);// Returns true becos 5 is greater than 3 and 5 is less than 10

        //logical or || (returns true if ONE of the statement id true)
        int d=5;
        System.out.println(d<6 || d<4);

        //logical not !(&&) (Reverse the result, returns false if the result is true)
        int e=5;
        System.out.println(!(e>3 && e<10));

    }
}