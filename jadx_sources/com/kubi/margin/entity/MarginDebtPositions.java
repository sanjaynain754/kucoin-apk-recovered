package com.kubi.margin.entity;

import androidx.annotation.Keep;
import com.kubi.margin.api.entity.MarginPosition;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003J3\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/margin/entity/MarginDebtPositions;", "", "currentPositionResp", "Lcom/kubi/margin/api/entity/MarginPosition;", "debtPositionRespList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "<init>", "(Lcom/kubi/margin/api/entity/MarginPosition;Ljava/util/ArrayList;)V", "getCurrentPositionResp", "()Lcom/kubi/margin/api/entity/MarginPosition;", "getDebtPositionRespList", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginDebtPositions {

    @Nullable
    private final MarginPosition currentPositionResp;

    @Nullable
    private final ArrayList<MarginPosition> debtPositionRespList;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginDebtPositions)) {
            return false;
        }
        MarginDebtPositions marginDebtPositions = (MarginDebtPositions) other;
        return Intrinsics.areEqual(this.currentPositionResp, marginDebtPositions.currentPositionResp) && Intrinsics.areEqual(this.debtPositionRespList, marginDebtPositions.debtPositionRespList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarginDebtPositions copy$default(MarginDebtPositions marginDebtPositions, MarginPosition marginPosition, ArrayList arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            marginPosition = marginDebtPositions.currentPositionResp;
        }
        if ((i11 & 2) != 0) {
            arrayList = marginDebtPositions.debtPositionRespList;
        }
        return marginDebtPositions.copy(marginPosition, arrayList);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MarginPosition getCurrentPositionResp() {
        return this.currentPositionResp;
    }

    @Nullable
    public final ArrayList<MarginPosition> component2() {
        return this.debtPositionRespList;
    }

    @NotNull
    public final MarginDebtPositions copy(@Nullable MarginPosition currentPositionResp, @Nullable ArrayList<MarginPosition> debtPositionRespList) {
        return new MarginDebtPositions(currentPositionResp, debtPositionRespList);
    }

    @Nullable
    public final MarginPosition getCurrentPositionResp() {
        return this.currentPositionResp;
    }

    @Nullable
    public final ArrayList<MarginPosition> getDebtPositionRespList() {
        return this.debtPositionRespList;
    }

    public int hashCode() {
        MarginPosition marginPosition = this.currentPositionResp;
        int iHashCode = (marginPosition == null ? 0 : marginPosition.hashCode()) * 31;
        ArrayList<MarginPosition> arrayList = this.debtPositionRespList;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarginDebtPositions(currentPositionResp=" + this.currentPositionResp + ", debtPositionRespList=" + this.debtPositionRespList + ')';
    }

    public MarginDebtPositions(@Nullable MarginPosition marginPosition, @Nullable ArrayList<MarginPosition> arrayList) {
        this.currentPositionResp = marginPosition;
        this.debtPositionRespList = arrayList;
    }
}
