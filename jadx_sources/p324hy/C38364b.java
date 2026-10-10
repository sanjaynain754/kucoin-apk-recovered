package p324hy;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.kubi.monitor.FlutterError;
import com.kubi.monitor.MonitorLevel;
import com.kubi.sdk.BaseApplication;
import com.tencent.bugly.library.Bugly;
import com.tencent.bugly.library.BuglyCustomLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p642tq.InterfaceC45058a;
import p642tq.InterfaceC45059b;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hy.b */
/* JADX INFO: compiled from: BuglyIssue.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\"\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0016J\"\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/bugly/BuglyIssue;", "Lcom/kubi/monitor/core/IIssue;", "Lcom/kubi/monitor/core/IBreadcrumb;", "<init>", "()V", "FLUTTER_ERROR_REASON", "", "TAG", "message", "", "msg", "category", FirebaseAnalytics.Param.LEVEL, "Lcom/kubi/monitor/MonitorLevel;", "exception", "e", "", "flutterException", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/kubi/monitor/FlutterError;", "setCustomKey", "key", "value", "log", "item", "Lcom/kubi/monitor/BreadcrumbItem;", "logPrivate", "tag", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C38364b implements InterfaceC45059b, InterfaceC45058a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C38364b f86125a = new C38364b();

    /* JADX INFO: renamed from: hy.b$a */
    /* JADX INFO: compiled from: BuglyIssue.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonitorLevel.values().length];
            try {
                iArr[MonitorLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonitorLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MonitorLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MonitorLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MonitorLevel.FATAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // p642tq.InterfaceC45059b
    /* JADX INFO: renamed from: a */
    public void mo86563a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Result.Companion companion = Result.INSTANCE;
            Application application = BaseApplication.INSTANCE.get();
            if (application == null) {
                return;
            }
            Bugly.putUserData(application, key, value);
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // p642tq.InterfaceC45059b
    /* JADX INFO: renamed from: b */
    public void mo86564b(@NotNull FlutterError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            Result.Companion companion = Result.INSTANCE;
            String reason = error.getReason();
            if (reason == null) {
                reason = "";
            }
            mo86563a("flutter_error_reason", reason);
            String information = error.getInformation();
            if (information != null) {
                m86568f("Flutter", information, MonitorLevel.ERROR);
            }
            mo86567e(error.getThrowable(), error.getCategory(), error.getLevel());
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // p642tq.InterfaceC45058a
    /* JADX INFO: renamed from: c */
    public void mo86565c(@NotNull String message, @NotNull MonitorLevel level, @Nullable String str) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(level, "level");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (str == null) {
                str = "Monitor::BuglyIssue";
            }
            m86568f(str, message, level);
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // p642tq.InterfaceC45059b
    /* JADX INFO: renamed from: d */
    public void mo86566d(@NotNull String msg, @Nullable String str, @NotNull MonitorLevel level) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(level, "level");
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    @Override // p642tq.InterfaceC45059b
    /* JADX INFO: renamed from: e */
    public void mo86567e(@NotNull Throwable e11, @Nullable String str, @NotNull MonitorLevel level) {
        Intrinsics.checkNotNullParameter(e11, "e");
        Intrinsics.checkNotNullParameter(level, "level");
        try {
            Result.Companion companion = Result.INSTANCE;
            Thread threadCurrentThread = Thread.currentThread();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("category=");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append(", level=");
            sb2.append(level.name());
            Result.m103844constructorimpl(Boolean.valueOf(Bugly.handleCatchException(threadCurrentThread, e11, sb2.toString(), null, false)));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m86568f(String str, String str2, MonitorLevel monitorLevel) {
        try {
            Result.Companion companion = Result.INSTANCE;
            int i11 = a.$EnumSwitchMapping$0[monitorLevel.ordinal()];
            if (i11 == 1) {
                BuglyCustomLog.m72201d(str, str2);
            } else if (i11 == 2) {
                BuglyCustomLog.m72204i(str, str2);
            } else if (i11 != 3) {
                if (i11 != 4 && i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                BuglyCustomLog.m72202e(str, str2);
            } else {
                BuglyCustomLog.m72206w(str, str2);
            }
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
