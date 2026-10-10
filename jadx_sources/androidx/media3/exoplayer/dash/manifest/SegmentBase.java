package androidx.media3.exoplayer.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public abstract class SegmentBase {

    @Nullable
    final RangedUri initialization;
    final long presentationTimeOffset;
    final long timescale;

    public static abstract class MultiSegmentBase extends SegmentBase {

        @VisibleForTesting
        final long availabilityTimeOffsetUs;
        final long duration;
        private final long periodStartUnixTimeUs;

        @Nullable
        final List<SegmentTimelineElement> segmentTimeline;
        final long startNumber;
        private final long timeShiftBufferDepthUs;

        public abstract long getSegmentCount(long j11);

        public abstract RangedUri getSegmentUrl(Representation representation, long j11);

        public long getFirstSegmentNum() {
            return this.startNumber;
        }

        public long getNextSegmentAvailableTimeUs(long j11, long j12) {
            if (this.segmentTimeline != null) {
                return C2711C.TIME_UNSET;
            }
            long firstAvailableSegmentNum = getFirstAvailableSegmentNum(j11, j12) + getAvailableSegmentCount(j11, j12);
            return (getSegmentTimeUs(firstAvailableSegmentNum) + getSegmentDurationUs(firstAvailableSegmentNum, j11)) - this.availabilityTimeOffsetUs;
        }

        public final long getSegmentDurationUs(long j11, long j12) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return (list.get((int) (j11 - this.startNumber)).duration * 1000000) / this.timescale;
            }
            long segmentCount = getSegmentCount(j12);
            return (segmentCount == -1 || j11 != (getFirstSegmentNum() + segmentCount) - 1) ? (this.duration * 1000000) / this.timescale : j12 - getSegmentTimeUs(j11);
        }

        public final long getSegmentTimeUs(long j11) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (j11 - this.startNumber)).startTime - this.presentationTimeOffset : (j11 - this.startNumber) * this.duration, 1000000L, this.timescale);
        }

        public boolean isExplicit() {
            return this.segmentTimeline != null;
        }

        public MultiSegmentBase(@Nullable RangedUri rangedUri, long j11, long j12, long j13, long j14, @Nullable List<SegmentTimelineElement> list, long j15, long j16, long j17) {
            super(rangedUri, j11, j12);
            this.startNumber = j13;
            this.duration = j14;
            this.segmentTimeline = list;
            this.availabilityTimeOffsetUs = j15;
            this.timeShiftBufferDepthUs = j16;
            this.periodStartUnixTimeUs = j17;
        }

        public long getAvailableSegmentCount(long j11, long j12) {
            long segmentCount = getSegmentCount(j11);
            if (segmentCount != -1) {
                return segmentCount;
            }
            return (int) (getSegmentNum((j12 - this.periodStartUnixTimeUs) + this.availabilityTimeOffsetUs, j11) - getFirstAvailableSegmentNum(j11, j12));
        }

        public long getFirstAvailableSegmentNum(long j11, long j12) {
            if (getSegmentCount(j11) == -1) {
                long j13 = this.timeShiftBufferDepthUs;
                if (j13 != C2711C.TIME_UNSET) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((j12 - this.periodStartUnixTimeUs) - j13, j11));
                }
            }
            return getFirstSegmentNum();
        }

        public long getSegmentNum(long j11, long j12) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(j12);
            if (segmentCount != 0) {
                if (this.segmentTimeline == null) {
                    long j13 = this.startNumber + (j11 / ((this.duration * 1000000) / this.timescale));
                    if (j13 >= firstSegmentNum) {
                        if (segmentCount == -1) {
                            return j13;
                        }
                        return Math.min(j13, (firstSegmentNum + segmentCount) - 1);
                    }
                } else {
                    long j14 = (segmentCount + firstSegmentNum) - 1;
                    long j15 = firstSegmentNum;
                    while (j15 <= j14) {
                        long j16 = ((j14 - j15) / 2) + j15;
                        long segmentTimeUs = getSegmentTimeUs(j16);
                        if (segmentTimeUs < j11) {
                            j15 = j16 + 1;
                        } else if (segmentTimeUs > j11) {
                            j14 = j16 - 1;
                        } else {
                            return j16;
                        }
                    }
                    if (j15 == firstSegmentNum) {
                        return j15;
                    }
                    return j14;
                }
            }
            return firstSegmentNum;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {

        @Nullable
        final List<RangedUri> mediaSegments;

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }

        public SegmentList(RangedUri rangedUri, long j11, long j12, long j13, long j14, @Nullable List<SegmentTimelineElement> list, long j15, @Nullable List<RangedUri> list2, long j16, long j17) {
            super(rangedUri, j11, j12, j13, j14, list, j15, j16, j17);
            this.mediaSegments = list2;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j11) {
            return this.mediaSegments.size();
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j11) {
            return this.mediaSegments.get((int) (j11 - this.startNumber));
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {
        final long endNumber;

        @Nullable
        final UrlTemplate initializationTemplate;

        @Nullable
        final UrlTemplate mediaTemplate;

        public SegmentTemplate(RangedUri rangedUri, long j11, long j12, long j13, long j14, long j15, @Nullable List<SegmentTimelineElement> list, long j16, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2, long j17, long j18) {
            super(rangedUri, j11, j12, j13, j15, list, j16, j17, j18);
            this.initializationTemplate = urlTemplate;
            this.mediaTemplate = urlTemplate2;
            this.endNumber = j14;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase
        @Nullable
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.initializationTemplate;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f2788id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long j11) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            if (list != null) {
                return list.size();
            }
            long j12 = this.endNumber;
            if (j12 != -1) {
                return (j12 - this.startNumber) + 1;
            }
            if (j11 != C2711C.TIME_UNSET) {
                return BigIntegerMath.divide(BigInteger.valueOf(j11).multiply(BigInteger.valueOf(this.timescale)), BigInteger.valueOf(this.duration).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // androidx.media3.exoplayer.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long j11) {
            List<SegmentTimelineElement> list = this.segmentTimeline;
            long j12 = list != null ? list.get((int) (j11 - this.startNumber)).startTime : (j11 - this.startNumber) * this.duration;
            UrlTemplate urlTemplate = this.mediaTemplate;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.f2788id, j11, format.bitrate, j12), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        final long duration;
        final long startTime;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SegmentTimelineElement.class == obj.getClass()) {
                SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) obj;
                if (this.startTime == segmentTimelineElement.startTime && this.duration == segmentTimelineElement.duration) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.startTime) * 31) + ((int) this.duration);
        }

        public SegmentTimelineElement(long j11, long j12) {
            this.startTime = j11;
            this.duration = j12;
        }
    }

    public static class SingleSegmentBase extends SegmentBase {
        final long indexLength;
        final long indexStart;

        public SingleSegmentBase(@Nullable RangedUri rangedUri, long j11, long j12, long j13, long j14) {
            super(rangedUri, j11, j12);
            this.indexStart = j13;
            this.indexLength = j14;
        }

        @Nullable
        public RangedUri getIndex() {
            long j11 = this.indexLength;
            if (j11 <= 0) {
                return null;
            }
            return new RangedUri(null, this.indexStart, j11);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }

    @Nullable
    public RangedUri getInitialization(Representation representation) {
        return this.initialization;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.presentationTimeOffset, 1000000L, this.timescale);
    }

    public SegmentBase(@Nullable RangedUri rangedUri, long j11, long j12) {
        this.initialization = rangedUri;
        this.timescale = j11;
        this.presentationTimeOffset = j12;
    }
}
