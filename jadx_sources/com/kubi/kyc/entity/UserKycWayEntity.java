package com.kubi.kyc.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserKycWayEntity.kt */
/* JADX INFO: loaded from: classes21.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kyc/entity/UserKycWayEntity;", "", "electricKyc", "", "manualKyc", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getElectricKyc", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getManualKyc", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/kyc/entity/UserKycWayEntity;", "equals", "", "other", "hashCode", "toString", "", "KycLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserKycWayEntity {

    @Nullable
    private final Integer electricKyc;

    @Nullable
    private final Integer manualKyc;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserKycWayEntity)) {
            return false;
        }
        UserKycWayEntity userKycWayEntity = (UserKycWayEntity) other;
        return Intrinsics.areEqual(this.electricKyc, userKycWayEntity.electricKyc) && Intrinsics.areEqual(this.manualKyc, userKycWayEntity.manualKyc);
    }

    public static /* synthetic */ UserKycWayEntity copy$default(UserKycWayEntity userKycWayEntity, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = userKycWayEntity.electricKyc;
        }
        if ((i11 & 2) != 0) {
            num2 = userKycWayEntity.manualKyc;
        }
        return userKycWayEntity.copy(num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getElectricKyc() {
        return this.electricKyc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getManualKyc() {
        return this.manualKyc;
    }

    @NotNull
    public final UserKycWayEntity copy(@Nullable Integer electricKyc, @Nullable Integer manualKyc) {
        return new UserKycWayEntity(electricKyc, manualKyc);
    }

    @Nullable
    public final Integer getElectricKyc() {
        return this.electricKyc;
    }

    @Nullable
    public final Integer getManualKyc() {
        return this.manualKyc;
    }

    public int hashCode() {
        Integer num = this.electricKyc;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.manualKyc;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserKycWayEntity(electricKyc=" + this.electricKyc + ", manualKyc=" + this.manualKyc + ')';
    }

    public UserKycWayEntity(@Nullable Integer num, @Nullable Integer num2) {
        this.electricKyc = num;
        this.manualKyc = num2;
    }
}
