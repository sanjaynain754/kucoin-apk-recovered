package p698vp;

import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.margin.MarginAgreementDialog;
import com.kubi.margin.trade.MarginConfigManager;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.tradebase.entity.CurrencyBalance;
import com.kubi.user.api.p;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import mp.C42579a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vp.b */
/* JADX INFO: compiled from: MarginEx.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a9\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\r\u001aI\u0010\u000e\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u000f*\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010\u001a\u001e\u0010\u0011\u001a\u00020\u0004*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¨\u0006\u0017"}, m90084d2 = {"isFavorEx", "", "Lcom/kubi/data/entity/TradeItemBean;", "sendNotifyMaintenance", "", "", "getMaxAvailableWithLever", "Ljava/math/BigDecimal;", "Lcom/kubi/tradebase/entity/CurrencyBalance;", "needLever", "lever", "isIsolate", "symbol", "(Lcom/kubi/tradebase/entity/CurrencyBalance;ZLjava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/math/BigDecimal;", "getMaxAvailableWithLeverPair", "Lkotlin/Pair;", "(Lcom/kubi/tradebase/entity/CurrencyBalance;ZLjava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;)Lkotlin/Pair;", "showErrorAgreementDialog", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "fallback", "Lio/reactivex/functions/Action;", "MarginLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45612b {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final BigDecimal m100695a(@NotNull CurrencyBalance currencyBalance, boolean z11, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable String str) {
        BigDecimal first;
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        Pair<BigDecimal, BigDecimal> pairM100696b = m100696b(currencyBalance, z11, bigDecimal, bool, str);
        if (pairM100696b == null || (first = pairM100696b.getFirst()) == null) {
            return null;
        }
        BigDecimal bigDecimalAdd = first.add(C41014a.m89922G(pairM100696b.getSecond(), null, 1, null));
        Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Pair<BigDecimal, BigDecimal> m100696b(@NotNull CurrencyBalance currencyBalance, boolean z11, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable String str) {
        Intrinsics.checkNotNullParameter(currencyBalance, "<this>");
        BigDecimal availableBalanceCompat = currencyBalance.getAvailableBalanceCompat();
        if (availableBalanceCompat != null) {
            return z11 ? new Pair<>(availableBalanceCompat, C41014a.m89922G(MarginConfigManager.f33681a.m39882a1(currencyBalance, bigDecimal, bool, str), null, 1, null)) : new Pair<>(availableBalanceCompat, BigDecimal.ZERO);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m100697c(@NotNull TradeItemBean tradeItemBean) {
        Intrinsics.checkNotNullParameter(tradeItemBean, "<this>");
        C42579a c42579a = C42579a.f94275a;
        if (c42579a.m93347g().c()) {
            return tradeItemBean.isFavor();
        }
        IQuoteFacadeService iQuoteFacadeServiceM93345e = c42579a.m93345e();
        String symbol = tradeItemBean.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        return iQuoteFacadeServiceM93345e.mo50716u(symbol);
    }

    /* JADX INFO: renamed from: d */
    public static final void m100698d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        C12572a.m23695d("NOTIFY_MAINTENANCE", str, 0L, 4, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m100699e(@NotNull Throwable th2, @NotNull FragmentManager childFragmentManager, @Nullable Action action) throws Exception {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        if (!CollectionsKt.contains(CollectionsKt.listOf((Object[]) new String[]{"130323", "210052"}), p.b(th2))) {
            if (action != null) {
                action.run();
                return;
            }
            return;
        }
        String simpleName = MarginAgreementDialog.class.getSimpleName();
        Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag(simpleName);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            MarginAgreementDialog marginAgreementDialog = new MarginAgreementDialog();
            marginAgreementDialog.setArguments(BundleKt.bundleOf(TuplesKt.m90091to("url", MarginConfigManager.f33681a.m39879Y0().getAgreementUrl()), TuplesKt.m90091to("type", 4)));
            marginAgreementDialog.show(childFragmentManager, simpleName);
        }
    }
}
