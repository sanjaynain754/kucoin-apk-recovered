package com.kubi.futures.trade.position;

import androidx.annotation.Keep;
import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.search.searchresult.SearchCategory$Companion;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesPositionAggregateManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/trade/position/TpslOrderData;", "", SearchCategory$Companion.EARN, "", "Lcom/kubi/kumex/data/trade/model/OrderEntity;", "loss", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getEarn", "()Ljava/util/List;", "getLoss", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TpslOrderData {

    @NotNull
    private final List<OrderEntity> earn;

    @NotNull
    private final List<OrderEntity> loss;

    /* JADX WARN: Multi-variable type inference failed */
    public TpslOrderData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TpslOrderData)) {
            return false;
        }
        TpslOrderData tpslOrderData = (TpslOrderData) other;
        return Intrinsics.areEqual(this.earn, tpslOrderData.earn) && Intrinsics.areEqual(this.loss, tpslOrderData.loss);
    }

    public TpslOrderData(@NotNull List<OrderEntity> earn, @NotNull List<OrderEntity> loss) {
        Intrinsics.checkNotNullParameter(earn, "earn");
        Intrinsics.checkNotNullParameter(loss, "loss");
        this.earn = earn;
        this.loss = loss;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TpslOrderData copy$default(TpslOrderData tpslOrderData, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tpslOrderData.earn;
        }
        if ((i11 & 2) != 0) {
            list2 = tpslOrderData.loss;
        }
        return tpslOrderData.copy(list, list2);
    }

    @NotNull
    public final List<OrderEntity> component1() {
        return this.earn;
    }

    @NotNull
    public final List<OrderEntity> component2() {
        return this.loss;
    }

    @NotNull
    public final TpslOrderData copy(@NotNull List<OrderEntity> earn, @NotNull List<OrderEntity> loss) {
        Intrinsics.checkNotNullParameter(earn, "earn");
        Intrinsics.checkNotNullParameter(loss, "loss");
        return new TpslOrderData(earn, loss);
    }

    @NotNull
    public final List<OrderEntity> getEarn() {
        return this.earn;
    }

    @NotNull
    public final List<OrderEntity> getLoss() {
        return this.loss;
    }

    public int hashCode() {
        return (this.earn.hashCode() * 31) + this.loss.hashCode();
    }

    @NotNull
    public String toString() {
        return "TpslOrderData(earn=" + this.earn + ", loss=" + this.loss + ')';
    }

    public /* synthetic */ TpslOrderData(List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.emptyList() : list, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list2);
    }
}
