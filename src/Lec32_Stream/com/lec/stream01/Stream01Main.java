package Lec32_Stream.com.lec.stream01;

import java.util.Arrays;
import java.util.List;

public class Stream01Main {

    public static void main(String[] args) {
        List<String> sList = Arrays.asList("John", "Susan", "Tom", "Michael");
        System.out.println(sList);

        // List 안의 문자열중 길이가 5개 이상인 요소만 출력하기
        for (int i = 0; i < sList.size(); i++) {
            String s = sList.get(i);
            if (s.length() >= 5) {
                System.out.println(s);
            }
        }

        sList.stream()
                .filter(s -> s.length() >= 5)
                .forEach(n -> System.out.println(n));

        System.out.println();
        sList.forEach(s -> System.out.println(s));
        sList.forEach(System.out::println);

        sList.stream().forEach(s -> System.out.println(s));

        sList.stream()
                .map(s -> s.length())
                .forEach(n -> System.out.println(n + " "));

        System.out.println();
    }

}
