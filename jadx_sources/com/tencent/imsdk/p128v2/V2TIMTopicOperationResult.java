package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.community.TopicOperationResult;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMTopicOperationResult {
    private TopicOperationResult topicOperationResult = new TopicOperationResult();

    public int getErrorCode() {
        TopicOperationResult topicOperationResult = this.topicOperationResult;
        if (topicOperationResult == null) {
            return 0;
        }
        return topicOperationResult.getErrorCode();
    }

    public String getErrorMessage() {
        TopicOperationResult topicOperationResult = this.topicOperationResult;
        return topicOperationResult == null ? "" : topicOperationResult.getErrorMessage();
    }

    public String getTopicID() {
        TopicOperationResult topicOperationResult = this.topicOperationResult;
        return topicOperationResult == null ? "" : topicOperationResult.getTopicID();
    }

    public void setTopicOperationResult(TopicOperationResult topicOperationResult) {
        this.topicOperationResult = topicOperationResult;
    }
}
