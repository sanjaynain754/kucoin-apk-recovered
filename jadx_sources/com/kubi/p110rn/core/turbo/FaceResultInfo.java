package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSecurityTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/FaceResultInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "success", "", DbParams.KEY_CHANNEL_RESULT, "Lcom/kubi/rn/core/turbo/FaceInfo;", "code", "", "message", "", "<init>", "(Ljava/lang/Boolean;Lcom/kubi/rn/core/turbo/FaceInfo;Ljava/lang/Double;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResult", "()Lcom/kubi/rn/core/turbo/FaceInfo;", "getCode", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMessage", "()Ljava/lang/String;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lcom/kubi/rn/core/turbo/FaceInfo;Ljava/lang/Double;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/FaceResultInfo;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSecurityTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSecurityTurboModule.kt\ncom/kubi/rn/core/turbo/FaceResultInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
public final /* data */ class FaceResultInfo implements WritableMapSerializable {

    @Nullable
    private final Double code;

    @Nullable
    private final String message;

    @Nullable
    private final FaceInfo result;

    @Nullable
    private final Boolean success;

    public FaceResultInfo() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceResultInfo)) {
            return false;
        }
        FaceResultInfo faceResultInfo = (FaceResultInfo) other;
        return Intrinsics.areEqual(this.success, faceResultInfo.success) && Intrinsics.areEqual(this.result, faceResultInfo.result) && Intrinsics.areEqual((Object) this.code, (Object) faceResultInfo.code) && Intrinsics.areEqual(this.message, faceResultInfo.message);
    }

    public FaceResultInfo(@Nullable Boolean bool, @Nullable FaceInfo faceInfo, @Nullable Double d11, @Nullable String str) {
        this.success = bool;
        this.result = faceInfo;
        this.code = d11;
        this.message = str;
    }

    public static /* synthetic */ FaceResultInfo copy$default(FaceResultInfo faceResultInfo, Boolean bool, FaceInfo faceInfo, Double d11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = faceResultInfo.success;
        }
        if ((i11 & 2) != 0) {
            faceInfo = faceResultInfo.result;
        }
        if ((i11 & 4) != 0) {
            d11 = faceResultInfo.code;
        }
        if ((i11 & 8) != 0) {
            str = faceResultInfo.message;
        }
        return faceResultInfo.copy(bool, faceInfo, d11, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FaceInfo getResult() {
        return this.result;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final FaceResultInfo copy(@Nullable Boolean success, @Nullable FaceInfo result, @Nullable Double code, @Nullable String message) {
        return new FaceResultInfo(success, result, code, message);
    }

    @Nullable
    public final Double getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final FaceInfo getResult() {
        return this.result;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        FaceInfo faceInfo = this.result;
        int iHashCode2 = (iHashCode + (faceInfo == null ? 0 : faceInfo.hashCode())) * 31;
        Double d11 = this.code;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str = this.message;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FaceResultInfo(success=" + this.success + ", result=" + this.result + ", code=" + this.code + ", message=" + this.message + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Boolean bool = this.success;
        if (bool != null) {
            writableMapCreateMap.putBoolean("success", bool.booleanValue());
        }
        FaceInfo faceInfo = this.result;
        if (faceInfo != null) {
            writableMapCreateMap.putString(DbParams.KEY_CHANNEL_RESULT, faceInfo.toString());
        }
        Double d11 = this.code;
        if (d11 != null) {
            writableMapCreateMap.putDouble("code", d11.doubleValue());
        }
        String str = this.message;
        if (str != null) {
            writableMapCreateMap.putString("message", str.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ FaceResultInfo(Boolean bool, FaceInfo faceInfo, Double d11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : faceInfo, (i11 & 4) != 0 ? null : d11, (i11 & 8) != 0 ? null : str);
    }
}
