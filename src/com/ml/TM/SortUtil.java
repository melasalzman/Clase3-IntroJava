package com.ml.TM;

public class SortUtil<T> {

    public static <T> Precedable<T>[] ordenar(Precedable<T> arr[]){
        Precedable<T>[] arrayOrdered = arr.clone();
        for (int i = 0; i < arrayOrdered.length - 1; i++) {
            for (int j = 0; j < arrayOrdered.length - 1; j++) {
                if (arrayOrdered[j + 1].precedeA((T)arrayOrdered[j])>0) {
                    Precedable<T> aux = arrayOrdered[j + 1];
                    arrayOrdered[j + 1] = arrayOrdered[j];
                    arrayOrdered[j] = aux;
                }
            }
        }
        return arrayOrdered;
    }
}
