package p314hi;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: hi.a */
/* JADX INFO: compiled from: IFuturesContractConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0003H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0005H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0007H&J\b\u0010\u0016\u001a\u00020\u0007H&J\b\u0010\u0017\u001a\u00020\u0007H&J\b\u0010\u0018\u001a\u00020\u0007H&J\b\u0010\u0019\u001a\u00020\u0007H&J\b\u0010\u001a\u001a\u00020\u0007H&J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u001c\u001a\u00020\u0007H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u001fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/trade/config/IFuturesContractConfig;", "", "isInverse", "", "getSymbol", "", "getTickSize", "Ljava/math/BigDecimal;", "getIndexPriceTickSize", "getMultiplier", "getTakerFeeRate", "getTakerFixFee", "getQuoteCurrency", "getDisplayBaseCurrency", "getLotSize", "getMaxLeverage", "isForeverContract", "getMaintainMarin", "getMaxPrice", "getSettleCurrency", "status", "getMaxOrderQty", "getMarketMaxOrderQty", "getM", "getK", "getF", "getMMRLimit", "getCrossRiskLimit", "getMMRLeverageConstant", "isUnderCountDown", "formatSymbol", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC38213a {
    @NotNull
    /* JADX INFO: renamed from: a */
    BigDecimal mo86230a();

    @NotNull
    /* JADX INFO: renamed from: b */
    BigDecimal mo86231b();

    @NotNull
    /* JADX INFO: renamed from: c */
    BigDecimal mo86232c();

    @NotNull
    /* JADX INFO: renamed from: d */
    CharSequence mo86233d();

    @Nullable
    /* JADX INFO: renamed from: e */
    BigDecimal mo86234e();

    @NotNull
    /* JADX INFO: renamed from: f */
    BigDecimal mo86235f();

    @NotNull
    /* JADX INFO: renamed from: g */
    String mo86236g();

    @NotNull
    String getSymbol();

    @Nullable
    /* JADX INFO: renamed from: h */
    BigDecimal mo86237h();

    @NotNull
    /* JADX INFO: renamed from: i */
    BigDecimal mo86238i();

    @NotNull
    /* JADX INFO: renamed from: j */
    String mo86239j();

    @NotNull
    /* JADX INFO: renamed from: k */
    BigDecimal mo86240k();

    @NotNull
    /* JADX INFO: renamed from: l */
    BigDecimal mo86241l();

    @NotNull
    /* JADX INFO: renamed from: m */
    BigDecimal mo86242m();

    @NotNull
    /* JADX INFO: renamed from: n */
    BigDecimal mo86243n();

    @NotNull
    /* JADX INFO: renamed from: o */
    BigDecimal mo86244o();

    @NotNull
    /* JADX INFO: renamed from: p */
    BigDecimal mo86245p();

    /* JADX INFO: renamed from: q */
    boolean mo86246q();

    /* JADX INFO: renamed from: r */
    boolean mo86247r();

    @NotNull
    /* JADX INFO: renamed from: s */
    BigDecimal mo86248s();

    @NotNull
    String status();

    @NotNull
    /* JADX INFO: renamed from: t */
    BigDecimal mo86249t();

    @NotNull
    /* JADX INFO: renamed from: u */
    String mo86250u();

    /* JADX INFO: renamed from: v */
    boolean mo86251v();
}
