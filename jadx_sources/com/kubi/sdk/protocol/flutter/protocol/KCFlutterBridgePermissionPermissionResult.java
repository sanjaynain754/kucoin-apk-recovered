package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgePermissionCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgePermissionPermissionResult;", "", "resultType", "", DbParams.KEY_CHANNEL_RESULT, "(Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "getResultType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgePermissionPermissionResult {

    @NotNull
    private final String result;

    @NotNull
    private final String resultType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgePermissionPermissionResult)) {
            return false;
        }
        KCFlutterBridgePermissionPermissionResult kCFlutterBridgePermissionPermissionResult = (KCFlutterBridgePermissionPermissionResult) other;
        return Intrinsics.areEqual(this.resultType, kCFlutterBridgePermissionPermissionResult.resultType) && Intrinsics.areEqual(this.result, kCFlutterBridgePermissionPermissionResult.result);
    }

    public KCFlutterBridgePermissionPermissionResult(@NotNull String resultType, @NotNull String result) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        Intrinsics.checkNotNullParameter(result, "result");
        this.resultType = resultType;
        this.result = result;
    }

    public static /* synthetic */ KCFlutterBridgePermissionPermissionResult copy$default(KCFlutterBridgePermissionPermissionResult kCFlutterBridgePermissionPermissionResult, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgePermissionPermissionResult.resultType;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgePermissionPermissionResult.result;
        }
        return kCFlutterBridgePermissionPermissionResult.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResultType() {
        return this.resultType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final KCFlutterBridgePermissionPermissionResult copy(@NotNull String resultType, @NotNull String result) {
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        Intrinsics.checkNotNullParameter(result, "result");
        return new KCFlutterBridgePermissionPermissionResult(resultType, result);
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final String getResultType() {
        return this.resultType;
    }

    public int hashCode() {
        return (this.resultType.hashCode() * 31) + this.result.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("resultType", this.resultType);
        linkedHashMap.put(DbParams.KEY_CHANNEL_RESULT, this.result);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgePermissionPermissionResult(resultType=" + this.resultType + ", result=" + this.result + ')';
    }
}
