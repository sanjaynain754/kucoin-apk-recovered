package p538pq;

import com.kubi.mine.lib.entity.AppUpgradeEntityV2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import y70.C46396e;

/* JADX INFO: renamed from: pq.a */
/* JADX INFO: compiled from: AppUpgradeCacheUtil.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0017\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0019J\r\u0010\u001a\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, m90084d2 = {"Lcom/kubi/mine/lib/util/AppUpgradeCacheUtil;", "", "<init>", "()V", "CACHENAME_APPUPGRADE", "", "APPUPGRADE_SHARE_LATESTAPPVERSION", "APPUPGRADE_SHARE_SHOWNOTIFIEDDATE", "APPUPGRADE_SHARE_HOMEPAGETIPDIALOG_SHOWNUMBER", "CATEGORY", "APPUPGRADE_TASK_ID", "APPUPGRADE_DIALOG_SHOW_TIME", "appUpgradeLatestAppVersion", "appUpgradeLatestAppVersion$MineLib_googleRelease", "homePageTipDialogShowNumber", "", "homePageTipDialogShowNumber$MineLib_googleRelease", "showNotifiedDate", "", "showNotifiedDate$MineLib_googleRelease", "cacheHomePageAppUpgradeData", "", "latestAppVersion", "cacheHomePageAppUpgradeData$MineLib_googleRelease", "getUpgradeTaskId", "getUpgradeTaskId$MineLib_googleRelease", "getUpgradeShowTime", "getUpgradeShowTime$MineLib_googleRelease", "cacheUpgrade", "appUpgradeEntity", "Lcom/kubi/mine/lib/entity/AppUpgradeEntityV2;", "cacheUpgrade$MineLib_googleRelease", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C43521a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43521a f96057a = new C43521a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m95763a() {
        return C46396e.m102351h("appUpgrade_share_cache", "appUpgrade_share_latestAppVersion", "");
    }

    /* JADX INFO: renamed from: b */
    public final void m95764b(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        String strM95763a = m95763a();
        C46396e.m102358o("appUpgrade_share_cache", "appUpgrade_share_latestAppVersion", str);
        C46396e.m102355l("appUpgrade_share_cache", "appUpgrade_share_homePageTipDialogShowNumber", Intrinsics.areEqual(str, strM95763a) ? 1 + m95768f() : 1);
        C46396e.m102356m("appUpgrade_share_cache", "appUpgrade_share_showNotifiedDate", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: c */
    public final void m95765c(@NotNull AppUpgradeEntityV2 appUpgradeEntity) {
        Intrinsics.checkNotNullParameter(appUpgradeEntity, "appUpgradeEntity");
        if (!Intrinsics.areEqual(appUpgradeEntity.getPopupId(), f96057a.m95767e())) {
            C46396e.m102358o("appUpgrade_v2_cache", "appUpgrade_task_id", appUpgradeEntity.getPopupId());
        }
        C46396e.m102356m("appUpgrade_v2_cache", "appupgrade_task_show_time", System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: d */
    public final long m95766d() {
        return C46396e.m102349f("appUpgrade_v2_cache", "appupgrade_task_show_time", 0L);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final String m95767e() {
        return C46396e.m102351h("appUpgrade_v2_cache", "appUpgrade_task_id", "0");
    }

    /* JADX INFO: renamed from: f */
    public final int m95768f() {
        return C46396e.m102348e("appUpgrade_share_cache", "appUpgrade_share_homePageTipDialogShowNumber", 0);
    }

    /* JADX INFO: renamed from: g */
    public final long m95769g() {
        return C46396e.m102349f("appUpgrade_share_cache", "appUpgrade_share_showNotifiedDate", 0L);
    }
}
