package com.kubi.kumex.data.platform.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SystemConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/SystemConfig;", "", "kumexEnable", "", "<init>", "(Z)V", "getKumexEnable", "()Z", "setKumexEnable", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SystemConfig {

    @SerializedName("kumexEnable")
    private boolean kumexEnable;

    public SystemConfig() {
        this(false, 1, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SystemConfig) && this.kumexEnable == ((SystemConfig) other).kumexEnable;
    }

    public SystemConfig(boolean z11) {
        this.kumexEnable = z11;
    }

    public static /* synthetic */ SystemConfig copy$default(SystemConfig systemConfig, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = systemConfig.kumexEnable;
        }
        return systemConfig.copy(z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getKumexEnable() {
        return this.kumexEnable;
    }

    @NotNull
    public final SystemConfig copy(boolean kumexEnable) {
        return new SystemConfig(kumexEnable);
    }

    public final boolean getKumexEnable() {
        return this.kumexEnable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.kumexEnable);
    }

    public final void setKumexEnable(boolean z11) {
        this.kumexEnable = z11;
    }

    @NotNull
    public String toString() {
        return "SystemConfig(kumexEnable=" + this.kumexEnable + ')';
    }

    public /* synthetic */ SystemConfig(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
