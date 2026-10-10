package com.kubi.mine.lib.interceptor;

import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.user.api.IUserService;
import org.jetbrains.annotations.NotNull;
import p026ay.C4400a;
import p846zx.InterfaceC46935a;
import p846zx.InterfaceC46936b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SettingsRouteInterceptor.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\f"}, m90084d2 = {"Lcom/kubi/mine/lib/interceptor/SettingsRouteInterceptor;", "Lcom/kubi/router/interceptor/IInterceptor;", "<init>", "()V", "intercept", "", "chain", "Lcom/kubi/router/interceptor/IChain;", "interceptSettings", "interceptTestFlight", "interceptWidgetChoose", "Companion", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SettingsRouteInterceptor implements InterfaceC46936b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f35029a = new Companion(null);

    /* JADX INFO: compiled from: SettingsRouteInterceptor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/mine/lib/interceptor/SettingsRouteInterceptor$Companion;", "", "<init>", "()V", "TAG", "", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41654a(InterfaceC46935a interfaceC46935a) {
        IUserService.Companion companion = IUserService.a;
        if (companion.get().i()) {
            C44128b.m97259c("SettingsRouteInterceptor", "settings downgrade, proceed to native SettingsFragment");
            return interfaceC46935a.mo103413a(interfaceC46935a.getPostcard());
        }
        Router.f46192a.m56184f(companion.get().A0()).m4048k();
        C44128b.m97259c("SettingsRouteInterceptor", "jump to RN SettingsHomePage");
        return true;
    }

    @Override // p846zx.InterfaceC46936b
    /* JADX INFO: renamed from: b */
    public boolean mo4304b(@NotNull InterfaceC46935a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        C4400a postcard = chain.getPostcard();
        String strM56216G = RouteExKt.m56216G(postcard.getUri());
        int iHashCode = strM56216G.hashCode();
        if (iHashCode != -538954827) {
            if (iHashCode != 1434631203) {
                if (iHashCode == 1876011074 && strM56216G.equals("widget/choose")) {
                    return m41656d();
                }
            } else if (strM56216G.equals("settings")) {
                return m41654a(chain);
            }
        } else if (strM56216G.equals("join/beta")) {
            return m41655c(chain);
        }
        return chain.mo103413a(postcard);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m41655c(InterfaceC46935a interfaceC46935a) {
        IUserService.Companion companion = IUserService.a;
        if (companion.get().W()) {
            C44128b.m97259c("SettingsRouteInterceptor", "testFlight downgrade, proceed to native JoinBetaFragment");
            return interfaceC46935a.mo103413a(interfaceC46935a.getPostcard());
        }
        Router.f46192a.m56184f(companion.get().r0()).m4048k();
        C44128b.m97259c("SettingsRouteInterceptor", "jump to RN TestFlightPage");
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m41656d() {
        Router.f46192a.m56184f("widget/setting").m4048k();
        C44128b.m97259c("SettingsRouteInterceptor", "jump widget/choose to widget/setting");
        return true;
    }
}
