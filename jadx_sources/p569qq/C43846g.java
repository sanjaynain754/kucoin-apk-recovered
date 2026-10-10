package p569qq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.BaseIssueException;
import com.kubi.monitor.MonitorLevel;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p642tq.InterfaceC45059b;
import p852kotlin.Deprecated;
import p852kotlin.DeprecationLevel;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qq.g */
/* JADX INFO: compiled from: Issues.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Lqq/g;", "", "<init>", "()V", "", "msg", "category", "Lcom/kubi/monitor/MonitorLevel;", FirebaseAnalytics.Param.LEVEL, "", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;)V", "", "b", "(Ljava/lang/Throwable;Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;)V", "Lcom/kubi/monitor/BaseIssueException;", "exception", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;)V", "key", "value", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43846g {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43846g f96911a = new C43846g();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96566a(@NotNull BaseIssueException exception, @NotNull MonitorLevel level) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(level, "level");
        Iterator<InterfaceC45059b> it = C43848i.f96913a.m96586e().mo32842d().iterator();
        while (it.hasNext()) {
            it.next().mo86567e(exception, null, level);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "此方法废弃", replaceWith = @ReplaceWith(expression = "fun exception(\n        exception: BaseIssueException,\n        level: MonitorLevel = MonitorLevel.ERROR\n    )", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ void m96567b(Throwable e11, String category, MonitorLevel level) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(level, "level");
        Iterator<InterfaceC45059b> it = C43848i.f96913a.m96586e().mo32842d().iterator();
        while (it.hasNext()) {
            it.next().mo86567e(e11, category, level);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m96568c(BaseIssueException baseIssueException, MonitorLevel monitorLevel, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            monitorLevel = MonitorLevel.ERROR;
        }
        m96566a(baseIssueException, monitorLevel);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m96569d(Throwable th2, String str, MonitorLevel monitorLevel, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            monitorLevel = MonitorLevel.ERROR;
        }
        m96567b(th2, str, monitorLevel);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "此方法废弃", replaceWith = @ReplaceWith(expression = "fun exception(\n        exception: BaseIssueException,\n        level: MonitorLevel = MonitorLevel.ERROR\n    )", imports = {}))
    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ void m96570e(String msg, String category, MonitorLevel level) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(level, "level");
        Iterator<InterfaceC45059b> it = C43848i.f96913a.m96586e().mo32842d().iterator();
        while (it.hasNext()) {
            it.next().mo86566d(msg, category, level);
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final void m96571f(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<InterfaceC45059b> it = C43848i.f96913a.m96586e().mo32842d().iterator();
        while (it.hasNext()) {
            it.next().mo86563a(key, value);
        }
    }
}
