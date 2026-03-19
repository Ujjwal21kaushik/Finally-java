package stacks;

import java.util.*;


public class pchp {
  public static void main(String[] args) {
    int[] arr = {5, 2, 4, 3};
    System.out.println(NGEonRight(arr));
    System.out.println(NGEonLeft(arr));
    System.out.println(NSEonRight(arr));
    System.out.println(NSEonLeft(arr));

    
  }

  static String NGEonRight(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    Arrays.fill(ans, -1);
    for(int i=0; i< arr.length; i++){

      while(!st.isEmpty() && arr[i]>arr[st.peek()]){
        ans[st.peek()] = arr[i];
        st.pop();
      }
      st.push(i);
    }
    

    return Arrays.toString(ans);
  }

  static String NGEonLeft(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    Arrays.fill(ans, -1);
    for(int i=arr.length-1; i>=0 ; i--){

      while(!st.isEmpty() && arr[i]>arr[st.peek()]){
        ans[st.peek()] = arr[i];
        st.pop();
      }
      st.push(i);
    }
    return Arrays.toString(ans);
  }

  static String NSEonRight(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    Arrays.fill(ans, -1);
    for(int i=0; i<arr.length ; i++){

      while(!st.isEmpty() && arr[i]<arr[st.peek()]){
        ans[st.peek()] = arr[i];
        st.pop();
      }
      st.push(i);
    }
    return Arrays.toString(ans);
  }

  static String NSEonLeft(int[]arr){
    Stack<Integer> st = new Stack<>();
    int[] ans = new int[arr.length];
    Arrays.fill(ans, -1);
    for(int i=arr.length-1; i>=0 ; i--){

      while(!st.isEmpty() && arr[i]<arr[st.peek()]){
        ans[st.peek()] = arr[i];
        st.pop();
      }
      st.push(i);
    }
    return Arrays.toString(ans);
  }
    
    
}
