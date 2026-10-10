package com.kubi.monitor.helper;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p806yq.C46557a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FrameMetricsHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/monitor/helper/FrameMetricsHelper;", "", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "", "e", "()V", "Lyq/a;", "c", "()Lyq/a;", "Landroid/util/SparseIntArray;", "frameTimes", "d", "(Landroid/util/SparseIntArray;)Lyq/a;", "Landroidx/core/app/FrameMetricsAggregator;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroidx/core/app/FrameMetricsAggregator;", "frameMetricsAggregator", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "b", "Ljava/lang/ref/WeakReference;", "activityRef", "", "Z", "isStopped", "Companion", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class FrameMetricsHelper {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Lazy<Boolean> f35559e = LazyKt.lazy(new Function0<Boolean>() { // from class: com.kubi.monitor.helper.FrameMetricsHelper$Companion$hasFrameMetricsAggregatorClass$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return true;
        }
    });

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Handler f35560f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final FrameMetricsAggregator frameMetricsAggregator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityRef;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isStopped;

    /* JADX INFO: compiled from: FrameMetricsHelper.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/monitor/helper/FrameMetricsHelper$Companion;", "", "<init>", "()V", "", "isScreenTraceSupported", "()Z", "hasFrameMetricsAggregatorClass$delegate", "Lkotlin/Lazy;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "hasFrameMetricsAggregatorClass", "", "TAG", "Ljava/lang/String;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Monitor_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m42465a() {
            return ((Boolean) FrameMetricsHelper.f35559e.getValue()).booleanValue();
        }

        public final boolean isScreenTraceSupported() {
            return m42465a();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final C46557a m42462c() {
        SparseIntArray sparseIntArray;
        this.isStopped = true;
        FrameMetricsAggregator frameMetricsAggregator = this.frameMetricsAggregator;
        SparseIntArray[] sparseIntArrayArrReset = frameMetricsAggregator == null ? null : frameMetricsAggregator.reset();
        if (sparseIntArrayArrReset == null || (sparseIntArray = sparseIntArrayArrReset[0]) == null) {
            return null;
        }
        return m42463d(sparseIntArray);
    }

    public FrameMetricsHelper(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.frameMetricsAggregator = INSTANCE.isScreenTraceSupported() ? new FrameMetricsAggregator() : null;
        this.activityRef = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: f */
    public static final void m42461f(FrameMetricsHelper this$0, FrameMetricsAggregator aggregator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(aggregator, "$aggregator");
        Activity activity = this$0.activityRef.get();
        if (activity == null || this$0.isStopped || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        aggregator.add(activity);
    }

    /* JADX INFO: renamed from: e */
    public final void m42464e() {
        final FrameMetricsAggregator frameMetricsAggregator = this.frameMetricsAggregator;
        if (frameMetricsAggregator == null) {
            return;
        }
        f35560f.postAtFrontOfQueue(new Runnable() { // from class: com.kubi.monitor.helper.c
            @Override // java.lang.Runnable
            public final void run() {
                FrameMetricsHelper.m42461f(this.f35567b, frameMetricsAggregator);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final C46557a m42463d(SparseIntArray frameTimes) {
        int size = frameTimes.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i11 < size) {
            int i16 = i11 + 1;
            int iKeyAt = frameTimes.keyAt(i11);
            int iValueAt = frameTimes.valueAt(i11);
            i12 += iValueAt;
            if (iKeyAt > 3000) {
                i15 += iValueAt;
            }
            if (iKeyAt > 700) {
                i14 += iValueAt;
            }
            if (iKeyAt > 16) {
                i13 += iValueAt;
            }
            i11 = i16;
        }
        return new C46557a(i12, i13, i14, i15);
    }
}
