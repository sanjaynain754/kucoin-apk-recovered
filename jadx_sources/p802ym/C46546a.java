package p802ym;

import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43840a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: ym.a */
/* JADX INFO: compiled from: KWebCommondRouterInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kweb/router/KWebCommonRouterInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46546a implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C43840a.m96547a("KWebCommonRouterInterceptor: " + chain.getPostcard().getUri(), "kweb_router_tag");
        C4400a postcard = chain.getPostcard();
        String string = postcard.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!StringsKt.startsWith$default(string, "http", false, 2, (Object) null)) {
            return chain.mo103413a(postcard);
        }
        C37304a c37304a = C37304a.f82764a;
        String string2 = postcard.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return InterfaceC37766r.a.m85190a(c37304a, string2, null, null, null, null, null, null, 126, null);
    }
}
