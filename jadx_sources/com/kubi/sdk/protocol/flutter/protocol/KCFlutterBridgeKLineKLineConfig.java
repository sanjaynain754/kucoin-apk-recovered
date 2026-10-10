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
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKLineKLineConfig;", "", "waterMarkString", "", "(Ljava/lang/String;)V", "getWaterMarkString", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeKLineKLineConfig {

    @NotNull
    private final String waterMarkString;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KCFlutterBridgeKLineKLineConfig) && Intrinsics.areEqual(this.waterMarkString, ((KCFlutterBridgeKLineKLineConfig) other).waterMarkString);
    }

    public KCFlutterBridgeKLineKLineConfig(@NotNull String waterMarkString) {
        Intrinsics.checkNotNullParameter(waterMarkString, "waterMarkString");
        this.waterMarkString = waterMarkString;
    }

    public static /* synthetic */ KCFlutterBridgeKLineKLineConfig copy$default(KCFlutterBridgeKLineKLineConfig kCFlutterBridgeKLineKLineConfig, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeKLineKLineConfig.waterMarkString;
        }
        return kCFlutterBridgeKLineKLineConfig.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWaterMarkString() {
        return this.waterMarkString;
    }

    @NotNull
    public final KCFlutterBridgeKLineKLineConfig copy(@NotNull String waterMarkString) {
        Intrinsics.checkNotNullParameter(waterMarkString, "waterMarkString");
        return new KCFlutterBridgeKLineKLineConfig(waterMarkString);
    }

    @NotNull
    public final String getWaterMarkString() {
        return this.waterMarkString;
    }

    public int hashCode() {
        return this.waterMarkString.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("waterMarkString", this.waterMarkString);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeKLineKLineConfig(waterMarkString=" + this.waterMarkString + ')';
    }
}
