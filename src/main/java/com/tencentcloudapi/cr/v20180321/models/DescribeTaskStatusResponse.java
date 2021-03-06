package com.tencentcloudapi.cr.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeTaskStatusResponse  extends AbstractModel{


    /**
    * 任务结果
    */
    @SerializedName("TaskResult")
    @Expose
    private String TaskResult;

    /**
    * 任务类型，010代表上传任务
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取任务结果
     * @return TaskResult 任务结果
     */
    public String getTaskResult() {
        return this.TaskResult;
    }

    /**
     * 设置任务结果
     * @param TaskResult 任务结果
     */
    public void setTaskResult(String TaskResult) {
        this.TaskResult = TaskResult;
    }

    /**
     * 获取任务类型，010代表上传任务
     * @return TaskType 任务类型，010代表上传任务
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * 设置任务类型，010代表上传任务
     * @param TaskType 任务类型，010代表上传任务
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskResult", this.TaskResult);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

