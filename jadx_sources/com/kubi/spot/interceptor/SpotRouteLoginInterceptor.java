package com.kubi.spot.interceptor;

import androidx.fragment.app.FragmentActivity;
import com.kubi.router.utils.RouteExKt;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.config.UserInfo;
import com.kubi.utaspot.api.IUtaSpotService;
import com.kubi.utaspot.api.UtaTradeType;
import f00.C37304a;
import g00.InterfaceC37756h;
import il.C38661c;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p481ny.C42899b;
import p846zx.InterfaceC46935a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.spot.interceptor.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SpotRouteLoginInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/spot/interceptor/SpotRouteLoginInterceptor;", "Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "<init>", "()V", "TYPE_MARGIN_ORDER_CENTER", "", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SpotRouteLoginInterceptor extends C38661c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f50616a = "1";

    /* JADX INFO: renamed from: d */
    public static final Unit m61876d(C4400a c4400a, FragmentActivity it) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(it, "it");
        IUtaSpotService iUtaSpotService = IUtaSpotService.f54014a.get();
        UtaTradeType utaTradeType = UtaTradeType.SPOT;
        String string = c4400a.getBundle().getString("symbol");
        String string2 = c4400a.getBundle().getString("index");
        IUtaSpotService.m65987f(iUtaSpotService, it, string, null, utaTradeType, (string2 == null || (intOrNull = StringsKt.toIntOrNull(string2)) == null) ? 2 : intOrNull.intValue(), 4, null);
        return Unit.INSTANCE;
    }

    @Override // il.C38661c, p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        final C4400a postcard = chain.getPostcard();
        String string = postcard.getBundle().getString("type");
        if (Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "trade/delegate/record") && Intrinsics.areEqual(string, this.f50616a)) {
            String string2 = postcard.getBundle().getString("symbol");
            String string3 = postcard.getBundle().getString("index");
            InterfaceC37756h.a.m85146d(C37304a.f82764a, "cross", string3 != null ? StringsKt.toLongOrNull(string3) : null, string2, null, null, null, null, null, 248, null);
            return true;
        }
        if (!Intrinsics.areEqual(RouteExKt.m56216G(postcard.getUri()), "trade/delegate/record") || !UserInfo.a.n() || !IUnifyAccountService.f53155a.get().mo64979C()) {
            return super.mo4304b(chain);
        }
        C42899b.m94073c(new Function1() { // from class: com.kubi.spot.interceptor.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SpotRouteLoginInterceptor.m61876d(postcard, (FragmentActivity) obj);
            }
        });
        return true;
    }
}
