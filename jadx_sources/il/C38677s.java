package il;

import com.kubi.router.utils.RouteExKt;
import com.kubi.utils.C27100x0;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: il.s */
/* JADX INFO: compiled from: RouteLogInterceptor.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/RouteLogInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38677s implements InterfaceC46936b {
    /* JADX INFO: renamed from: c */
    public static final Unit m87421c(InterfaceC46935a interfaceC46935a) {
        C43840a.m96550d("NAV: " + interfaceC46935a.getPostcard().getUri() + ": " + RouteExKt.m56243d0(interfaceC46935a.getPostcard().getBundle()), "router");
        return Unit.INSTANCE;
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull final InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C27100x0.m66924e(new Function0() { // from class: il.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38677s.m87421c(chain);
            }
        });
        return chain.mo103413a(chain.getPostcard());
    }
}
