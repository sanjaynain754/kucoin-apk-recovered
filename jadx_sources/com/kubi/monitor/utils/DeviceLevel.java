package com.kubi.monitor.utils;

import p852kotlin.Metadata;

/* JADX INFO: compiled from: DeviceLevelHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/monitor/utils/DeviceLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "setValue", "(I)V", "BEST", "HIGH", "MIDDLE", "LOW", "BAD", "UN_KNOW", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public enum DeviceLevel {
    BEST(5),
    HIGH(4),
    MIDDLE(3),
    LOW(2),
    BAD(1),
    UN_KNOW(-1);

    private int value;

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i11) {
        this.value = i11;
    }

    DeviceLevel(int i11) {
        this.value = i11;
    }
}
