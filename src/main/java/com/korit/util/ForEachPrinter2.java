package com.korit.util;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// (메소드)제네릭
public class ForEachPrinter2<T> {
     public static <T> List<T> print(List<T> datas, Consumer<List<T>> action) {
         List<T> result = new ArrayList<T>();

         action.accept(datas);

        // ForEachPrinter2<Integer> ifp = new ForEachPrinter2<>();
        // ForEachPrinter2<>(); → <> 안에 Object 들어감 생략가능


        return result;

    }
}
