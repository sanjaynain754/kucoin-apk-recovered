package com.tencent.thumbplayer.tcmedia.core.connection;

import java.util.HashMap;

/* JADX INFO: loaded from: classes63.dex */
public class TPNativePlayerConnectionNode {
    private HashMap<Integer, HashMap<Integer, Long>> mLongMap;

    public boolean addAction(int i11) {
        if (this.mLongMap.containsKey(Integer.valueOf(i11))) {
            return false;
        }
        this.mLongMap.put(Integer.valueOf(i11), new HashMap<>());
        return true;
    }

    public void removeAction(int i11) {
        if (this.mLongMap.containsKey(Integer.valueOf(i11))) {
            this.mLongMap.remove(Integer.valueOf(i11));
        }
    }

    public boolean setLongActionConfig(int i11, int i12, long j11) {
        if (!this.mLongMap.containsKey(Integer.valueOf(i11))) {
            return false;
        }
        this.mLongMap.get(Integer.valueOf(i11)).put(Integer.valueOf(i12), Long.valueOf(j11));
        return true;
    }

    public TPNativePlayerConnectionNode() {
        this.mLongMap = null;
        this.mLongMap = new HashMap<>();
    }
}
