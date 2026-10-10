package com.tencent.rmonitor.common.logcat;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/rmonitor/common/logcat/LogcatManager;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class LogcatManager {
    public static final int JAVA = 1;
    public static final int NATIVE = 2;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<LogcatFromJava> javaLog$delegate = LazyKt.lazy(new Function0<LogcatFromJava>() { // from class: com.tencent.rmonitor.common.logcat.LogcatManager$Companion$javaLog$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final LogcatFromJava invoke() {
            return new LogcatFromJava();
        }
    });

    @NotNull
    private static final Lazy<LogcatFromNative> nativeLog$delegate = LazyKt.lazy(new Function0<LogcatFromNative>() { // from class: com.tencent.rmonitor.common.logcat.LogcatManager$Companion$nativeLog$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final LogcatFromNative invoke() {
            return new LogcatFromNative();
        }
    });

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, m90084d2 = {"Lcom/tencent/rmonitor/common/logcat/LogcatManager$Companion;", "", "()V", "JAVA", "", "NATIVE", "javaLog", "Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;", "getJavaLog", "()Lcom/tencent/rmonitor/common/logcat/LogcatFromJava;", "javaLog$delegate", "Lkotlin/Lazy;", "nativeLog", "Lcom/tencent/rmonitor/common/logcat/LogcatFromNative;", "getNativeLog", "()Lcom/tencent/rmonitor/common/logcat/LogcatFromNative;", "nativeLog$delegate", "initLogcat", "Lcom/tencent/rmonitor/common/logcat/ILogcat;", "type", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final ILogcat initLogcat(int type) {
            if (type != 1) {
                return type != 2 ? getJavaLog() : getNativeLog();
            }
            return getJavaLog();
        }

        private Companion() {
        }

        private final LogcatFromJava getJavaLog() {
            return (LogcatFromJava) LogcatManager.javaLog$delegate.getValue();
        }

        private final LogcatFromNative getNativeLog() {
            return (LogcatFromNative) LogcatManager.nativeLog$delegate.getValue();
        }
    }

    @JvmStatic
    @Nullable
    public static final ILogcat initLogcat(int i11) {
        return INSTANCE.initLogcat(i11);
    }
}
