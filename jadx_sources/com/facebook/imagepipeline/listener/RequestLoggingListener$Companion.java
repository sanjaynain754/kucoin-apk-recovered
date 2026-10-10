package com.facebook.imagepipeline.listener;

import android.os.SystemClock;
import androidx.media3.exoplayer.upstream.CmcdData;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: RequestLoggingListener.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"com/facebook/imagepipeline/listener/RequestLoggingListener$Companion", "", "<init>", "()V", "", "startTime", "endTime", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Ljava/lang/Long;J)J", "b", "()J", "time", "", "TAG", "Ljava/lang/String;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RequestLoggingListener$Companion {
    public /* synthetic */ RequestLoggingListener$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public RequestLoggingListener$Companion() {
    }

    /* JADX INFO: renamed from: a */
    public final long m9464a(Long startTime, long endTime) {
        if (startTime != null) {
            return endTime - startTime.longValue();
        }
        return -1L;
    }

    /* JADX INFO: renamed from: b */
    public final long m9465b() {
        return SystemClock.uptimeMillis();
    }
}
