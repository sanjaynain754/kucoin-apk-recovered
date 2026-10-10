package p423l6;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.C5501a;
import com.facebook.internal.instrument.InstrumentData;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394k6.C40926i;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: l6.b */
/* JADX INFO: compiled from: ANRDetector.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\u0003R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Ll6/b;", "", "<init>", "()V", "Landroid/app/ActivityManager;", "am", "", "c", "(Landroid/app/ActivityManager;)V", "d", "", "b", "I", "myUid", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "", "Ljava/lang/String;", "previousStackTrace", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "anrDetectorRunnable", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nANRDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ANRDetector.kt\ncom/facebook/internal/instrument/anrreport/ANRDetector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1855#2,2:69\n*S KotlinDebug\n*F\n+ 1 ANRDetector.kt\ncom/facebook/internal/instrument/anrreport/ANRDetector\n*L\n46#1:69,2\n*E\n"})
public final class C42102b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42102b f93422a = new C42102b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final int myUid = Process.myUid();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static String previousStackTrace = "";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Runnable anrDetectorRunnable = new Runnable() { // from class: l6.a
        @Override // java.lang.Runnable
        public final void run() {
            C42102b.m92358b();
        }
    };

    /* JADX INFO: renamed from: b */
    public static final void m92358b() {
        if (C42757a.m93689d(C42102b.class)) {
            return;
        }
        try {
            Object systemService = C5501a.m7799m().getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            m92359c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42102b.class);
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public static final void m92359c(@Nullable ActivityManager am2) {
        if (C42757a.m93689d(C42102b.class) || am2 == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = am2.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                        Thread thread = Looper.getMainLooper().getThread();
                        Intrinsics.checkNotNullExpressionValue(thread, "getMainLooper().thread");
                        String strM89628g = C40926i.m89628g(thread);
                        if (!Intrinsics.areEqual(strM89628g, previousStackTrace) && C40926i.m89632k(thread)) {
                            previousStackTrace = strM89628g;
                            InstrumentData.C5762a.m10124a(processErrorStateInfo.shortMsg, strM89628g).m10121g();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42102b.class);
        }
    }

    @JvmStatic
    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public static final void m92360d() {
        if (C42757a.m93689d(C42102b.class)) {
            return;
        }
        try {
            scheduledExecutorService.scheduleWithFixedDelay(anrDetectorRunnable, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42102b.class);
        }
    }
}
