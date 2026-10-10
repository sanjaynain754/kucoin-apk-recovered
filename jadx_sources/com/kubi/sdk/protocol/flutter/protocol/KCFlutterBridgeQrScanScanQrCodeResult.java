package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeQrScanCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeQrScanScanQrCodeResult;", "", "handled", "", "qrCodeOriginString", "", "(ZLjava/lang/String;)V", "getHandled", "()Z", "getQrCodeOriginString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeQrScanScanQrCodeResult {
    private final boolean handled;

    @NotNull
    private final String qrCodeOriginString;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeQrScanScanQrCodeResult)) {
            return false;
        }
        KCFlutterBridgeQrScanScanQrCodeResult kCFlutterBridgeQrScanScanQrCodeResult = (KCFlutterBridgeQrScanScanQrCodeResult) other;
        return this.handled == kCFlutterBridgeQrScanScanQrCodeResult.handled && Intrinsics.areEqual(this.qrCodeOriginString, kCFlutterBridgeQrScanScanQrCodeResult.qrCodeOriginString);
    }

    public KCFlutterBridgeQrScanScanQrCodeResult(boolean z11, @NotNull String qrCodeOriginString) {
        Intrinsics.checkNotNullParameter(qrCodeOriginString, "qrCodeOriginString");
        this.handled = z11;
        this.qrCodeOriginString = qrCodeOriginString;
    }

    public static /* synthetic */ KCFlutterBridgeQrScanScanQrCodeResult copy$default(KCFlutterBridgeQrScanScanQrCodeResult kCFlutterBridgeQrScanScanQrCodeResult, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kCFlutterBridgeQrScanScanQrCodeResult.handled;
        }
        if ((i11 & 2) != 0) {
            str = kCFlutterBridgeQrScanScanQrCodeResult.qrCodeOriginString;
        }
        return kCFlutterBridgeQrScanScanQrCodeResult.copy(z11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHandled() {
        return this.handled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQrCodeOriginString() {
        return this.qrCodeOriginString;
    }

    @NotNull
    public final KCFlutterBridgeQrScanScanQrCodeResult copy(boolean handled, @NotNull String qrCodeOriginString) {
        Intrinsics.checkNotNullParameter(qrCodeOriginString, "qrCodeOriginString");
        return new KCFlutterBridgeQrScanScanQrCodeResult(handled, qrCodeOriginString);
    }

    public final boolean getHandled() {
        return this.handled;
    }

    @NotNull
    public final String getQrCodeOriginString() {
        return this.qrCodeOriginString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.handled;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return (r11 * 31) + this.qrCodeOriginString.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("handled", Boolean.valueOf(this.handled));
        linkedHashMap.put("qrCodeOriginString", this.qrCodeOriginString);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeQrScanScanQrCodeResult(handled=" + this.handled + ", qrCodeOriginString=" + this.qrCodeOriginString + ')';
    }
}
