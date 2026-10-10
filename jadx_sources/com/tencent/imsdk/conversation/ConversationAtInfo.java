package com.tencent.imsdk.conversation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes59.dex */
public class ConversationAtInfo implements Serializable {
    public static final String AT_ALL_TAG = "__kImSDK_MesssageAtALL__";
    public static final int TIM_AT_ALL = 2;
    public static final int TIM_AT_ALL_AT_ME = 3;
    public static final int TIM_AT_ME = 1;
    public static final int TIM_AT_UNKNOWN = 0;
    private long atMessageSequence;
    private List<Integer> atTypes = new ArrayList();

    public void addAtType(int i11) {
        this.atTypes.add(Integer.valueOf(i11));
    }

    public long getAtMessageSequence() {
        return this.atMessageSequence;
    }

    public int getAtType() {
        Iterator<Integer> it = this.atTypes.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue == 1) {
                i11 |= 1;
            } else if (iIntValue == 2) {
                i11 |= 2;
            }
        }
        return i11;
    }
}
