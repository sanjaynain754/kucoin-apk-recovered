package com.tencent.imsdk.community;

import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class TopicInfoModifyParam implements Serializable {
    private long modifyFlag;
    private TopicInfo topicInfo;

    public long getModifyFlag() {
        return this.modifyFlag;
    }

    public TopicInfo getTopicInfo() {
        return this.topicInfo;
    }

    public void setModifyFlag(long j11) {
        this.modifyFlag = j11;
    }

    public void setTopicInfo(TopicInfo topicInfo) {
        this.topicInfo = topicInfo;
    }
}
