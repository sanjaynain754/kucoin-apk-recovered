package androidx.media3.extractor.text.ttml;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes34.dex */
final class TtmlSubtitle implements Subtitle {
    private final long[] eventTimesUs;
    private final Map<String, TtmlStyle> globalStyles;
    private final Map<String, String> imageMap;
    private final Map<String, TtmlRegion> regionMap;
    private final TtmlNode root;

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j11) {
        return this.root.getCues(j11, this.globalStyles, this.regionMap, this.imageMap);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i11) {
        return this.eventTimesUs[i11];
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.eventTimesUs.length;
    }

    @VisibleForTesting
    public Map<String, TtmlStyle> getGlobalStyles() {
        return this.globalStyles;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j11) {
        int iBinarySearchCeil = Util.binarySearchCeil(this.eventTimesUs, j11, false, false);
        if (iBinarySearchCeil < this.eventTimesUs.length) {
            return iBinarySearchCeil;
        }
        return -1;
    }

    @VisibleForTesting
    public TtmlNode getRoot() {
        return this.root;
    }

    public TtmlSubtitle(TtmlNode ttmlNode, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2, Map<String, String> map3) {
        Map<String, TtmlStyle> mapUnmodifiableMap;
        this.root = ttmlNode;
        this.regionMap = map2;
        this.imageMap = map3;
        if (map != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        } else {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        }
        this.globalStyles = mapUnmodifiableMap;
        this.eventTimesUs = ttmlNode.getEventTimesUs();
    }
}
