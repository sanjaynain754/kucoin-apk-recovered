package com.facebook.react.uimanager.events;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes45.dex */
public class TouchEventCoalescingKeyHelper {
    private final SparseIntArray mDownTimeToCoalescingKey = new SparseIntArray();

    public void addCoalescingKey(long j11) {
        this.mDownTimeToCoalescingKey.put((int) j11, 0);
    }

    public short getCoalescingKey(long j11) {
        int i11 = this.mDownTimeToCoalescingKey.get((int) j11, -1);
        if (i11 != -1) {
            return (short) (i11 & 65535);
        }
        throw new RuntimeException("Tried to get non-existent cookie");
    }

    public boolean hasCoalescingKey(long j11) {
        return this.mDownTimeToCoalescingKey.get((int) j11, -1) != -1;
    }

    public void incrementCoalescingKey(long j11) {
        int i11 = (int) j11;
        int i12 = this.mDownTimeToCoalescingKey.get(i11, -1);
        if (i12 == -1) {
            throw new RuntimeException("Tried to increment non-existent cookie");
        }
        this.mDownTimeToCoalescingKey.put(i11, i12 + 1);
    }

    public void removeCoalescingKey(long j11) {
        this.mDownTimeToCoalescingKey.delete((int) j11);
    }
}
