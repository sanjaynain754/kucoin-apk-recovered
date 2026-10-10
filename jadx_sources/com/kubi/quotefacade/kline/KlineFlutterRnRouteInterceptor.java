package com.kubi.quotefacade.kline;

import android.net.Uri;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.p110rn.Constants;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.utils.C27059l;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p472nk.C42847d;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KlineFlutterRnRouteInterceptor.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineFlutterRnRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "isKlineRnDetailRoute", "uri", "Landroid/net/Uri;", "routeAction", "", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKlineFlutterRnRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KlineFlutterRnRouteInterceptor.kt\ncom/kubi/quotefacade/kline/KlineFlutterRnRouteInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
public final class KlineFlutterRnRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f42137a = new Companion(null);

    /* JADX INFO: compiled from: KlineFlutterRnRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/quotefacade/kline/KlineFlutterRnRouteInterceptor$Companion;", "", "<init>", "()V", "FLUTTER_ROUTE_PATH", "", "KLINE_TYPE_STOCK", "KRN_ROUTE_PATH", "RN_COMPONENT", "RN_BIZ", "RN_ENTRY", "RN_KLINE_ROUTE", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m52173a(Uri uri, String str) {
        if (!Intrinsics.areEqual(str, "krn/router") || !Intrinsics.areEqual(uri.getQueryParameter(Constants.COMPONENT), "kc_trade_center_next") || !Intrinsics.areEqual(uri.getQueryParameter(Constants.BIZ), "trade_center") || !Intrinsics.areEqual(uri.getQueryParameter("entry"), "main")) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("route");
        return Intrinsics.areEqual(queryParameter != null ? StringsKt.substringBefore$default(queryParameter, '?', (String) null, 2, (Object) null) : null, "KlineDetailContainerPage");
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        String strTrimStart = StringsKt.trimStart(RouteExKt.m56216G(postcard.getUri()), '/');
        if (m52173a(postcard.getUri(), strTrimStart)) {
            C42847d.f94914a.m93975a(C27059l.f54343a.m66757a());
        }
        if (!Intrinsics.areEqual(strTrimStart, ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER)) {
            return chain.mo103413a(postcard);
        }
        FlutterKlineRouteParams flutterKlineRouteParamsM52189f = KlineRnDetailRouteHelper.f42151a.m52189f(C23767n.m56884h(postcard, false, 1, null));
        if (flutterKlineRouteParamsM52189f == null) {
            return chain.mo103413a(postcard);
        }
        if (StringsKt.equals(flutterKlineRouteParamsM52189f.getKlineType(), "stock", true)) {
            return chain.mo103413a(postcard);
        }
        if (IQuoteFacadeService.f41383a.get().mo50699b(flutterKlineRouteParamsM52189f.getSymbol(), flutterKlineRouteParamsM52189f.getKlineType(), flutterKlineRouteParamsM52189f.getLeverTradeType())) {
            return true;
        }
        return chain.mo103413a(postcard);
    }
}
