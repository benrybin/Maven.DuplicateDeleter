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
        Integer[] temp = new Integer[100];
        Integer counter2=0;
        Arrays.fill(temp,0);
        Integer counter =0;
        for (int i = 0; i <super.array.length; i++) {
            temp[super.array[i]]++;


            }
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i] < maxNumberOfDuplications){
                counter+= temp[i];
            }


        }
        Integer[] answer = new Integer[counter];
        for (int i = 0; i <super.array.length ; i++) {
            if(temp[super.array[i]]<maxNumberOfDuplications){

                answer[counter2++] = super.array[i];

            }

        }




        return answer;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] temp = new Integer[100];
        Integer counter2=0;
        Arrays.fill(temp,0);
        Integer counter =0;
        for (int i = 0; i <super.array.length; i++) {
            temp[super.array[i]]++;


        }
        for (int i = 0; i <temp.length ; i++) {
            if(!(temp[i] == exactNumberOfDuplications)){
                counter+= temp[i];
            }


        }
        Integer[] answer = new Integer[counter];
        for (int i = 0; i <super.array.length ; i++) {
            if(!(temp[super.array[i]] == exactNumberOfDuplications)){

                answer[counter2++] = super.array[i];

            }

        }
        return answer;
    }
}
