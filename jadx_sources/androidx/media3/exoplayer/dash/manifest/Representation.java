package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final ImmutableList<BaseUrl> baseUrls;
    public final List<Descriptor> essentialProperties;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;

    @Nullable
    private final RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;
    public final List<Descriptor> supplementalProperties;

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {

        @VisibleForTesting
        final SegmentBase.MultiSegmentBase segmentBase;

        public MultiSegmentRepresentation(long j11, Format format, List<BaseUrl> list, SegmentBase.MultiSegmentBase multiSegmentBase, @Nullable List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
            super(j11, format, list, multiSegmentBase, list2, list3, list4);
            this.segmentBase = multiSegmentBase;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public String getCacheKey() {
            return null;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public RangedUri getIndexUri() {
            return null;
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getAvailableSegmentCount(long j11, long j12) {
            return this.segmentBase.getAvailableSegmentCount(j11, j12);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getDurationUs(long j11, long j12) {
            return this.segmentBase.getSegmentDurationUs(j11, j12);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getFirstAvailableSegmentNum(long j11, long j12) {
            return this.segmentBase.getFirstAvailableSegmentNum(j11, j12);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
            return this.segmentBase.getFirstSegmentNum();
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getNextSegmentAvailableTimeUs(long j11, long j12) {
            return this.segmentBase.getNextSegmentAvailableTimeUs(j11, j12);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getSegmentCount(long j11) {
            return this.segmentBase.getSegmentCount(j11);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getSegmentNum(long j11, long j12) {
            return this.segmentBase.getSegmentNum(j11, j12);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public RangedUri getSegmentUrl(long j11) {
            return this.segmentBase.getSegmentUrl(this, j11);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public long getTimeUs(long j11) {
            return this.segmentBase.getSegmentTimeUs(j11);
        }

        @Override // androidx.media3.exoplayer.dash.DashSegmentIndex
        public boolean isExplicit() {
            return this.segmentBase.isExplicit();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        public DashSegmentIndex getIndex() {
            return this;
        }
    }

    public static class SingleSegmentRepresentation extends Representation {

        @Nullable
        private final String cacheKey;
        public final long contentLength;

        @Nullable
        private final RangedUri indexUri;

        @Nullable
        private final SingleSegmentIndex segmentIndex;
        public final Uri uri;

        public SingleSegmentRepresentation(long j11, Format format, List<BaseUrl> list, SegmentBase.SingleSegmentBase singleSegmentBase, @Nullable List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, @Nullable String str, long j12) {
            super(j11, format, list, singleSegmentBase, list2, list3, list4);
            this.uri = Uri.parse(list.get(0).url);
            RangedUri index = singleSegmentBase.getIndex();
            this.indexUri = index;
            this.cacheKey = str;
            this.contentLength = j12;
            this.segmentIndex = index != null ? null : new SingleSegmentIndex(new RangedUri(null, 0L, j12));
        }

        public static SingleSegmentRepresentation newInstance(long j11, Format format, String str, long j12, long j13, long j14, long j15, List<Descriptor> list, @Nullable String str2, long j16) {
            return new SingleSegmentRepresentation(j11, format, ImmutableList.m13440of(new BaseUrl(str)), new SegmentBase.SingleSegmentBase(new RangedUri(null, j12, (j13 - j12) + 1), 1L, 0L, j14, (j15 - j14) + 1), list, ImmutableList.m13439of(), ImmutableList.m13439of(), str2, j16);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public String getCacheKey() {
            return this.cacheKey;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public DashSegmentIndex getIndex() {
            return this.segmentIndex;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.Representation
        @Nullable
        public RangedUri getIndexUri() {
            return this.indexUri;
        }
    }

    public static Representation newInstance(long j11, Format format, List<BaseUrl> list, SegmentBase segmentBase) {
        return newInstance(j11, format, list, segmentBase, null, ImmutableList.m13439of(), ImmutableList.m13439of(), null);
    }

    @Nullable
    public abstract String getCacheKey();

    @Nullable
    public abstract DashSegmentIndex getIndex();

    @Nullable
    public abstract RangedUri getIndexUri();

    private Representation(long j11, Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        Assertions.checkArgument(!list.isEmpty());
        this.revisionId = j11;
        this.format = format;
        this.baseUrls = ImmutableList.copyOf((Collection) list);
        this.inbandEventStreams = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.essentialProperties = list3;
        this.supplementalProperties = list4;
        this.initializationUri = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    @Nullable
    public RangedUri getInitializationUri() {
        return this.initializationUri;
    }

    public static Representation newInstance(long j11, Format format, List<BaseUrl> list, SegmentBase segmentBase, @Nullable List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, @Nullable String str) {
        if (segmentBase instanceof SegmentBase.SingleSegmentBase) {
            return new SingleSegmentRepresentation(j11, format, list, (SegmentBase.SingleSegmentBase) segmentBase, list2, list3, list4, str, -1L);
        }
        if (segmentBase instanceof SegmentBase.MultiSegmentBase) {
            return new MultiSegmentRepresentation(j11, format, list, (SegmentBase.MultiSegmentBase) segmentBase, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
