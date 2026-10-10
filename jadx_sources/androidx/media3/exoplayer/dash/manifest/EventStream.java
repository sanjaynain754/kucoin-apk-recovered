package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.emsg.EventMessage;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class EventStream {
    public final EventMessage[] events;
    public final long[] presentationTimesUs;
    public final String schemeIdUri;
    public final long timescale;
    public final String value;

    /* JADX INFO: renamed from: id */
    public String m3273id() {
        return this.schemeIdUri + "/" + this.value;
    }

    public EventStream(String str, String str2, long j11, long[] jArr, EventMessage[] eventMessageArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.timescale = j11;
        this.presentationTimesUs = jArr;
        this.events = eventMessageArr;
    }
}
