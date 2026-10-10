package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public interface Subtitle {
    List<Cue> getCues(long j11);

    long getEventTime(int i11);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j11);
}
