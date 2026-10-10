package com.tencent.imsdk.message;

import com.tencent.imsdk.relationship.UserInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class MessageReactionUserResult implements Serializable {
    private boolean isFinished;
    private int nextSequence;
    private List<UserInfo> userInfoList = new ArrayList();

    public boolean getIsFinished() {
        return this.isFinished;
    }

    public int getNextSequence() {
        return this.nextSequence;
    }

    public List<UserInfo> getUserInfoList() {
        return this.userInfoList;
    }

    public void setFinished(boolean z11) {
        this.isFinished = z11;
    }

    public void setNextSequence(int i11) {
        this.nextSequence = i11;
    }

    public void setUserInfoList(List<UserInfo> list) {
        this.userInfoList = list;
    }
}
