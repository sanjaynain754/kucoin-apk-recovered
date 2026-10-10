package il;

import android.text.TextUtils;
import com.kubi.router.core.Router;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: il.c */
/* JADX INFO: compiled from: RouteLoginInterceptor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/interceptor/BaseLoginCheckInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class C38661c implements InterfaceC46936b {
    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a c4400aMo103414b = chain.mo103414b();
        if (UserInfo.a.n()) {
            return chain.mo103413a(chain.mo103414b());
        }
        if (!TextUtils.isEmpty(UserInfo.c().id) && com.kubi.user.config.a.b()) {
            return Router.f46192a.m56184f("safe/gestureUnlock").m4050m(c4400aMo103414b.m4045h()).m4048k();
        }
        if (!TextUtils.isEmpty(UserInfo.c().id) && !TextUtils.isEmpty(C27041f.m66668h(UserInfo.c().token))) {
            UserInfo.c().token = "";
        }
        return Router.f46192a.m56184f("user/login").m4050m(c4400aMo103414b.m4045h()).m4048k();
    }
}
