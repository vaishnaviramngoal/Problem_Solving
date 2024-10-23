public class Tree {

             public static void main(String[] args) {

                int[] arr= {89,56,75,46,93,69,56,48};
                int value = arr.length;
                int sum = SumOfArray(arr,value);
                System.out.println("Sum of array :" +sum);
                 PrintResult(arr,value);
                 String msg = "happyholidays";
                  char ch = 'y' ;
                  int result1 = findingFirstOccurence(msg,ch);
                  System.out.println(result1);
                } 

               public static int SumOfArray(int[] arr, int value) {
                  int sum=0;
                   for(int i=0; i< value;i++) {
                     sum=sum+arr[i];
                    }
                     return sum;
                }

               
               public static void PrintResult( int[] arr , int value) {
                    int evenCount = 0;
                     int oddCount = 0;
                 
                   for(int i = 0;i < value;i++) {
                          if(arr[i] %2 ==0) {
                                 evenCount++;
                           } else {
                                 oddCount++;
                           }
                    }
                         System.out.println(" Even number :" +evenCount);
                         System.out.println(" odd number :" +oddCount);
                   }
       
                   public static int findingFirstOccurence(String msg, char ch) {
                       char[] chArray = msg.toCharArray();
                        int value = chArray.length;
                          for (int i = 0; i < value;i++) {
                              if(chArray[i]==ch) {
                                    return i;
                               }
                           }
                            return -1;
                      }
         }
   
