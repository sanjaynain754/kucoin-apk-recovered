package com.kubi.user.interceptor;

import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.api.IUserService;
import com.kubi.user.config.UserInfo;
import com.kubi.user.interceptor.NeedLoginInterceptor;
import com.kubi.utils.extensions.C27025c;
import f00.C37304a;
import g00.InterfaceC37764p;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p569qq.C43840a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RouteUserCenterInterceptor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0014\u0010\b\u001a\u00020\u0005*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\r"}, m90084d2 = {"Lcom/kubi/user/interceptor/NeedLoginInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "hasKey", "Lcom/kubi/router/model/Postcard;", "key", "", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class NeedLoginInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f53677a = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Set<String> f53678b = SetsKt.setOf((Object[]) new String[]{"user/registerGuidance", "user/login", "user/register", "safe/gestureUnlock"});

    /* JADX INFO: compiled from: RouteUserCenterInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/user/interceptor/NeedLoginInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "blackList", "", "KEY_NEED_LOGIN", "KEY_NEED_REGISTER", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m65507d(C4400a c4400a, String str) {
        try {
            return RouteExKt.m56252i(c4400a.getBundle(), str, false) || C27025c.m66566d(Boolean.valueOf(c4400a.getUri().getBooleanQueryParameter(str, false)));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        final C4400a postcard = chain.getPostcard();
        if (!UserInfo.a.n() && !CollectionsKt.contains(f53678b, postcard.getUri().getPath())) {
            if (m65507d(postcard, "needLogin")) {
                C43840a.m96550d("needLogin " + postcard.getUri().getPath(), "RouteUserCenterIntercep");
                IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: i70.a
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NeedLoginInterceptor.m65505e(postcard);
                    }
                }), 1, (Object) null);
                return true;
            }
            if (m65507d(postcard, "needRegister")) {
                C43840a.m96550d("needRegister " + postcard.getUri().getPath(), "RouteUserCenterIntercep");
                return InterfaceC37764p.a.m85185f(C37304a.f82764a, null, null, null, null, null, null, null, null, null, IRedirect.INSTANCE.obtain(new Function0() { // from class: i70.b
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NeedLoginInterceptor.m65506f(postcard);
                    }
                }), null, 1535, null);
            }
        }
        return chain.mo103413a(postcard);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m65505e(C4400a c4400a) {
        c4400a.getBundle().remove("needLogin");
        Router router = Router.f46192a;
        String string = c4400a.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        router.m56185g(string, c4400a.getBundle()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m65506f(C4400a c4400a) {
        c4400a.getBundle().remove("needRegister");
        Router router = Router.f46192a;
        String string = c4400a.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        router.m56185g(string, c4400a.getBundle()).m4048k();
        return Unit.INSTANCE;
    }
}
