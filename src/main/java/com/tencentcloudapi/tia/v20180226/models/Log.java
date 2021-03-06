package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Log  extends AbstractModel{


    /**
    * 容器名
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * 日志内容
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 空间名
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Pod Id
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * Pod名
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 日志日期，格式为“2018-07-02T09:10:04.916553368Z”
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * 获取容器名
     * @return ContainerName 容器名
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * 设置容器名
     * @param ContainerName 容器名
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * 获取日志内容
     * @return Log 日志内容
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * 设置日志内容
     * @param Log 日志内容
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * 获取空间名
     * @return Namespace 空间名
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置空间名
     * @param Namespace 空间名
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取Pod Id
     * @return PodId Pod Id
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * 设置Pod Id
     * @param PodId Pod Id
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * 获取Pod名
     * @return PodName Pod名
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * 设置Pod名
     * @param PodName Pod名
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * 获取日志日期，格式为“2018-07-02T09:10:04.916553368Z”
     * @return Time 日志日期，格式为“2018-07-02T09:10:04.916553368Z”
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * 设置日志日期，格式为“2018-07-02T09:10:04.916553368Z”
     * @param Time 日志日期，格式为“2018-07-02T09:10:04.916553368Z”
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

