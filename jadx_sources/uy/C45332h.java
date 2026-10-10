package uy;

import android.net.Uri;
import com.kubi.router.core.Router;
import com.kubi.utils.C27100x0;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p741wy.InterfaceC45957q;
import p741wy.InterfaceC45958r;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: uy.h */
/* JADX INFO: compiled from: RouteReferralCodeInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/flutter/interceptor/RouteReferralCodeInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "checkReferralCode", "", "uri", "Landroid/net/Uri;", "iUserServiceTransmit", "Lcom/kubi/sdk/flutter/transmit/IUserServiceTransmit;", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRouteReferralCodeInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteReferralCodeInterceptor.kt\ncom/kubi/sdk/flutter/interceptor/RouteReferralCodeInterceptor\n+ 2 FlutterEx.kt\ncom/kubi/sdk/flutter/FlutterExKt\n*L\n1#1,45:1\n65#2:46\n*S KotlinDebug\n*F\n+ 1 RouteReferralCodeInterceptor.kt\ncom/kubi/sdk/flutter/interceptor/RouteReferralCodeInterceptor\n*L\n40#1:46\n*E\n"})
public final class C45332h implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @Nullable
    public InterfaceC45958r f101935a;

    /* JADX INFO: renamed from: e */
    private final InterfaceC45958r m100222e() {
        if (this.f101935a == null) {
            this.f101935a = (InterfaceC45958r) ((InterfaceC45957q) CollectionsKt.firstOrNull(Router.f46192a.m56190l(InterfaceC45958r.class)));
        }
        return this.f101935a;
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        m100223c(chain.getPostcard().getUri());
        return chain.mo103413a(chain.getPostcard());
    }

    /* JADX INFO: renamed from: c */
    public final void m100223c(final Uri uri) {
        C27100x0.m66923d(new Function0() { // from class: uy.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C45332h.m100221d(uri, this);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m100221d(Uri uri, C45332h c45332h) {
        InterfaceC45958r interfaceC45958rM100222e;
        InterfaceC45958r interfaceC45958rM100222e2;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains("rCode") && (interfaceC45958rM100222e2 = c45332h.m100222e()) != null) {
            interfaceC45958rM100222e2.mo65474b(uri.getQueryParameter("rCode"));
        }
        if (queryParameterNames.contains("rcode") && (interfaceC45958rM100222e = c45332h.m100222e()) != null) {
            interfaceC45958rM100222e.mo65474b(uri.getQueryParameter("rcode"));
        }
        return Unit.INSTANCE;
    }
}
