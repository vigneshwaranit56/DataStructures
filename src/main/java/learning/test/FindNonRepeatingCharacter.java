package learning.test;

import java.util.*;

public class FindNonRepeatingCharacter {

    public static void main(String[] args){
        FindNonRepeatingCharacter findNonRepeatingCharacter = new FindNonRepeatingCharacter();
        findNonRepeatingCharacter.solution("vigneshwaran");

    }

    public void solution(String abcba) {

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(Character c:abcba.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        Character nonRepeatingCharacter = map.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue() ==1).findFirst().get().getKey();

        System.out.println(nonRepeatingCharacter);

    }
}
