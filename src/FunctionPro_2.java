 public class FunctionPro_2 {
        int maxValue()
        {
            int num[]={2222222,28,217,2,3000};
            for (int i =0;i <5;i++) {
                System.out.println(""+num[i]);
            }
            int max=num[0];
            for(int i=1; i<5; i++)
            {
                if(max<num[i])
                    max=num[i];
            }
            return max;
        }
        public static void main(String[] args) {
            FunctionPro_2 p2= new FunctionPro_2();
            System.out.println("Maximum value is :"+p2.maxValue());
        }
    }
