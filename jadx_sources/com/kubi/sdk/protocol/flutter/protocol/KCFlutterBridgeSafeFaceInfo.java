package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C33577c3;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeSafeCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeSafeFaceInfo;", "", "advanceLivenessId", "", "transactionId", "sKey", "image", C33577c3.f69334H, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvanceLivenessId", "()Ljava/lang/String;", "getDeviceId", "getImage", "getSKey", "getTransactionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeSafeFaceInfo {

    @NotNull
    private final String advanceLivenessId;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String image;

    @NotNull
    private final String sKey;

    @NotNull
    private final String transactionId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeSafeFaceInfo)) {
            return false;
        }
        KCFlutterBridgeSafeFaceInfo kCFlutterBridgeSafeFaceInfo = (KCFlutterBridgeSafeFaceInfo) other;
        return Intrinsics.areEqual(this.advanceLivenessId, kCFlutterBridgeSafeFaceInfo.advanceLivenessId) && Intrinsics.areEqual(this.transactionId, kCFlutterBridgeSafeFaceInfo.transactionId) && Intrinsics.areEqual(this.sKey, kCFlutterBridgeSafeFaceInfo.sKey) && Intrinsics.areEqual(this.image, kCFlutterBridgeSafeFaceInfo.image) && Intrinsics.areEqual(this.deviceId, kCFlutterBridgeSafeFaceInfo.deviceId);
    }

    public KCFlutterBridgeSafeFaceInfo(@NotNull String advanceLivenessId, @NotNull String transactionId, @NotNull String sKey, @NotNull String image, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(advanceLivenessId, "advanceLivenessId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(sKey, "sKey");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        this.advanceLivenessId = advanceLivenessId;
        this.transactionId = transactionId;
        this.sKey = sKey;
        this.image = image;
        this.deviceId = deviceId;
    }

    public static /* synthetic */ KCFlutterBridgeSafeFaceInfo copy$default(KCFlutterBridgeSafeFaceInfo kCFlutterBridgeSafeFaceInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeSafeFaceInfo.advanceLivenessId;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgeSafeFaceInfo.transactionId;
        }
        if ((i11 & 4) != 0) {
            str3 = kCFlutterBridgeSafeFaceInfo.sKey;
        }
        if ((i11 & 8) != 0) {
            str4 = kCFlutterBridgeSafeFaceInfo.image;
        }
        if ((i11 & 16) != 0) {
            str5 = kCFlutterBridgeSafeFaceInfo.deviceId;
        }
        String str6 = str5;
        String str7 = str3;
        return kCFlutterBridgeSafeFaceInfo.copy(str, str2, str7, str4, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdvanceLivenessId() {
        return this.advanceLivenessId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSKey() {
        return this.sKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final KCFlutterBridgeSafeFaceInfo copy(@NotNull String advanceLivenessId, @NotNull String transactionId, @NotNull String sKey, @NotNull String image, @NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(advanceLivenessId, "advanceLivenessId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(sKey, "sKey");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        return new KCFlutterBridgeSafeFaceInfo(advanceLivenessId, transactionId, sKey, image, deviceId);
    }

    @NotNull
    public final String getAdvanceLivenessId() {
        return this.advanceLivenessId;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String getSKey() {
        return this.sKey;
    }

    @NotNull
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        return (((((((this.advanceLivenessId.hashCode() * 31) + this.transactionId.hashCode()) * 31) + this.sKey.hashCode()) * 31) + this.image.hashCode()) * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("advanceLivenessId", this.advanceLivenessId);
        linkedHashMap.put("transactionId", this.transactionId);
        linkedHashMap.put("sKey", this.sKey);
        linkedHashMap.put("image", this.image);
        linkedHashMap.put(C33577c3.f69334H, this.deviceId);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeSafeFaceInfo(advanceLivenessId=" + this.advanceLivenessId + ", transactionId=" + this.transactionId + ", sKey=" + this.sKey + ", image=" + this.image + ", deviceId=" + this.deviceId + ')';
    }
}
