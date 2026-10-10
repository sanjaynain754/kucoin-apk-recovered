package p569qq;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p671uq.C45290a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: qq.b */
/* JADX INFO: compiled from: DurationTracker.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"", "eventName", "pointName", "traceId", "", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/String;Ljava/lang/String;)V", "Monitor_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class C43841b {
    /* JADX INFO: renamed from: a */
    public static final void m96554a(@NotNull String eventName, @NotNull String traceId) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        if (eventName.length() != 0) {
            C45290a.f101823a.m100102c(eventName, traceId);
            return;
        }
        C44128b.m97270n("Monitor", "endTrackPoint eventName(" + eventName + ") is null");
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m96555b(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        m96554a(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m96556c(@NotNull String eventName, @NotNull String pointName, @NotNull String traceId) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(pointName, "pointName");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        if (eventName.length() != 0 && pointName.length() != 0) {
            C45290a.f101823a.m100101b(eventName, pointName, traceId, null);
            return;
        }
        C44128b.m97270n("Monitor", "eventName(" + eventName + ") or pointName(" + pointName + ") is null");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m96557d(String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "";
        }
        m96556c(str, str2, str3);
    }
}
