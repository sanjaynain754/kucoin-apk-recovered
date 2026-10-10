package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCommonTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/OpenScanResult;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "success", "", "qrCode", "", "msg", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getQrCode", "()Ljava/lang/String;", "getMsg", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/OpenScanResult;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCommonTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCommonTurboModule.kt\ncom/kubi/rn/core/turbo/OpenScanResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
public final /* data */ class OpenScanResult implements WritableMapSerializable {

    @Nullable
    private final String msg;

    @Nullable
    private final String qrCode;

    @Nullable
    private final Boolean success;

    public OpenScanResult() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenScanResult)) {
            return false;
        }
        OpenScanResult openScanResult = (OpenScanResult) other;
        return Intrinsics.areEqual(this.success, openScanResult.success) && Intrinsics.areEqual(this.qrCode, openScanResult.qrCode) && Intrinsics.areEqual(this.msg, openScanResult.msg);
    }

    public OpenScanResult(@Nullable Boolean bool, @Nullable String str, @Nullable String str2) {
        this.success = bool;
        this.qrCode = str;
        this.msg = str2;
    }

    public static /* synthetic */ OpenScanResult copy$default(OpenScanResult openScanResult, Boolean bool, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = openScanResult.success;
        }
        if ((i11 & 2) != 0) {
            str = openScanResult.qrCode;
        }
        if ((i11 & 4) != 0) {
            str2 = openScanResult.msg;
        }
        return openScanResult.copy(bool, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final OpenScanResult copy(@Nullable Boolean success, @Nullable String qrCode, @Nullable String msg) {
        return new OpenScanResult(success, qrCode, msg);
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final String getQrCode() {
        return this.qrCode;
    }

    @Nullable
    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.qrCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.msg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenScanResult(success=" + this.success + ", qrCode=" + this.qrCode + ", msg=" + this.msg + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Boolean bool = this.success;
        if (bool != null) {
            writableMapCreateMap.putBoolean("success", bool.booleanValue());
        }
        String str = this.qrCode;
        if (str != null) {
            writableMapCreateMap.putString("qrCode", str.toString());
        }
        String str2 = this.msg;
        if (str2 != null) {
            writableMapCreateMap.putString("msg", str2.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ OpenScanResult(Boolean bool, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}
