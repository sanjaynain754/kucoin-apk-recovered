package com.tencent.imsdk.p128v2;

import com.tencent.imsdk.group.GroupInfoGetResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMGroupInfoResult implements Serializable {
    private GroupInfoGetResult groupInfoGetResult = new GroupInfoGetResult();

    public V2TIMGroupInfo getGroupInfo() {
        V2TIMGroupInfo v2TIMGroupInfo = new V2TIMGroupInfo();
        v2TIMGroupInfo.setGroupInfo(this.groupInfoGetResult.getGroupInfo());
        return v2TIMGroupInfo;
    }

    public GroupInfoGetResult getGroupInfoGetResult() {
        return this.groupInfoGetResult;
    }

    public int getResultCode() {
        return this.groupInfoGetResult.getErrorCode();
    }

    public String getResultMessage() {
        return this.groupInfoGetResult.getErrorMessage();
    }

    public void setGroupInfoGetResult(GroupInfoGetResult groupInfoGetResult) {
        this.groupInfoGetResult = groupInfoGetResult;
    }
}
