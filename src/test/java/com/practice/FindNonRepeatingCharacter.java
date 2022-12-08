package com.practice;

import com.test.FindNonRepeatingCharacter;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FindNonRepeatingCharacterTest{

    private FindNonRepeatingCharacter findNonRepeatingCharacter;

    @BeforeAll
    public void init(){
        findNonRepeatingCharacter = new FindNonRepeatingCharacter();
    }

    @Test
    public void postiveCase(){


    }
}
