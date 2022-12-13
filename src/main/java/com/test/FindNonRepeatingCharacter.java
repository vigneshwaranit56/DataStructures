package com.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class FindNonRepeatingCharacter {

    public static void main(String[] args){
        FindNonRepeatingCharacter findNonRepeatingCharacter = new FindNonRepeatingCharacter();
        findNonRepeatingCharacter.solution("abcba");

    }

    public void solution(String abcba) {


        List<Character> list = new LinkedList<>();

        for(Character c:abcba.toCharArray()){
            if(list.contains(c)){
                list.remove(c);
            }else{
                list.add(c);
            }
        }

        System.out.println(list.stream().findFirst());

    }
}
