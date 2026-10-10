package p371ji;

import com.kubi.futures.trade.config.positions.PnlCalculatePriceType;
import com.kubi.kumex.utils.Persistence;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ji.a */
/* JADX INFO: compiled from: PnlCalculatePriceTypeConfig.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u000f\u001a\u00020\u0006H\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\n\u0010\u0013\u001a\u00020\u0006*\u00020\u0014R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceTypeConfig;", "", "<init>", "()V", "pnlCalculatePriceTypeSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/kubi/futures/trade/config/positions/PnlCalculatePriceType;", "kotlin.jvm.PlatformType", "pnlCalculatePriceTypeObs", "Lio/reactivex/Observable;", "getPnlCalculatePriceTypeObs", "()Lio/reactivex/Observable;", "isCalculateByMarkPrice", "", "isCalculateByLatestPrice", "getFromCache", "updatePnlCalculate", "", "priceType", "toPriceType", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40410a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C40410a f89722a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final BehaviorSubject<PnlCalculatePriceType> f89723b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Observable<PnlCalculatePriceType> f89724c;

    static {
        C40410a c40410a = new C40410a();
        f89722a = c40410a;
        BehaviorSubject<PnlCalculatePriceType> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(c40410a.m89052a());
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        f89723b = behaviorSubjectCreateDefault;
        f89724c = behaviorSubjectCreateDefault;
    }

    /* JADX INFO: renamed from: a */
    public final PnlCalculatePriceType m89052a() {
        return m89056e(Persistence.f30799a.m36518d("pnl_calculate_price_type", "MarkPrice"));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Observable<PnlCalculatePriceType> m89053b() {
        return f89724c;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final PnlCalculatePriceType m89056e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Intrinsics.areEqual(str, "LatestPrice") ? PnlCalculatePriceType.LatestPrice : PnlCalculatePriceType.MarkPrice;
    }

    /* JADX INFO: renamed from: f */
    public final void m89057f(@NotNull PnlCalculatePriceType priceType) {
        Intrinsics.checkNotNullParameter(priceType, "priceType");
        Persistence.f30799a.m36521h("pnl_calculate_price_type", priceType.name());
        f89723b.onNext(priceType);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89054c() {
        if (m89052a() == PnlCalculatePriceType.LatestPrice) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89055d() {
        if (m89052a() == PnlCalculatePriceType.MarkPrice) {
            return true;
        }
        return false;
    }
}
