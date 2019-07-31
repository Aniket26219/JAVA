package JavaDemo;

public class Loop {
    public static void main(String[] args) {
        /*for (int i=1;i<=5;++i){
            for (int j=1;j<=i;++j){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }*/
        for(int i=0;i<5;i++){
            System.out.println("Outer Loop");
            for (int j=0;j<2;j++){
                System.out.println("    Inner Loop");
            }
        }
    }
}
