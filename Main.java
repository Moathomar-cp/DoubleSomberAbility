class Main {
  public static void main(String[] args) {
    //
    int[] arr = {1,2,1,1,2,3,4,5,7,8,977,7,7,7,8};
    int [] result = uniqe(arr);
    printArr(result);// 1,2,3,4,5,7,8,997
  }
  
  public static int [] uniqe(int[] arr){
    int[] result = {};
    return result;
  }

  public static void printArr(int[] arr){
    for (int i=0; i<arr.length; i++){
        System.out.printf("%d,",arr[i]);
    }
  }

}
