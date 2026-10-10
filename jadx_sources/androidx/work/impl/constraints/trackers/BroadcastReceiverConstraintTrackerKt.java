package androidx.work.impl.constraints.trackers;

import androidx.work.Logger;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0002"}, m90084d2 = {"TAG", "", "work-runtime_release"}, m90085k = 2, m90086mv = {1, 7, 1}, m90088xi = 48)
public final class BroadcastReceiverConstraintTrackerKt {

    @NotNull
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("BrdcstRcvrCnstrntTrckr");
        Intrinsics.checkNotNullExpressionValue(strTagWithPrefix, "tagWithPrefix(\"BrdcstRcvrCnstrntTrckr\")");
        TAG = strTagWithPrefix;
    }
}
