package cm;

import com.kubi.futures.trade.submit.panel.footer.r0;
import com.kubi.kumex.data.assets.model.SimpleBalanceEntity;
import com.kubi.kumex.data.trade.model.PositionEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.i, reason: from toString */
/* JADX INFO: compiled from: ComposeUserEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003JS\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006$"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/FuturesStreamsData;", "", "isHedge", "", "positions", "", "Lcom/kubi/kumex/data/trade/model/PositionEntity;", "balances", "Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;", "leverageMap", "Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "positionCouplesMap", "", "", "Lcom/kubi/futures/trade/submit/panel/footer/PositionCouple;", "<init>", "(ZLjava/util/List;Ljava/util/List;Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;Ljava/util/Map;)V", "()Z", "getPositions", "()Ljava/util/List;", "getBalances", "getLeverageMap", "()Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "getPositionCouplesMap", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FuturesStreamsData {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isHedge;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final List<PositionEntity> positions;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final List<SimpleBalanceEntity> balances;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final SymbolsCrossLeverage leverageMap;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final Map<String, r0> positionCouplesMap;

    public FuturesStreamsData() {
        this(false, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesStreamsData)) {
            return false;
        }
        FuturesStreamsData futuresStreamsData = (FuturesStreamsData) other;
        return this.isHedge == futuresStreamsData.isHedge && Intrinsics.areEqual(this.positions, futuresStreamsData.positions) && Intrinsics.areEqual(this.balances, futuresStreamsData.balances) && Intrinsics.areEqual(this.leverageMap, futuresStreamsData.leverageMap) && Intrinsics.areEqual(this.positionCouplesMap, futuresStreamsData.positionCouplesMap);
    }

    public FuturesStreamsData(boolean z11, @NotNull List<PositionEntity> positions, @NotNull List<SimpleBalanceEntity> balances, @NotNull SymbolsCrossLeverage leverageMap, @NotNull Map<String, r0> positionCouplesMap) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(leverageMap, "leverageMap");
        Intrinsics.checkNotNullParameter(positionCouplesMap, "positionCouplesMap");
        this.isHedge = z11;
        this.positions = positions;
        this.balances = balances;
        this.leverageMap = leverageMap;
        this.positionCouplesMap = positionCouplesMap;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<SimpleBalanceEntity> m5399a() {
        return this.balances;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SymbolsCrossLeverage getLeverageMap() {
        return this.leverageMap;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, r0> m5401c() {
        return this.positionCouplesMap;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<PositionEntity> m5402d() {
        return this.positions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsHedge() {
        return this.isHedge;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isHedge) * 31) + this.positions.hashCode()) * 31) + this.balances.hashCode()) * 31) + this.leverageMap.hashCode()) * 31) + this.positionCouplesMap.hashCode();
    }

    @NotNull
    public String toString() {
        return "FuturesStreamsData(isHedge=" + this.isHedge + ", positions=" + this.positions + ", balances=" + this.balances + ", leverageMap=" + this.leverageMap + ", positionCouplesMap=" + this.positionCouplesMap + ')';
    }

    public /* synthetic */ FuturesStreamsData(boolean z11, List list, List list2, SymbolsCrossLeverage symbolsCrossLeverage, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 8) != 0 ? new SymbolsCrossLeverage() : symbolsCrossLeverage, (i11 & 16) != 0 ? MapsKt.emptyMap() : map);
    }
}
