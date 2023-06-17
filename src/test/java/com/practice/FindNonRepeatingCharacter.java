package com.practice;

import com.test.FindNonRepeatingCharacter;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class FindNonRepeatingCharacterTest implements ITestCaseTemplate{
    private FindNonRepeatingCharacter findNonRepeatingCharacter;

    @BeforeAll
    public void init(){
        findNonRepeatingCharacter = new FindNonRepeatingCharacter();
    }



    @Override
    public void positiveCase() {
        findNonRepeatingCharacter.solution("jshjahdjfjs");

    }

    @Override
    public void averageCase() {

    }

    @Override
    public void negativeCase() {

    }
}
