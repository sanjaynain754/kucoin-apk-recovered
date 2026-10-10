package mo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.loan.repo.trade.model.LeverManualBorrow;
import mr.C42597a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mo.c */
/* JADX INFO: compiled from: TradeServiceImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/loan/repo/trade/TradeServiceImpl;", "Lcom/kubi/loan/repo/trade/ITradeService;", "Lcom/kubi/loan/repo/trade/ITradeApi;", "tradeApi", "<init>", "(Lcom/kubi/loan/repo/trade/ITradeApi;)V", "()V", "submitLeverManualBorrow", "Lcom/kubi/loan/repo/trade/model/LeverManualBorrow;", FirebaseAnalytics.Param.CURRENCY, "", "amount", "maxRate", "strategy", "LoanLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42578c implements InterfaceC42577b, InterfaceC42576a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC42576a f94274a;

    public C42578c(@NotNull InterfaceC42576a tradeApi) {
        Intrinsics.checkNotNullParameter(tradeApi, "tradeApi");
        this.f94274a = tradeApi;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C42578c() {
        Object objCreate = C42597a.m93391g().create(InterfaceC42576a.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        this((InterfaceC42576a) objCreate);
    }

    @Override // mo.InterfaceC42576a
    @NotNull
    /* JADX INFO: renamed from: a */
    public LeverManualBorrow mo93340a(@NotNull String currency, @NotNull String amount, @Nullable String str, @NotNull String strategy) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return this.f94274a.mo93340a(C42828b.m93912m(currency), amount, str, strategy);
    }
}
