package com.tencent.imsdk.community;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class TopicInfoGetResult implements Serializable {
    private int errorCode;
    private String errorMessage;
    private String topicID;
    private TopicInfo topicInfo;

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getTopicID() {
        return this.topicID;
    }

    public TopicInfo getTopicInfo() {
        return this.topicInfo;
    }

    public void setErrorCode(int i11) {
        this.errorCode = i11;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setTopicID(String str) {
        this.topicID = str;
    }

    public void setTopicInfo(TopicInfo topicInfo) {
        this.topicInfo = topicInfo;
    }
}
