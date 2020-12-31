package Test.java;
import static org.junit.jupiter.api.Assertions.*;

import SecretBox.SHA256Util;
import org.junit.jupiter.api.Test;

public class SecretBoxTest {
    /**
     * 测试SHA256加密算法
     */
    @Test
    public void should_return_code_when_SHA256(){
        //given
        String toDecryptCode = "1234567";
        String respectCode = "8bb0cf6eb9b17d0f7d22b456f121257dc1254e1f01665370476383ea776df414";
        //when
        String resultCode = SHA256Util.getSHA256StrJava(toDecryptCode);
        //then
        assertEquals(resultCode,respectCode);
    }
}
