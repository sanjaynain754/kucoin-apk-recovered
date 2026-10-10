package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.kubi.margin.api.entity.MarginPosition;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/entity/IsolatedPositionDetail;", "", "totalBalance", "", "totalLiability", "positions", "", "Lcom/kubi/margin/api/entity/MarginPosition;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTotalBalance", "()Ljava/lang/String;", "getTotalLiability", "getPositions", "()Ljava/util/List;", "setPositions", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class IsolatedPositionDetail {

    @Nullable
    private List<MarginPosition> positions;

    @Nullable
    private final String totalBalance;

    @Nullable
    private final String totalLiability;

    public IsolatedPositionDetail() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IsolatedPositionDetail)) {
            return false;
        }
        IsolatedPositionDetail isolatedPositionDetail = (IsolatedPositionDetail) other;
        return Intrinsics.areEqual(this.totalBalance, isolatedPositionDetail.totalBalance) && Intrinsics.areEqual(this.totalLiability, isolatedPositionDetail.totalLiability) && Intrinsics.areEqual(this.positions, isolatedPositionDetail.positions);
    }

    public IsolatedPositionDetail(@Nullable String str, @Nullable String str2, @Nullable List<MarginPosition> list) {
        this.totalBalance = str;
        this.totalLiability = str2;
        this.positions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IsolatedPositionDetail copy$default(IsolatedPositionDetail isolatedPositionDetail, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = isolatedPositionDetail.totalBalance;
        }
        if ((i11 & 2) != 0) {
            str2 = isolatedPositionDetail.totalLiability;
        }
        if ((i11 & 4) != 0) {
            list = isolatedPositionDetail.positions;
        }
        return isolatedPositionDetail.copy(str, str2, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    public final List<MarginPosition> component3() {
        return this.positions;
    }

    @NotNull
    public final IsolatedPositionDetail copy(@Nullable String totalBalance, @Nullable String totalLiability, @Nullable List<MarginPosition> positions) {
        return new IsolatedPositionDetail(totalBalance, totalLiability, positions);
    }

    @Nullable
    public final List<MarginPosition> getPositions() {
        return this.positions;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final String getTotalLiability() {
        return this.totalLiability;
    }

    public int hashCode() {
        String str = this.totalBalance;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.totalLiability;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MarginPosition> list = this.positions;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final void setPositions(@Nullable List<MarginPosition> list) {
        this.positions = list;
    }

    @NotNull
    public String toString() {
        return "IsolatedPositionDetail(totalBalance=" + this.totalBalance + ", totalLiability=" + this.totalLiability + ", positions=" + this.positions + ')';
    }

    public /* synthetic */ IsolatedPositionDetail(String str, String str2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : list);
    }
}
