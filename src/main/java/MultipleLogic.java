public class MultipleLogic {

    public int multiCalc(int maxNumber){

        int sum=0;

        for(int i=0; i<maxNumber; i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }

     return sum;
    }

}
