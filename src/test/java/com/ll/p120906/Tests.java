package com.ll.p120906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("t1 Input : 1234 / Output : 10 ")
    void t1(){
        assertThat( new Solution().solution(1234)).isEqualTo(10);
    }

    @Test
    @DisplayName("t2 Input(930211) / Output(16)")
    void t2(){
        assertThat( new Solution().solution(930211)).isEqualTo(16);
    }
}
