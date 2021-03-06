package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateComputeEnvRequest  extends AbstractModel{


    /**
    * 计算环境信息
    */
    @SerializedName("ComputeEnv")
    @Expose
    private NamedComputeEnv ComputeEnv;

    /**
    * 位置信息
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * 获取计算环境信息
     * @return ComputeEnv 计算环境信息
     */
    public NamedComputeEnv getComputeEnv() {
        return this.ComputeEnv;
    }

    /**
     * 设置计算环境信息
     * @param ComputeEnv 计算环境信息
     */
    public void setComputeEnv(NamedComputeEnv ComputeEnv) {
        this.ComputeEnv = ComputeEnv;
    }

    /**
     * 获取位置信息
     * @return Placement 位置信息
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置位置信息
     * @param Placement 位置信息
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * 设置用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由用户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ComputeEnv.", this.ComputeEnv);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

