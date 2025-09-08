public class BlockScope {
    public static void main(String[] args) {

        int s = 50;
        
        {
            int n = 60;
            System.out.println(n); // easy run 

            System.out.println(s); // here we can run and find output of s because block of s is already define and we are print under s block 

        }

        // System.out.println(n); // here n is not print  and give error because n is in a block scope. if we want to print n than we redefine n variable outside of block scope

        int n = 50;
        System.out.println(n); // here n give output without error

        System.out.println(s);

        // and now


    }
}
