package ne;

import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.business.holder.ITradeDiffBizDefine;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.core.spot.business.holder.SegmentOrderHolder;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import com.kubi.tradebase.tradetype.TradeType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ne.g, reason: from toString */
/* JADX INFO: compiled from: SegmentTradeData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0005HÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\t\u0010F\u001a\u00020\u000eHÆ\u0003J\t\u0010G\u001a\u00020\u0010HÆ\u0003J\t\u0010H\u001a\u00020\u0012HÆ\u0003J\t\u0010I\u001a\u00020\u0014HÆ\u0003J\t\u0010J\u001a\u00020\u0014HÆ\u0003J\u0081\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001J\u0013\u0010L\u001a\u00020\u000e2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\tHÖ\u0001J\t\u0010P\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010)R\u0016\u00105\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u00109\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010)R\u0014\u0010;\u001a\u00020<8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006Q"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "priceMin", "Ljava/math/BigDecimal;", "priceMax", "avgPrice", "orderCount", "", "totalQty", "distributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "isBuy", "", "orderHolderType", "Lcom/kubi/core/spot/business/holder/SegmentOrderHolder;", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "quoteCurrencyName", "", "baseCurrencyName", "<init>", "(Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ILjava/math/BigDecimal;Lcom/kubi/tradebase/api/segment/SegmentDistributionType;ZLcom/kubi/core/spot/business/holder/SegmentOrderHolder;Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;Ljava/lang/String;Ljava/lang/String;)V", "getParentBehavior", "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "getPriceMin", "()Ljava/math/BigDecimal;", "getPriceMax", "getAvgPrice", "getOrderCount", "()I", "getTotalQty", "getDistributionType", "()Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "()Z", "getOrderHolderType", "()Lcom/kubi/core/spot/business/holder/SegmentOrderHolder;", "getDiffTradeImp", "()Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "getQuoteCurrencyName", "()Ljava/lang/String;", "getBaseCurrencyName", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "tradeDirection", "Lcom/kubi/core/base/setting/data/TradeDirection;", "getTradeDirection", "()Lcom/kubi/core/base/setting/data/TradeDirection;", "symbol", "getSymbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "symbolDisplayName", "getSymbolDisplayName", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SegmentTradeInputData implements InterfaceC42808a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final ITradeHolderDependDelegate parentBehavior;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BigDecimal priceMin;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final BigDecimal priceMax;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final BigDecimal avgPrice;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final int orderCount;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final BigDecimal totalQty;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final SegmentDistributionType distributionType;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final boolean isBuy;

    /* JADX INFO: renamed from: i, reason: from toString */
    @NotNull
    public final SegmentOrderHolder orderHolderType;

    /* JADX INFO: renamed from: j, reason: from toString */
    @NotNull
    public final ITradeDiffBizDefine diffTradeImp;

    /* JADX INFO: renamed from: k, reason: from toString */
    @NotNull
    public final String quoteCurrencyName;

    /* JADX INFO: renamed from: l, reason: from toString */
    @NotNull
    public final String baseCurrencyName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentTradeInputData)) {
            return false;
        }
        SegmentTradeInputData segmentTradeInputData = (SegmentTradeInputData) other;
        return Intrinsics.areEqual(this.parentBehavior, segmentTradeInputData.parentBehavior) && Intrinsics.areEqual(this.priceMin, segmentTradeInputData.priceMin) && Intrinsics.areEqual(this.priceMax, segmentTradeInputData.priceMax) && Intrinsics.areEqual(this.avgPrice, segmentTradeInputData.avgPrice) && this.orderCount == segmentTradeInputData.orderCount && Intrinsics.areEqual(this.totalQty, segmentTradeInputData.totalQty) && this.distributionType == segmentTradeInputData.distributionType && this.isBuy == segmentTradeInputData.isBuy && Intrinsics.areEqual(this.orderHolderType, segmentTradeInputData.orderHolderType) && Intrinsics.areEqual(this.diffTradeImp, segmentTradeInputData.diffTradeImp) && Intrinsics.areEqual(this.quoteCurrencyName, segmentTradeInputData.quoteCurrencyName) && Intrinsics.areEqual(this.baseCurrencyName, segmentTradeInputData.baseCurrencyName);
    }

    public SegmentTradeInputData(@NotNull ITradeHolderDependDelegate parentBehavior, @NotNull BigDecimal priceMin, @NotNull BigDecimal priceMax, @NotNull BigDecimal avgPrice, int i11, @NotNull BigDecimal totalQty, @NotNull SegmentDistributionType distributionType, boolean z11, @NotNull SegmentOrderHolder orderHolderType, @NotNull ITradeDiffBizDefine diffTradeImp, @NotNull String quoteCurrencyName, @NotNull String baseCurrencyName) {
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(priceMin, "priceMin");
        Intrinsics.checkNotNullParameter(priceMax, "priceMax");
        Intrinsics.checkNotNullParameter(avgPrice, "avgPrice");
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        Intrinsics.checkNotNullParameter(orderHolderType, "orderHolderType");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        Intrinsics.checkNotNullParameter(quoteCurrencyName, "quoteCurrencyName");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        this.parentBehavior = parentBehavior;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
        this.avgPrice = avgPrice;
        this.orderCount = i11;
        this.totalQty = totalQty;
        this.distributionType = distributionType;
        this.isBuy = z11;
        this.orderHolderType = orderHolderType;
        this.diffTradeImp = diffTradeImp;
        this.quoteCurrencyName = quoteCurrencyName;
        this.baseCurrencyName = baseCurrencyName;
    }

    @Override // ne.InterfaceC42808a
    @NotNull
    /* JADX INFO: renamed from: a */
    public TradeType mo93835a() {
        return this.orderHolderType.getF21069o();
    }

    @Override // ne.InterfaceC42808a
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC38169a mo93836b() {
        return this.isBuy ? InterfaceC38169a.a.f85864a : InterfaceC38169a.b.f85865a;
    }

    @Override // ne.InterfaceC42808a
    @Nullable
    /* JADX INFO: renamed from: c */
    public String mo93837c() {
        return this.parentBehavior.mo22365N().getShowSymbol();
    }

    @Override // ne.InterfaceC42808a
    @NotNull
    /* JADX INFO: renamed from: d */
    public FragmentManager mo93838d() {
        FragmentManager childFragmentManager = this.parentBehavior.mo22357H().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return childFragmentManager;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final ITradeDiffBizDefine getDiffTradeImp() {
        return this.diffTradeImp;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final SegmentDistributionType getDistributionType() {
        return this.distributionType;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.parentBehavior.hashCode() * 31) + this.priceMin.hashCode()) * 31) + this.priceMax.hashCode()) * 31) + this.avgPrice.hashCode()) * 31) + Integer.hashCode(this.orderCount)) * 31) + this.totalQty.hashCode()) * 31) + this.distributionType.hashCode()) * 31) + Boolean.hashCode(this.isBuy)) * 31) + this.orderHolderType.hashCode()) * 31) + this.diffTradeImp.hashCode()) * 31) + this.quoteCurrencyName.hashCode()) * 31) + this.baseCurrencyName.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getOrderCount() {
        return this.orderCount;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final SegmentOrderHolder getOrderHolderType() {
        return this.orderHolderType;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final ITradeHolderDependDelegate getParentBehavior() {
        return this.parentBehavior;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final BigDecimal getPriceMax() {
        return this.priceMax;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final BigDecimal getPriceMin() {
        return this.priceMin;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public String m93877o() {
        return this.parentBehavior.mo22365N().getCode();
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public SymbolInfoEntity m93878p() {
        return this.parentBehavior.mo22365N();
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final BigDecimal getTotalQty() {
        return this.totalQty;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsBuy() {
        return this.isBuy;
    }

    @NotNull
    public String toString() {
        return "SegmentTradeInputData(parentBehavior=" + this.parentBehavior + ", priceMin=" + this.priceMin + ", priceMax=" + this.priceMax + ", avgPrice=" + this.avgPrice + ", orderCount=" + this.orderCount + ", totalQty=" + this.totalQty + ", distributionType=" + this.distributionType + ", isBuy=" + this.isBuy + ", orderHolderType=" + this.orderHolderType + ", diffTradeImp=" + this.diffTradeImp + ", quoteCurrencyName=" + this.quoteCurrencyName + ", baseCurrencyName=" + this.baseCurrencyName + ')';
    }
}
