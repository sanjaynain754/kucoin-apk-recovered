package com.kubi.copytrading.assets;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CopyTdEntity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/copytrading/assets/LeadTraderUsedTrialEntity;", "", "id", "", "amount", "status", "", "<init>", "(IILjava/lang/String;)V", "getId", "()I", "getAmount", "getStatus", "()Ljava/lang/String;", "getStatusEnum", "Lcom/kubi/copytrading/assets/LeadTraderTrialFundStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeadTraderUsedTrialEntity {
    private final int amount;
    private final int id;

    @NotNull
    private final String status;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeadTraderUsedTrialEntity)) {
            return false;
        }
        LeadTraderUsedTrialEntity leadTraderUsedTrialEntity = (LeadTraderUsedTrialEntity) other;
        return this.id == leadTraderUsedTrialEntity.id && this.amount == leadTraderUsedTrialEntity.amount && Intrinsics.areEqual(this.status, leadTraderUsedTrialEntity.status);
    }

    public LeadTraderUsedTrialEntity(int i11, int i12, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = i11;
        this.amount = i12;
        this.status = status;
    }

    public static /* synthetic */ LeadTraderUsedTrialEntity copy$default(LeadTraderUsedTrialEntity leadTraderUsedTrialEntity, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = leadTraderUsedTrialEntity.id;
        }
        if ((i13 & 2) != 0) {
            i12 = leadTraderUsedTrialEntity.amount;
        }
        if ((i13 & 4) != 0) {
            str = leadTraderUsedTrialEntity.status;
        }
        return leadTraderUsedTrialEntity.copy(i11, i12, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final LeadTraderUsedTrialEntity copy(int id2, int amount, @NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new LeadTraderUsedTrialEntity(id2, amount, status);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final LeadTraderTrialFundStatus getStatusEnum() {
        return LeadTraderTrialFundStatus.INSTANCE.fromCode(this.status);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.amount)) * 31) + this.status.hashCode();
    }

    @NotNull
    public String toString() {
        return "LeadTraderUsedTrialEntity(id=" + this.id + ", amount=" + this.amount + ", status=" + this.status + ')';
    }
}
