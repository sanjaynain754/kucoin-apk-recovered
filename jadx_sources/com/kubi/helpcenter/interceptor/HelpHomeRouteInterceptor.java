package com.kubi.helpcenter.interceptor;

import com.kubi.router.core.Router;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: HelpHomeRouteInterceptor.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, m90084d2 = {"Lcom/kubi/helpcenter/interceptor/HelpHomeRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "Companion", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HelpHomeRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f25329a = new Companion(null);

    /* JADX INFO: compiled from: HelpHomeRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/helpcenter/interceptor/HelpHomeRouteInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "HelpCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        IUserService.Companion companion = IUserService.a;
        if (companion.get().V()) {
            C44128b.m97259c("HelpHomeRouteInterceptor", "help downgrade, proceed to native HelpCenterFragment");
            return chain.mo103413a(chain.getPostcard());
        }
        Router.f46192a.m56184f(companion.get().u0()).m4048k();
        C44128b.m97259c("HelpHomeRouteInterceptor", "jump to RN HelpCenterPage");
        return true;
    }
}
