package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SimpleStringEncoderTest {
    @Test
    void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoder.encode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringa3b3c3ThenResultaaabbbccc() {
        String input = "a3b3c3";
        String expected = "aaabbbccc";
        String result = SimpleStringEncoder.decode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStringabcThenResultabc1() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoder.decode(input);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1Stringab2c3ThenResultabbccc() {
        String input = "ab2c3";
        String expected = "abbccc";
        String result = SimpleStringEncoder.decode(input);
        assertThat(result).isEqualTo(expected);
    }
}