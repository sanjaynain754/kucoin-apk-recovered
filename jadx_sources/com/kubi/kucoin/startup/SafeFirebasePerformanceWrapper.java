package com.kubi.kucoin.startup;

import com.google.firebase.messaging.Constants;
import com.kubi.monitor.FinishType;
import com.kubi.monitor.firebase.C19221c;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43851l;
import p642tq.InterfaceC45062e;
import p642tq.InterfaceC45063f;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.kucoin.startup.z, reason: from Kotlin metadata */
/* JADX INFO: compiled from: SafeFirebasePerformanceWrapper.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0017\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0082\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper;", "Lcom/kubi/monitor/core/IPerformance;", "<init>", "()V", "startTransaction", "Lcom/kubi/monitor/core/IPerformSpan;", "name", "", "operation", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "category", "startTrace", "Lcom/kubi/monitor/TechnologyPerformance$IPrefWatcher;", "runSafely", "", "block", "Lkotlin/Function0;", "SafePerformSpan", "SafePrefWatcher", "NoOpPerformSpan", "NoOpPrefWatcher", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SafeFirebasePerformanceWrapper implements InterfaceC45063f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SafeFirebasePerformanceWrapper f28417a = new SafeFirebasePerformanceWrapper();

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.z$a */
    /* JADX INFO: compiled from: SafeFirebasePerformanceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$NoOpPerformSpan;", "Lcom/kubi/monitor/core/IPerformSpan;", "<init>", "()V", "finish", "", "type", "Lcom/kubi/monitor/FinishType;", "startChild", "operation", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a implements InterfaceC45062e {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f28418a = new a();

        @Override // p642tq.InterfaceC45062e
        /* JADX INFO: renamed from: a */
        public void mo32881a(@NotNull FinishType type) {
            Intrinsics.checkNotNullParameter(type, "type");
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.z$b */
    /* JADX INFO: compiled from: SafeFirebasePerformanceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rH\u0016¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$NoOpPrefWatcher;", "Lcom/kubi/monitor/TechnologyPerformance$IPrefWatcher;", "<init>", "()V", "start", "", InterfaceC33730j9.f70350a, "putAttribute", "key", "", "value", "putMetric", "name", "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b implements C43851l.a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f28419a = new b();

        @Override // p569qq.C43851l.a
        /* JADX INFO: renamed from: a */
        public void mo32882a(@NotNull String name, long j11) {
            Intrinsics.checkNotNullParameter(name, "name");
        }

        @Override // p569qq.C43851l.a
        public void putAttribute(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
        }

        @Override // p569qq.C43851l.a
        public void start() {
        }

        @Override // p569qq.C43851l.a
        public void stop() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.z$c */
    /* JADX INFO: compiled from: SafeFirebasePerformanceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$SafePerformSpan;", "Lcom/kubi/monitor/core/IPerformSpan;", "delegate", "<init>", "(Lcom/kubi/monitor/core/IPerformSpan;)V", "finish", "", "type", "Lcom/kubi/monitor/FinishType;", "startChild", "operation", "", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "setError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeFirebasePerformanceWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeFirebasePerformanceWrapper.kt\ncom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$SafePerformSpan\n+ 2 SafeFirebasePerformanceWrapper.kt\ncom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper\n*L\n1#1,106:1\n99#2,6:107\n99#2,6:113\n*S KotlinDebug\n*F\n+ 1 SafeFirebasePerformanceWrapper.kt\ncom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$SafePerformSpan\n*L\n49#1:107,6\n61#1:113,6\n*E\n"})
    public static final class c implements InterfaceC45062e {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final InterfaceC45062e f28420a;

        public c(@NotNull InterfaceC45062e delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f28420a = delegate;
        }

        @Override // p642tq.InterfaceC45062e
        /* JADX INFO: renamed from: a */
        public void mo32881a(@NotNull FinishType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            SafeFirebasePerformanceWrapper safeFirebasePerformanceWrapper = SafeFirebasePerformanceWrapper.f28417a;
            try {
                this.f28420a.mo32881a(type);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.z$d */
    /* JADX INFO: compiled from: SafeFirebasePerformanceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$SafePrefWatcher;", "Lcom/kubi/monitor/TechnologyPerformance$IPrefWatcher;", "delegate", "<init>", "(Lcom/kubi/monitor/TechnologyPerformance$IPrefWatcher;)V", "start", "", InterfaceC33730j9.f70350a, "putAttribute", "key", "", "value", "putMetric", "name", "", "LAppStartup_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSafeFirebasePerformanceWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeFirebasePerformanceWrapper.kt\ncom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$SafePrefWatcher\n+ 2 SafeFirebasePerformanceWrapper.kt\ncom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper\n*L\n1#1,106:1\n99#2,6:107\n99#2,6:113\n99#2,6:119\n99#2,6:125\n*S KotlinDebug\n*F\n+ 1 SafeFirebasePerformanceWrapper.kt\ncom/kubi/kucoin/startup/SafeFirebasePerformanceWrapper$SafePrefWatcher\n*L\n69#1:107,6\n73#1:113,6\n77#1:119,6\n81#1:125,6\n*E\n"})
    public static final class d implements C43851l.a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final C43851l.a f28421a;

        public d(@NotNull C43851l.a delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f28421a = delegate;
        }

        @Override // p569qq.C43851l.a
        /* JADX INFO: renamed from: a */
        public void mo32882a(@NotNull String name, long j11) {
            Intrinsics.checkNotNullParameter(name, "name");
            SafeFirebasePerformanceWrapper safeFirebasePerformanceWrapper = SafeFirebasePerformanceWrapper.f28417a;
            try {
                this.f28421a.mo32882a(name, j11);
            } catch (Throwable unused) {
            }
        }

        @Override // p569qq.C43851l.a
        public void putAttribute(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            SafeFirebasePerformanceWrapper safeFirebasePerformanceWrapper = SafeFirebasePerformanceWrapper.f28417a;
            try {
                this.f28421a.putAttribute(key, value);
            } catch (Throwable unused) {
            }
        }

        @Override // p569qq.C43851l.a
        public void start() {
            SafeFirebasePerformanceWrapper safeFirebasePerformanceWrapper = SafeFirebasePerformanceWrapper.f28417a;
            try {
                this.f28421a.start();
            } catch (Throwable unused) {
            }
        }

        @Override // p569qq.C43851l.a
        public void stop() {
            SafeFirebasePerformanceWrapper safeFirebasePerformanceWrapper = SafeFirebasePerformanceWrapper.f28417a;
            try {
                this.f28421a.stop();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // p642tq.InterfaceC45063f
    @NotNull
    /* JADX INFO: renamed from: a */
    public C43851l.a mo32879a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            return new d(C19221c.f35549a.mo32879a(name));
        } catch (Throwable unused) {
            return b.f28419a;
        }
    }

    @Override // p642tq.InterfaceC45063f
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC45062e mo32880b(@NotNull String name, @NotNull String operation, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        try {
            return new c(C19221c.f35549a.mo32880b(name, operation, str, str2));
        } catch (Throwable unused) {
            return a.f28418a;
        }
    }
}
