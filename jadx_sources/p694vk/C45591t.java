package p694vk;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: vk.t */
/* JADX INFO: compiled from: AppUpgradeTyp.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kucoin/AppUpgradeLog;", "", "<init>", "()V", "TAG", "", "upgradeLog", "", "msg", "upgradeLogv", "funName", "e", "", "LAppConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45591t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C45591t f102713a = new C45591t();

    /* JADX INFO: renamed from: a */
    public final void m100681a(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        C44128b.m97266j("appUpgradeLog_tag", msg);
    }

    /* JADX INFO: renamed from: b */
    public final void m100682b(@NotNull String funName, @NotNull Throwable e11) {
        Intrinsics.checkNotNullParameter(funName, "funName");
        Intrinsics.checkNotNullParameter(e11, "e");
        C44128b.m97268l("appUpgradeLog_tag", "appUpgradeLog-" + funName + ",msg:" + e11.getMessage());
    }
}
