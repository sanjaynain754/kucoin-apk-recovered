package ne;

import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.business.holder.ITradeDiffBizDefine;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.core.spot.business.holder.MarketOrderHolder;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradebase.marketamount.MarketAmountUnit;
import com.kubi.tradebase.tradetype.TradeType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ne.f, reason: from toString */
/* JADX INFO: compiled from: MarketTradeInputData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003Jm\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001J\u0013\u0010D\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010#R\u0016\u0010/\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010#R\u0014\u00105\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006J"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/data/MarketTradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "inputNumber", "Ljava/math/BigDecimal;", "displayInputNumber", "amountUnit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "etTriggerPrice", "isBuy", "", "orderHolderType", "Lcom/kubi/core/spot/business/holder/MarketOrderHolder;", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "quoteCurrencyName", "", "baseCurrencyName", "<init>", "(Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;Ljava/math/BigDecimal;ZLcom/kubi/core/spot/business/holder/MarketOrderHolder;Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;Ljava/lang/String;Ljava/lang/String;)V", "getParentBehavior", "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "getInputNumber", "()Ljava/math/BigDecimal;", "getDisplayInputNumber", "getAmountUnit", "()Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "getEtTriggerPrice", "()Z", "getOrderHolderType", "()Lcom/kubi/core/spot/business/holder/MarketOrderHolder;", "getDiffTradeImp", "()Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "getQuoteCurrencyName", "()Ljava/lang/String;", "getBaseCurrencyName", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "tradeDirection", "Lcom/kubi/core/base/setting/data/TradeDirection;", "getTradeDirection", "()Lcom/kubi/core/base/setting/data/TradeDirection;", "symbol", "getSymbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "symbolDisplayName", "getSymbolDisplayName", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketTradeInputData implements InterfaceC42808a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final ITradeHolderDependDelegate parentBehavior;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BigDecimal inputNumber;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final BigDecimal displayInputNumber;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final MarketAmountUnit amountUnit;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final BigDecimal etTriggerPrice;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final boolean isBuy;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final MarketOrderHolder orderHolderType;

    /* JADX INFO: renamed from: h, reason: from toString */
    @NotNull
    public final ITradeDiffBizDefine diffTradeImp;

    /* JADX INFO: renamed from: i, reason: from toString */
    @NotNull
    public final String quoteCurrencyName;

    /* JADX INFO: renamed from: j, reason: from toString */
    @NotNull
    public final String baseCurrencyName;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketTradeInputData)) {
            return false;
        }
        MarketTradeInputData marketTradeInputData = (MarketTradeInputData) other;
        return Intrinsics.areEqual(this.parentBehavior, marketTradeInputData.parentBehavior) && Intrinsics.areEqual(this.inputNumber, marketTradeInputData.inputNumber) && Intrinsics.areEqual(this.displayInputNumber, marketTradeInputData.displayInputNumber) && this.amountUnit == marketTradeInputData.amountUnit && Intrinsics.areEqual(this.etTriggerPrice, marketTradeInputData.etTriggerPrice) && this.isBuy == marketTradeInputData.isBuy && Intrinsics.areEqual(this.orderHolderType, marketTradeInputData.orderHolderType) && Intrinsics.areEqual(this.diffTradeImp, marketTradeInputData.diffTradeImp) && Intrinsics.areEqual(this.quoteCurrencyName, marketTradeInputData.quoteCurrencyName) && Intrinsics.areEqual(this.baseCurrencyName, marketTradeInputData.baseCurrencyName);
    }

    public MarketTradeInputData(@NotNull ITradeHolderDependDelegate parentBehavior, @NotNull BigDecimal inputNumber, @NotNull BigDecimal displayInputNumber, @NotNull MarketAmountUnit amountUnit, @NotNull BigDecimal etTriggerPrice, boolean z11, @NotNull MarketOrderHolder orderHolderType, @NotNull ITradeDiffBizDefine diffTradeImp, @NotNull String quoteCurrencyName, @NotNull String baseCurrencyName) {
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(inputNumber, "inputNumber");
        Intrinsics.checkNotNullParameter(displayInputNumber, "displayInputNumber");
        Intrinsics.checkNotNullParameter(amountUnit, "amountUnit");
        Intrinsics.checkNotNullParameter(etTriggerPrice, "etTriggerPrice");
        Intrinsics.checkNotNullParameter(orderHolderType, "orderHolderType");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        Intrinsics.checkNotNullParameter(quoteCurrencyName, "quoteCurrencyName");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        this.parentBehavior = parentBehavior;
        this.inputNumber = inputNumber;
        this.displayInputNumber = displayInputNumber;
        this.amountUnit = amountUnit;
        this.etTriggerPrice = etTriggerPrice;
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
        return this.orderHolderType.getF21055o();
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
    public final MarketAmountUnit getAmountUnit() {
        return this.amountUnit;
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
    public final BigDecimal getDisplayInputNumber() {
        return this.displayInputNumber;
    }

    public int hashCode() {
        return (((((((((((((((((this.parentBehavior.hashCode() * 31) + this.inputNumber.hashCode()) * 31) + this.displayInputNumber.hashCode()) * 31) + this.amountUnit.hashCode()) * 31) + this.etTriggerPrice.hashCode()) * 31) + Boolean.hashCode(this.isBuy)) * 31) + this.orderHolderType.hashCode()) * 31) + this.diffTradeImp.hashCode()) * 31) + this.quoteCurrencyName.hashCode()) * 31) + this.baseCurrencyName.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getEtTriggerPrice() {
        return this.etTriggerPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getInputNumber() {
        return this.inputNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final MarketOrderHolder getOrderHolderType() {
        return this.orderHolderType;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final ITradeHolderDependDelegate getParentBehavior() {
        return this.parentBehavior;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public String m93864n() {
        return this.parentBehavior.mo22365N().getCode();
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public SymbolInfoEntity m93865o() {
        return this.parentBehavior.mo22365N();
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsBuy() {
        return this.isBuy;
    }

    @NotNull
    public String toString() {
        return "MarketTradeInputData(parentBehavior=" + this.parentBehavior + ", inputNumber=" + this.inputNumber + ", displayInputNumber=" + this.displayInputNumber + ", amountUnit=" + this.amountUnit + ", etTriggerPrice=" + this.etTriggerPrice + ", isBuy=" + this.isBuy + ", orderHolderType=" + this.orderHolderType + ", diffTradeImp=" + this.diffTradeImp + ", quoteCurrencyName=" + this.quoteCurrencyName + ", baseCurrencyName=" + this.baseCurrencyName + ')';
    }
}
