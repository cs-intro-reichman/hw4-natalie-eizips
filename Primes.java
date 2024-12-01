public class Primes {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + input + ":");
        boolean[] table = new boolean[input + 1];
        
        for (int i = 0; i < input + 1; i++){
            if (i > 1){
                table[i] = true;
            }
            else {
                table[i] = false;
            }
        } 
        int p = 0;
        for (int i = 0; i <= input; i++){
            if (table[i]){
                for (int j = 2 * i; j <= input; j+= i){
                    table[j] = false;
                }
                System.out.println(i);
                p++;
            }
        }

        System.out.println("There are " + p + " primes between 2 " + input + " (" + (int)(((double)p/input) * 100) + "% are primes)");
        
    } 

}
    