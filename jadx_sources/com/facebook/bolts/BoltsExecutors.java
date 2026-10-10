package com.facebook.bolts;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BoltsExecutors.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m90084d2 = {"Lcom/facebook/bolts/BoltsExecutors;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/ExecutorService;", "background", "Ljava/util/concurrent/ScheduledExecutorService;", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduled", "Ljava/util/concurrent/Executor;", "c", "Ljava/util/concurrent/Executor;", "immediate", "d", "Companion", "ImmediateExecutor", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class BoltsExecutors {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final BoltsExecutors f8056e = new BoltsExecutors();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ExecutorService background;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ScheduledExecutorService scheduled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Executor immediate;

    /* JADX INFO: compiled from: BoltsExecutors.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m90084d2 = {"Lcom/facebook/bolts/BoltsExecutors$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "background", "()Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduled$facebook_bolts_release", "()Ljava/util/concurrent/ScheduledExecutorService;", "scheduled", "Ljava/util/concurrent/Executor;", "immediate$facebook_bolts_release", "()Ljava/util/concurrent/Executor;", "immediate", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Z", "isAndroidRuntime", "Lcom/facebook/bolts/BoltsExecutors;", "INSTANCE", "Lcom/facebook/bolts/BoltsExecutors;", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m8390a() {
            String property = System.getProperty("java.runtime.name");
            if (property == null) {
                return false;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = property.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "android", false, 2, (Object) null);
        }

        @JvmStatic
        @NotNull
        public final ExecutorService background() {
            return BoltsExecutors.f8056e.background;
        }

        @JvmStatic
        @NotNull
        public final Executor immediate$facebook_bolts_release() {
            return BoltsExecutors.f8056e.immediate;
        }

        @JvmStatic
        @NotNull
        public final ScheduledExecutorService scheduled$facebook_bolts_release() {
            return BoltsExecutors.f8056e.scheduled;
        }
    }

    /* JADX INFO: compiled from: BoltsExecutors.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0012"}, m90084d2 = {"Lcom/facebook/bolts/BoltsExecutors$ImmediateExecutor;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "", "b", "()I", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/ThreadLocal;", "Ljava/lang/ThreadLocal;", "executionDepth", "c", "Companion", "facebook-bolts_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class ImmediateExecutor implements Executor {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ThreadLocal<Integer> executionDepth = new ThreadLocal<>();

        /* JADX INFO: renamed from: a */
        public final int m8391a() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() - 1;
            if (iIntValue == 0) {
                this.executionDepth.remove();
                return iIntValue;
            }
            this.executionDepth.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        /* JADX INFO: renamed from: b */
        public final int m8392b() {
            Integer num = this.executionDepth.get();
            if (num == null) {
                num = 0;
            }
            int iIntValue = num.intValue() + 1;
            this.executionDepth.set(Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NotNull Runnable command) {
            Intrinsics.checkNotNullParameter(command, "command");
            try {
                if (m8392b() <= 15) {
                    command.run();
                } else {
                    BoltsExecutors.INSTANCE.background().execute(command);
                }
                m8391a();
            } catch (Throwable th2) {
                m8391a();
                throw th2;
            }
        }
    }

    public BoltsExecutors() {
        ExecutorService executorServiceNewCachedThreadPool;
        if (!INSTANCE.m8390a()) {
            executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            Intrinsics.checkNotNullExpressionValue(executorServiceNewCachedThreadPool, "newCachedThreadPool()");
        } else {
            executorServiceNewCachedThreadPool = AndroidExecutors.INSTANCE.newCachedThreadPool();
        }
        this.background = executorServiceNewCachedThreadPool;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduledExecutor()");
        this.scheduled = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.immediate = new ImmediateExecutor();
    }
}
