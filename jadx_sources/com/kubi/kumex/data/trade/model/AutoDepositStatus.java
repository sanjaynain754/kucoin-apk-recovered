package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoDepositStatusEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "", SharedPositionInfo.SIDE_LONG, "", SharedPositionInfo.SIDE_SHORT, "BOTH", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getLONG", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSHORT", "getBOTH", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;", "equals", "other", "hashCode", "", "toString", "", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AutoDepositStatus {

    @Nullable
    private final Boolean BOTH;

    @Nullable
    private final Boolean LONG;

    @Nullable
    private final Boolean SHORT;

    public AutoDepositStatus() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoDepositStatus)) {
            return false;
        }
        AutoDepositStatus autoDepositStatus = (AutoDepositStatus) other;
        return Intrinsics.areEqual(this.LONG, autoDepositStatus.LONG) && Intrinsics.areEqual(this.SHORT, autoDepositStatus.SHORT) && Intrinsics.areEqual(this.BOTH, autoDepositStatus.BOTH);
    }

    public AutoDepositStatus(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.LONG = bool;
        this.SHORT = bool2;
        this.BOTH = bool3;
    }

    public static /* synthetic */ AutoDepositStatus copy$default(AutoDepositStatus autoDepositStatus, Boolean bool, Boolean bool2, Boolean bool3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = autoDepositStatus.LONG;
        }
        if ((i11 & 2) != 0) {
            bool2 = autoDepositStatus.SHORT;
        }
        if ((i11 & 4) != 0) {
            bool3 = autoDepositStatus.BOTH;
        }
        return autoDepositStatus.copy(bool, bool2, bool3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getLONG() {
        return this.LONG;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSHORT() {
        return this.SHORT;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getBOTH() {
        return this.BOTH;
    }

    @NotNull
    public final AutoDepositStatus copy(@Nullable Boolean LONG, @Nullable Boolean SHORT, @Nullable Boolean BOTH) {
        return new AutoDepositStatus(LONG, SHORT, BOTH);
    }

    @Nullable
    public final Boolean getBOTH() {
        return this.BOTH;
    }

    @Nullable
    public final Boolean getLONG() {
        return this.LONG;
    }

    @Nullable
    public final Boolean getSHORT() {
        return this.SHORT;
    }

    public int hashCode() {
        Boolean bool = this.LONG;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.SHORT;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.BOTH;
        return iHashCode2 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AutoDepositStatus(LONG=" + this.LONG + ", SHORT=" + this.SHORT + ", BOTH=" + this.BOTH + ')';
    }

    public /* synthetic */ AutoDepositStatus(Boolean bool, Boolean bool2, Boolean bool3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3);
    }
}
