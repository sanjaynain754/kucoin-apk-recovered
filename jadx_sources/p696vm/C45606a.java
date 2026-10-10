package p696vm;

import android.net.Uri;
import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: vm.a */
/* JADX INFO: compiled from: FutureRNRouter.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u000eJ6\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005J=\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/kumex/trade/router/FutureRNRouter;", "", "<init>", "()V", "TRADE_CENTER_BIZ", "", "TRADE_CENTER_ENTRY", "TRADE_CENTER_COMPONENT", "FUTURES_ORDER_CENTER_ROUTE", "ROUTE_FUNDING_RATE_PAGE", "ROUTE_ARBITRAGE_PAGE", "ROUTE_INSURANCE_FUND_PAGE", "ROUTE_RISK_LIMIT_PAGE", "jumpToRNPage", "", "route", "jumpToTrialFundLeadPage", "jumpToFuturesOrderCenter", "page", "ordersType", "bizType", "symbol", "spm", "buildFuturesOrderCenterRoute", "buildFuturesOrderCenterRoute$KumexLib_googleRelease", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFutureRNRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FutureRNRouter.kt\ncom/kubi/kumex/trade/router/FutureRNRouter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n774#2:84\n865#2,2:85\n*S KotlinDebug\n*F\n+ 1 FutureRNRouter.kt\ncom/kubi/kumex/trade/router/FutureRNRouter\n*L\n76#1:84\n76#1:85,2\n*E\n"})
public final class C45606a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45606a f102730a = new C45606a();

    /* JADX INFO: renamed from: a */
    public final void m100690a(@NotNull String route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Router.f46192a.m56184f("/krn/router?biz=tradeinfo&entry=main&component=kucoin_tradeinfo_rn&route=" + route).m4048k();
    }

    /* JADX INFO: renamed from: b */
    public final void m100691b() {
        Router.f46192a.m56184f("/krn/router?biz=follow&entry=main&component=krn_follow_trade&route=" + Uri.encode("TrialFund?scene=lead")).m4048k();
    }
}
