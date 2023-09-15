public class Reduce {
    public static int main(int n) {
        int steps = 0;
        while(n > 0){
            boolean isEven = n % 2 == 0;
            if(isEven){
                n/=2;
            }
            else{
                n-=1;
            }
            steps++;
        }
        return steps;
    }
    public static int main() {
        return main(100);
    }

}
