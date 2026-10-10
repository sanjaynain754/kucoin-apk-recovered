package com.jumio.core.performance;

import android.content.Context;
import androidx.core.content.ContextCompat;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005¨\u0006\u0014"}, m90084d2 = {"Lcom/jumio/core/performance/FrameRateUtils;", "", "<init>", "()V", "getFrameRate", "", "context", "Landroid/content/Context;", "getFrameRateFromSample", "frameTimingsInNs", "", "", "samplingTimeInNs", "checkThresholdForFrameRate", "", "idealFrameRate", "actualFrameRate", "thresholdPercentage", "", "thresholdFrameRate", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FrameRateUtils {

    @NotNull
    public static final FrameRateUtils INSTANCE = new FrameRateUtils();

    public final boolean checkThresholdForFrameRate(int actualFrameRate, int thresholdFrameRate) {
        return actualFrameRate > thresholdFrameRate;
    }

    public final boolean checkThresholdForFrameRate(int idealFrameRate, int actualFrameRate, float thresholdPercentage) {
        return checkThresholdForFrameRate(actualFrameRate, (int) (idealFrameRate * thresholdPercentage));
    }

    public final int getFrameRate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ContextCompat.getDisplayOrDefault(context).getRefreshRate();
    }

    public final int getFrameRateFromSample(@NotNull List<Long> frameTimingsInNs, long samplingTimeInNs) {
        Intrinsics.checkNotNullParameter(frameTimingsInNs, "frameTimingsInNs");
        return (int) (((long) frameTimingsInNs.size()) / TimeUnit.SECONDS.convert(samplingTimeInNs, TimeUnit.NANOSECONDS));
    }
}
