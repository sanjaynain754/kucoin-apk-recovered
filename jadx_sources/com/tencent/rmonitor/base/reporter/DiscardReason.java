package com.tencent.rmonitor.base.reporter;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/DiscardReason;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "CACHE_EXPIRE", "RETRY_EXCEEDED", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public enum DiscardReason {
    CACHE_EXPIRE(1),
    RETRY_EXCEEDED(2);

    private final int value;

    public final int getValue() {
        return this.value;
    }

    DiscardReason(int i11) {
        this.value = i11;
    }
}
