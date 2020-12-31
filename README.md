# -mySecretBox
1.运行环境：jdk1.8
2.运行方式：
        先运行SHA256CodeTest.java,测试SHA256算法是否正确
        再运行SecretBoxTest.java，测试第一个箱子HashValue的前五位是否为0，这一步可能需要点时间
3.代码结构解释：
    开发：
        ConstsUtil:常亮类，避免魔法值
        SecretBox:神秘箱子实体类，包含四个箱子的属性，和打开箱子的方法
        SHA256Code:SHA256算法
    测试：
    SHA256CodeTest.java：测试SHA256算法是否正确
    SecretBoxTest.java：创建10个箱子，每个箱子创建的时候就直接打开，最后测试第一个箱子HashValue的前五位是否为0
        