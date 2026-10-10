package com.kubi.assets.freeze.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawPreFreezeEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/assets/freeze/entity/WithdrawPreFreezeEntity;", "", "frozenStatus", "", "popupConfigId", "expiredAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getFrozenStatus", "()Ljava/lang/String;", "getPopupConfigId", "getExpiredAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/assets/freeze/entity/WithdrawPreFreezeEntity;", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WithdrawPreFreezeEntity {

    @Nullable
    private final Long expiredAt;

    @Nullable
    private final String frozenStatus;

    @Nullable
    private final String popupConfigId;

    public WithdrawPreFreezeEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawPreFreezeEntity)) {
            return false;
        }
        WithdrawPreFreezeEntity withdrawPreFreezeEntity = (WithdrawPreFreezeEntity) other;
        return Intrinsics.areEqual(this.frozenStatus, withdrawPreFreezeEntity.frozenStatus) && Intrinsics.areEqual(this.popupConfigId, withdrawPreFreezeEntity.popupConfigId) && Intrinsics.areEqual(this.expiredAt, withdrawPreFreezeEntity.expiredAt);
    }

    public WithdrawPreFreezeEntity(@Nullable String str, @Nullable String str2, @Nullable Long l11) {
        this.frozenStatus = str;
        this.popupConfigId = str2;
        this.expiredAt = l11;
    }

    public static /* synthetic */ WithdrawPreFreezeEntity copy$default(WithdrawPreFreezeEntity withdrawPreFreezeEntity, String str, String str2, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = withdrawPreFreezeEntity.frozenStatus;
        }
        if ((i11 & 2) != 0) {
            str2 = withdrawPreFreezeEntity.popupConfigId;
        }
        if ((i11 & 4) != 0) {
            l11 = withdrawPreFreezeEntity.expiredAt;
        }
        return withdrawPreFreezeEntity.copy(str, str2, l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFrozenStatus() {
        return this.frozenStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPopupConfigId() {
        return this.popupConfigId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    @NotNull
    public final WithdrawPreFreezeEntity copy(@Nullable String frozenStatus, @Nullable String popupConfigId, @Nullable Long expiredAt) {
        return new WithdrawPreFreezeEntity(frozenStatus, popupConfigId, expiredAt);
    }

    @Nullable
    public final Long getExpiredAt() {
        return this.expiredAt;
    }

    @Nullable
    public final String getFrozenStatus() {
        return this.frozenStatus;
    }

    @Nullable
    public final String getPopupConfigId() {
        return this.popupConfigId;
    }

    public int hashCode() {
        String str = this.frozenStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.popupConfigId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.expiredAt;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WithdrawPreFreezeEntity(frozenStatus=" + this.frozenStatus + ", popupConfigId=" + this.popupConfigId + ", expiredAt=" + this.expiredAt + ')';
    }

    public /* synthetic */ WithdrawPreFreezeEntity(String str, String str2, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11);
    }
}
