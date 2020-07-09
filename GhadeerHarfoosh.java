class GhadeerHarfoosh {
  public static void main(String[] args) {
    //
    int[] arr = {1,2,1,1,2,3,4,5,7,8,977,7,7,7,8};
    int [] result = uniqe(arr);
    printArr(result);// 1,2,3,4,5,7,8,997
  }
  
  public static int [] uniqe(int[] arr){
    int temp[] = new int [arr.length];
    int j =0;
    for (int i=0; i<arr.length; i++){
      if(!isHere(temp,arr[i]) ){
        temp[j] = arr[i];
        j++;
      }
    }
    return temp;
  }

  public static void printArr(int[] arr){
    for (int i=0; i<arr.length; i++){
        System.out.printf("%d,",arr[i]);
    }
  }
  
  public static boolean isHere(int[]t , int x){
    for(int i=0;i<t.length;i++){
      if (x== t[i])
      return true;
    }
    return false;
  }

}
