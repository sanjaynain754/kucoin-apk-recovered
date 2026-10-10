package com.kubi.kucoin.main.router;

import android.net.Uri;
import android.os.Bundle;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.lite.api.ILiteService;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.helper.UserSelectorMode;
import gf.C37890n;
import java.util.HashMap;
import ml.C42566b;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.kucoin.main.router.h, reason: from Kotlin metadata */
/* JADX INFO: compiled from: RouterHomeInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kucoin/main/router/RouterHomeInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "upgradeTables", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getUpgradeTables", "()Ljava/util/HashMap;", "KEY_SYMBOL", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "resolveLeverWholeTarget", "postcard", "Lcom/kubi/router/model/Postcard;", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouterHomeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouterHomeInterceptor.kt\ncom/kubi/kucoin/main/router/RouterHomeInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public final class RouterHomeInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final HashMap<String, String> f28025a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f28026b;

    /* JADX INFO: renamed from: a */
    public final String m32484a(C4400a c4400a) {
        Object objM103844constructorimpl;
        SymbolInfoEntity symbolInfoEntityM85601B;
        String str = this.f28025a.get("lever/wholeTrade");
        String str2 = this.f28025a.get("lever/isolatedTrade");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(c4400a.getUri().getQueryParameter(this.f28026b));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
            objM103844constructorimpl = null;
        }
        String string = (String) objM103844constructorimpl;
        if (string == null) {
            string = c4400a.getBundle().getString(this.f28026b);
        }
        return (string == null || string.length() == 0 || (symbolInfoEntityM85601B = C37890n.f85269a.m85601B(string)) == null || symbolInfoEntityM85601B.isMarginEnabled() || !symbolInfoEntityM85601B.isIsolatedMarginEnabled()) ? str : str2;
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("RouterLiteHomeInterceptor: AppMode=");
        AppMode.Companion companion = AppMode.INSTANCE;
        sb2.append(AppMode.Companion.getCurrentMode$default(companion, null, 1, null));
        sb2.append("， UserSelectorMode=");
        UserSelectorMode.Companion companion2 = UserSelectorMode.INSTANCE;
        sb2.append(companion2.get());
        C44128b.m97266j("LiteTag", sb2.toString());
        if ((companion2.get() == UserSelectorMode.Newer || companion.isLiteMode()) && ILiteService.f32003a.get().mo37530a()) {
            Bundle bundle = postcard.getBundle();
            if (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "account/asset")) {
                C42566b c42566b = C42566b.f94258a;
                bundle.putString("tab", Uri.encode("kucoin://lite/asset"));
                C42566b.m93333b(c42566b, bundle, false, true, 2, null);
            } else {
                C42566b.m93333b(C42566b.f94258a, bundle, false, true, 2, null);
            }
            companion2.set(UserSelectorMode.Experienced);
            return true;
        }
        C44128b.m97266j("LiteTag", "RouterLiteHomeInterceptor : continue to proceed");
        if (this.f28025a.containsKey(RouteExKt.m56216G(postcard.getUri()))) {
            Uri uri = Uri.parse(postcard.getUri().getScheme() + "://" + (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "lever/wholeTrade") ? m32484a(postcard) : this.f28025a.get(RouteExKt.m56216G(postcard.getUri()))));
            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
            postcard = new C4400a(uri, postcard.getBundle());
        }
        return chain.mo103413a(IKuMexService.f28731a.get().mo33271V(postcard));
    }

    public RouterHomeInterceptor() {
        HashMap<String, String> map = new HashMap<>();
        map.put("quotes", "home?page=1");
        map.put("trade", "home?page=2&type=0");
        map.put("lever/wholeTrade", "home?page=2&type=1");
        map.put("lever/isolatedTrade", "home?page=2&type=2");
        map.put("lever/trade", "home?page=2&type=3");
        map.put("trade/spot/grid", "home?page=2&type=4");
        map.put("trade/futures/grid", "home?page=2&type=5");
        map.put("alpha/trade", "home?page=2&type=6");
        map.put("trade/alpha", "home?page=2&type=6");
        map.put("kumex/trade", "home?page=3");
        map.put("account/asset", "home?page=4");
        this.f28025a = map;
        this.f28026b = "symbol";
    }
}
