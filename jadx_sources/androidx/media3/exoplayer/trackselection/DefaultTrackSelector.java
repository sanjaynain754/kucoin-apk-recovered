package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.emoji2.text.ExecutorC2501a;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DefaultTrackSelector extends MappingTrackSelector implements RendererCapabilities.Listener {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final Ordering<Integer> FORMAT_VALUE_ORDERING = Ordering.from(new Comparator() { // from class: androidx.media3.exoplayer.trackselection.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.m3467e((Integer) obj, (Integer) obj2);
        }
    });
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";

    @GuardedBy("lock")
    private AudioAttributes audioAttributes;

    @Nullable
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;

    @GuardedBy("lock")
    private Parameters parameters;

    @Nullable
    @GuardedBy("lock")
    private SpatializerWrapperV32 spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;

    public static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isObjectBasedAudio;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;

        @Nullable
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        private int evaluateSelectionEligibility(int i11, boolean z11, int i12) {
            if (!RendererCapabilities.isFormatSupported(i11, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            Parameters parameters = this.parameters;
            if (parameters.audioOffloadPreferences.audioOffloadMode == 2 && !DefaultTrackSelector.rendererSupportsOffload(parameters, i11, this.format)) {
                return 0;
            }
            if (!RendererCapabilities.isFormatSupported(i11, false) || !this.isWithinConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters2 = this.parameters;
            if (parameters2.forceHighestSupportedBitrate || parameters2.forceLowestBitrate) {
                return 1;
            }
            return ((!parameters2.allowMultipleAdaptiveSelections && z11) || parameters2.audioOffloadPreferences.audioOffloadMode == 2 || (i11 & i12) == 0) ? 1 : 2;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackInfo audioTrackInfo) {
            Ordering orderingReverse = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(audioTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).compareFalseFirst(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).compare(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), Ordering.natural().reverse()).compare(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).compareFalseFirst(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).compare(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), Ordering.natural().reverse());
            if (this.parameters.forceLowestBitrate) {
                comparisonChainCompare = comparisonChainCompare.compare(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse());
            }
            ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compareFalseFirst(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).compareFalseFirst(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).compareFalseFirst(this.isObjectBasedAudio, audioTrackInfo.isObjectBasedAudio).compare(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), orderingReverse).compare(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), orderingReverse);
            if (Util.areEqual(this.language, audioTrackInfo.language)) {
                comparisonChainCompare2 = comparisonChainCompare2.compare(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), orderingReverse);
            }
            return comparisonChainCompare2.result();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
            int i11;
            String str;
            int i12;
            if (!this.parameters.allowAudioMixedChannelCountAdaptiveness && ((i12 = this.format.channelCount) == -1 || i12 != audioTrackInfo.format.channelCount)) {
                return false;
            }
            if (!this.allowMixedMimeTypes && ((str = this.format.sampleMimeType) == null || !TextUtils.equals(str, audioTrackInfo.format.sampleMimeType))) {
                return false;
            }
            Parameters parameters = this.parameters;
            if (!parameters.allowAudioMixedSampleRateAdaptiveness && ((i11 = this.format.sampleRate) == -1 || i11 != audioTrackInfo.format.sampleRate)) {
                return false;
            }
            if (parameters.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }

        public AudioTrackInfo(int i11, TrackGroup trackGroup, int i12, Parameters parameters, int i13, boolean z11, Predicate<Format> predicate, int i14) {
            int i15;
            boolean z12;
            int i16;
            int formatLanguageScore;
            boolean z13;
            boolean z14;
            boolean z15;
            int formatLanguageScore2;
            boolean z16;
            super(i11, trackGroup, i12);
            this.parameters = parameters;
            if (parameters.allowAudioNonSeamlessAdaptiveness) {
                i15 = 24;
            } else {
                i15 = 16;
            }
            if (parameters.allowAudioMixedMimeTypeAdaptiveness && (i14 & i15) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.allowMixedMimeTypes = z12;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i13, false);
            int i17 = 0;
            while (true) {
                i16 = Integer.MAX_VALUE;
                if (i17 < parameters.preferredAudioLanguages.size()) {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, parameters.preferredAudioLanguages.get(i17), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i17++;
                    }
                } else {
                    formatLanguageScore = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.preferredLanguageIndex = i17;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            Format format = this.format;
            int i18 = format.roleFlags;
            if (i18 != 0 && (i18 & 1) == 0) {
                z13 = false;
            } else {
                z13 = true;
            }
            this.hasMainOrNoRoleFlag = z13;
            if ((format.selectionFlags & 1) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.isDefaultSelectionFlag = z14;
            this.isObjectBasedAudio = DefaultTrackSelector.isObjectBasedAudio(format);
            Format format2 = this.format;
            int i19 = format2.channelCount;
            this.channelCount = i19;
            this.sampleRate = format2.sampleRate;
            int i21 = format2.bitrate;
            this.bitrate = i21;
            if ((i21 == -1 || i21 <= parameters.maxAudioBitrate) && ((i19 == -1 || i19 <= parameters.maxAudioChannelCount) && predicate.apply(format2))) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.isWithinConstraints = z15;
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i22 = 0;
            while (true) {
                if (i22 < systemLanguageCodes.length) {
                    formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i22], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i22++;
                    }
                } else {
                    formatLanguageScore2 = 0;
                    i22 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.localeLanguageMatchIndex = i22;
            this.localeLanguageScore = formatLanguageScore2;
            for (int i23 = 0; i23 < parameters.preferredAudioMimeTypes.size(); i23++) {
                String str = this.format.sampleMimeType;
                if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i23))) {
                    i16 = i23;
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i16;
            if (RendererCapabilities.getDecoderSupport(i13) == 128) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.usesPrimaryDecoder = z16;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i13) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i13, z11, i15);
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
            return ((AudioTrackInfo) Collections.max(list)).compareTo((AudioTrackInfo) Collections.max(list2));
        }

        public static ImmutableList<AudioTrackInfo> createForTrackGroup(int i11, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z11, Predicate<Format> predicate, int i12) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i13 = 0; i13 < trackGroup.length; i13++) {
                builder.add(new AudioTrackInfo(i11, trackGroup, i13, parameters, iArr[i13], z11, predicate, i12));
            }
            return builder.build();
        }
    }

    public static final class ImageTrackInfo extends TrackInfo<ImageTrackInfo> implements Comparable<ImageTrackInfo> {
        private final int pixelCount;
        private final int selectionEligibility;

        public static int compareSelections(List<ImageTrackInfo> list, List<ImageTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(ImageTrackInfo imageTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(ImageTrackInfo imageTrackInfo) {
            return Integer.compare(this.pixelCount, imageTrackInfo.pixelCount);
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        public ImageTrackInfo(int i11, TrackGroup trackGroup, int i12, Parameters parameters, int i13) {
            super(i11, trackGroup, i12);
            this.selectionEligibility = RendererCapabilities.isFormatSupported(i13, parameters.exceedRendererCapabilitiesIfNecessary) ? 1 : 0;
            this.pixelCount = this.format.getPixelCount();
        }

        public static ImmutableList<ImageTrackInfo> createForTrackGroup(int i11, TrackGroup trackGroup, Parameters parameters, int[] iArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i12 = 0; i12 < trackGroup.length; i12++) {
                builder.add(new ImageTrackInfo(i11, trackGroup, i12, parameters, iArr[i12]));
            }
            return builder.build();
        }
    }

    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore otherTrackScore) {
            return ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(this.isDefault, otherTrackScore.isDefault).result();
        }

        public OtherTrackScore(Format format, int i11) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i11, false);
        }
    }

    public static final class Parameters extends TrackSelectionParameters {

        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS;

        /* JADX INFO: renamed from: FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE */
        private static final String f3416xaec1bc6e;
        private static final String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS;
        private static final String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES;
        private static final String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY;
        private static final String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_RENDERER_DISABLED_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES;
        private static final String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
        private static final String FIELD_TUNNELING_ENABLED;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowAudioNonSeamlessAdaptiveness;
        public final boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        public static final class Builder extends TrackSelectionParameters.Builder {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowAudioNonSeamlessAdaptiveness;
            private boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.allowAudioNonSeamlessAdaptiveness = true;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = false;
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverrides(int i11) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i11);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i11);
                }
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            @Deprecated
            public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
                SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    sparseArray2.put(sparseArray.keyAt(i11), new HashMap(sparseArray.valueAt(i11)));
                }
                return sparseArray2;
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(@Nullable int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i11 : iArr) {
                    sparseBooleanArray.append(i11, true);
                }
                return sparseBooleanArray;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder addOverride(TrackSelectionOverride trackSelectionOverride) {
                super.addOverride(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            public Parameters build() {
                return new Parameters(this);
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverride(TrackGroup trackGroup) {
                super.clearOverride(trackGroup);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearOverridesOfType(int i11) {
                super.clearOverridesOfType(i11);
                return this;
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverride(int i11, TrackGroupArray trackGroupArray) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i11);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i11);
                    }
                }
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder clearViewportSizeConstraints() {
                super.clearViewportSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder set(TrackSelectionParameters trackSelectionParameters) {
                super.set(trackSelectionParameters);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z11) {
                this.allowAudioMixedChannelCountAdaptiveness = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z11) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z11) {
                this.allowAudioMixedMimeTypeAdaptiveness = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z11) {
                this.allowAudioMixedSampleRateAdaptiveness = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowAudioNonSeamlessAdaptiveness(boolean z11) {
                this.allowAudioNonSeamlessAdaptiveness = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z11) {
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowMultipleAdaptiveSelections(boolean z11) {
                this.allowMultipleAdaptiveSelections = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z11) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z11) {
                this.allowVideoMixedMimeTypeAdaptiveness = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setAllowVideoNonSeamlessAdaptiveness(boolean z11) {
                this.allowVideoNonSeamlessAdaptiveness = z11;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setAudioOffloadPreferences(TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
                super.setAudioOffloadPreferences(audioOffloadPreferences);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z11) {
                this.constrainAudioChannelCountToDeviceCapabilities = z11;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            @Deprecated
            public Builder setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes(set);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setExceedAudioConstraintsIfNecessary(boolean z11) {
                this.exceedAudioConstraintsIfNecessary = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setExceedRendererCapabilitiesIfNecessary(boolean z11) {
                this.exceedRendererCapabilitiesIfNecessary = z11;
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setExceedVideoConstraintsIfNecessary(boolean z11) {
                this.exceedVideoConstraintsIfNecessary = z11;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setForceHighestSupportedBitrate(boolean z11) {
                super.setForceHighestSupportedBitrate(z11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setForceLowestBitrate(boolean z11) {
                super.setForceLowestBitrate(z11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setIgnoredTextSelectionFlags(int i11) {
                super.setIgnoredTextSelectionFlags(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxAudioBitrate(int i11) {
                super.setMaxAudioBitrate(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxAudioChannelCount(int i11) {
                super.setMaxAudioChannelCount(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoBitrate(int i11) {
                super.setMaxVideoBitrate(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoFrameRate(int i11) {
                super.setMaxVideoFrameRate(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoSize(int i11, int i12) {
                super.setMaxVideoSize(i11, i12);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMaxVideoSizeSd() {
                super.setMaxVideoSizeSd();
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoBitrate(int i11) {
                super.setMinVideoBitrate(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoFrameRate(int i11) {
                super.setMinVideoFrameRate(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setMinVideoSize(int i11, int i12) {
                super.setMinVideoSize(i11, i12);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
                super.setOverrideForType(trackSelectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioLanguage(@Nullable String str) {
                super.setPreferredAudioLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioMimeType(@Nullable String str) {
                super.setPreferredAudioMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredAudioRoleFlags(int i11) {
                super.setPreferredAudioRoleFlags(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguage(@Nullable String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredTextRoleFlags(int i11) {
                super.setPreferredTextRoleFlags(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoMimeType(@Nullable String str) {
                super.setPreferredVideoMimeType(str);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPreferredVideoRoleFlags(int i11) {
                super.setPreferredVideoRoleFlags(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setPrioritizeImageOverVideoEnabled(boolean z11) {
                super.setPrioritizeImageOverVideoEnabled(z11);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setRendererDisabled(int i11, boolean z11) {
                if (this.rendererDisabledFlags.get(i11) == z11) {
                    return this;
                }
                if (z11) {
                    this.rendererDisabledFlags.put(i11, true);
                    return this;
                }
                this.rendererDisabledFlags.delete(i11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setSelectUndeterminedTextLanguage(boolean z11) {
                super.setSelectUndeterminedTextLanguage(z11);
                return this;
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder setSelectionOverride(int i11, TrackGroupArray trackGroupArray, @Nullable SelectionOverride selectionOverride) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i11);
                if (map == null) {
                    map = new HashMap<>();
                    this.selectionOverrides.put(i11, map);
                }
                if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                    return this;
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setTrackTypeDisabled(int i11, boolean z11) {
                super.setTrackTypeDisabled(i11, z11);
                return this;
            }

            @CanIgnoreReturnValue
            public Builder setTunnelingEnabled(boolean z11) {
                this.tunnelingEnabled = z11;
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setViewportSize(int i11, int i12, boolean z11) {
                super.setViewportSize(i11, i12, z11);
                return this;
            }

            @Override // androidx.media3.common.TrackSelectionParameters.Builder
            @CanIgnoreReturnValue
            public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z11) {
                super.setViewportSizeToPhysicalDisplaySize(context, z11);
                return this;
            }

            @Deprecated
            public Builder() {
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void setSelectionOverridesFromBundle(Bundle bundle) {
                ImmutableList immutableListFromBundleList;
                SparseArray sparseArrayFromBundleSparseArray;
                int[] intArray = bundle.getIntArray(Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS);
                if (parcelableArrayList == null) {
                    immutableListFromBundleList = ImmutableList.m13439of();
                } else {
                    immutableListFromBundleList = BundleCollectionUtil.fromBundleList(new Function() { // from class: androidx.media3.exoplayer.trackselection.n
                        @Override // com.google.common.base.Function
                        public final Object apply(Object obj) {
                            return TrackGroupArray.fromBundle((Bundle) obj);
                        }
                    }, parcelableArrayList);
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Parameters.FIELD_SELECTION_OVERRIDES);
                if (sparseParcelableArray == null) {
                    sparseArrayFromBundleSparseArray = new SparseArray();
                } else {
                    sparseArrayFromBundleSparseArray = BundleCollectionUtil.fromBundleSparseArray(new Function() { // from class: androidx.media3.exoplayer.trackselection.o
                        @Override // com.google.common.base.Function
                        public final Object apply(Object obj) {
                            return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
                        }
                    }, sparseParcelableArray);
                }
                if (intArray != null && intArray.length == immutableListFromBundleList.size()) {
                    for (int i11 = 0; i11 < intArray.length; i11++) {
                        setSelectionOverride(intArray[i11], (TrackGroupArray) immutableListFromBundleList.get(i11), (SelectionOverride) sparseArrayFromBundleSparseArray.get(i11));
                    }
                }
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder setDisabledTextTrackSelectionFlags(int i11) {
                return setIgnoredTextSelectionFlags(i11);
            }

            @CanIgnoreReturnValue
            @Deprecated
            public Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            public Builder(Context context) {
                super(context);
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            private Builder(Parameters parameters) {
                super(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.allowAudioNonSeamlessAdaptiveness = parameters.allowAudioNonSeamlessAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private Builder(Bundle bundle) {
                super(bundle);
                init();
                Parameters parameters = Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowAudioNonSeamlessAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(Parameters.FIELD_TUNNELING_ENABLED, parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, parameters.allowMultipleAdaptiveSelections));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(Parameters.f3416xaec1bc6e, parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange));
                this.selectionOverrides = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(Parameters.FIELD_RENDERER_DISABLED_INDICES));
            }
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i11), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.allowAudioNonSeamlessAdaptiveness == parameters.allowAudioNonSeamlessAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && this.allowInvalidateSelectionsOnRendererCapabilitiesChange == parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        static {
            Parameters parametersBuild = new Builder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1000);
            FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1001);
            FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = Util.intToStringMaxRadix(1002);
            FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = Util.intToStringMaxRadix(1003);
            FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = Util.intToStringMaxRadix(1004);
            FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = Util.intToStringMaxRadix(1005);
            FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = Util.intToStringMaxRadix(1006);
            FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = Util.intToStringMaxRadix(1007);
            FIELD_TUNNELING_ENABLED = Util.intToStringMaxRadix(1008);
            FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = Util.intToStringMaxRadix(1009);
            FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = Util.intToStringMaxRadix(1010);
            FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = Util.intToStringMaxRadix(1011);
            FIELD_SELECTION_OVERRIDES = Util.intToStringMaxRadix(1012);
            FIELD_RENDERER_DISABLED_INDICES = Util.intToStringMaxRadix(1013);
            FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(1014);
            FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Util.intToStringMaxRadix(1015);
            FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = Util.intToStringMaxRadix(1016);
            f3416xaec1bc6e = Util.intToStringMaxRadix(1017);
            FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS = Util.intToStringMaxRadix(1018);
        }

        private Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.allowAudioNonSeamlessAdaptiveness = builder.allowAudioNonSeamlessAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.allowInvalidateSelectionsOnRendererCapabilitiesChange = builder.allowInvalidateSelectionsOnRendererCapabilitiesChange;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        public static Parameters fromBundle(Bundle bundle) {
            return new Builder(bundle).build();
        }

        public static Parameters getDefaults(Context context) {
            return new Builder(context).build();
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                int iKeyAt = sparseArray.keyAt(i11);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i11).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(FIELD_SELECTION_OVERRIDES_RENDERER_INDICES, Ints.toArray(arrayList));
                bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS, BundleCollectionUtil.toBundleArrayList(arrayList2, new Function() { // from class: androidx.media3.exoplayer.trackselection.l
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return ((TrackGroupArray) obj).toBundle();
                    }
                }));
                bundle.putSparseParcelableArray(FIELD_SELECTION_OVERRIDES, BundleCollectionUtil.toBundleSparseArray(sparseArray2, new Function() { // from class: androidx.media3.exoplayer.trackselection.m
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
                    }
                }));
            }
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public Builder buildUpon() {
            return new Builder();
        }

        public boolean getRendererDisabled(int i11) {
            return this.rendererDisabledFlags.get(i11);
        }

        @Nullable
        @Deprecated
        public SelectionOverride getSelectionOverride(int i11, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i11);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Deprecated
        public boolean hasSelectionOverride(int i11, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i11);
            return map != null && map.containsKey(trackGroupArray);
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i11)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i11 = 0; i11 < sparseBooleanArray.size(); i11++) {
                iArr[i11] = sparseBooleanArray.keyAt(i11);
            }
            return iArr;
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31) + (this.allowInvalidateSelectionsOnRendererCapabilitiesChange ? 1 : 0);
        }

        @Override // androidx.media3.common.TrackSelectionParameters
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, this.allowAudioNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(FIELD_TUNNELING_ENABLED, this.tunnelingEnabled);
            bundle.putBoolean(FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, this.allowMultipleAdaptiveSelections);
            bundle.putBoolean(f3416xaec1bc6e, this.allowInvalidateSelectionsOnRendererCapabilitiesChange);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(FIELD_RENDERER_DISABLED_INDICES, getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Deprecated
    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private final Parameters.Builder delegate;

        @Deprecated
        public ParametersBuilder() {
            this.delegate = new Parameters.Builder();
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverrides(int i11) {
            this.delegate.clearSelectionOverrides(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        @Deprecated
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder addOverride(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.addOverride(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        public Parameters build() {
            return this.delegate.build();
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverride(TrackGroup trackGroup) {
            this.delegate.clearOverride(trackGroup);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearOverridesOfType(int i11) {
            this.delegate.clearOverridesOfType(i11);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverride(int i11, TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i11, trackGroupArray);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
            this.delegate.set(trackSelectionParameters);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z11) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z11) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z11) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z11) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z11) {
            this.delegate.setAllowMultipleAdaptiveSelections(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z11) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z11) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z11) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setAudioOffloadPreferences(TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.delegate.setAudioOffloadPreferences(audioOffloadPreferences);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i11) {
            this.delegate.setDisabledTextTrackSelectionFlags(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z11) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z11) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z11) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z11) {
            this.delegate.setForceHighestSupportedBitrate(z11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setForceLowestBitrate(boolean z11) {
            this.delegate.setForceLowestBitrate(z11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setIgnoredTextSelectionFlags(int i11) {
            this.delegate.setIgnoredTextSelectionFlags(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxAudioBitrate(int i11) {
            this.delegate.setMaxAudioBitrate(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxAudioChannelCount(int i11) {
            this.delegate.setMaxAudioChannelCount(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoBitrate(int i11) {
            this.delegate.setMaxVideoBitrate(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoFrameRate(int i11) {
            this.delegate.setMaxVideoFrameRate(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoSize(int i11, int i12) {
            this.delegate.setMaxVideoSize(i11, i12);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoBitrate(int i11) {
            this.delegate.setMinVideoBitrate(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoFrameRate(int i11) {
            this.delegate.setMinVideoFrameRate(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setMinVideoSize(int i11, int i12) {
            this.delegate.setMinVideoSize(i11, i12);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            this.delegate.setOverrideForType(trackSelectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioLanguage(@Nullable String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioMimeType(@Nullable String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredAudioRoleFlags(int i11) {
            this.delegate.setPreferredAudioRoleFlags(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguage(@Nullable String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredTextRoleFlags(int i11) {
            this.delegate.setPreferredTextRoleFlags(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoMimeType(@Nullable String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPreferredVideoRoleFlags(int i11) {
            this.delegate.setPreferredVideoRoleFlags(i11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setPrioritizeImageOverVideoEnabled(boolean z11) {
            this.delegate.setPrioritizeImageOverVideoEnabled(z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setRendererDisabled(int i11, boolean z11) {
            this.delegate.setRendererDisabled(i11, z11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z11) {
            this.delegate.setSelectUndeterminedTextLanguage(z11);
            return this;
        }

        @CanIgnoreReturnValue
        @Deprecated
        public ParametersBuilder setSelectionOverride(int i11, TrackGroupArray trackGroupArray, @Nullable SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i11, trackGroupArray, selectionOverride);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setTrackTypeDisabled(int i11, boolean z11) {
            this.delegate.setTrackTypeDisabled(i11, z11);
            return this;
        }

        @CanIgnoreReturnValue
        public ParametersBuilder setTunnelingEnabled(boolean z11) {
            this.delegate.setTunnelingEnabled(z11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setViewportSize(int i11, int i12, boolean z11) {
            this.delegate.setViewportSize(i11, i12, z11);
            return this;
        }

        @Override // androidx.media3.common.TrackSelectionParameters.Builder
        @CanIgnoreReturnValue
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z11) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z11);
            return this;
        }

        public ParametersBuilder(Context context) {
            this.delegate = new Parameters.Builder(context);
        }
    }

    public static final class SelectionOverride {
        private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(0);
        private static final String FIELD_TRACKS = Util.intToStringMaxRadix(1);
        private static final String FIELD_TRACK_TYPE = Util.intToStringMaxRadix(2);
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i11, int... iArr) {
            this(i11, iArr, 0);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type) {
                    return true;
                }
            }
            return false;
        }

        @UnstableApi
        public SelectionOverride(int i11, int[] iArr, int i12) {
            this.groupIndex = i11;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i12;
            Arrays.sort(iArrCopyOf);
        }

        @UnstableApi
        public static SelectionOverride fromBundle(Bundle bundle) {
            int i11 = bundle.getInt(FIELD_GROUP_INDEX, -1);
            int[] intArray = bundle.getIntArray(FIELD_TRACKS);
            int i12 = bundle.getInt(FIELD_TRACK_TYPE, -1);
            Assertions.checkArgument(i11 >= 0 && i12 >= 0);
            Assertions.checkNotNull(intArray);
            return new SelectionOverride(i11, intArray, i12);
        }

        public boolean containsTrack(int i11) {
            for (int i12 : this.tracks) {
                if (i12 == i11) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.groupIndex * 31) + Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        @UnstableApi
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(FIELD_GROUP_INDEX, this.groupIndex);
            bundle.putIntArray(FIELD_TRACKS, this.tracks);
            bundle.putInt(FIELD_TRACK_TYPE, this.type);
            return bundle;
        }
    }

    @RequiresApi(32)
    public static class SpatializerWrapperV32 {

        @Nullable
        private Handler handler;

        @Nullable
        private Spatializer$OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final Spatializer spatializer;

        @Nullable
        public static SpatializerWrapperV32 tryCreateInstance(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new SpatializerWrapperV32(audioManager.getSpatializer());
        }

        public boolean canBeSpatialized(AudioAttributes audioAttributes, Format format) {
            int i11;
            if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_E_AC3_JOC)) {
                i11 = format.channelCount;
                if (i11 == 16) {
                    i11 = 12;
                }
            } else if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_IAMF)) {
                i11 = format.channelCount;
                if (i11 == -1) {
                    i11 = 6;
                }
            } else if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_AC4)) {
                i11 = format.channelCount;
                if (i11 == 18 || i11 == 21) {
                    i11 = 24;
                }
            } else {
                i11 = format.channelCount;
            }
            int audioTrackChannelConfig = Util.getAudioTrackChannelConfig(i11);
            if (audioTrackChannelConfig == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(audioTrackChannelConfig);
            int i12 = format.sampleRate;
            if (i12 != -1) {
                channelMask.setSampleRate(i12);
            }
            return this.spatializer.canBeSpatialized(audioAttributes.getAudioAttributesV21().audioAttributes, channelMask.build());
        }

        public void ensureInitialized(final DefaultTrackSelector defaultTrackSelector, Looper looper) {
            if (this.listener == null && this.handler == null) {
                this.listener = new Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z11) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }

                    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z11) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }
                };
                Handler handler = new Handler(looper);
                this.handler = handler;
                Spatializer spatializer = this.spatializer;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new ExecutorC2501a(handler), this.listener);
            }
        }

        public boolean isAvailable() {
            return this.spatializer.isAvailable();
        }

        public boolean isEnabled() {
            return this.spatializer.isEnabled();
        }

        public boolean isSpatializationSupported() {
            return this.spatializationSupported;
        }

        public void release() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.listener;
            if (spatializer$OnSpatializerStateChangedListener == null || this.handler == null) {
                return;
            }
            this.spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) Util.castNonNull(this.handler)).removeCallbacksAndMessages(null);
            this.handler = null;
            this.listener = null;
        }

        private SpatializerWrapperV32(Spatializer spatializer) {
            boolean z11;
            this.spatializer = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.spatializationSupported = z11;
        }
    }

    public static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackInfo textTrackInfo) {
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(textTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefault, textTrackInfo.isDefault).compare(Boolean.valueOf(this.isForced), Boolean.valueOf(textTrackInfo.isForced), this.preferredLanguageScore == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                comparisonChainCompare = comparisonChainCompare.compareTrueFirst(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return comparisonChainCompare.result();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        public TextTrackInfo(int i11, TrackGroup trackGroup, int i12, Parameters parameters, int i13, @Nullable String str) {
            boolean z11;
            boolean z12;
            ImmutableList<String> immutableListM13440of;
            int formatLanguageScore;
            boolean z13;
            boolean z14;
            boolean z15;
            super(i11, trackGroup, i12);
            int i14 = 0;
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i13, false);
            int i15 = this.format.selectionFlags & (~parameters.ignoredTextSelectionFlags);
            if ((i15 & 1) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.isDefault = z11;
            if ((i15 & 2) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.isForced = z12;
            if (parameters.preferredTextLanguages.isEmpty()) {
                immutableListM13440of = ImmutableList.m13440of("");
            } else {
                immutableListM13440of = parameters.preferredTextLanguages;
            }
            int i16 = 0;
            while (true) {
                if (i16 < immutableListM13440of.size()) {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, immutableListM13440of.get(i16), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    i16 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                }
            }
            this.preferredLanguageIndex = i16;
            this.preferredLanguageScore = formatLanguageScore;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            if ((this.format.roleFlags & 1088) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.hasCaptionRoleFlags = z13;
            if (DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null) {
                z14 = true;
            } else {
                z14 = false;
            }
            int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, str, z14);
            this.selectedAudioLanguageScore = formatLanguageScore2;
            if (formatLanguageScore <= 0 && ((!parameters.preferredTextLanguages.isEmpty() || roleFlagMatchScore <= 0) && !this.isDefault && (!this.isForced || formatLanguageScore2 <= 0))) {
                z15 = false;
            } else {
                z15 = true;
            }
            if (RendererCapabilities.isFormatSupported(i13, parameters.exceedRendererCapabilitiesIfNecessary) && z15) {
                i14 = 1;
            }
            this.selectionEligibility = i14;
        }

        public static ImmutableList<TextTrackInfo> createForTrackGroup(int i11, TrackGroup trackGroup, Parameters parameters, int[] iArr, @Nullable String str) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i12 = 0; i12 < trackGroup.length; i12++) {
                builder.add(new TextTrackInfo(i11, trackGroup, i12, parameters, iArr[i12], str));
            }
            return builder.build();
        }
    }

    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private static final float MIN_REASONABLE_FRAME_RATE = 10.0f;
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean hasReasonableFrameRate;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            Ordering orderingReverse = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            ComparisonChain comparisonChainStart = ComparisonChain.start();
            if (videoTrackInfo.parameters.forceLowestBitrate) {
                comparisonChainStart = comparisonChainStart.compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse());
            }
            return comparisonChainStart.compare(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), orderingReverse).compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), orderingReverse).result();
        }

        public static ImmutableList<VideoTrackInfo> createForTrackGroup(int i11, TrackGroup trackGroup, Parameters parameters, int[] iArr, int i12) {
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i13 = 0; i13 < trackGroup.length; i13++) {
                int pixelCount = trackGroup.getFormat(i13).getPixelCount();
                builder.add(new VideoTrackInfo(i11, trackGroup, i13, parameters, iArr[i13], i12, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return builder.build();
        }

        private int evaluateSelectionEligibility(int i11, int i12) {
            if ((this.format.roleFlags & 16384) != 0 || !RendererCapabilities.isFormatSupported(i11, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinMaxConstraints && !this.parameters.exceedVideoConstraintsIfNecessary) {
                return 0;
            }
            if (!RendererCapabilities.isFormatSupported(i11, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters = this.parameters;
            return (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || (i11 & i12) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
            if (!this.allowMixedMimeTypes && !Util.areEqual(this.format.sampleMimeType, videoTrackInfo.format.sampleMimeType)) {
                return false;
            }
            if (this.parameters.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public VideoTrackInfo(int i11, TrackGroup trackGroup, int i12, Parameters parameters, int i13, int i14, boolean z11) {
            int i15;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            Format format;
            int i16;
            int i17;
            int i18;
            Format format2;
            int i19;
            int i21;
            int i22;
            super(i11, trackGroup, i12);
            this.parameters = parameters;
            if (parameters.allowVideoNonSeamlessAdaptiveness) {
                i15 = 24;
            } else {
                i15 = 16;
            }
            if (parameters.allowVideoMixedMimeTypeAdaptiveness && (i14 & i15) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.allowMixedMimeTypes = z12;
            if (z11 && (((i19 = (format2 = this.format).width) == -1 || i19 <= parameters.maxVideoWidth) && ((i21 = format2.height) == -1 || i21 <= parameters.maxVideoHeight))) {
                float f11 = format2.frameRate;
                if ((f11 == -1.0f || f11 <= parameters.maxVideoFrameRate) && ((i22 = format2.bitrate) == -1 || i22 <= parameters.maxVideoBitrate)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            this.isWithinMaxConstraints = z13;
            if (z11 && (((i16 = (format = this.format).width) == -1 || i16 >= parameters.minVideoWidth) && ((i17 = format.height) == -1 || i17 >= parameters.minVideoHeight))) {
                float f12 = format.frameRate;
                if ((f12 == -1.0f || f12 >= parameters.minVideoFrameRate) && ((i18 = format.bitrate) == -1 || i18 >= parameters.minVideoBitrate)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            this.isWithinMinConstraints = z14;
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i13, false);
            Format format3 = this.format;
            float f13 = format3.frameRate;
            if (f13 != -1.0f && f13 >= 10.0f) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.hasReasonableFrameRate = z15;
            this.bitrate = format3.bitrate;
            this.pixelCount = format3.getPixelCount();
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredVideoRoleFlags);
            int i23 = this.format.roleFlags;
            if (i23 != 0 && (i23 & 1) == 0) {
                z16 = false;
            } else {
                z16 = true;
            }
            this.hasMainOrNoRoleFlag = z16;
            int i24 = 0;
            while (true) {
                if (i24 < parameters.preferredVideoMimeTypes.size()) {
                    String str = this.format.sampleMimeType;
                    if (str != null && str.equals(parameters.preferredVideoMimeTypes.get(i24))) {
                        break;
                    } else {
                        i24++;
                    }
                } else {
                    i24 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i24;
            if (RendererCapabilities.getDecoderSupport(i13) == 128) {
                z17 = true;
            } else {
                z17 = false;
            }
            this.usesPrimaryDecoder = z17;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i13) == 64;
            this.codecPreferenceScore = DefaultTrackSelector.getVideoCodecPreferenceScore(this.format.sampleMimeType);
            this.selectionEligibility = evaluateSelectionEligibility(i13, i15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            ComparisonChain comparisonChainCompareFalseFirst = ComparisonChain.start().compareFalseFirst(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).compare(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).compareFalseFirst(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).compareFalseFirst(videoTrackInfo.hasReasonableFrameRate, videoTrackInfo2.hasReasonableFrameRate).compareFalseFirst(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).compareFalseFirst(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).compare(Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), Ordering.natural().reverse()).compareFalseFirst(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).compareFalseFirst(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                comparisonChainCompareFalseFirst = comparisonChainCompareFalseFirst.compare(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return comparisonChainCompareFalseFirst.result();
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
            return ComparisonChain.start().compare((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareNonQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).compare(list.size(), list2.size()).compare((VideoTrackInfo) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), (VideoTrackInfo) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return DefaultTrackSelector.VideoTrackInfo.compareQualityPreferences((DefaultTrackSelector.VideoTrackInfo) obj, (DefaultTrackSelector.VideoTrackInfo) obj2);
                }
            }).result();
        }
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, TrackSelectionParameters trackSelectionParameters, Map<Integer, TrackSelectionOverride> map) {
        TrackSelectionOverride trackSelectionOverride;
        for (int i11 = 0; i11 < trackGroupArray.length; i11++) {
            TrackSelectionOverride trackSelectionOverride2 = trackSelectionParameters.overrides.get(trackGroupArray.get(i11));
            if (trackSelectionOverride2 != null && ((trackSelectionOverride = map.get(Integer.valueOf(trackSelectionOverride2.getType()))) == null || (trackSelectionOverride.trackIndices.isEmpty() && !trackSelectionOverride2.trackIndices.isEmpty()))) {
                map.put(Integer.valueOf(trackSelectionOverride2.getType()), trackSelectionOverride2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    private static boolean isDolbyAudio(Format format) {
        String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac3":
            case "audio/ac4":
            case "audio/eac3":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isObjectBasedAudio(Format format) {
        String str = format.sampleMimeType;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/ac4":
            case "audio/iamf":
                return true;
            default:
                return false;
        }
    }

    private static void maybeConfigureRendererForOffload(Parameters parameters, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int i11 = -1;
        boolean z11 = false;
        int i12 = 0;
        for (int i13 = 0; i13 < mappedTrackInfo.getRendererCount(); i13++) {
            int rendererType = mappedTrackInfo.getRendererType(i13);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i13];
            if (rendererType != 1 && exoTrackSelection != null) {
                return;
            }
            if (rendererType == 1 && exoTrackSelection != null && exoTrackSelection.length() == 1) {
                if (rendererSupportsOffload(parameters, iArr[i13][mappedTrackInfo.getTrackGroups(i13).indexOf(exoTrackSelection.getTrackGroup())][exoTrackSelection.getIndexInTrackGroup(0)], exoTrackSelection.getSelectedFormat())) {
                    i12++;
                    i11 = i13;
                }
            }
        }
        if (i12 == 1) {
            int i14 = parameters.audioOffloadPreferences.isGaplessSupportRequired ? 1 : 2;
            RendererConfiguration rendererConfiguration = rendererConfigurationArr[i11];
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                z11 = true;
            }
            rendererConfigurationArr[i11] = new RendererConfiguration(i14, z11);
        }
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z11;
        int i11 = -1;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            if (i13 >= mappedTrackInfo.getRendererCount()) {
                z11 = true;
                break;
            }
            int rendererType = mappedTrackInfo.getRendererType(i13);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i13];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i13], mappedTrackInfo.getTrackGroups(i13), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i12 != -1) {
                        z11 = false;
                        break;
                    }
                    i12 = i13;
                } else {
                    if (i11 != -1) {
                        z11 = false;
                        break;
                    }
                    i11 = i13;
                }
            }
            i13++;
        }
        if (z11 && ((i12 == -1 || i11 == -1) ? false : true)) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(0, true);
            rendererConfigurationArr[i12] = rendererConfiguration;
            rendererConfigurationArr[i11] = rendererConfiguration;
        }
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i11 = 0; i11 < exoTrackSelection.length(); i11++) {
            if (RendererCapabilities.getTunnelingSupport(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i11)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        final boolean z11 = false;
        for (int i11 = 0; i11 < mappedTrackInfo.getRendererCount(); i11++) {
            if (2 == mappedTrackInfo.getRendererType(i11) && mappedTrackInfo.getTrackGroups(i11).length > 0) {
                z11 = true;
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.f
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i12, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.m3465c(this.f3419a, parameters, z11, iArr2, i12, trackGroup, iArr3);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.AudioTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        setParametersInternal(new Parameters.Builder().set(trackSelectionParameters).build());
    }

    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final Format format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i11, TrackGroup trackGroup, int[] iArr);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t11);

        public TrackInfo(int i11, TrackGroup trackGroup, int i12) {
            this.rendererIndex = i11;
            this.trackGroup = trackGroup;
            this.trackIndex = i12;
            this.format = trackGroup.getFormat(i12);
        }
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(context, Parameters.getDefaults(context), factory);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i11, int i12) {
        if (i11 == 0 || i11 != i12) {
            return Integer.bitCount(i11 & i12);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(Format format) {
        boolean z11;
        int i11;
        SpatializerWrapperV32 spatializerWrapperV32;
        SpatializerWrapperV32 spatializerWrapperV33;
        synchronized (this.lock) {
            try {
                if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && (i11 = format.channelCount) != -1 && i11 > 2 && (!isDolbyAudio(format) || (Util.SDK_INT >= 32 && (spatializerWrapperV33 = this.spatializer) != null && spatializerWrapperV33.isSpatializationSupported()))) {
                    z11 = Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, format);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z11;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                z11 = this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            invalidate();
        }
    }

    private void maybeInvalidateForRendererCapabilitiesChange(Renderer renderer) {
        boolean z11;
        synchronized (this.lock) {
            z11 = this.parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
        }
        if (z11) {
            invalidateForRendererCapabilitiesChange(renderer);
        }
    }

    @Nullable
    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i11, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i12;
        RandomAccess randomAccessM13440of;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo2.getRendererCount();
        int i13 = 0;
        while (i13 < rendererCount) {
            if (i11 == mappedTrackInfo2.getRendererType(i13)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i13);
                for (int i14 = 0; i14 < trackGroups.length; i14++) {
                    TrackGroup trackGroup = trackGroups.get(i14);
                    List<T> listCreate = factory.create(i13, trackGroup, iArr[i13][i14]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i15 = 0;
                    while (i15 < trackGroup.length) {
                        T t11 = listCreate.get(i15);
                        int selectionEligibility = t11.getSelectionEligibility();
                        if (zArr[i15] || selectionEligibility == 0) {
                            i12 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessM13440of = ImmutableList.m13440of(t11);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t11);
                                int i16 = i15 + 1;
                                while (i16 < trackGroup.length) {
                                    T t12 = listCreate.get(i16);
                                    int i17 = rendererCount;
                                    if (t12.getSelectionEligibility() == 2 && t11.isCompatibleForAdaptationWith(t12)) {
                                        arrayList2.add(t12);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    rendererCount = i17;
                                }
                                randomAccessM13440of = arrayList2;
                            }
                            i12 = rendererCount;
                            arrayList.add(randomAccessM13440of);
                        }
                        i15++;
                        rendererCount = i12;
                    }
                }
            }
            i13++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((TrackInfo) list.get(i18)).trackIndex;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), Integer.valueOf(trackInfo.rendererIndex));
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public Parameters getParameters() {
        Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void release() {
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                if (Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                    spatializerWrapperV32.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super.release();
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, Integer> selectImageTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final Parameters parameters) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(4, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.d
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i11, TrackGroup trackGroup, int[] iArr2) {
                return DefaultTrackSelector.ImageTrackInfo.createForTrackGroup(i11, trackGroup, parameters, iArr2);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.ImageTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Nullable
    public ExoTrackSelection.Definition selectOtherTrack(int i11, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        int i12 = 0;
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        for (int i13 = 0; i13 < trackGroupArray.length; i13++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < trackGroup2.length; i14++) {
                if (RendererCapabilities.isFormatSupported(iArr2[i14], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i14), iArr2[i14]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i12 = i14;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i12);
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final Parameters parameters, @Nullable final String str) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(3, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.j
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i11, TrackGroup trackGroup, int[] iArr2) {
                return DefaultTrackSelector.TextTrackInfo.createForTrackGroup(i11, trackGroup, parameters, iArr2, str);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.TextTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        Parameters parameters;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                parameters = this.parameters;
                if (parameters.constrainAudioChannelCountToDeviceCapabilities && Util.SDK_INT >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                    spatializerWrapperV32.ensureInitialized(this, (Looper) Assertions.checkStateNotNull(Looper.myLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        for (int i11 = 0; i11 < rendererCount; i11++) {
            int rendererType = mappedTrackInfo.getRendererType(i11);
            if (parameters.getRendererDisabled(i11) || parameters.disabledTrackTypes.contains(Integer.valueOf(rendererType))) {
                definitionArrSelectAllTracks[i11] = null;
            }
        }
        ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i12 = 0; i12 < rendererCount; i12++) {
            rendererConfigurationArr[i12] = (parameters.getRendererDisabled(i12) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i12))) || (mappedTrackInfo.getRendererType(i12) != -2 && exoTrackSelectionArrCreateTrackSelections[i12] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        if (parameters.audioOffloadPreferences.audioOffloadMode != 0) {
            maybeConfigureRendererForOffload(parameters, mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) throws ExoPlaybackException {
        if (parameters.audioOffloadPreferences.audioOffloadMode == 2) {
            return null;
        }
        return selectTracksForType(2, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.h
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i11, TrackGroup trackGroup, int[] iArr3) {
                return DefaultTrackSelector.VideoTrackInfo.createForTrackGroup(i11, trackGroup, parameters, iArr3, iArr2[i11]);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return DefaultTrackSelector.VideoTrackInfo.compareSelections((List) obj, (List) obj2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        boolean zEquals;
        synchronized (this.lock) {
            zEquals = this.audioAttributes.equals(audioAttributes);
            this.audioAttributes = audioAttributes;
        }
        if (zEquals) {
            return;
        }
        maybeInvalidateForAudioChannelCountConstraints();
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters) {
        this(context, trackSelectionParameters, new AdaptiveTrackSelection.Factory());
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        ExoTrackSelection.Definition definition;
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i11 = 0; i11 < rendererCount; i11++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i11);
            if (parameters.hasSelectionOverride(i11, trackGroups)) {
                SelectionOverride selectionOverride = parameters.getSelectionOverride(i11, trackGroups);
                if (selectionOverride != null && selectionOverride.tracks.length != 0) {
                    definition = new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
                } else {
                    definition = null;
                }
                definitionArr[i11] = definition;
            }
        }
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Definition[] definitionArr) {
        ExoTrackSelection.Definition definition;
        int rendererCount = mappedTrackInfo.getRendererCount();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < rendererCount; i11++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i11), trackSelectionParameters, map);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), trackSelectionParameters, map);
        for (int i12 = 0; i12 < rendererCount; i12++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(Integer.valueOf(mappedTrackInfo.getRendererType(i12)));
            if (trackSelectionOverride != null) {
                if (!trackSelectionOverride.trackIndices.isEmpty() && mappedTrackInfo.getTrackGroups(i12).indexOf(trackSelectionOverride.mediaTrackGroup) != -1) {
                    definition = new ExoTrackSelection.Definition(trackSelectionOverride.mediaTrackGroup, Ints.toArray(trackSelectionOverride.trackIndices));
                } else {
                    definition = null;
                }
                definitionArr[i12] = definition;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m3465c(final DefaultTrackSelector defaultTrackSelector, Parameters parameters, boolean z11, int[] iArr, int i11, TrackGroup trackGroup, int[] iArr2) {
        defaultTrackSelector.getClass();
        return AudioTrackInfo.createForTrackGroup(i11, trackGroup, parameters, iArr2, z11, new Predicate() { // from class: androidx.media3.exoplayer.trackselection.c
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                return this.f3417b.isAudioFormatWithinAudioChannelCountConstraints((Format) obj);
            }
        }, iArr[i11]);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m3467e(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() != -1) {
                return -1;
            }
            return 0;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static int getFormatLanguageScore(Format format, @Nullable String str, boolean z11) {
        if (!TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 != null && strNormalizeUndeterminedLanguageToNull != null) {
            if (!strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) && !strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
                if (!Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, C33820nf.f71144W)[0].equals(Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, C33820nf.f71144W)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z11 || strNormalizeUndeterminedLanguageToNull2 != null) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i11, int i12, boolean z11) {
        int i13;
        int i14 = Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
            for (int i15 = 0; i15 < trackGroup.length; i15++) {
                Format format = trackGroup.getFormat(i15);
                int i16 = format.width;
                if (i16 > 0 && (i13 = format.height) > 0) {
                    Point maxVideoSizeInViewport = TrackSelectionUtil.getMaxVideoSizeInViewport(z11, i11, i12, i16, i13);
                    int i17 = format.width;
                    int i18 = format.height;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i18 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
        }
        return i14;
    }

    @Deprecated
    public static boolean isSupported(int i11, boolean z11) {
        return RendererCapabilities.isFormatSupported(i11, z11);
    }

    @Nullable
    public static String normalizeUndeterminedLanguageToNull(@Nullable String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, C2711C.LANGUAGE_UNDETERMINED)) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rendererSupportsOffload(Parameters parameters, int i11, Format format) {
        boolean z11;
        boolean z12;
        if (RendererCapabilities.getAudioOffloadSupport(i11) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isSpeedChangeSupportRequired && (RendererCapabilities.getAudioOffloadSupport(i11) & 2048) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.isGaplessSupportRequired) {
            if (format.encoderDelay == 0 && format.encoderPadding == 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if ((RendererCapabilities.getAudioOffloadSupport(i11) & 1024) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z11 && !z12) {
                return false;
            }
        }
        return true;
    }

    private void setParametersInternal(Parameters parameters) {
        boolean zEquals;
        Assertions.checkNotNull(parameters);
        synchronized (this.lock) {
            zEquals = this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (!zEquals) {
            if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
                Log.m2961w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
            }
            invalidate();
        }
    }

    public Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        maybeInvalidateForRendererCapabilitiesChange(renderer);
    }

    public ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) throws ExoPlaybackException {
        Pair<ExoTrackSelection.Definition, Integer> pairSelectImageTrack;
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        Pair<ExoTrackSelection.Definition, Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        String str = null;
        if (!parameters.isPrioritizeImageOverVideoEnabled && pairSelectVideoTrack != null) {
            pairSelectImageTrack = null;
        } else {
            pairSelectImageTrack = selectImageTrack(mappedTrackInfo, iArr, parameters);
        }
        if (pairSelectImageTrack != null) {
            definitionArr[((Integer) pairSelectImageTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectImageTrack.first;
        } else if (pairSelectVideoTrack != null) {
            definitionArr[((Integer) pairSelectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectVideoTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectAudioTrack != null) {
            definitionArr[((Integer) pairSelectAudioTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectAudioTrack.first;
        }
        if (pairSelectAudioTrack != null) {
            Object obj = pairSelectAudioTrack.first;
            str = ((ExoTrackSelection.Definition) obj).group.getFormat(((ExoTrackSelection.Definition) obj).tracks[0]).language;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, str);
        if (pairSelectTextTrack != null) {
            definitionArr[((Integer) pairSelectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        for (int i11 = 0; i11 < rendererCount; i11++) {
            int rendererType = mappedTrackInfo.getRendererType(i11);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3 && rendererType != 4) {
                definitionArr[i11] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i11), iArr[i11], parameters);
            }
        }
        return definitionArr;
    }

    @Deprecated
    public DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, (Context) null);
    }

    public DefaultTrackSelector(Context context, TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory) {
        this(trackSelectionParameters, factory, context);
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    private DefaultTrackSelector(TrackSelectionParameters trackSelectionParameters, ExoTrackSelection.Factory factory, @Nullable Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (trackSelectionParameters instanceof Parameters) {
            this.parameters = (Parameters) trackSelectionParameters;
        } else {
            this.parameters = (context == null ? Parameters.DEFAULT_WITHOUT_CONTEXT : Parameters.getDefaults(context)).buildUpon().set(trackSelectionParameters).build();
        }
        this.audioAttributes = AudioAttributes.DEFAULT;
        boolean z11 = context != null && Util.isTv(context);
        this.deviceIsTV = z11;
        if (!z11 && context != null && Util.SDK_INT >= 32) {
            this.spatializer = SpatializerWrapperV32.tryCreateInstance(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            Log.m2961w(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    public void setParameters(Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    @Nullable
    public RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return this;
    }
}
