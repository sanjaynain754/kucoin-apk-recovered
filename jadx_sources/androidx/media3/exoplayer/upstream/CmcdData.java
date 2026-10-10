package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.base.Joiner;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class CmcdData {
    private static final Joiner COMMA_JOINER = Joiner.m13373on(",");
    private final CmcdObject cmcdObject;
    private final CmcdRequest cmcdRequest;
    private final CmcdSession cmcdSession;
    private final CmcdStatus cmcdStatus;
    private final int dataTransmissionMode;

    public static final class CmcdObject {
        public final int bitrateKbps;
        public final ImmutableList<String> customDataList;
        public final long objectDurationMs;

        @Nullable
        public final String objectType;
        public final int topBitrateKbps;

        public static final class Builder {

            @Nullable
            private String objectType;
            private int bitrateKbps = C2711C.RATE_UNSET_INT;
            private int topBitrateKbps = C2711C.RATE_UNSET_INT;
            private long objectDurationMs = C2711C.TIME_UNSET;
            private ImmutableList<String> customDataList = ImmutableList.m13439of();

            public CmcdObject build() {
                return new CmcdObject(this);
            }

            @CanIgnoreReturnValue
            public Builder setBitrateKbps(int i11) {
                Assertions.checkArgument(i11 >= 0 || i11 == -2147483647);
                this.bitrateKbps = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setObjectDurationMs(long j11) {
                Assertions.checkArgument(j11 >= 0 || j11 == C2711C.TIME_UNSET);
                this.objectDurationMs = j11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setObjectType(@Nullable String str) {
                this.objectType = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTopBitrateKbps(int i11) {
                Assertions.checkArgument(i11 >= 0 || i11 == -2147483647);
                this.topBitrateKbps = i11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }
        }

        private CmcdObject(Builder builder) {
            this.bitrateKbps = builder.bitrateKbps;
            this.topBitrateKbps = builder.topBitrateKbps;
            this.objectDurationMs = builder.objectDurationMs;
            this.objectType = builder.objectType;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.bitrateKbps != -2147483647) {
                arrayList.add("br=" + this.bitrateKbps);
            }
            if (this.topBitrateKbps != -2147483647) {
                arrayList.add("tb=" + this.topBitrateKbps);
            }
            if (this.objectDurationMs != C2711C.TIME_UNSET) {
                arrayList.add("d=" + this.objectDurationMs);
            }
            if (!TextUtils.isEmpty(this.objectType)) {
                arrayList.add("ot=" + this.objectType);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_OBJECT, arrayList);
        }
    }

    public static final class CmcdRequest {
        public final long bufferLengthMs;
        public final ImmutableList<String> customDataList;
        public final long deadlineMs;
        public final long measuredThroughputInKbps;

        @Nullable
        public final String nextObjectRequest;

        @Nullable
        public final String nextRangeRequest;
        public final boolean startup;

        public static final class Builder {

            @Nullable
            private String nextObjectRequest;

            @Nullable
            private String nextRangeRequest;
            private boolean startup;
            private long bufferLengthMs = C2711C.TIME_UNSET;
            private long measuredThroughputInKbps = -2147483647L;
            private long deadlineMs = C2711C.TIME_UNSET;
            private ImmutableList<String> customDataList = ImmutableList.m13439of();

            public CmcdRequest build() {
                return new CmcdRequest(this);
            }

            @CanIgnoreReturnValue
            public Builder setBufferLengthMs(long j11) {
                Assertions.checkArgument(j11 >= 0 || j11 == C2711C.TIME_UNSET);
                this.bufferLengthMs = ((j11 + 50) / 100) * 100;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setDeadlineMs(long j11) {
                Assertions.checkArgument(j11 >= 0 || j11 == C2711C.TIME_UNSET);
                this.deadlineMs = ((j11 + 50) / 100) * 100;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMeasuredThroughputInKbps(long j11) {
                Assertions.checkArgument(j11 >= 0 || j11 == -2147483647L);
                this.measuredThroughputInKbps = ((j11 + 50) / 100) * 100;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setNextObjectRequest(@Nullable String str) {
                this.nextObjectRequest = str == null ? null : Uri.encode(str);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setNextRangeRequest(@Nullable String str) {
                this.nextRangeRequest = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStartup(boolean z11) {
                this.startup = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }
        }

        private CmcdRequest(Builder builder) {
            this.bufferLengthMs = builder.bufferLengthMs;
            this.measuredThroughputInKbps = builder.measuredThroughputInKbps;
            this.deadlineMs = builder.deadlineMs;
            this.startup = builder.startup;
            this.nextObjectRequest = builder.nextObjectRequest;
            this.nextRangeRequest = builder.nextRangeRequest;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.bufferLengthMs != C2711C.TIME_UNSET) {
                arrayList.add("bl=" + this.bufferLengthMs);
            }
            if (this.measuredThroughputInKbps != -2147483647L) {
                arrayList.add("mtp=" + this.measuredThroughputInKbps);
            }
            if (this.deadlineMs != C2711C.TIME_UNSET) {
                arrayList.add("dl=" + this.deadlineMs);
            }
            if (this.startup) {
                arrayList.add(CmcdConfiguration.KEY_STARTUP);
            }
            if (!TextUtils.isEmpty(this.nextObjectRequest)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_NEXT_OBJECT_REQUEST, this.nextObjectRequest));
            }
            if (!TextUtils.isEmpty(this.nextRangeRequest)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_NEXT_RANGE_REQUEST, this.nextRangeRequest));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_REQUEST, arrayList);
        }
    }

    public static final class CmcdSession {
        public static final int VERSION = 1;

        @Nullable
        public final String contentId;
        public final ImmutableList<String> customDataList;
        public final float playbackRate;

        @Nullable
        public final String sessionId;

        @Nullable
        public final String streamType;

        @Nullable
        public final String streamingFormat;

        public static final class Builder {

            @Nullable
            private String contentId;
            private ImmutableList<String> customDataList = ImmutableList.m13439of();
            private float playbackRate;

            @Nullable
            private String sessionId;

            @Nullable
            private String streamType;

            @Nullable
            private String streamingFormat;

            @CanIgnoreReturnValue
            public Builder setPlaybackRate(float f11) {
                Assertions.checkArgument(f11 > 0.0f || f11 == -3.4028235E38f);
                this.playbackRate = f11;
                return this;
            }

            public CmcdSession build() {
                return new CmcdSession(this);
            }

            @CanIgnoreReturnValue
            public Builder setContentId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.contentId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setSessionId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.sessionId = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStreamType(@Nullable String str) {
                this.streamType = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setStreamingFormat(@Nullable String str) {
                this.streamingFormat = str;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }
        }

        private CmcdSession(Builder builder) {
            this.contentId = builder.contentId;
            this.sessionId = builder.sessionId;
            this.streamingFormat = builder.streamingFormat;
            this.streamType = builder.streamType;
            this.playbackRate = builder.playbackRate;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.contentId)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_CONTENT_ID, this.contentId));
            }
            if (!TextUtils.isEmpty(this.sessionId)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_SESSION_ID, this.sessionId));
            }
            if (!TextUtils.isEmpty(this.streamingFormat)) {
                arrayList.add("sf=" + this.streamingFormat);
            }
            if (!TextUtils.isEmpty(this.streamType)) {
                arrayList.add("st=" + this.streamType);
            }
            float f11 = this.playbackRate;
            if (f11 != -3.4028235E38f && f11 != 1.0f) {
                arrayList.add(Util.formatInvariant("%s=%.2f", CmcdConfiguration.KEY_PLAYBACK_RATE, Float.valueOf(f11)));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_SESSION, arrayList);
        }
    }

    public static final class CmcdStatus {
        public final boolean bufferStarvation;
        public final ImmutableList<String> customDataList;
        public final int maximumRequestedThroughputKbps;

        public static final class Builder {
            private boolean bufferStarvation;
            private int maximumRequestedThroughputKbps = C2711C.RATE_UNSET_INT;
            private ImmutableList<String> customDataList = ImmutableList.m13439of();

            public CmcdStatus build() {
                return new CmcdStatus(this);
            }

            @CanIgnoreReturnValue
            public Builder setBufferStarvation(boolean z11) {
                this.bufferStarvation = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setMaximumRequestedThroughputKbps(int i11) {
                boolean z11;
                if (i11 < 0 && i11 != -2147483647) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                Assertions.checkArgument(z11);
                if (i11 != -2147483647) {
                    i11 = ((i11 + 50) / 100) * 100;
                }
                this.maximumRequestedThroughputKbps = i11;
                return this;
            }
        }

        private CmcdStatus(Builder builder) {
            this.maximumRequestedThroughputKbps = builder.maximumRequestedThroughputKbps;
            this.bufferStarvation = builder.bufferStarvation;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.maximumRequestedThroughputKbps != -2147483647) {
                arrayList.add("rtp=" + this.maximumRequestedThroughputKbps);
            }
            if (this.bufferStarvation) {
                arrayList.add(CmcdConfiguration.KEY_BUFFER_STARVATION);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_STATUS, arrayList);
        }
    }

    public static final class Factory {
        private static final Pattern CUSTOM_KEY_NAME_PATTERN = Pattern.compile(".*-.*");
        public static final String OBJECT_TYPE_AUDIO_ONLY = "a";
        public static final String OBJECT_TYPE_INIT_SEGMENT = "i";
        public static final String OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO = "av";
        public static final String OBJECT_TYPE_VIDEO_ONLY = "v";
        public static final String STREAMING_FORMAT_DASH = "d";
        public static final String STREAMING_FORMAT_HLS = "h";
        public static final String STREAMING_FORMAT_SS = "s";
        public static final String STREAM_TYPE_LIVE = "l";
        public static final String STREAM_TYPE_VOD = "v";
        private final long bufferedDurationUs;
        private long chunkDurationUs;
        private final CmcdConfiguration cmcdConfiguration;
        private final boolean didRebuffer;
        private final boolean isBufferEmpty;
        private final boolean isLive;

        @Nullable
        private String nextObjectRequest;

        @Nullable
        private String nextRangeRequest;

        @Nullable
        private String objectType;
        private final float playbackRate;
        private final String streamingFormat;
        private final ExoTrackSelection trackSelection;

        @Nullable
        public static String getObjectType(ExoTrackSelection exoTrackSelection) {
            Assertions.checkArgument(exoTrackSelection != null);
            int trackType = MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().sampleMimeType);
            if (trackType == -1) {
                trackType = MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().containerMimeType);
            }
            if (trackType == 1) {
                return OBJECT_TYPE_AUDIO_ONLY;
            }
            if (trackType == 2) {
                return "v";
            }
            return null;
        }

        private boolean getIsInitSegment() {
            String str = this.objectType;
            return str != null && str.equals("i");
        }

        public CmcdData createCmcdData() {
            ImmutableListMultimap<String, String> customData = this.cmcdConfiguration.requestConfig.getCustomData();
            UnmodifiableIterator<String> it = customData.keySet().iterator();
            while (it.hasNext()) {
                validateCustomDataListFormat(customData.get(it.next()));
            }
            int iCeilDivide = Util.ceilDivide(this.trackSelection.getSelectedFormat().bitrate, 1000);
            CmcdObject.Builder builder = new CmcdObject.Builder();
            if (!getIsInitSegment()) {
                if (this.cmcdConfiguration.isBitrateLoggingAllowed()) {
                    builder.setBitrateKbps(iCeilDivide);
                }
                if (this.cmcdConfiguration.isTopBitrateLoggingAllowed()) {
                    TrackGroup trackGroup = this.trackSelection.getTrackGroup();
                    int iMax = this.trackSelection.getSelectedFormat().bitrate;
                    for (int i11 = 0; i11 < trackGroup.length; i11++) {
                        iMax = Math.max(iMax, trackGroup.getFormat(i11).bitrate);
                    }
                    builder.setTopBitrateKbps(Util.ceilDivide(iMax, 1000));
                }
                if (this.cmcdConfiguration.isObjectDurationLoggingAllowed()) {
                    builder.setObjectDurationMs(Util.usToMs(this.chunkDurationUs));
                }
            }
            if (this.cmcdConfiguration.isObjectTypeLoggingAllowed()) {
                builder.setObjectType(this.objectType);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_OBJECT)) {
                builder.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_OBJECT));
            }
            CmcdRequest.Builder builder2 = new CmcdRequest.Builder();
            if (!getIsInitSegment() && this.cmcdConfiguration.isBufferLengthLoggingAllowed()) {
                builder2.setBufferLengthMs(Util.usToMs(this.bufferedDurationUs));
            }
            if (this.cmcdConfiguration.isMeasuredThroughputLoggingAllowed() && this.trackSelection.getLatestBitrateEstimate() != -2147483647L) {
                builder2.setMeasuredThroughputInKbps(Util.ceilDivide(this.trackSelection.getLatestBitrateEstimate(), 1000L));
            }
            if (this.cmcdConfiguration.isDeadlineLoggingAllowed()) {
                builder2.setDeadlineMs(Util.usToMs((long) (this.bufferedDurationUs / this.playbackRate)));
            }
            if (this.cmcdConfiguration.isStartupLoggingAllowed()) {
                builder2.setStartup(this.didRebuffer || this.isBufferEmpty);
            }
            if (this.cmcdConfiguration.isNextObjectRequestLoggingAllowed()) {
                builder2.setNextObjectRequest(this.nextObjectRequest);
            }
            if (this.cmcdConfiguration.isNextRangeRequestLoggingAllowed()) {
                builder2.setNextRangeRequest(this.nextRangeRequest);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_REQUEST)) {
                builder2.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_REQUEST));
            }
            CmcdSession.Builder builder3 = new CmcdSession.Builder();
            if (this.cmcdConfiguration.isContentIdLoggingAllowed()) {
                builder3.setContentId(this.cmcdConfiguration.contentId);
            }
            if (this.cmcdConfiguration.isSessionIdLoggingAllowed()) {
                builder3.setSessionId(this.cmcdConfiguration.sessionId);
            }
            if (this.cmcdConfiguration.isStreamingFormatLoggingAllowed()) {
                builder3.setStreamingFormat(this.streamingFormat);
            }
            if (this.cmcdConfiguration.isStreamTypeLoggingAllowed()) {
                builder3.setStreamType(this.isLive ? STREAM_TYPE_LIVE : "v");
            }
            if (this.cmcdConfiguration.isPlaybackRateLoggingAllowed()) {
                builder3.setPlaybackRate(this.playbackRate);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_SESSION)) {
                builder3.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_SESSION));
            }
            CmcdStatus.Builder builder4 = new CmcdStatus.Builder();
            if (this.cmcdConfiguration.isMaximumRequestThroughputLoggingAllowed()) {
                builder4.setMaximumRequestedThroughputKbps(this.cmcdConfiguration.requestConfig.getRequestedMaximumThroughputKbps(iCeilDivide));
            }
            if (this.cmcdConfiguration.isBufferStarvationLoggingAllowed()) {
                builder4.setBufferStarvation(this.didRebuffer);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_STATUS)) {
                builder4.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_STATUS));
            }
            return new CmcdData(builder.build(), builder2.build(), builder3.build(), builder4.build(), this.cmcdConfiguration.dataTransmissionMode);
        }

        @CanIgnoreReturnValue
        public Factory setChunkDurationUs(long j11) {
            Assertions.checkArgument(j11 >= 0);
            this.chunkDurationUs = j11;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setNextObjectRequest(@Nullable String str) {
            this.nextObjectRequest = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setNextRangeRequest(@Nullable String str) {
            this.nextRangeRequest = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setObjectType(@Nullable String str) {
            this.objectType = str;
            return this;
        }

        public Factory(CmcdConfiguration cmcdConfiguration, ExoTrackSelection exoTrackSelection, long j11, float f11, String str, boolean z11, boolean z12, boolean z13) {
            boolean z14;
            if (j11 >= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            Assertions.checkArgument(z14);
            Assertions.checkArgument(f11 == -3.4028235E38f || f11 > 0.0f);
            this.cmcdConfiguration = cmcdConfiguration;
            this.trackSelection = exoTrackSelection;
            this.bufferedDurationUs = j11;
            this.playbackRate = f11;
            this.streamingFormat = str;
            this.isLive = z11;
            this.didRebuffer = z12;
            this.isBufferEmpty = z13;
            this.chunkDurationUs = C2711C.TIME_UNSET;
        }

        private void validateCustomDataListFormat(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Assertions.checkState(CUSTOM_KEY_NAME_PATTERN.matcher(Util.split(it.next(), "=")[0]).matches());
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    private CmcdData(CmcdObject cmcdObject, CmcdRequest cmcdRequest, CmcdSession cmcdSession, CmcdStatus cmcdStatus, int i11) {
        this.cmcdObject = cmcdObject;
        this.cmcdRequest = cmcdRequest;
        this.cmcdSession = cmcdSession;
        this.cmcdStatus = cmcdStatus;
        this.dataTransmissionMode = i11;
    }

    public DataSpec addToDataSpec(DataSpec dataSpec) {
        ArrayListMultimap<String, String> arrayListMultimapCreate = ArrayListMultimap.create();
        this.cmcdObject.populateCmcdDataMap(arrayListMultimapCreate);
        this.cmcdRequest.populateCmcdDataMap(arrayListMultimapCreate);
        this.cmcdSession.populateCmcdDataMap(arrayListMultimapCreate);
        this.cmcdStatus.populateCmcdDataMap(arrayListMultimapCreate);
        if (this.dataTransmissionMode == 0) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (String str : arrayListMultimapCreate.keySet()) {
                List list = arrayListMultimapCreate.get((Object) str);
                Collections.sort(list);
                builder.put(str, COMMA_JOINER.join(list));
            }
            return dataSpec.withAdditionalHeaders(builder.buildOrThrow());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListMultimapCreate.asMap().values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) it.next());
        }
        Collections.sort(arrayList);
        return dataSpec.buildUpon().setUri(dataSpec.uri.buildUpon().appendQueryParameter(CmcdConfiguration.CMCD_QUERY_PARAMETER_KEY, COMMA_JOINER.join(arrayList)).build()).build();
    }
}
