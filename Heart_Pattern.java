package Java_Pattern;
public class Heart_Pattern {
    public static void main(String[] args) {
        for(int i=0 ;i<2;i++){
            for(int j=0;j<7;j++){
                if(i==0 && j%3!=0 || i==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=4 ; i>=1 ; i--){
            for(int j=1 ; j<=4-i ; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}