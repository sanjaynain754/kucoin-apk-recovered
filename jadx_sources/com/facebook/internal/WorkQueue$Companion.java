package com.facebook.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.FacebookException;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"com/facebook/internal/WorkQueue$Companion", "", "<init>", "()V", "", "condition", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Z)V", "", "DEFAULT_MAX_CONCURRENT", "I", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class WorkQueue$Companion {
    public /* synthetic */ WorkQueue$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public WorkQueue$Companion() {
    }

    /* JADX INFO: renamed from: a */
    public final void m10023a(boolean condition) {
        if (!condition) {
            throw new FacebookException("Validation failed");
        }
    }
}
