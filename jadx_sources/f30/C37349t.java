package f30;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.service.SpotDepend;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: f30.t */
/* JADX INFO: compiled from: UrlConstant.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005¨\u0006\t"}, m90084d2 = {"Lcom/kubi/spot/utils/UrlConstant;", "", "<init>", "()V", "getFutureRobotGridUrl", "", "symbol", "getEarnUrl", FirebaseAnalytics.Param.CURRENCY, "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37349t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C37349t f82867a = new C37349t();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m83949a(@Nullable String str) {
        return SpotDepend.f51244a.m63031a().mo15358x() + "?dark=true&loading=2&lang=" + MultiLanguageManager.f46811g.getLocalString() + "&currency=" + str;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m83950b(@Nullable String str) {
        return HostManager.a.j() + "/machine/torun/3?utm_source=FuturesToRobot&type=3&loading=2&dark=true&needLogin=true&lang=" + MultiLanguageManager.f46811g.getLocalString() + "&symbol=" + str;
    }
}
