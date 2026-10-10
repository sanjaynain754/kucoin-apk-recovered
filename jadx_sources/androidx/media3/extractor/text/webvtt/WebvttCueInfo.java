package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class WebvttCueInfo {
    public final Cue cue;
    public final long endTimeUs;
    public final long startTimeUs;

    public WebvttCueInfo(Cue cue, long j11, long j12) {
        this.cue = cue;
        this.startTimeUs = j11;
        this.endTimeUs = j12;
    }
}
