package androidx.media3.exoplayer.smoothstreaming.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.offline.FilterableManifest;
import androidx.media3.extractor.mp4.TrackEncryptionBox;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class SsManifest implements FilterableManifest<SsManifest> {
    public static final int UNSET_LOOKAHEAD = -1;
    public final long durationUs;
    public final long dvrWindowLengthUs;
    public final boolean isLive;
    public final int lookAheadCount;
    public final int majorVersion;
    public final int minorVersion;

    @Nullable
    public final ProtectionElement protectionElement;
    public final StreamElement[] streamElements;

    public static class StreamElement {
        private static final String URL_PLACEHOLDER_BITRATE_1 = "{bitrate}";
        private static final String URL_PLACEHOLDER_BITRATE_2 = "{Bitrate}";
        private static final String URL_PLACEHOLDER_START_TIME_1 = "{start time}";
        private static final String URL_PLACEHOLDER_START_TIME_2 = "{start_time}";
        private final String baseUri;
        public final int chunkCount;
        private final List<Long> chunkStartTimes;
        private final long[] chunkStartTimesUs;
        private final String chunkTemplate;
        public final int displayHeight;
        public final int displayWidth;
        public final Format[] formats;

        @Nullable
        public final String language;
        private final long lastChunkDurationUs;
        public final int maxHeight;
        public final int maxWidth;
        public final String name;
        public final String subType;
        public final long timescale;
        public final int type;

        public StreamElement(String str, String str2, int i11, String str3, long j11, String str4, int i12, int i13, int i14, int i15, @Nullable String str5, Format[] formatArr, List<Long> list, long j12) {
            this(str, str2, i11, str3, j11, str4, i12, i13, i14, i15, str5, formatArr, list, Util.scaleLargeTimestamps(list, 1000000L, j11), Util.scaleLargeTimestamp(j12, 1000000L, j11));
        }

        public Uri buildRequestUri(int i11, int i12) {
            Assertions.checkState(this.formats != null);
            Assertions.checkState(this.chunkStartTimes != null);
            Assertions.checkState(i12 < this.chunkStartTimes.size());
            String string = Integer.toString(this.formats[i11].bitrate);
            String string2 = this.chunkStartTimes.get(i12).toString();
            return UriUtil.resolveToUri(this.baseUri, this.chunkTemplate.replace(URL_PLACEHOLDER_BITRATE_1, string).replace(URL_PLACEHOLDER_BITRATE_2, string).replace(URL_PLACEHOLDER_START_TIME_1, string2).replace(URL_PLACEHOLDER_START_TIME_2, string2));
        }

        public StreamElement copy(Format[] formatArr) {
            return new StreamElement(this.baseUri, this.chunkTemplate, this.type, this.subType, this.timescale, this.name, this.maxWidth, this.maxHeight, this.displayWidth, this.displayHeight, this.language, formatArr, this.chunkStartTimes, this.chunkStartTimesUs, this.lastChunkDurationUs);
        }

        public long getChunkDurationUs(int i11) {
            if (i11 == this.chunkCount - 1) {
                return this.lastChunkDurationUs;
            }
            long[] jArr = this.chunkStartTimesUs;
            return jArr[i11 + 1] - jArr[i11];
        }

        public int getChunkIndex(long j11) {
            return Util.binarySearchFloor(this.chunkStartTimesUs, j11, true, true);
        }

        public long getStartTimeUs(int i11) {
            return this.chunkStartTimesUs[i11];
        }

        private StreamElement(String str, String str2, int i11, String str3, long j11, String str4, int i12, int i13, int i14, int i15, @Nullable String str5, Format[] formatArr, List<Long> list, long[] jArr, long j12) {
            this.baseUri = str;
            this.chunkTemplate = str2;
            this.type = i11;
            this.subType = str3;
            this.timescale = j11;
            this.name = str4;
            this.maxWidth = i12;
            this.maxHeight = i13;
            this.displayWidth = i14;
            this.displayHeight = i15;
            this.language = str5;
            this.formats = formatArr;
            this.chunkStartTimes = list;
            this.chunkStartTimesUs = jArr;
            this.lastChunkDurationUs = j12;
            this.chunkCount = list.size();
        }
    }

    public SsManifest(int i11, int i12, long j11, long j12, long j13, int i13, boolean z11, @Nullable ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        this(i11, i12, j12 == 0 ? -9223372036854775807L : Util.scaleLargeTimestamp(j12, 1000000L, j11), j13 != 0 ? Util.scaleLargeTimestamp(j13, 1000000L, j11) : C2711C.TIME_UNSET, i13, z11, protectionElement, streamElementArr);
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public /* bridge */ /* synthetic */ SsManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }

    public static class ProtectionElement {
        public final byte[] data;
        public final TrackEncryptionBox[] trackEncryptionBoxes;
        public final UUID uuid;

        public ProtectionElement(UUID uuid, byte[] bArr, TrackEncryptionBox[] trackEncryptionBoxArr) {
            this.uuid = uuid;
            this.data = bArr;
            this.trackEncryptionBoxes = trackEncryptionBoxArr;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public final SsManifest copy(List<StreamKey> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StreamElement streamElement = null;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i11);
            StreamElement streamElement2 = this.streamElements[streamKey.groupIndex];
            if (streamElement2 != streamElement && streamElement != null) {
                arrayList2.add(streamElement.copy((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(streamElement2.formats[streamKey.streamIndex]);
            i11++;
            streamElement = streamElement2;
        }
        if (streamElement != null) {
            arrayList2.add(streamElement.copy((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new SsManifest(this.majorVersion, this.minorVersion, this.durationUs, this.dvrWindowLengthUs, this.lookAheadCount, this.isLive, this.protectionElement, (StreamElement[]) arrayList2.toArray(new StreamElement[0]));
    }

    private SsManifest(int i11, int i12, long j11, long j12, int i13, boolean z11, @Nullable ProtectionElement protectionElement, StreamElement[] streamElementArr) {
        this.majorVersion = i11;
        this.minorVersion = i12;
        this.durationUs = j11;
        this.dvrWindowLengthUs = j12;
        this.lookAheadCount = i13;
        this.isLive = z11;
        this.protectionElement = protectionElement;
        this.streamElements = streamElementArr;
    }
}
