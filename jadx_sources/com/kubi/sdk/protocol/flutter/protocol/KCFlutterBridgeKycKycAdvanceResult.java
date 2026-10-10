package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeKycCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeKycKycAdvanceResult;", "", "isSuccess", "", "errorCode", "", "errorMessage", AppsFlyerProperties.CHANNEL, "data", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getData", "getErrorCode", "getErrorMessage", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeKycKycAdvanceResult {

    @NotNull
    private final String channel;

    @NotNull
    private final String data;

    @NotNull
    private final String errorCode;

    @NotNull
    private final String errorMessage;
    private final boolean isSuccess;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeKycKycAdvanceResult)) {
            return false;
        }
        KCFlutterBridgeKycKycAdvanceResult kCFlutterBridgeKycKycAdvanceResult = (KCFlutterBridgeKycKycAdvanceResult) other;
        return this.isSuccess == kCFlutterBridgeKycKycAdvanceResult.isSuccess && Intrinsics.areEqual(this.errorCode, kCFlutterBridgeKycKycAdvanceResult.errorCode) && Intrinsics.areEqual(this.errorMessage, kCFlutterBridgeKycKycAdvanceResult.errorMessage) && Intrinsics.areEqual(this.channel, kCFlutterBridgeKycKycAdvanceResult.channel) && Intrinsics.areEqual(this.data, kCFlutterBridgeKycKycAdvanceResult.data);
    }

    public KCFlutterBridgeKycKycAdvanceResult(boolean z11, @NotNull String errorCode, @NotNull String errorMessage, @NotNull String channel, @NotNull String data) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(data, "data");
        this.isSuccess = z11;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.channel = channel;
        this.data = data;
    }

    public static /* synthetic */ KCFlutterBridgeKycKycAdvanceResult copy$default(KCFlutterBridgeKycKycAdvanceResult kCFlutterBridgeKycKycAdvanceResult, boolean z11, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kCFlutterBridgeKycKycAdvanceResult.isSuccess;
        }
        if ((i11 & 2) != 0) {
            str = kCFlutterBridgeKycKycAdvanceResult.errorCode;
        }
        if ((i11 & 4) != 0) {
            str2 = kCFlutterBridgeKycKycAdvanceResult.errorMessage;
        }
        if ((i11 & 8) != 0) {
            str3 = kCFlutterBridgeKycKycAdvanceResult.channel;
        }
        if ((i11 & 16) != 0) {
            str4 = kCFlutterBridgeKycKycAdvanceResult.data;
        }
        String str5 = str4;
        String str6 = str2;
        return kCFlutterBridgeKycKycAdvanceResult.copy(z11, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final KCFlutterBridgeKycKycAdvanceResult copy(boolean isSuccess, @NotNull String errorCode, @NotNull String errorMessage, @NotNull String channel, @NotNull String data) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(data, "data");
        return new KCFlutterBridgeKycKycAdvanceResult(isSuccess, errorCode, errorMessage, channel, data);
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z11 = this.isSuccess;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return (((((((r11 * 31) + this.errorCode.hashCode()) * 31) + this.errorMessage.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.data.hashCode();
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isSuccess", Boolean.valueOf(this.isSuccess));
        linkedHashMap.put("errorCode", this.errorCode);
        linkedHashMap.put("errorMessage", this.errorMessage);
        linkedHashMap.put(AppsFlyerProperties.CHANNEL, this.channel);
        linkedHashMap.put("data", this.data);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeKycKycAdvanceResult(isSuccess=" + this.isSuccess + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", channel=" + this.channel + ", data=" + this.data + ')';
    }
}
