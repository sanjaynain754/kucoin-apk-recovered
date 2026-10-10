package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeSafeCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dJ\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSafeFaceResultInfo;", "", "success", "", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSafeFaceInfo;", "code", "", "message", "", "(ZLcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSafeFaceInfo;JLjava/lang/String;)V", "getCode", "()J", "getMessage", "()Ljava/lang/String;", "getResult", "()Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSafeFaceInfo;", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeSafeFaceResultInfo {
    private final long code;

    @NotNull
    private final String message;

    @NotNull
    private final KCFlutterBridgeSafeFaceInfo result;
    private final boolean success;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeSafeFaceResultInfo)) {
            return false;
        }
        KCFlutterBridgeSafeFaceResultInfo kCFlutterBridgeSafeFaceResultInfo = (KCFlutterBridgeSafeFaceResultInfo) other;
        return this.success == kCFlutterBridgeSafeFaceResultInfo.success && Intrinsics.areEqual(this.result, kCFlutterBridgeSafeFaceResultInfo.result) && this.code == kCFlutterBridgeSafeFaceResultInfo.code && Intrinsics.areEqual(this.message, kCFlutterBridgeSafeFaceResultInfo.message);
    }

    public KCFlutterBridgeSafeFaceResultInfo(boolean z11, @NotNull KCFlutterBridgeSafeFaceInfo result, long j11, @NotNull String message) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        this.success = z11;
        this.result = result;
        this.code = j11;
        this.message = message;
    }

    public static /* synthetic */ KCFlutterBridgeSafeFaceResultInfo copy$default(KCFlutterBridgeSafeFaceResultInfo kCFlutterBridgeSafeFaceResultInfo, boolean z11, KCFlutterBridgeSafeFaceInfo kCFlutterBridgeSafeFaceInfo, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kCFlutterBridgeSafeFaceResultInfo.success;
        }
        if ((i11 & 2) != 0) {
            kCFlutterBridgeSafeFaceInfo = kCFlutterBridgeSafeFaceResultInfo.result;
        }
        if ((i11 & 4) != 0) {
            j11 = kCFlutterBridgeSafeFaceResultInfo.code;
        }
        if ((i11 & 8) != 0) {
            str = kCFlutterBridgeSafeFaceResultInfo.message;
        }
        String str2 = str;
        return kCFlutterBridgeSafeFaceResultInfo.copy(z11, kCFlutterBridgeSafeFaceInfo, j11, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KCFlutterBridgeSafeFaceInfo getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final KCFlutterBridgeSafeFaceResultInfo copy(boolean success, @NotNull KCFlutterBridgeSafeFaceInfo result, long code, @NotNull String message) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(message, "message");
        return new KCFlutterBridgeSafeFaceResultInfo(success, result, code, message);
    }

    public final long getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final KCFlutterBridgeSafeFaceInfo getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z11 = this.success;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return (((((r11 * 31) + this.result.hashCode()) * 31) + Long.hashCode(this.code)) * 31) + this.message.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("success", Boolean.valueOf(this.success));
        linkedHashMap.put(DbParams.KEY_CHANNEL_RESULT, this.result.toMap());
        linkedHashMap.put("code", Long.valueOf(this.code));
        linkedHashMap.put("message", this.message);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeSafeFaceResultInfo(success=" + this.success + ", result=" + this.result + ", code=" + this.code + ", message=" + this.message + ')';
    }
}
