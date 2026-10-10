package p538pq;

import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.user.config.UserInfo;
import org.jetbrains.annotations.NotNull;
import p351iy.C40192c;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;

/* JADX INFO: renamed from: pq.f */
/* JADX INFO: compiled from: MultiAccountSwitchEntrance.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/mine/lib/util/MultiAccountSwitchEntrance;", "", "<init>", "()V", "isVisible", "", "isVisibleOnMineTab", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43526f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43526f f96061a = new C43526f();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m95789a() {
        if (AppMode.INSTANCE.isLiteMode() || C40192c.f89321a.m88546h()) {
            return false;
        }
        return C24129b.m58030b(SiteVisibleConfigKey.SwitchAccount);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m95790b() {
        if (m95789a() && UserInfo.a.n()) {
            return true;
        }
        return false;
    }
}
