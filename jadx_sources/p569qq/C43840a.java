package p569qq;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.MonitorLevel;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p642tq.InterfaceC45058a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qq.a */
/* JADX INFO: compiled from: Breadcrumbs.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ#\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ#\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\tJ#\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\tJ-\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lqq/a;", "", "<init>", "()V", "", "message", "category", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "d", "g", "b", "Lcom/kubi/monitor/MonitorLevel;", FirebaseAnalytics.Param.LEVEL, "f", "(Ljava/lang/String;Lcom/kubi/monitor/MonitorLevel;Ljava/lang/String;)V", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43840a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C43840a f96909a = new C43840a();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m96547a(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        f96909a.m96553f(message, MonitorLevel.DEBUG, category);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final void m96548b(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        f96909a.m96553f(message, MonitorLevel.ERROR, category);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m96549c(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        m96548b(str, str2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m96550d(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        f96909a.m96553f(message, MonitorLevel.INFO, category);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m96551e(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        m96550d(str, str2);
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final void m96552g(@NotNull String message, @Nullable String category) {
        Intrinsics.checkNotNullParameter(message, "message");
        f96909a.m96553f(message, MonitorLevel.WARNING, category);
    }

    /* JADX INFO: renamed from: f */
    public final void m96553f(String message, MonitorLevel level, String category) {
        Iterator<InterfaceC45058a> it = C43848i.f96913a.m96586e().mo32840b().iterator();
        while (it.hasNext()) {
            it.next().mo86565c(message, level, category);
        }
    }
}
