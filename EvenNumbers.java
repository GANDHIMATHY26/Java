public class Main{
    public static void main(String[] args){
        System.out.println("Even numbers from 1 to 20");
        int end=20;
        for(int start=1;start<=end;start++){
            if(start%2==1)continue;
            System.out.println(start);
        }
    }
}
