package b40;

import com.kubi.p110rn.Constants;
import com.kubi.tradefacade.tabs.data.TabBiz;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: b40.a, reason: from toString */
/* JADX INFO: compiled from: TradeTabSortData.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/data/TradeTabSortData;", "", Constants.BIZ, "Lcom/kubi/tradefacade/tabs/data/TabBiz;", "supportHide", "", "isHide", "<init>", "(Lcom/kubi/tradefacade/tabs/data/TabBiz;ZZ)V", "getBiz", "()Lcom/kubi/tradefacade/tabs/data/TabBiz;", "getSupportHide", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TradeTabSortData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final TabBiz biz;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean supportHide;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final boolean isHide;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TradeTabSortData)) {
            return false;
        }
        TradeTabSortData tradeTabSortData = (TradeTabSortData) other;
        return Intrinsics.areEqual(this.biz, tradeTabSortData.biz) && this.supportHide == tradeTabSortData.supportHide && this.isHide == tradeTabSortData.isHide;
    }

    public TradeTabSortData(@NotNull TabBiz biz, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        this.biz = biz;
        this.supportHide = z11;
        this.isHide = z12;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ TradeTabSortData m4278b(TradeTabSortData tradeTabSortData, TabBiz tabBiz, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tabBiz = tradeTabSortData.biz;
        }
        if ((i11 & 2) != 0) {
            z11 = tradeTabSortData.supportHide;
        }
        if ((i11 & 4) != 0) {
            z12 = tradeTabSortData.isHide;
        }
        return tradeTabSortData.m4279a(tabBiz, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TradeTabSortData m4279a(@NotNull TabBiz biz, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        return new TradeTabSortData(biz, z11, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final TabBiz getBiz() {
        return this.biz;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getSupportHide() {
        return this.supportHide;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsHide() {
        return this.isHide;
    }

    public int hashCode() {
        return (((this.biz.hashCode() * 31) + Boolean.hashCode(this.supportHide)) * 31) + Boolean.hashCode(this.isHide);
    }

    @NotNull
    public String toString() {
        return "TradeTabSortData(biz=" + this.biz + ", supportHide=" + this.supportHide + ", isHide=" + this.isHide + ')';
    }
}
