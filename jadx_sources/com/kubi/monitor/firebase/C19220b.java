package com.kubi.monitor.firebase;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.util.Constants;
import com.kubi.monitor.helper.FrameMetricsHelper;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43848i;
import p569qq.InterfaceC43845f;
import p569qq.InterfaceC43850k;
import p642tq.InterfaceC45060c;
import p642tq.InterfaceC45061d;
import p806yq.C46557a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.monitor.firebase.b */
/* JADX INFO: compiled from: FirebasePageFrameTrackFactory.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/monitor/firebase/b;", "Ltq/c;", "<init>", "()V", "Lqq/f;", "page", "Ltq/d;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lqq/f;)Ltq/d;", "", "b", "Ljava/lang/String;", "FRAMES_TOTAL", "c", "FRAMES_SLOW", "d", "FRAMES_FROZEN", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C19220b implements InterfaceC45060c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C19220b f35543a = new C19220b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String FRAMES_TOTAL;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final String FRAMES_SLOW;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final String FRAMES_FROZEN;

    /* JADX INFO: renamed from: com.kubi.monitor.firebase.b$a */
    /* JADX INFO: compiled from: FirebasePageFrameTrackFactory.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/monitor/firebase/b$a;", "Ltq/d;", "", "pageName", "<init>", "(Ljava/lang/String;)V", "Lqq/f;", "page", "Lyq/a;", "framesInfo", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lqq/f;Lyq/a;)V", "Ljava/lang/String;", "Lcom/google/firebase/perf/metrics/Trace;", "b", "Lcom/google/firebase/perf/metrics/Trace;", "screenTrace", "Monitor-firebase_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class a implements InterfaceC45061d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String pageName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Trace screenTrace;

        public a(@NotNull String pageName) {
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            this.pageName = pageName;
            Trace traceCreate = Trace.create(Intrinsics.stringPlus(Constants.SCREEN_TRACE_PREFIX, pageName));
            traceCreate.start();
            Intrinsics.checkNotNullExpressionValue(traceCreate, "create(\"_st_$pageName\").apply { start() }");
            this.screenTrace = traceCreate;
        }

        @Override // p642tq.InterfaceC45061d
        /* JADX INFO: renamed from: a */
        public void mo42448a(@NotNull InterfaceC43845f page, @Nullable C46557a framesInfo) {
            Intrinsics.checkNotNullParameter(page, "page");
            if (framesInfo == null) {
                return;
            }
            if (framesInfo.getTotal() > 0) {
                this.screenTrace.putMetric(C19220b.FRAMES_TOTAL, framesInfo.getTotal());
            }
            if (framesInfo.getSlow() > 0) {
                this.screenTrace.putMetric(C19220b.FRAMES_SLOW, framesInfo.getSlow());
            }
            if (framesInfo.getFrozen() > 0) {
                this.screenTrace.putMetric(C19220b.FRAMES_FROZEN, framesInfo.getFrozen());
            }
            this.screenTrace.stop();
        }
    }

    static {
        String string = Constants.CounterNames.FRAMES_TOTAL.toString();
        Intrinsics.checkNotNullExpressionValue(string, "FRAMES_TOTAL.toString()");
        FRAMES_TOTAL = string;
        String string2 = Constants.CounterNames.FRAMES_SLOW.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "FRAMES_SLOW.toString()");
        FRAMES_SLOW = string2;
        String string3 = Constants.CounterNames.FRAMES_FROZEN.toString();
        Intrinsics.checkNotNullExpressionValue(string3, "FRAMES_FROZEN.toString()");
        FRAMES_FROZEN = string3;
    }

    @Override // p642tq.InterfaceC45060c
    @Nullable
    /* JADX INFO: renamed from: a */
    public InterfaceC45061d mo42447a(@NotNull InterfaceC43845f page) {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(page, "page");
        if (!C43848i.m96579f() || !FrameMetricsHelper.INSTANCE.isScreenTraceSupported()) {
            return null;
        }
        String pageId = page.getPageId();
        if (pageId == null) {
            Annotation[] annotations = page.getClass().getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "this.javaClass.annotations");
            int length = annotations.length;
            int i11 = 0;
            do {
                if (i11 >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i11];
                i11++;
            } while (!(annotation instanceof InterfaceC43850k));
            InterfaceC43850k interfaceC43850k = annotation instanceof InterfaceC43850k ? (InterfaceC43850k) annotation : null;
            pageId = interfaceC43850k == null ? null : interfaceC43850k.pageId();
            if (pageId == null) {
                return null;
            }
        }
        if (pageId.length() == 0) {
            return null;
        }
        return new a(pageId);
    }
}
