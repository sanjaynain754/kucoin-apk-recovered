package p538pq;

import com.kubi.host.HostManager;
import com.kubi.sdk.function.language.MultiLanguageManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: pq.c */
/* JADX INFO: compiled from: MineConst.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/mine/lib/util/MineConst;", "", "<init>", "()V", "RewardHubUrl", "", "getRewardHubUrl", "()Ljava/lang/String;", "API_URL", "getAPI_URL", "KCS_URL", "getKCS_URL", "MY_VOUCHERS_URL", "getMY_VOUCHERS_URL", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43523c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43523c f96059a = new C43523c();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m95775a() {
        return HostManager.a.m() + "/account/api?appNeedLang=true";
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m95776b() {
        return HostManager.a.m() + "/kcs?loading=2&appNeedLang=true&transparentTitle=true";
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m95777c() {
        return HostManager.a.m() + "/account/vouchers?loading=2&appNeedLang=true&&needLogin=true&transparentTitle=true";
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m95778d() {
        return HostManager.a.m() + "/zh-hant/rewardshub?lang=" + MultiLanguageManager.f46811g.getLocalString() + "&transparentTitle=true";
    }
}
