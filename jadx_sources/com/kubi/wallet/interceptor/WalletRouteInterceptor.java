package com.kubi.wallet.interceptor;

import android.net.Uri;
import android.os.Bundle;
import com.kubi.kucoin.token.ITokenLifecycleRefreshSPI;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.flutter.C23767n;
import com.kubi.utils.ToastCompat;
import com.kubi.wallet.R$string;
import com.kubi.wallet.api.IWalletService;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41727q2;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: WalletRouteInterceptor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/wallet/interceptor/WalletRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "getMainScope", "()Lkotlinx/coroutines/CoroutineScope;", "mainScope$delegate", "Lkotlin/Lazy;", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "isWeb3Path", "postcard", "Lcom/kubi/router/model/Postcard;", "getInitialRoute", "", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWalletRouteInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletRouteInterceptor.kt\ncom/kubi/wallet/interceptor/WalletRouteInterceptor\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,72:1\n29#2:73\n*S KotlinDebug\n*F\n+ 1 WalletRouteInterceptor.kt\ncom/kubi/wallet/interceptor/WalletRouteInterceptor\n*L\n65#1:73\n*E\n"})
public final class WalletRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f54623a = LazyKt.lazy(new Function0() { // from class: com.kubi.wallet.interceptor.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WalletRouteInterceptor.m66952f();
        }
    });

    /* JADX INFO: renamed from: f */
    public static final InterfaceC41709m0 m66952f() {
        return C41713n0.m91125a(C41727q2.m91192b(null, 1, null).plus(C42911a.m94121c()));
    }

    /* JADX INFO: renamed from: c */
    public final String m66953c(C4400a c4400a) {
        String strM56882f = C23767n.m56882f(c4400a, false);
        String strM56884h = C23767n.m56884h(c4400a, false, 1, null);
        if (!Intrinsics.areEqual(strM56882f, "wallet/walletConnect") && !Intrinsics.areEqual(strM56882f, "wallet/walletConnect/")) {
            return strM56884h;
        }
        String string = Uri.parse(strM56884h).buildUpon().path("wallet/walletConnectwc").build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        if (!m66955e(postcard)) {
            return chain.mo103413a(postcard);
        }
        if (!IWalletService.f54542a.get().mo66941a()) {
            ToastCompat.m66437C(R$string.kc_web3_not_support);
            return true;
        }
        Bundle bundle = postcard.getBundle();
        bundle.putString("flutterInitialRoute", m66953c(postcard));
        C41696j.m91104d(m66954d(), null, null, new WalletRouteInterceptor$intercept$1(bundle, null), 3, null);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC41709m0 m66954d() {
        return (InterfaceC41709m0) this.f54623a.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m66955e(C4400a c4400a) {
        String queryParameter;
        if (!Intrinsics.areEqual(RouteExKt.m56216G(c4400a.getUri()), ITokenLifecycleRefreshSPI.Companion.SOURCE_FLUTTER) || (queryParameter = c4400a.getUri().getQueryParameter("route")) == null || !StringsKt.startsWith$default(queryParameter, "wallet/", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }
}
