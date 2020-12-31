package SecretBox;

/**
 * 宝箱有以下几个属性：宝箱编号、时间戳、Hash值、上一个宝箱的Hash值、神秘数字
 */
public class SecretBox {
    private int boxNum;
    private String hashValue;
    private String lastHashValue;
    private int secretNum;
//    public SecretBox(SecretBox secretBox){
//        this.boxNum = secretBox.getBoxNum()+1;
//        this.lastHashValue = secretBox.getHashValue();
//        this.secretNum = 0;
//        this.hashValue =  SHA256Code.getSHA256StrJava(this.boxNum+this.lastHashValue+this.secretNum);
//    }
    public SecretBox(int boxNum){
        this.boxNum = boxNum;
    }
    public SecretBox(int boxNum,String hashValue){
        this.boxNum = boxNum;
        this.hashValue = hashValue;
    }
    public int getBoxNum() {
        return boxNum;
    }
    public String getHashValue() {
        return hashValue;
    }

    public void setLastHashValue(String lastHashValue) {
        this.lastHashValue = lastHashValue;
    }

    public void openBox(SecretBox lastBox){
        this.lastHashValue = lastBox.getHashValue();
        int secretNum = 0;
        String hashCode =  SHA256Code.getSHA256StrJava(this.boxNum+this.lastHashValue+this.secretNum);
        while(!ConstsUtil.OPENED_BOX_FLAG.equals(hashCode.substring(0,5))){
            secretNum ++;
            hashCode =  SHA256Code.getSHA256StrJava(this.boxNum+this.lastHashValue+this.secretNum);
        }
        this.hashValue = hashCode;
        this.secretNum = secretNum;
    }

}

