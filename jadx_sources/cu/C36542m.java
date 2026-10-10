package cu;

import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.helper.RemoteConfigHelper;
import com.kubi.payment.p2p.P2PFallbackFragment;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.utils.C27059l;
import com.kubi.utils.extensions.C27041f;
import il.C38661c;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43846g;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: cu.m */
/* JADX INFO: compiled from: PaymentRouteInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/payment/interceptor/route/PaymentRouteInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/PaymentRouteInterceptor\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,99:1\n44#2,2:100\n29#3:102\n*S KotlinDebug\n*F\n+ 1 PaymentRouteInterceptor.kt\ncom/kubi/payment/interceptor/route/PaymentRouteInterceptor\n*L\n53#1:100,2\n93#1:102\n*E\n"})
public final class C36542m extends C38661c {
    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!OtcDepend.f38138a.m45466o()) {
            return super.mo4304b(chain);
        }
        C4400a postcard = chain.getPostcard();
        int iM56262n = RouteExKt.m56262n(postcard.getBundle(), "type", -1);
        if (!C24129b.m58030b(SiteVisibleConfigKey.P2P) && iM56262n == 0) {
            P2PFallbackFragment.f39680V.launch(C27059l.f54343a.m66757a());
            return true;
        }
        if (!C24129b.m58030b(SiteVisibleConfigKey.FastTrade) && (iM56262n == -1 || iM56262n == 2)) {
            C43846g.m96568c(new OtcException(new Exception("fast trade is not available"), "PaymentRouteInterceptor", false, null, 8, null), null, 2, null);
            return true;
        }
        if (AppMode.INSTANCE.isLiteMode()) {
            Router.f46192a.m56184f("kucoin://lite/home?tab=kucoin%3A%2F%2Flite%2Ftrade%3Froute%3DTradeHome%26type%3DFAST_BUY").m4048k();
            return true;
        }
        Bundle bundle = postcard.getBundle();
        String strM66668h = C27041f.m66668h(RouteExKt.m56284y(bundle, "fiat"));
        if (strM66668h.length() > 0) {
            bundle.putString("fiatCurrency", strM66668h);
        }
        String strM66668h2 = C27041f.m66668h(RouteExKt.m56284y(bundle, "coin"));
        if (strM66668h2.length() > 0) {
            bundle.putString("cryptoCurrency", strM66668h2);
        } else if (C27041f.m66668h(RouteExKt.m56284y(bundle, FirebaseAnalytics.Param.CURRENCY)).length() > 0) {
            bundle.putString("cryptoCurrency", C27041f.m66668h(RouteExKt.m56284y(bundle, FirebaseAnalytics.Param.CURRENCY)));
        }
        if (!RemoteConfigHelper.f39546a.m48249a()) {
            return chain.mo103413a(postcard);
        }
        return new C4400a(Uri.parse(postcard.getUri().getScheme() + "://" + ((iM56262n == -1 || iM56262n == 2) ? "payment/fastTrade" : "payment/p2p")), postcard.getBundle()).m4048k();
    }
}
