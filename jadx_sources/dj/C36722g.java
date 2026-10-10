package dj;

import android.content.Context;
import com.kubi.home.service.HomeDepend;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.notice.api.service.INoticeService;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.model.LoginUserEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dj.g */
/* JADX INFO: compiled from: ServiceEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0006\u0010\u0007\u001a\u00020\u0003\u001a\u0006\u0010\b\u001a\u00020\t\u001a\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003¨\u0006\u000e"}, m90084d2 = {"getUserId", "", "hasLogin", "", "getLoginEntity", "Lcom/kubi/user/model/LoginUserEntity;", "isRestrictedDepositWithdraw", "isDayTheme", "loadNoticeConfig", "", "getRedPoint", "context", "Landroid/content/Context;", "needRequestOTC", "HomeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C36722g {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final LoginUserEntity m82288b() {
        return HomeDepend.f26198a.m30225d().d0();
    }

    /* JADX INFO: renamed from: c */
    public static final void m82289c(@NotNull Context context, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        INoticeService.f36364a.get().mo43136e(context, z11);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m82290d(Context context, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        m82289c(context, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m82291e() {
        return HomeDepend.f26198a.m30225d().d();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m82292f() {
        return HomeDepend.f26198a.m30225d().c();
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m82293g() {
        return DayNightThemeManager.f28592a.m33187l();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m82294h() {
        return HomeDepend.f26198a.m30225d().U();
    }

    /* JADX INFO: renamed from: i */
    public static final void m82295i() {
        C24129b.m58033e(SiteVisibleConfigKey.Futures, new Function0() { // from class: dj.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C36722g.m82296j();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m82296j() {
        HomeDepend.f26198a.m30222a().mo33280h();
        return Unit.INSTANCE;
    }
}
