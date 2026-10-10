package com.tencent.imsdk.p128v2;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class V2TIMTTSResponse {
    private String msgID = "";
    private List<byte[]> audioDataList = new ArrayList();
    private boolean isFinished = false;

    public List<byte[]> getAudioDataList() {
        return this.audioDataList;
    }

    public String getMsgID() {
        return this.msgID;
    }

    public boolean isFinished() {
        return this.isFinished;
    }

    public void setAudioDataList(List<byte[]> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.audioDataList = list;
    }

    public void setFinished(boolean z11) {
        this.isFinished = z11;
    }

    public void setMsgID(String str) {
        if (str == null) {
            str = "";
        }
        this.msgID = str;
    }
}
