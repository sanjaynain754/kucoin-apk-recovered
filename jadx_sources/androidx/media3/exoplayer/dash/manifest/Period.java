package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class Period {
    public final List<AdaptationSet> adaptationSets;

    @Nullable
    public final Descriptor assetIdentifier;
    public final List<EventStream> eventStreams;

    /* JADX INFO: renamed from: id */
    @Nullable
    public final String f3166id;
    public final long startMs;

    public Period(@Nullable String str, long j11, List<AdaptationSet> list) {
        this(str, j11, list, Collections.EMPTY_LIST, null);
    }

    public Period(@Nullable String str, long j11, List<AdaptationSet> list, List<EventStream> list2) {
        this(str, j11, list, list2, null);
    }

    public int getAdaptationSetIndex(int i11) {
        int size = this.adaptationSets.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.adaptationSets.get(i12).type == i11) {
                return i12;
            }
        }
        return -1;
    }

    public Period(@Nullable String str, long j11, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        this.f3166id = str;
        this.startMs = j11;
        this.adaptationSets = Collections.unmodifiableList(list);
        this.eventStreams = Collections.unmodifiableList(list2);
        this.assetIdentifier = descriptor;
    }
}
