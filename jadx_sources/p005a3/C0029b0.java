package p005a3;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.FlushResult;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: a3.b0 */
/* JADX INFO: compiled from: FlushStatistics.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m90084d2 = {"La3/b0;", "", "<init>", "()V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "()I", "c", "(I)V", "numEvents", "Lcom/facebook/appevents/FlushResult;", "b", "Lcom/facebook/appevents/FlushResult;", "()Lcom/facebook/appevents/FlushResult;", "d", "(Lcom/facebook/appevents/FlushResult;)V", DbParams.KEY_CHANNEL_RESULT, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C0029b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int numEvents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public FlushResult result = FlushResult.SUCCESS;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNumEvents() {
        return this.numEvents;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FlushResult getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: c */
    public final void m76c(int i11) {
        this.numEvents = i11;
    }

    /* JADX INFO: renamed from: d */
    public final void m77d(@NotNull FlushResult flushResult) {
        Intrinsics.checkNotNullParameter(flushResult, "<set-?>");
        this.result = flushResult;
    }
}
