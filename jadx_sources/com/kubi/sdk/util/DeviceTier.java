package com.kubi.sdk.util;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: DeviceTierProvider.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/util/DeviceTier;", "", "intValue", "", "strValue", "", "isLowDevice", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;Z)V", "getIntValue", "()I", "getStrValue", "()Ljava/lang/String;", "()Z", "UNKNOWN", "ULTRA_LOW", "LOW", "MID", "HIGH", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public enum DeviceTier {
    UNKNOWN(0, "UNKNOWN", true),
    ULTRA_LOW(10, "ULTRA_LOW", true),
    LOW(20, "LOW", true),
    MID(30, "MID", false),
    HIGH(40, "HIGH", false);


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f48105c = EnumEntriesKt.enumEntries(m58262a());
    private final int intValue;
    private final boolean isLowDevice;

    @NotNull
    private final String strValue;

    @NotNull
    public static EnumEntries<DeviceTier> getEntries() {
        return f48105c;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    @NotNull
    public final String getStrValue() {
        return this.strValue;
    }

    /* JADX INFO: renamed from: isLowDevice, reason: from getter */
    public final boolean getIsLowDevice() {
        return this.isLowDevice;
    }

    DeviceTier(int i11, String str, boolean z11) {
        this.intValue = i11;
        this.strValue = str;
        this.isLowDevice = z11;
    }
}
