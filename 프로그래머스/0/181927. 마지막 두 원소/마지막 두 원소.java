import java.util.*; 

class Solution {
   public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
       
       for(int i =0; i<num_list.length; i++){
           answer.add(num_list[i]);
       }
        int length = num_list.length;

        if(num_list[length-1] >num_list[length-2]){
            answer.add(num_list[length-1]-num_list[length-2]);
        }else{
            answer.add(num_list[length-1]*2);
        }

        return  answer;
    }
}