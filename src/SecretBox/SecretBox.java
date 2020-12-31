package SecretBox;

/**
 * 宝箱有以下几个属性：宝箱编号、时间戳、Hash值、上一个宝箱的Hash值、神秘数字
 */
public class SecretBox {
    private String boxNum;
    private String hashValue;
    private String lastHashValue;
    private int SecretNum;


    public SecretBox(SecretBox secretBox){
        this.boxNum = secretBox.getBoxNum()+1;
        this.lastHashValue = secretBox.getHashValue();

    }
    public String getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(String boxNum) {
        this.boxNum = boxNum;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public String getLastHashValue() {
        return lastHashValue;
    }

    public void setLastHashValue(String lastHashValue) {
        this.lastHashValue = lastHashValue;
    }

    public int getSecretNum() {
        return SecretNum;
    }

    public void setSecretNum(int secretNum) {
        SecretNum = secretNum;
    }


    public int openBox(SecretBox secretBox){
        int resultSecretNum = 0;

        return resultSecretNum;
    }

}

