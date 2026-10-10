package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.community.TopicPermissionResult;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMTopicPermissionResult {
    private TopicPermissionResult topicPermissionResult = new TopicPermissionResult();

    public String getGroupID() {
        TopicPermissionResult topicPermissionResult = this.topicPermissionResult;
        return topicPermissionResult != null ? topicPermissionResult.getGroupID() : "";
    }

    public String getPermissionGroupID() {
        TopicPermissionResult topicPermissionResult = this.topicPermissionResult;
        return topicPermissionResult != null ? topicPermissionResult.getPermissionGroupID() : "";
    }

    public int getResultCode() {
        TopicPermissionResult topicPermissionResult = this.topicPermissionResult;
        if (topicPermissionResult != null) {
            return topicPermissionResult.getErrorCode();
        }
        return 0;
    }

    public String getResultMessage() {
        TopicPermissionResult topicPermissionResult = this.topicPermissionResult;
        return topicPermissionResult != null ? topicPermissionResult.getErrorMessage() : "";
    }

    public String getTopicID() {
        TopicPermissionResult topicPermissionResult = this.topicPermissionResult;
        return topicPermissionResult != null ? topicPermissionResult.getTopicID() : "";
    }

    public long getTopicPermission() {
        TopicPermissionResult topicPermissionResult = this.topicPermissionResult;
        if (topicPermissionResult != null) {
            return topicPermissionResult.getTopicPermission();
        }
        return 0L;
    }

    public void setTopicPermissionResult(TopicPermissionResult topicPermissionResult) {
        this.topicPermissionResult = topicPermissionResult;
    }
}
