package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {


    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] array = origional.clone();
        Integer currentCount =1;
        Integer counter =0;
        String dups = "";
        if(maxNumberOfDuplications<2){
            return new String[0];
       }
        for (int i = 0; i <array.length ; i++) {
            currentCount =0;
            counter=0;

            for (int j = i+1; j < array.length-1 ; j++) {
                if(array[i].equals(array[j])){
                    currentCount++;
                    dups = array[i];

                }

                }
            if(currentCount>=maxNumberOfDuplications){
                for (int k = 0; k <array.length ; k++) {
                    if(dups.equals(array[k])){
                        array[k] = "blank";
                    }

                }

            }


        }
        for (int i = 0; i <array.length ; i++) {
            if(!(array[i].equals("blank"))){
                counter++;
            }

        }
        String[] temp = new String[counter];
        Integer counter2 = 0;
        for (int i = 0; i <array.length ; i++) {
            if(!(array[i].equals("blank"))){
                temp[counter2] = array[i];
                counter2++;
            }

        }


        return temp;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer counter =0;
        String test ="";
        Integer dupCount =0;
        String[] array = origional.clone();
        for (int i = 0; i <array.length ; i++) {
           test = array[i];
           dupCount=0;
            for (int j = 0; j <array.length ; j++) {


                if (array[j].equals(test)) {
                    dupCount++;
                }
            }
            if(dupCount==exactNumberOfDuplications){
                for (int j = 0; j <array.length ; j++) {
                    if(array[j].equals(test)){
                        array[j]= "Blank";
                    }

                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if(!array[i].equals("Blank")){
                counter++;
            }

        }
        Integer counter2 =0;
        String[] answer = new String[counter];
        for (int i = 0; i <array.length ; i++) {
            if(!array[i].equals("Blank")){
                answer[counter2]=array[i];
                    counter2++;
            }

        }
        //array = new String[answer.length];
       // array[1] = "Yes";

        return answer;
    }
}
