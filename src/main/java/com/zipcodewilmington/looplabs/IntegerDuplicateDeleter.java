package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] array = origional.clone();
        Integer[] temp = new Integer[100];
        Integer counter2=0;
        Arrays.fill(temp,0);
        Integer counter =0;
        for (int i = 0; i <array.length; i++) {
            temp[array[i]]++;


            }
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i] < maxNumberOfDuplications){
                counter+= temp[i];
            }


        }
        Integer[] answer = new Integer[counter];
        for (int i = 0; i <array.length ; i++) {
            if(temp[array[i]]<maxNumberOfDuplications){

                answer[counter2++] = array[i];

            }

        }




        return answer;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] array = origional.clone();
        Integer[] temp = new Integer[100];
        Integer counter2=0;
        Arrays.fill(temp,0);
        Integer counter =0;
        for (int i = 0; i <array.length; i++) {
            temp[array[i]]++;


        }
        for (int i = 0; i <temp.length ; i++) {
            if(!(temp[i] == exactNumberOfDuplications)){
                counter+= temp[i];
            }


        }
        Integer[] answer = new Integer[counter];
        for (int i = 0; i <array.length ; i++) {
            if(!(temp[array[i]] == exactNumberOfDuplications)){

                answer[counter2++] = array[i];

            }

        }
        return answer;
    }
}
