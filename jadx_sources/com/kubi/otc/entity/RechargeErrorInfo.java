package com.kubi.otc.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/otc/entity/RechargeErrorInfo;", "", "code", "", "msg", "data", "Lcom/kubi/otc/entity/RechargeInfoErrorData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/RechargeInfoErrorData;)V", "getCode", "()Ljava/lang/String;", "getMsg", "getData", "()Lcom/kubi/otc/entity/RechargeInfoErrorData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RechargeErrorInfo {

    @Nullable
    private final String code;

    @Nullable
    private final RechargeInfoErrorData data;

    @Nullable
    private final String msg;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RechargeErrorInfo)) {
            return false;
        }
        RechargeErrorInfo rechargeErrorInfo = (RechargeErrorInfo) other;
        return Intrinsics.areEqual(this.code, rechargeErrorInfo.code) && Intrinsics.areEqual(this.msg, rechargeErrorInfo.msg) && Intrinsics.areEqual(this.data, rechargeErrorInfo.data);
    }

    public static /* synthetic */ RechargeErrorInfo copy$default(RechargeErrorInfo rechargeErrorInfo, String str, String str2, RechargeInfoErrorData rechargeInfoErrorData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rechargeErrorInfo.code;
        }
        if ((i11 & 2) != 0) {
            str2 = rechargeErrorInfo.msg;
        }
        if ((i11 & 4) != 0) {
            rechargeInfoErrorData = rechargeErrorInfo.data;
        }
        return rechargeErrorInfo.copy(str, str2, rechargeInfoErrorData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RechargeInfoErrorData getData() {
        return this.data;
    }

    @NotNull
    public final RechargeErrorInfo copy(@Nullable String code, @Nullable String msg, @Nullable RechargeInfoErrorData data) {
        return new RechargeErrorInfo(code, msg, data);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final RechargeInfoErrorData getData() {
        return this.data;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.msg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        RechargeInfoErrorData rechargeInfoErrorData = this.data;
        return iHashCode2 + (rechargeInfoErrorData != null ? rechargeInfoErrorData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RechargeErrorInfo(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ')';
    }

    public RechargeErrorInfo(@Nullable String str, @Nullable String str2, @Nullable RechargeInfoErrorData rechargeInfoErrorData) {
        this.code = str;
        this.msg = str2;
        this.data = rechargeInfoErrorData;
    }
}
