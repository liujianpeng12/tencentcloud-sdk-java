package com.tencentcloudapi.ds.v20180523.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DeleteAccountResponse  extends AbstractModel{


    /**
    * 删除成功帐号ID列表
    */
    @SerializedName("DelSuccessList")
    @Expose
    private String [] DelSuccessList;

    /**
    * 删除失败帐号ID列表
    */
    @SerializedName("DelFailedList")
    @Expose
    private String [] DelFailedList;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取删除成功帐号ID列表
     * @return DelSuccessList 删除成功帐号ID列表
     */
    public String [] getDelSuccessList() {
        return this.DelSuccessList;
    }

    /**
     * 设置删除成功帐号ID列表
     * @param DelSuccessList 删除成功帐号ID列表
     */
    public void setDelSuccessList(String [] DelSuccessList) {
        this.DelSuccessList = DelSuccessList;
    }

    /**
     * 获取删除失败帐号ID列表
     * @return DelFailedList 删除失败帐号ID列表
     */
    public String [] getDelFailedList() {
        return this.DelFailedList;
    }

    /**
     * 设置删除失败帐号ID列表
     * @param DelFailedList 删除失败帐号ID列表
     */
    public void setDelFailedList(String [] DelFailedList) {
        this.DelFailedList = DelFailedList;
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
        this.setParamArraySimple(map, prefix + "DelSuccessList.", this.DelSuccessList);
        this.setParamArraySimple(map, prefix + "DelFailedList.", this.DelFailedList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

