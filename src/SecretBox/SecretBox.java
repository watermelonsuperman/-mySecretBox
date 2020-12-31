package SecretBox;

/**
 * 宝箱有以下几个属性：宝箱编号、时间戳、Hash值、上一个宝箱的Hash值、神秘数字
 */
public class SecretBox {
    private String boxNum;
    private String timeFlag;
    private String hashValue;
    private String lastHashValue;
    private String SecretNum;

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

    public String getSecretNum() {
        return SecretNum;
    }

    public void setSecretNum(String secretNum) {
        SecretNum = secretNum;
    }

    public String getTimeFlag() {
        return timeFlag;
    }

    public void setTimeFlag(String timeFlag) {
        this.timeFlag = timeFlag;
    }

}

