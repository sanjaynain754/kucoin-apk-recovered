package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeAssetsCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAssetsCoinInfo;", "", "code", "", FirebaseAnalytics.Param.CURRENCY, "fullName", "iconUrl", "isLegal", "", "precision", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getCode", "()Ljava/lang/String;", "getCurrency", "getFullName", "getIconUrl", "()Z", "getPrecision", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeAssetsCoinInfo {

    @NotNull
    private final String code;

    @NotNull
    private final String currency;

    @NotNull
    private final String fullName;

    @NotNull
    private final String iconUrl;
    private final boolean isLegal;
    private final long precision;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeAssetsCoinInfo)) {
            return false;
        }
        KCFlutterBridgeAssetsCoinInfo kCFlutterBridgeAssetsCoinInfo = (KCFlutterBridgeAssetsCoinInfo) other;
        return Intrinsics.areEqual(this.code, kCFlutterBridgeAssetsCoinInfo.code) && Intrinsics.areEqual(this.currency, kCFlutterBridgeAssetsCoinInfo.currency) && Intrinsics.areEqual(this.fullName, kCFlutterBridgeAssetsCoinInfo.fullName) && Intrinsics.areEqual(this.iconUrl, kCFlutterBridgeAssetsCoinInfo.iconUrl) && this.isLegal == kCFlutterBridgeAssetsCoinInfo.isLegal && this.precision == kCFlutterBridgeAssetsCoinInfo.precision;
    }

    public KCFlutterBridgeAssetsCoinInfo(@NotNull String code, @NotNull String currency, @NotNull String fullName, @NotNull String iconUrl, boolean z11, long j11) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.code = code;
        this.currency = currency;
        this.fullName = fullName;
        this.iconUrl = iconUrl;
        this.isLegal = z11;
        this.precision = j11;
    }

    public static /* synthetic */ KCFlutterBridgeAssetsCoinInfo copy$default(KCFlutterBridgeAssetsCoinInfo kCFlutterBridgeAssetsCoinInfo, String str, String str2, String str3, String str4, boolean z11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCFlutterBridgeAssetsCoinInfo.code;
        }
        if ((i11 & 2) != 0) {
            str2 = kCFlutterBridgeAssetsCoinInfo.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = kCFlutterBridgeAssetsCoinInfo.fullName;
        }
        if ((i11 & 8) != 0) {
            str4 = kCFlutterBridgeAssetsCoinInfo.iconUrl;
        }
        if ((i11 & 16) != 0) {
            z11 = kCFlutterBridgeAssetsCoinInfo.isLegal;
        }
        if ((i11 & 32) != 0) {
            j11 = kCFlutterBridgeAssetsCoinInfo.precision;
        }
        long j12 = j11;
        boolean z12 = z11;
        String str5 = str3;
        return kCFlutterBridgeAssetsCoinInfo.copy(str, str2, str5, str4, z12, j12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLegal() {
        return this.isLegal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPrecision() {
        return this.precision;
    }

    @NotNull
    public final KCFlutterBridgeAssetsCoinInfo copy(@NotNull String code, @NotNull String currency, @NotNull String fullName, @NotNull String iconUrl, boolean isLegal, long precision) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        return new KCFlutterBridgeAssetsCoinInfo(code, currency, fullName, iconUrl, isLegal, precision);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getFullName() {
        return this.fullName;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final long getPrecision() {
        return this.precision;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = ((((((this.code.hashCode() * 31) + this.currency.hashCode()) * 31) + this.fullName.hashCode()) * 31) + this.iconUrl.hashCode()) * 31;
        boolean z11 = this.isLegal;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return ((iHashCode + r11) * 31) + Long.hashCode(this.precision);
    }

    public final boolean isLegal() {
        return this.isLegal;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", this.code);
        linkedHashMap.put(FirebaseAnalytics.Param.CURRENCY, this.currency);
        linkedHashMap.put("fullName", this.fullName);
        linkedHashMap.put("iconUrl", this.iconUrl);
        linkedHashMap.put("isLegal", Boolean.valueOf(this.isLegal));
        linkedHashMap.put("precision", Long.valueOf(this.precision));
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeAssetsCoinInfo(code=" + this.code + ", currency=" + this.currency + ", fullName=" + this.fullName + ", iconUrl=" + this.iconUrl + ", isLegal=" + this.isLegal + ", precision=" + this.precision + ')';
    }
}
