package Test.java;
import static org.junit.jupiter.api.Assertions.*;
import SecretBox.SHA256Code;
import SecretBox.SecretBox;
import org.junit.jupiter.api.Test;
import SecretBox.ConstsUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class SecretBoxTest {
    @Test
    public void should_return_code_with_00000_when_open_box(){
        //given
        //创建10个宝箱
        List<SecretBox> secretBoxList = new ArrayList<SecretBox>();
        //创建第0个箱子
        SecretBox notExistBox = new SecretBox(0,ConstsUtil.THE_FIRST_BOX_LAST_HASH_VALUE);
        secretBoxList.add(notExistBox);
        //when
        for(int boxNum = 1;boxNum <= ConstsUtil.BOX_COUNT;boxNum++){
            SecretBox secretBox = new SecretBox(boxNum);
            secretBoxList.add(secretBox);
            secretBox.openBox(secretBoxList.get(boxNum-1));
        }
        //then
        assertEquals(ConstsUtil.OPENED_BOX_FLAG,secretBoxList.get(1).getHashValue().substring(0,5));
    }
}
