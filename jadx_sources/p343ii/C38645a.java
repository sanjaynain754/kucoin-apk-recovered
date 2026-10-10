package p343ii;

import bm.C4634g;
import com.kubi.futures.FuturesDisplayNameUtils;
import com.kubi.futures.trade.submit.panel.premarket.g;
import com.kubi.kumex.data.platform.model.ContractEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ii.a */
/* JADX INFO: compiled from: FuturesContractConfigImpl.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u000bH\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\b\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000bH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010!\u001a\u00020\u000bH\u0016J\b\u0010\"\u001a\u00020\u0007H\u0016J\b\u0010#\u001a\u00020$H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/futures/trade/config/impl/FuturesContractConfigImpl;", "Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "contract", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "<init>", "(Lcom/kubi/kumex/data/platform/model/ContractEntity;)V", "isInverse", "", "getSymbol", "", "getTickSize", "Ljava/math/BigDecimal;", "getIndexPriceTickSize", "getMultiplier", "getTakerFeeRate", "getTakerFixFee", "getQuoteCurrency", "getDisplayBaseCurrency", "getLotSize", "getMaxLeverage", "isForeverContract", "getMaintainMarin", "getMaxPrice", "getSettleCurrency", "status", "toString", "getMaxOrderQty", "getMarketMaxOrderQty", "getK", "getM", "getF", "getMMRLimit", "getCrossRiskLimit", "getMMRLeverageConstant", "isUnderCountDown", "formatSymbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38645a implements InterfaceC38213a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ContractEntity f86643a;

    public C38645a(@NotNull ContractEntity contract) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        this.f86643a = contract;
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: a */
    public BigDecimal mo86230a() {
        return C27039d.m66656p(this.f86643a.getIndexPriceTickSize());
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: b */
    public BigDecimal mo86231b() {
        return C41014a.m89921F(this.f86643a.getF(), "1.3");
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: c */
    public BigDecimal mo86232c() {
        BigDecimal marketMaxOrderQty = this.f86643a.getMarketMaxOrderQty();
        return marketMaxOrderQty == null ? mo86249t() : marketMaxOrderQty;
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: d */
    public CharSequence mo86233d() {
        return FuturesDisplayNameUtils.f22525a.m24440e(this.f86643a);
    }

    @Override // p314hi.InterfaceC38213a
    @Nullable
    /* JADX INFO: renamed from: e */
    public BigDecimal mo86234e() {
        return this.f86643a.getCrossRiskLimit();
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: f */
    public BigDecimal mo86235f() {
        return C27039d.m66656p(this.f86643a.getTakerFeeRate());
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: g */
    public String mo86236g() {
        return C27041f.m66668h(C27041f.m66677q(this.f86643a.getDisplayBaseCurrency()));
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    public String getSymbol() {
        return C27041f.m66669i(this.f86643a.getSymbol(), C4634g.m4564a());
    }

    @Override // p314hi.InterfaceC38213a
    @Nullable
    /* JADX INFO: renamed from: h */
    public BigDecimal mo86237h() {
        return this.f86643a.getMaintainMargin();
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: i */
    public BigDecimal mo86238i() {
        return C41014a.m89921F(this.f86643a.getMmrLimit(), "0.3");
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: j */
    public String mo86239j() {
        return C27041f.m66668h(C27041f.m66677q(this.f86643a.getQuoteCurrency()));
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: k */
    public BigDecimal mo86240k() {
        return C41014a.m89921F(this.f86643a.getMultiplier(), "1");
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: l */
    public BigDecimal mo86241l() {
        return C27039d.m66656p(this.f86643a.getM());
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: m */
    public BigDecimal mo86242m() {
        return C41014a.m89921F(this.f86643a.getLotSize(), "1");
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: n */
    public BigDecimal mo86243n() {
        return C41014a.m89921F(this.f86643a.getMaxPrice(), "1000000");
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: o */
    public BigDecimal mo86244o() {
        return C27039d.m66656p(this.f86643a.getMmrLevConstant());
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: p */
    public BigDecimal mo86245p() {
        return C27039d.m66656p(this.f86643a.getK());
    }

    @Override // p314hi.InterfaceC38213a
    /* JADX INFO: renamed from: q */
    public boolean mo86246q() {
        return C27025c.m66566d(Boolean.valueOf(this.f86643a.isInverse()));
    }

    @Override // p314hi.InterfaceC38213a
    /* JADX INFO: renamed from: r */
    public boolean mo86247r() {
        return Intrinsics.areEqual(this.f86643a.getType(), "FFWCSX");
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: s */
    public BigDecimal mo86248s() {
        return C27039d.m66656p(this.f86643a.getTickSize());
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    public String status() {
        return C27041f.m66668h(this.f86643a.getStatus());
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: t */
    public BigDecimal mo86249t() {
        return C41014a.m89921F(this.f86643a.getMaxOrderQty(), "1000000");
    }

    @NotNull
    public String toString() {
        return this.f86643a.toString();
    }

    @Override // p314hi.InterfaceC38213a
    @NotNull
    /* JADX INFO: renamed from: u */
    public String mo86250u() {
        return C27041f.m66668h(this.f86643a.getSettleCurrency());
    }

    @Override // p314hi.InterfaceC38213a
    /* JADX INFO: renamed from: v */
    public boolean mo86251v() {
        return g.a.o(this.f86643a);
    }
}
