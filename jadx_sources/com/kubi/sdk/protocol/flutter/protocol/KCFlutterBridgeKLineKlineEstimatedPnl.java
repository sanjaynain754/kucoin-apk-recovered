package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeKLineCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKlineEstimatedPnl;", "", "estimatedPnl", "", "estimatedPnlRate", "pnlRate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEstimatedPnl", "()Ljava/lang/String;", "getEstimatedPnlRate", "getPnlRate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeKLineKlineEstimatedPnl {

    @NotNull
    private final String estimatedPnl;

    @NotNull
    private final String estimatedPnlRate;

    @Nullable
    private final String pnlRate;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeKLineKlineEstimatedPnl)) {
            return false;
        }
        KCFlutterBridgeKLineKlineEstimatedPnl kCFlutterBridgeKLineKlineEstimatedPnl = (KCFlutterBridgeKLineKlineEstimatedPnl) other;
        return Intrinsics.areEqual(this.estimatedPnl, kCFlutterBridgeKLineKlineEstimatedPnl.estimatedPnl) && Intrinsics.areEqual(this.estimatedPnlRate, kCFlutterBridgeKLineKlineEstimatedPnl.estimatedPnlRate) && Intrinsics.areEqual(this.pnlRate, kCFlutterBridgeKLineKlineEstimatedPnl.pnlRate);
    }

    public KCFlutterBridgeKLineKlineEstimatedPnl(@NotNull String estimatedPnl, @NotNull String estimatedPnlRate, @Nullable String str) {
        Intrinsics.checkNotNullParameter(estimatedPnl, "estimatedPnl");
        Intrinsics.checkNotNullParameter(estimatedPnlRate, "estimatedPnlRate");
        this.estimatedPnl = estimatedPnl;
        this.estimatedPnlRate = estimatedPnlRate;
        this.pnlRate = str;
    }

    public static /* synthetic */ KCFlutterBridgeKLineKlineEstimatedPnl copy$default(KCFlutterBridgeKLineKlineEstimatedPnl kCFlutterBridgeKLineKlineEstimatedPnl, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeKLineKlineEstimatedPnl.estimatedPnl;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgeKLineKlineEstimatedPnl.estimatedPnlRate;
        }
        if ((i11 & 4) != 0) {
            str3 = kCFlutterBridgeKLineKlineEstimatedPnl.pnlRate;
        }
        return kCFlutterBridgeKLineKlineEstimatedPnl.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEstimatedPnl() {
        return this.estimatedPnl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEstimatedPnlRate() {
        return this.estimatedPnlRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    @NotNull
    public final KCFlutterBridgeKLineKlineEstimatedPnl copy(@NotNull String estimatedPnl, @NotNull String estimatedPnlRate, @Nullable String pnlRate) {
        Intrinsics.checkNotNullParameter(estimatedPnl, "estimatedPnl");
        Intrinsics.checkNotNullParameter(estimatedPnlRate, "estimatedPnlRate");
        return new KCFlutterBridgeKLineKlineEstimatedPnl(estimatedPnl, estimatedPnlRate, pnlRate);
    }

    @NotNull
    public final String getEstimatedPnl() {
        return this.estimatedPnl;
    }

    @NotNull
    public final String getEstimatedPnlRate() {
        return this.estimatedPnlRate;
    }

    @Nullable
    public final String getPnlRate() {
        return this.pnlRate;
    }

    public int hashCode() {
        int iHashCode = ((this.estimatedPnl.hashCode() * 31) + this.estimatedPnlRate.hashCode()) * 31;
        String str = this.pnlRate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("estimatedPnl", this.estimatedPnl);
        linkedHashMap.put("estimatedPnlRate", this.estimatedPnlRate);
        linkedHashMap.put("pnlRate", this.pnlRate);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeKLineKlineEstimatedPnl(estimatedPnl=" + this.estimatedPnl + ", estimatedPnlRate=" + this.estimatedPnlRate + ", pnlRate=" + this.pnlRate + ')';
    }
}
