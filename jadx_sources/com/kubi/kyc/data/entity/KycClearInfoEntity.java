package com.kubi.kyc.data.entity;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycClearInfoEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kyc/data/entity/KycClearInfoEntity;", "", "clearStatus", "", "msg", "", "clearAt", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getClearStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMsg", "()Ljava/lang/String;", "getClearAt", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kyc/data/entity/KycClearInfoEntity;", "equals", "", "other", "hashCode", "toString", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KycClearInfoEntity {

    @SerializedName("clearAt")
    @Nullable
    private final String clearAt;

    @Nullable
    private final Integer clearStatus;

    @Nullable
    private final String msg;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycClearInfoEntity)) {
            return false;
        }
        KycClearInfoEntity kycClearInfoEntity = (KycClearInfoEntity) other;
        return Intrinsics.areEqual(this.clearStatus, kycClearInfoEntity.clearStatus) && Intrinsics.areEqual(this.msg, kycClearInfoEntity.msg) && Intrinsics.areEqual(this.clearAt, kycClearInfoEntity.clearAt);
    }

    public static /* synthetic */ KycClearInfoEntity copy$default(KycClearInfoEntity kycClearInfoEntity, Integer num, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = kycClearInfoEntity.clearStatus;
        }
        if ((i11 & 2) != 0) {
            str = kycClearInfoEntity.msg;
        }
        if ((i11 & 4) != 0) {
            str2 = kycClearInfoEntity.clearAt;
        }
        return kycClearInfoEntity.copy(num, str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getClearStatus() {
        return this.clearStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClearAt() {
        return this.clearAt;
    }

    @NotNull
    public final KycClearInfoEntity copy(@Nullable Integer clearStatus, @Nullable String msg, @Nullable String clearAt) {
        return new KycClearInfoEntity(clearStatus, msg, clearAt);
    }

    @Nullable
    public final String getClearAt() {
        return this.clearAt;
    }

    @Nullable
    public final Integer getClearStatus() {
        return this.clearStatus;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        Integer num = this.clearStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.msg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clearAt;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KycClearInfoEntity(clearStatus=" + this.clearStatus + ", msg=" + this.msg + ", clearAt=" + this.clearAt + ')';
    }

    public KycClearInfoEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2) {
        this.clearStatus = num;
        this.msg = str;
        this.clearAt = str2;
    }
}
