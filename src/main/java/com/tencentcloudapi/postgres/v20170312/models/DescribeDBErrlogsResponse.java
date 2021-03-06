package com.tencentcloudapi.postgres.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBErrlogsResponse  extends AbstractModel{


    /**
    * 本次调用返回了多少条数据
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 错误日志列表
    */
    @SerializedName("Details")
    @Expose
    private ErrLogDetail [] Details;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取本次调用返回了多少条数据
     * @return TotalCount 本次调用返回了多少条数据
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置本次调用返回了多少条数据
     * @param TotalCount 本次调用返回了多少条数据
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取错误日志列表
     * @return Details 错误日志列表
     */
    public ErrLogDetail [] getDetails() {
        return this.Details;
    }

    /**
     * 设置错误日志列表
     * @param Details 错误日志列表
     */
    public void setDetails(ErrLogDetail [] Details) {
        this.Details = Details;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

