package com.kubi.monitor.firebase;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.ktx.PerformanceKt;
import com.google.firebase.perf.metrics.Trace;
import com.kubi.monitor.FinishType;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43851l;
import p642tq.InterfaceC45062e;
import p642tq.InterfaceC45063f;
import p699vq.C45621b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.monitor.firebase.c */
/* JADX INFO: compiled from: FirebasePerformanceWrapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\r\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/monitor/firebase/c;", "Ltq/f;", "<init>", "()V", "", "name", "operation", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "category", "Ltq/e;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltq/e;", "Lqq/l$a;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;)Lqq/l$a;", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19221c implements InterfaceC45063f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19221c f35549a = new C19221c();

    /* JADX INFO: renamed from: com.kubi.monitor.firebase.c$a */
    /* JADX INFO: compiled from: FirebasePerformanceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/monitor/firebase/c$a;", "Ltq/e;", "", "name", "operation", TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/kubi/monitor/FinishType;", "type", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lcom/kubi/monitor/FinishType;)V", "Ljava/lang/String;", "getOperation", "()Ljava/lang/String;", "b", "getDescription", "c", "getCategory", "Lcom/google/firebase/perf/metrics/Trace;", "d", "Lcom/google/firebase/perf/metrics/Trace;", "trace", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a implements InterfaceC45062e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String operation;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final String description;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final String category;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final Trace trace;

        public a(@NotNull String name, @NotNull String operation, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
            this.description = str;
            this.category = str2;
            FirebasePerformance performance = PerformanceKt.getPerformance(Firebase.INSTANCE);
            Trace traceNewTrace = performance == null ? null : performance.newTrace(name);
            this.trace = traceNewTrace;
            if (traceNewTrace == null) {
                return;
            }
            traceNewTrace.start();
        }

        @Override // p642tq.InterfaceC45062e
        /* JADX INFO: renamed from: a */
        public void mo32881a(@NotNull FinishType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            Trace trace = this.trace;
            if (trace == null) {
                return;
            }
            trace.stop();
        }
    }

    /* JADX INFO: renamed from: com.kubi.monitor.firebase.c$b */
    /* JADX INFO: compiled from: FirebasePerformanceWrapper.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/monitor/firebase/c$b;", "Lqq/l$a;", "", "name", "<init>", "(Ljava/lang/String;)V", "", "start", "()V", InterfaceC33730j9.f70350a, "key", "value", "putAttribute", "(Ljava/lang/String;Ljava/lang/String;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;J)V", "Lcom/google/firebase/perf/metrics/Trace;", "Lcom/google/firebase/perf/metrics/Trace;", "trace", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class b implements C43851l.a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final Trace trace;

        public b(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            FirebasePerformance performance = PerformanceKt.getPerformance(Firebase.INSTANCE);
            this.trace = performance == null ? null : performance.newTrace(name);
        }

        @Override // p569qq.C43851l.a
        /* JADX INFO: renamed from: a */
        public void mo32882a(@NotNull String name, long value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Trace trace = this.trace;
            if (trace == null) {
                return;
            }
            trace.putMetric(name, value);
        }

        @Override // p569qq.C43851l.a
        public void putAttribute(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            Trace trace = this.trace;
            if (trace == null) {
                return;
            }
            trace.putAttribute(key, value);
        }

        @Override // p569qq.C43851l.a
        public void start() {
            Trace trace = this.trace;
            if (trace == null) {
                return;
            }
            trace.start();
        }

        @Override // p569qq.C43851l.a
        public void stop() {
            Trace trace = this.trace;
            if (trace == null) {
                return;
            }
            trace.stop();
        }
    }

    @Override // p642tq.InterfaceC45063f
    @NotNull
    /* JADX INFO: renamed from: a */
    public C43851l.a mo32879a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new b(name);
    }

    @Override // p642tq.InterfaceC45063f
    @NotNull
    /* JADX INFO: renamed from: b */
    public InterfaceC45062e mo32880b(@NotNull String name, @NotNull String operation, @Nullable String description, @Nullable String category) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return Intrinsics.areEqual(category, "primary_page") ? new a(name, operation, description, category) : C45621b.f102749a;
    }
}
