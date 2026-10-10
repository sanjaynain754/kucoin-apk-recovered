package p662uf;

import com.kubi.fallback.FallbackManager;
import com.kubi.fallback.internal.config.FallbackData;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43840a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import wf.C45824a;
import wf.C45825b;

/* JADX INFO: renamed from: uf.b */
/* JADX INFO: compiled from: DynamicRoutesFallback.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/fallback/internal/dynamicroutes/DynamicRoutesFallback;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45211b implements InterfaceC46936b {
    /* JADX INFO: renamed from: c */
    public static final Unit m99886c(String str, C4400a c4400a, FallbackData fallbackData) {
        C43840a.m96550d("DynamicRoutesFallback route:" + str + ",params:" + RouteExKt.m56243d0(c4400a.getBundle()) + ",fallbackData:" + fallbackData, "Fallback");
        return Unit.INSTANCE;
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        final C4400a postcard = chain.getPostcard();
        final String strM56216G = RouteExKt.m56216G(postcard.getUri());
        final FallbackData fallbackDataMo23749b = FallbackManager.f21936a.mo23749b(strM56216G);
        if (fallbackDataMo23749b == null) {
            return chain.mo103413a(postcard);
        }
        C27100x0.m66924e(new Function0() { // from class: uf.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45211b.m99886c(strM56216G, postcard, fallbackDataMo23749b);
            }
        });
        C4400a c4400aM56184f = Router.f46192a.m56184f(C27041f.m66668h(fallbackDataMo23749b.getFallbackValue()));
        if (!C27025c.m66566d(fallbackDataMo23749b.getDiscardParams())) {
            c4400aM56184f.m4039b(RouteExKt.m56243d0(postcard.getBundle()));
        }
        boolean zM4048k = c4400aM56184f.m4048k();
        C45825b.f103310a.m101240c(zM4048k, "dynamicRoutes", C27041f.m66668h(fallbackDataMo23749b.getFallbackType()), strM56216G);
        if (!zM4048k) {
            C45824a.m101237b("Dynamic routing disaster recovery failure,rawRoute:" + strM56216G, "DynamicRoutesFallback");
        }
        return zM4048k;
    }
}
