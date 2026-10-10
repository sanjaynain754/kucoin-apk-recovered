package p437lp;

import android.net.Uri;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.Constants;
import com.kubi.router.core.Router;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041bp.C4643e;
import p311hf.C38184b;
import p768xo.InterfaceC46306g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: lp.a */
/* JADX INFO: compiled from: RouterMarginHandler.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\nJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/margin/router/RouterMarginHandler;", "", "<init>", "()V", "ROUTE_SPOT_INDEX_PRICE", "", "ROUTE_COLLATERAL_RATIO_PAGE", "ROUTE_LOAN_RATES_PAGE", "ROUTE_MARGIN_RISK_LIMIT_PAGE", "jumpSpotIndexPage", "", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "jumpRiskLimitPage", "type", "", "jumpLoanRatesPage", "jumpRnPage", "route", "jumpRnPage$MarginLib_googleRelease", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42290a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42290a f93780a = new C42290a();

    /* JADX INFO: renamed from: b */
    public final void m92823b(int i11) {
        m92824c("MarginRiskLimitPage?type=" + (i11 == 2 ? "isolated" : "cross"));
    }

    /* JADX INFO: renamed from: a */
    public final void m92822a() {
        if (C4643e.f4176a.m4584f()) {
            m92824c("LoanRatesPage");
            return;
        }
        C37304a c37304a = C37304a.f82764a;
        String strDecode = Uri.decode(InterfaceC46306g.f103882i);
        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
        InterfaceC37766r.a.m85190a(c37304a, strDecode, null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m92824c(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Router.f46192a.m56184f("/krn/router").m4038a(Constants.BIZ, "tradeinfo").m4038a("entry", "main").m4038a(Constants.COMPONENT, "kucoin_tradeinfo_rn").m4038a("route", Uri.encode(route)).m4048k();
    }

    /* JADX INFO: renamed from: d */
    public final void m92825d(@Nullable SymbolInfoEntity symbolInfoEntity) {
        if (symbolInfoEntity == null) {
            return;
        }
        if (C4643e.f4176a.m4583e()) {
            m92824c("SpotIndexPage?symbol=" + symbolInfoEntity.getCode());
            return;
        }
        C37304a c37304a = C37304a.f82764a;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String SPOT_INDEX_PAGE = InterfaceC46306g.f103883j;
        Intrinsics.checkNotNullExpressionValue(SPOT_INDEX_PAGE, "SPOT_INDEX_PAGE");
        StringBuilder sb2 = new StringBuilder();
        String baseCurrency = symbolInfoEntity.getBaseCurrency();
        if (Intrinsics.areEqual(baseCurrency, "BTC")) {
            baseCurrency = C38184b.f85884a.m86146a();
        }
        sb2.append(baseCurrency);
        sb2.append("-BTC");
        String str = String.format(SPOT_INDEX_PAGE, Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        InterfaceC37766r.a.m85190a(c37304a, str, null, null, null, null, null, null, 126, null);
    }
}
