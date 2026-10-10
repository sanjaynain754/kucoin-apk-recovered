package com.jumio.core.performance;

import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/core/performance/FrameRateCallback;", "", "onFramesSampled", "", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface FrameRateCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f14461a;
    public static final long DEFAULT_SAMPLE_TIME_IN_NS = 1000000000;

    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/performance/FrameRateCallback$Companion;", "", "<init>", "()V", "DEFAULT_SAMPLE_TIME_IN_NS", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public static final long DEFAULT_SAMPLE_TIME_IN_NS = 1000000000;

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f14461a = new Companion();
    }

    void onFramesSampled(int frames);
}
