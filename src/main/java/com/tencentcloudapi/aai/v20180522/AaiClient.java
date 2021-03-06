/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.tencentcloudapi.aai.v20180522;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.aai.v20180522.models.*;

public class AaiClient extends AbstractClient{
    private static String endpoint = "aai.tencentcloudapi.com";
    private static String version = "2018-05-22";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public AaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public AaiClient(Credential credential, String region, ClientProfile profile) {
        super(AaiClient.endpoint, AaiClient.version, credential, region, profile);
    }

    /**
     *识别60s内的短语音，当音频放在请求body中传输时整个请求大小不能超过1M，当音频以url方式传输时，音频时长不可超过60s。
     * @param req SentenceRecognitionRequest
     * @return SentenceRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public SentenceRecognitionResponse  SentenceRecognition(SentenceRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceRecognitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceRecognitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SentenceRecognition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *腾讯云语音合成技术（TTS）可以将任意文本转化为语音，实现让机器和应用张口说话。
腾讯TTS技术可以应用到很多场景，比如，移动APP语音播报新闻；智能设备语音提醒；依靠网上现有节目或少量录音，快速合成明星语音，降低邀约成本；支持车载导航语音合成的个性化语音播报。
内测期间免费使用。
     * @param req TextToVoiceRequest
     * @return TextToVoiceResponse
     * @throws TencentCloudSDKException
     */
    public TextToVoiceResponse  TextToVoice(TextToVoiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextToVoiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TextToVoiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TextToVoice"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
