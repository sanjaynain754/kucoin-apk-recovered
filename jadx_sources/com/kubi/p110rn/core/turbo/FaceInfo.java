package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33577c3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSecurityTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/FaceInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "advanceLivenessId", "", "transactionId", "sKey", "image", C33577c3.f69334H, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvanceLivenessId", "()Ljava/lang/String;", "getTransactionId", "getSKey", "getImage", "getDeviceId", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSecurityTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSecurityTurboModule.kt\ncom/kubi/rn/core/turbo/FaceInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
public final /* data */ class FaceInfo implements WritableMapSerializable {

    @Nullable
    private final String advanceLivenessId;

    @Nullable
    private final String deviceId;

    @Nullable
    private final String image;

    @Nullable
    private final String sKey;

    @Nullable
    private final String transactionId;

    public FaceInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceInfo)) {
            return false;
        }
        FaceInfo faceInfo = (FaceInfo) other;
        return Intrinsics.areEqual(this.advanceLivenessId, faceInfo.advanceLivenessId) && Intrinsics.areEqual(this.transactionId, faceInfo.transactionId) && Intrinsics.areEqual(this.sKey, faceInfo.sKey) && Intrinsics.areEqual(this.image, faceInfo.image) && Intrinsics.areEqual(this.deviceId, faceInfo.deviceId);
    }

    public FaceInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.advanceLivenessId = str;
        this.transactionId = str2;
        this.sKey = str3;
        this.image = str4;
        this.deviceId = str5;
    }

    public static /* synthetic */ FaceInfo copy$default(FaceInfo faceInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = faceInfo.advanceLivenessId;
        }
        if ((i11 & 2) != 0) {
            str2 = faceInfo.transactionId;
        }
        if ((i11 & 4) != 0) {
            str3 = faceInfo.sKey;
        }
        if ((i11 & 8) != 0) {
            str4 = faceInfo.image;
        }
        if ((i11 & 16) != 0) {
            str5 = faceInfo.deviceId;
        }
        String str6 = str5;
        String str7 = str3;
        return faceInfo.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdvanceLivenessId() {
        return this.advanceLivenessId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSKey() {
        return this.sKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final FaceInfo copy(@Nullable String advanceLivenessId, @Nullable String transactionId, @Nullable String sKey, @Nullable String image, @Nullable String deviceId) {
        return new FaceInfo(advanceLivenessId, transactionId, sKey, image, deviceId);
    }

    @Nullable
    public final String getAdvanceLivenessId() {
        return this.advanceLivenessId;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getSKey() {
        return this.sKey;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.advanceLivenessId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.transactionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.image;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaceInfo(advanceLivenessId=" + this.advanceLivenessId + ", transactionId=" + this.transactionId + ", sKey=" + this.sKey + ", image=" + this.image + ", deviceId=" + this.deviceId + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.advanceLivenessId;
        if (str != null) {
            writableMapCreateMap.putString("advanceLivenessId", str.toString());
        }
        String str2 = this.transactionId;
        if (str2 != null) {
            writableMapCreateMap.putString("transactionId", str2.toString());
        }
        String str3 = this.sKey;
        if (str3 != null) {
            writableMapCreateMap.putString("sKey", str3.toString());
        }
        String str4 = this.image;
        if (str4 != null) {
            writableMapCreateMap.putString("image", str4.toString());
        }
        String str5 = this.deviceId;
        if (str5 != null) {
            writableMapCreateMap.putString(C33577c3.f69334H, str5.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ FaceInfo(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}
