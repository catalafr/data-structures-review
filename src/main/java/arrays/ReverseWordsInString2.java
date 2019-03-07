package arrays;

public class ReverseWordsInString2 {

    public void reverseWords(char[] str) {
        if(str == null)
            return;

        reverseArray(str, 0, str.length - 1);

        int wordStart = 0;
        for(int j=0; j<str.length; j++){
            if(str[j]== ' '){
               reverseArray(str, wordStart, j -1);
               wordStart = j + 1;
            }

            if(j == str.length -1){
                reverseArray(str, wordStart, j);
                wordStart = j + 1;
            }
        }
    }

    public void reverseArray(char [] array, int startIdx, int endIdx){

        //Reverse the array.
        for(int i=startIdx,j=endIdx ; i != j && i < j; i++, j--){
            char m = array[i];
            char p = array[j];

            array[i] = p;
            array[j] = m;
        }
    }


}
