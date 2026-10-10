package ne;

import androidx.fragment.app.FragmentManager;
import com.kubi.core.spot.business.holder.ITradeDiffBizDefine;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.core.spot.business.holder.LimitOrderHolder;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.tradebase.tradetype.TradeType;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38169a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ne.d, reason: from toString */
/* JADX INFO: compiled from: LimitTradeData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\t\u0010B\u001a\u00020\u0010HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003Jw\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\u0013\u0010E\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\"R\u0016\u0010/\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00103\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\"R\u0014\u00105\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006K"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/intercept/data/LimitTradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "inputLimitPrice", "Ljava/math/BigDecimal;", "etNumber", "etDealAmount", "etTriggerPrice", "isBuy", "", "orderHolderType", "Lcom/kubi/core/spot/business/holder/LimitOrderHolder;", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "quoteCurrencyName", "", "baseCurrencyName", "priceProtectionRate", "<init>", "(Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;ZLcom/kubi/core/spot/business/holder/LimitOrderHolder;Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getParentBehavior", "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "getInputLimitPrice", "()Ljava/math/BigDecimal;", "getEtNumber", "getEtDealAmount", "getEtTriggerPrice", "()Z", "getOrderHolderType", "()Lcom/kubi/core/spot/business/holder/LimitOrderHolder;", "getDiffTradeImp", "()Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "getQuoteCurrencyName", "()Ljava/lang/String;", "getBaseCurrencyName", "getPriceProtectionRate", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "tradeDirection", "Lcom/kubi/core/base/setting/data/TradeDirection;", "getTradeDirection", "()Lcom/kubi/core/base/setting/data/TradeDirection;", "symbol", "getSymbol", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "getSymbolInfo", "()Lcom/kubi/data/entity/SymbolInfoEntity;", "symbolDisplayName", "getSymbolDisplayName", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LimitTradeInputData implements InterfaceC42808a {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final ITradeHolderDependDelegate parentBehavior;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final BigDecimal inputLimitPrice;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final BigDecimal etNumber;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final BigDecimal etDealAmount;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final BigDecimal etTriggerPrice;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final boolean isBuy;

    /* JADX INFO: renamed from: g, reason: from toString */
    @NotNull
    public final LimitOrderHolder orderHolderType;

    /* JADX INFO: renamed from: h, reason: from toString */
    @NotNull
    public final ITradeDiffBizDefine diffTradeImp;

    /* JADX INFO: renamed from: i, reason: from toString */
    @NotNull
    public final String quoteCurrencyName;

    /* JADX INFO: renamed from: j, reason: from toString */
    @NotNull
    public final String baseCurrencyName;

    /* JADX INFO: renamed from: k, reason: from toString */
    @NotNull
    public final BigDecimal priceProtectionRate;

    public LimitTradeInputData(@NotNull ITradeHolderDependDelegate parentBehavior, @NotNull BigDecimal inputLimitPrice, @NotNull BigDecimal etNumber, @NotNull BigDecimal etDealAmount, @NotNull BigDecimal etTriggerPrice, boolean z11, @NotNull LimitOrderHolder orderHolderType, @NotNull ITradeDiffBizDefine diffTradeImp, @NotNull String quoteCurrencyName, @NotNull String baseCurrencyName, @NotNull BigDecimal priceProtectionRate) {
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(inputLimitPrice, "inputLimitPrice");
        Intrinsics.checkNotNullParameter(etNumber, "etNumber");
        Intrinsics.checkNotNullParameter(etDealAmount, "etDealAmount");
        Intrinsics.checkNotNullParameter(etTriggerPrice, "etTriggerPrice");
        Intrinsics.checkNotNullParameter(orderHolderType, "orderHolderType");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        Intrinsics.checkNotNullParameter(quoteCurrencyName, "quoteCurrencyName");
        Intrinsics.checkNotNullParameter(baseCurrencyName, "baseCurrencyName");
        Intrinsics.checkNotNullParameter(priceProtectionRate, "priceProtectionRate");
        this.parentBehavior = parentBehavior;
        this.inputLimitPrice = inputLimitPrice;
        this.etNumber = etNumber;
        this.etDealAmount = etDealAmount;
        this.etTriggerPrice = etTriggerPrice;
        this.isBuy = z11;
        this.orderHolderType = orderHolderType;
        this.diffTradeImp = diffTradeImp;
        this.quoteCurrencyName = quoteCurrencyName;
        this.baseCurrencyName = baseCurrencyName;
        this.priceProtectionRate = priceProtectionRate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LimitTradeInputData)) {
            return false;
        }
        LimitTradeInputData limitTradeInputData = (LimitTradeInputData) other;
        return Intrinsics.areEqual(this.parentBehavior, limitTradeInputData.parentBehavior) && Intrinsics.areEqual(this.inputLimitPrice, limitTradeInputData.inputLimitPrice) && Intrinsics.areEqual(this.etNumber, limitTradeInputData.etNumber) && Intrinsics.areEqual(this.etDealAmount, limitTradeInputData.etDealAmount) && Intrinsics.areEqual(this.etTriggerPrice, limitTradeInputData.etTriggerPrice) && this.isBuy == limitTradeInputData.isBuy && Intrinsics.areEqual(this.orderHolderType, limitTradeInputData.orderHolderType) && Intrinsics.areEqual(this.diffTradeImp, limitTradeInputData.diffTradeImp) && Intrinsics.areEqual(this.quoteCurrencyName, limitTradeInputData.quoteCurrencyName) && Intrinsics.areEqual(this.baseCurrencyName, limitTradeInputData.baseCurrencyName) && Intrinsics.areEqual(this.priceProtectionRate, limitTradeInputData.priceProtectionRate);
    }

    @Override // ne.InterfaceC42808a
    @NotNull
    /* JADX INFO: renamed from: a */
    public TradeType mo93835a() {
        return this.orderHolderType.getF21046o();
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
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ITradeDiffBizDefine getDiffTradeImp() {
        return this.diffTradeImp;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getEtDealAmount() {
        return this.etDealAmount;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final BigDecimal getEtNumber() {
        return this.etNumber;
    }

    public int hashCode() {
        return (((((((((((((((((((this.parentBehavior.hashCode() * 31) + this.inputLimitPrice.hashCode()) * 31) + this.etNumber.hashCode()) * 31) + this.etDealAmount.hashCode()) * 31) + this.etTriggerPrice.hashCode()) * 31) + Boolean.hashCode(this.isBuy)) * 31) + this.orderHolderType.hashCode()) * 31) + this.diffTradeImp.hashCode()) * 31) + this.quoteCurrencyName.hashCode()) * 31) + this.baseCurrencyName.hashCode()) * 31) + this.priceProtectionRate.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getEtTriggerPrice() {
        return this.etTriggerPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final BigDecimal getInputLimitPrice() {
        return this.inputLimitPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final LimitOrderHolder getOrderHolderType() {
        return this.orderHolderType;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final ITradeHolderDependDelegate getParentBehavior() {
        return this.parentBehavior;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final BigDecimal getPriceProtectionRate() {
        return this.priceProtectionRate;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public String m93851o() {
        return this.parentBehavior.mo22365N().getCode();
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public SymbolInfoEntity m93852p() {
        return this.parentBehavior.mo22365N();
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getIsBuy() {
        return this.isBuy;
    }

    @NotNull
    public String toString() {
        return "LimitTradeInputData(parentBehavior=" + this.parentBehavior + ", inputLimitPrice=" + this.inputLimitPrice + ", etNumber=" + this.etNumber + ", etDealAmount=" + this.etDealAmount + ", etTriggerPrice=" + this.etTriggerPrice + ", isBuy=" + this.isBuy + ", orderHolderType=" + this.orderHolderType + ", diffTradeImp=" + this.diffTradeImp + ", quoteCurrencyName=" + this.quoteCurrencyName + ", baseCurrencyName=" + this.baseCurrencyName + ", priceProtectionRate=" + this.priceProtectionRate + ')';
    }
}
