package model;


/*command和对应功能关系
        21     灯1打开
        2      灯1关闭
        3      灯2打开
        4      灯2关闭
        5      灯3打开
        6      灯3关闭
        7      电动窗帘正转
        8      电动窗帘反转
        9      插座1打开
        10     插座1关闭
        11     插座2打开
        12     插座2关闭
        13     自动控制
        14     手动控制

        51  开门
        52  禁用门禁（任何人打不开家门了 包括用门禁卡）
        53  开启门禁
        54  发送紧急消息1（触发条件：kinect）
        55  发送紧急消息2（家中空气异常 触发条件：）
        56  发送紧急消息3（系统起火 触发条件：火焰传感器低于350一段时间）
        57  我了解了 解除警报
        58
        59
        60


        31-45预留成机器人动作好了 （你可以写一个简单的遥控界面 控制他前进 停下 左转 右转 说话之类的）
        31 前进
        32 停下
        33 左转
        34 右转
        35 说 “你好 我是 脑”
        36 待拓展
        37
        38
        39
        40
        41

        56&&7    70
        56&&8    71
        ！56&&7  72
        ！56&&8  73

*/
public class Fcommond {
    private Integer fid;

    private Integer flag;

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}