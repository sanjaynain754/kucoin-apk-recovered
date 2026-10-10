package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.C2711C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.StreamKey;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.manifest.ServiceDescriptionElement;
import androidx.media3.exoplayer.dash.manifest.UtcTimingElement;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManagerProvider;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.offline.FilteringManifestParser;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.CompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.DefaultCompositeSequenceableLoaderFactory;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.MediaSourceFactory;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.LoaderErrorThrower;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.util.SntpClient;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.math.LongMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class DashMediaSource extends BaseMediaSource {
    public static final long DEFAULT_FALLBACK_TARGET_LIVE_OFFSET_MS = 30000;
    public static final String DEFAULT_MEDIA_ID = "DashMediaSource";
    private static final long DEFAULT_NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    public static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final String TAG = "DashMediaSource";
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final DashChunkSource.Factory chunkSourceFactory;

    @Nullable
    private final CmcdConfiguration cmcdConfiguration;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private final DrmSessionManager drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private final long fallbackTargetLiveOffsetMs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private MediaItem.LiveConfiguration liveConfiguration;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;

    @GuardedBy("this")
    private MediaItem mediaItem;

    @Nullable
    private TransferListener mediaTransferListener;
    private final long minLiveStartPositionUs;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    public static final class DashTimeline extends Timeline {
        private final long elapsedRealtimeEpochOffsetMs;
        private final int firstPeriodId;

        @Nullable
        private final MediaItem.LiveConfiguration liveConfiguration;
        private final DashManifest manifest;
        private final MediaItem mediaItem;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i11) {
            Assertions.checkIndex(i11, 0, getPeriodCount());
            return Integer.valueOf(this.firstPeriodId + i11);
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        public DashTimeline(long j11, long j12, long j13, int i11, long j14, long j15, long j16, DashManifest dashManifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
            Assertions.checkState(dashManifest.dynamic == (liveConfiguration != null));
            this.presentationStartTimeMs = j11;
            this.windowStartTimeMs = j12;
            this.elapsedRealtimeEpochOffsetMs = j13;
            this.firstPeriodId = i11;
            this.offsetInFirstPeriodUs = j14;
            this.windowDurationUs = j15;
            this.windowDefaultStartPositionUs = j16;
            this.manifest = dashManifest;
            this.mediaItem = mediaItem;
            this.liveConfiguration = liveConfiguration;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j11) {
            DashSegmentIndex index;
            long j12 = this.windowDefaultStartPositionUs;
            if (!isMovingLiveWindow(this.manifest)) {
                return j12;
            }
            if (j11 > 0) {
                j12 += j11;
                if (j12 > this.windowDurationUs) {
                    return C2711C.TIME_UNSET;
                }
            }
            long j13 = this.offsetInFirstPeriodUs + j12;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i11 = 0;
            while (i11 < this.manifest.getPeriodCount() - 1 && j13 >= periodDurationUs) {
                j13 -= periodDurationUs;
                i11++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i11);
            }
            Period period = this.manifest.getPeriod(i11);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j12 : (j12 + index.getTimeUs(index.getSegmentNum(j13, periodDurationUs))) - j13;
        }

        private static boolean isMovingLiveWindow(DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != C2711C.TIME_UNSET && dashManifest.durationMs == C2711C.TIME_UNSET;
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.firstPeriodId) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i11, Timeline.Window window, long j11) {
            Assertions.checkIndex(i11, 0, 1);
            long adjustedWindowDefaultStartPositionUs = getAdjustedWindowDefaultStartPositionUs(j11);
            Object obj = Timeline.Window.SINGLE_WINDOW_UID;
            MediaItem mediaItem = this.mediaItem;
            DashManifest dashManifest = this.manifest;
            return window.set(obj, mediaItem, dashManifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, true, isMovingLiveWindow(dashManifest), this.liveConfiguration, adjustedWindowDefaultStartPositionUs, this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i11, Timeline.Period period, boolean z11) {
            String str;
            Assertions.checkIndex(i11, 0, getPeriodCount());
            Integer numValueOf = null;
            if (z11) {
                str = this.manifest.getPeriod(i11).f3166id;
            } else {
                str = null;
            }
            if (z11) {
                numValueOf = Integer.valueOf(this.firstPeriodId + i11);
            }
            return period.set(str, numValueOf, 0, this.manifest.getPeriodDurationUs(i11), Util.msToUs(this.manifest.getPeriod(i11).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }
    }

    public final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j11) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j11);
        }

        @Override // androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }
    }

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int f3161a = 0;
        private final DashChunkSource.Factory chunkSourceFactory;
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private long fallbackTargetLiveOffsetMs;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @Nullable
        private final DataSource.Factory manifestDataSourceFactory;

        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;
        private long minLiveStartPositionUs;

        public Factory(DataSource.Factory factory) {
            this(new DefaultDashChunkSource.Factory(factory), factory);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory(DashChunkSource.Factory factory, @Nullable DataSource.Factory factory2) {
            this.chunkSourceFactory = (DashChunkSource.Factory) Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
            this.drmSessionManagerProvider = new DefaultDrmSessionManagerProvider();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.fallbackTargetLiveOffsetMs = 30000L;
            this.minLiveStartPositionUs = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
            experimentalParseSubtitlesDuringExtraction(true);
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
            return createMediaSource(dashManifest, new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId("DashMediaSource").setMimeType(MimeTypes.APPLICATION_MPD).build());
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        @Deprecated
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z11) {
            this.chunkSourceFactory.experimentalParseSubtitlesDuringExtraction(z11);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = (CmcdConfiguration.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory, "DashMediaSource.Factory#setCompositeSequenceableLoaderFactory no longer handles null by instantiating a new DefaultCompositeSequenceableLoaderFactory. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = (DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setFallbackTargetLiveOffsetMs(long j11) {
            this.fallbackTargetLiveOffsetMs = j11;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setManifestParser(@Nullable ParsingLoadable.Parser<? extends DashManifest> parser) {
            this.manifestParser = parser;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setMinLiveStartPositionUs(long j11) {
            this.minLiveStartPositionUs = j11;
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        @CanIgnoreReturnValue
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.chunkSourceFactory.setSubtitleParserFactory((SubtitleParser.Factory) Assertions.checkNotNull(factory));
            return this;
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest, MediaItem mediaItem) {
            Assertions.checkArgument(!dashManifest.dynamic);
            MediaItem.Builder mimeType = mediaItem.buildUpon().setMimeType(MimeTypes.APPLICATION_MPD);
            if (mediaItem.localConfiguration == null) {
                mimeType.setUri(Uri.EMPTY);
            }
            MediaItem mediaItemBuild = mimeType.build();
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(mediaItemBuild, dashManifest, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItemBuild), this.drmSessionManagerProvider.get(mediaItemBuild), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public DashMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            ParsingLoadable.Parser dashManifestParser = this.manifestParser;
            if (dashManifestParser == null) {
                dashManifestParser = new DashManifestParser();
            }
            List<StreamKey> list = mediaItem.localConfiguration.streamKeys;
            ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
            CmcdConfiguration.Factory factory = this.cmcdConfigurationFactory;
            return new DashMediaSource(mediaItem, null, this.manifestDataSourceFactory, filteringManifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, factory == null ? null : factory.createCmcdConfiguration(mediaItem), this.drmSessionManagerProvider.get(mediaItem), this.loadErrorHandlingPolicy, this.fallbackTargetLiveOffsetMs, this.minLiveStartPositionUs);
        }
    }

    public static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).readLine();
            try {
                Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(line);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Couldn't parse timestamp: " + line, null);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j11 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j12 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j11 * (((j12 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e11) {
                throw ParserException.createForMalformedManifest(null, e11);
            }
        }
    }

    public final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private ManifestCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j11, long j12, boolean z11) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j11, long j12) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j11, long j12, IOException iOException, int i11) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j11, j12, iOException, i11);
        }
    }

    public final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        public ManifestLoadErrorThrower() {
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
        public void maybeThrowError(int i11) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i11);
            maybeThrowManifestError();
        }
    }

    public final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        private UtcTimestampCallback() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j11, long j12, boolean z11) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j11, long j12) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j11, j12);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j11, long j12, IOException iOException, int i11) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j11, j12, iOException);
        }
    }

    public static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    private static boolean hasVideoOrAudioAdaptationSets(Period period) {
        for (int i11 = 0; i11 < period.adaptationSets.size(); i11++) {
            int i12 = period.adaptationSets.get(i11).type;
            if (i12 == 1 || i12 == 2) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIndexExplicit(Period period) {
        for (int i11 = 0; i11 < period.adaptationSets.size(); i11++) {
            DashSegmentIndex index = period.adaptationSets.get(i11).representations.get(0).getIndex();
            if (index == null || index.isExplicit()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = C2711C.TIME_UNSET;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = C2711C.TIME_UNSET;
        this.periodsById.clear();
        this.baseUrlExclusionList.reset();
        this.drmSessionManager.release();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    static {
        MediaLibraryInfo.registerModule("media3.exoplayer.dash");
    }

    private DashMediaSource(MediaItem mediaItem, @Nullable DashManifest dashManifest, @Nullable DataSource.Factory factory, @Nullable ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, @Nullable CmcdConfiguration cmcdConfiguration, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j11, long j12) {
        this.mediaItem = mediaItem;
        this.liveConfiguration = mediaItem.liveConfiguration;
        this.manifestUri = ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
        this.initialManifestUri = mediaItem.localConfiguration.uri;
        this.manifest = dashManifest;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.cmcdConfiguration = cmcdConfiguration;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.fallbackTargetLiveOffsetMs = j11;
        this.minLiveStartPositionUs = j12;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.baseUrlExclusionList = new BaseUrlExclusionList();
        boolean z11 = dashManifest != null;
        this.sideloadedManifest = z11;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = C2711C.TIME_UNSET;
        this.elapsedRealtimeOffsetMs = C2711C.TIME_UNSET;
        if (!z11) {
            this.manifestCallback = new ManifestCallback();
            this.manifestLoadErrorThrower = new ManifestLoadErrorThrower();
            this.refreshManifestRunnable = new Runnable() { // from class: androidx.media3.exoplayer.dash.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3162b.startLoadingManifest();
                }
            };
            this.simulateManifestRefreshRunnable = new Runnable() { // from class: androidx.media3.exoplayer.dash.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3163b.processManifest(false);
                }
            };
            return;
        }
        Assertions.checkState(true ^ dashManifest.dynamic);
        this.manifestCallback = null;
        this.refreshManifestRunnable = null;
        this.simulateManifestRefreshRunnable = null;
        this.manifestLoadErrorThrower = new LoaderErrorThrower.Placeholder();
    }

    private static long getAvailableEndTimeInManifestUs(Period period, long j11, long j12) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMin = Long.MAX_VALUE;
        for (int i11 = 0; i11 < period.adaptationSets.size(); i11++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i11);
            List<Representation> list = adaptationSet.representations;
            int i12 = adaptationSet.type;
            boolean z11 = (i12 == 1 || i12 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z11) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null) {
                    return jMsToUs + j11;
                }
                long availableSegmentCount = index.getAvailableSegmentCount(j11, j12);
                if (availableSegmentCount == 0) {
                    return jMsToUs;
                }
                long firstAvailableSegmentNum = (index.getFirstAvailableSegmentNum(j11, j12) + availableSegmentCount) - 1;
                jMin = Math.min(jMin, index.getDurationUs(firstAvailableSegmentNum, j11) + index.getTimeUs(firstAvailableSegmentNum) + jMsToUs);
            }
        }
        return jMin;
    }

    private static long getAvailableStartTimeInManifestUs(Period period, long j11, long j12) {
        long jMsToUs = Util.msToUs(period.startMs);
        boolean zHasVideoOrAudioAdaptationSets = hasVideoOrAudioAdaptationSets(period);
        long jMax = jMsToUs;
        for (int i11 = 0; i11 < period.adaptationSets.size(); i11++) {
            AdaptationSet adaptationSet = period.adaptationSets.get(i11);
            List<Representation> list = adaptationSet.representations;
            int i12 = adaptationSet.type;
            boolean z11 = (i12 == 1 || i12 == 2) ? false : true;
            if ((!zHasVideoOrAudioAdaptationSets || !z11) && !list.isEmpty()) {
                DashSegmentIndex index = list.get(0).getIndex();
                if (index == null || index.getAvailableSegmentCount(j11, j12) == 0) {
                    return jMsToUs;
                }
                jMax = Math.max(jMax, index.getTimeUs(index.getFirstAvailableSegmentNum(j11, j12)) + jMsToUs);
            }
        }
        return jMax;
    }

    private static long getIntervalUntilNextManifestRefreshMs(DashManifest dashManifest, long j11) {
        DashSegmentIndex index;
        int periodCount = dashManifest.getPeriodCount() - 1;
        Period period = dashManifest.getPeriod(periodCount);
        long jMsToUs = Util.msToUs(period.startMs);
        long periodDurationUs = dashManifest.getPeriodDurationUs(periodCount);
        long jMsToUs2 = Util.msToUs(j11);
        long jMsToUs3 = Util.msToUs(dashManifest.availabilityStartTimeMs);
        long jMsToUs4 = Util.msToUs(5000L);
        for (int i11 = 0; i11 < period.adaptationSets.size(); i11++) {
            List<Representation> list = period.adaptationSets.get(i11).representations;
            if (!list.isEmpty() && (index = list.get(0).getIndex()) != null) {
                long nextSegmentAvailableTimeUs = ((jMsToUs3 + jMsToUs) + index.getNextSegmentAvailableTimeUs(periodDurationUs, jMsToUs2)) - jMsToUs2;
                if (nextSegmentAvailableTimeUs < jMsToUs4 - SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US || (nextSegmentAvailableTimeUs > jMsToUs4 && nextSegmentAvailableTimeUs < jMsToUs4 + SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US)) {
                    jMsToUs4 = nextSegmentAvailableTimeUs;
                }
            }
        }
        return LongMath.divide(jMsToUs4, 1000L, RoundingMode.CEILING);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private void loadNtpTimeOffset() {
        SntpClient.initialize(this.loader, new SntpClient.InitializationCallback() { // from class: androidx.media3.exoplayer.dash.DashMediaSource.1
            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitializationFailed(IOException iOException) {
                DashMediaSource.this.onUtcTimestampResolutionError(iOException);
            }

            @Override // androidx.media3.exoplayer.util.SntpClient.InitializationCallback
            public void onInitialized() {
                DashMediaSource.this.onUtcTimestampResolved(SntpClient.getElapsedRealtimeOffsetMs());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolutionError(IOException iOException) {
        Log.m2958e("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.elapsedRealtimeOffsetMs = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUtcTimestampResolved(long j11) {
        this.elapsedRealtimeOffsetMs = j11;
        processManifest(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processManifest(boolean z11) {
        long j11;
        long j12;
        long j13;
        for (int i11 = 0; i11 < this.periodsById.size(); i11++) {
            int iKeyAt = this.periodsById.keyAt(i11);
            if (iKeyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i11).updateManifest(this.manifest, iKeyAt - this.firstPeriodId);
            }
        }
        Period period = this.manifest.getPeriod(0);
        int periodCount = this.manifest.getPeriodCount() - 1;
        Period period2 = this.manifest.getPeriod(periodCount);
        long periodDurationUs = this.manifest.getPeriodDurationUs(periodCount);
        long jMsToUs = Util.msToUs(Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs));
        long availableStartTimeInManifestUs = getAvailableStartTimeInManifestUs(period, this.manifest.getPeriodDurationUs(0), jMsToUs);
        long availableEndTimeInManifestUs = getAvailableEndTimeInManifestUs(period2, periodDurationUs, jMsToUs);
        boolean z12 = this.manifest.dynamic && !isIndexExplicit(period2);
        if (z12) {
            long j14 = this.manifest.timeShiftBufferDepthMs;
            if (j14 != C2711C.TIME_UNSET) {
                availableStartTimeInManifestUs = Math.max(availableStartTimeInManifestUs, availableEndTimeInManifestUs - Util.msToUs(j14));
            }
        }
        long j15 = availableEndTimeInManifestUs - availableStartTimeInManifestUs;
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            Assertions.checkState(dashManifest.availabilityStartTimeMs != C2711C.TIME_UNSET);
            long jMsToUs2 = (jMsToUs - Util.msToUs(this.manifest.availabilityStartTimeMs)) - availableStartTimeInManifestUs;
            updateLiveConfiguration(jMsToUs2, j15);
            long jUsToMs = this.manifest.availabilityStartTimeMs + Util.usToMs(availableStartTimeInManifestUs);
            long jMsToUs3 = jMsToUs2 - Util.msToUs(this.liveConfiguration.targetOffsetMs);
            j11 = 0;
            long jMin = Math.min(this.minLiveStartPositionUs, j15 / 2);
            j12 = jUsToMs;
            j13 = jMsToUs3 < jMin ? jMin : jMsToUs3;
        } else {
            j11 = 0;
            j12 = -9223372036854775807L;
            j13 = 0;
        }
        long jMsToUs4 = availableStartTimeInManifestUs - Util.msToUs(period.startMs);
        DashManifest dashManifest2 = this.manifest;
        refreshSourceInfo(new DashTimeline(dashManifest2.availabilityStartTimeMs, j12, this.elapsedRealtimeOffsetMs, this.firstPeriodId, jMsToUs4, j15, j13, dashManifest2, getMediaItem(), this.manifest.dynamic ? this.liveConfiguration : null));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        if (z12) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, getIntervalUntilNextManifestRefreshMs(this.manifest, Util.getNowUnixTimeMs(this.elapsedRealtimeOffsetMs)));
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z11) {
            DashManifest dashManifest3 = this.manifest;
            if (dashManifest3.dynamic) {
                long j16 = dashManifest3.minUpdatePeriodMs;
                if (j16 != C2711C.TIME_UNSET) {
                    if (j16 == j11) {
                        j16 = 5000;
                    }
                    scheduleManifestRefresh(Math.max(j11, (this.manifestLoadStartTimestampMs + j16) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        String str = utcTimingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new Iso8601Parser());
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            resolveUtcTimingElementHttp(utcTimingElement, new XsDateTimeParser());
        } else if (Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:ntp:2012")) {
            loadNtpTimeOffset();
        } else {
            onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
        }
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (ParserException e11) {
            onUtcTimestampResolutionError(e11);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new UtcTimestampCallback(), 1);
    }

    private void scheduleManifestRefresh(long j11) {
        this.handler.postDelayed(this.refreshManifestRunnable, j11);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i11) {
        this.manifestEventDispatcher.loadStarted(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, this.loader.startLoading(parsingLoadable, callback, i11)), parsingLoadable.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.hasFatalError()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    private void updateLiveConfiguration(long j11, long j12) {
        long j13;
        long jMin;
        long jUsToMs;
        long j14;
        long jConstrainValue;
        long j15;
        ServiceDescriptionElement serviceDescriptionElement;
        long j16;
        long j17;
        long j18;
        long jConstrainValue2;
        float f11;
        float f12;
        ServiceDescriptionElement serviceDescriptionElement2;
        ServiceDescriptionElement serviceDescriptionElement3;
        ServiceDescriptionElement serviceDescriptionElement4;
        DashManifest dashManifest;
        ServiceDescriptionElement serviceDescriptionElement5;
        long j19;
        MediaItem.LiveConfiguration liveConfiguration = getMediaItem().liveConfiguration;
        long jUsToMs2 = Util.usToMs(j11);
        long j21 = liveConfiguration.maxOffsetMs;
        if (j21 == C2711C.TIME_UNSET) {
            ServiceDescriptionElement serviceDescriptionElement6 = this.manifest.serviceDescription;
            if (serviceDescriptionElement6 != null) {
                long j22 = serviceDescriptionElement6.maxOffsetMs;
                if (j22 != C2711C.TIME_UNSET) {
                    jMin = Math.min(jUsToMs2, j22);
                }
                jUsToMs = Util.usToMs(j11 - j12);
                if (jUsToMs < 0 && j13 > 0) {
                    jUsToMs = 0;
                }
                j14 = this.manifest.minBufferTimeMs;
                if (j14 != C2711C.TIME_UNSET) {
                    jUsToMs = Math.min(jUsToMs + j14, jUsToMs2);
                }
                jConstrainValue = jUsToMs;
                j15 = liveConfiguration.minOffsetMs;
                if (j15 != C2711C.TIME_UNSET) {
                    jConstrainValue = Util.constrainValue(j15, jConstrainValue, jUsToMs2);
                } else {
                    serviceDescriptionElement = this.manifest.serviceDescription;
                    if (serviceDescriptionElement != null) {
                        j16 = serviceDescriptionElement.minOffsetMs;
                        if (j16 != C2711C.TIME_UNSET) {
                            jConstrainValue = Util.constrainValue(j16, jConstrainValue, jUsToMs2);
                        }
                    }
                }
                j17 = jConstrainValue;
                if (j17 > j13) {
                    j18 = j17;
                } else {
                    j18 = j13;
                }
                jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
                if (jConstrainValue2 == C2711C.TIME_UNSET) {
                    dashManifest = this.manifest;
                    serviceDescriptionElement5 = dashManifest.serviceDescription;
                    if (serviceDescriptionElement5 != null) {
                        j19 = serviceDescriptionElement5.targetOffsetMs;
                        if (j19 != C2711C.TIME_UNSET) {
                            jConstrainValue2 = j19;
                        } else {
                            jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                            if (jConstrainValue2 == C2711C.TIME_UNSET) {
                                jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                            }
                        }
                    } else {
                        jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                        if (jConstrainValue2 == C2711C.TIME_UNSET) {
                            jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                        }
                    }
                }
                if (jConstrainValue2 < j17) {
                    jConstrainValue2 = j17;
                }
                if (jConstrainValue2 > j18) {
                    jConstrainValue2 = Util.constrainValue(Util.usToMs(j11 - Math.min(this.minLiveStartPositionUs, j12 / 2)), j17, j18);
                }
                long j23 = j18;
                f11 = liveConfiguration.minPlaybackSpeed;
                if (f11 == -3.4028235E38f) {
                    serviceDescriptionElement4 = this.manifest.serviceDescription;
                    if (serviceDescriptionElement4 != null) {
                        f11 = serviceDescriptionElement4.minPlaybackSpeed;
                    } else {
                        f11 = -3.4028235E38f;
                    }
                }
                f12 = liveConfiguration.maxPlaybackSpeed;
                if (f12 == -3.4028235E38f) {
                    serviceDescriptionElement3 = this.manifest.serviceDescription;
                    if (serviceDescriptionElement3 != null) {
                        f12 = serviceDescriptionElement3.maxPlaybackSpeed;
                    } else {
                        f12 = -3.4028235E38f;
                    }
                }
                if (f11 == -3.4028235E38f && f12 == -3.4028235E38f && ((serviceDescriptionElement2 = this.manifest.serviceDescription) == null || serviceDescriptionElement2.targetOffsetMs == C2711C.TIME_UNSET)) {
                    f11 = 1.0f;
                    f12 = 1.0f;
                }
                this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(j17).setMaxOffsetMs(j23).setMinPlaybackSpeed(f11).setMaxPlaybackSpeed(f12).build();
            }
            j13 = jUsToMs2;
            jUsToMs = Util.usToMs(j11 - j12);
            if (jUsToMs < 0) {
                jUsToMs = 0;
            }
            j14 = this.manifest.minBufferTimeMs;
            if (j14 != C2711C.TIME_UNSET) {
                jUsToMs = Math.min(jUsToMs + j14, jUsToMs2);
            }
            jConstrainValue = jUsToMs;
            j15 = liveConfiguration.minOffsetMs;
            if (j15 != C2711C.TIME_UNSET) {
                jConstrainValue = Util.constrainValue(j15, jConstrainValue, jUsToMs2);
            } else {
                serviceDescriptionElement = this.manifest.serviceDescription;
                if (serviceDescriptionElement != null) {
                    j16 = serviceDescriptionElement.minOffsetMs;
                    if (j16 != C2711C.TIME_UNSET) {
                        jConstrainValue = Util.constrainValue(j16, jConstrainValue, jUsToMs2);
                    }
                }
            }
            j17 = jConstrainValue;
            if (j17 > j13) {
                j18 = j17;
            } else {
                j18 = j13;
            }
            jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
            if (jConstrainValue2 == C2711C.TIME_UNSET) {
                dashManifest = this.manifest;
                serviceDescriptionElement5 = dashManifest.serviceDescription;
                if (serviceDescriptionElement5 != null) {
                    j19 = serviceDescriptionElement5.targetOffsetMs;
                    if (j19 != C2711C.TIME_UNSET) {
                        jConstrainValue2 = j19;
                    } else {
                        jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                        if (jConstrainValue2 == C2711C.TIME_UNSET) {
                            jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                        }
                    }
                } else {
                    jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                    if (jConstrainValue2 == C2711C.TIME_UNSET) {
                        jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                    }
                }
            }
            if (jConstrainValue2 < j17) {
                jConstrainValue2 = j17;
            }
            if (jConstrainValue2 > j18) {
                jConstrainValue2 = Util.constrainValue(Util.usToMs(j11 - Math.min(this.minLiveStartPositionUs, j12 / 2)), j17, j18);
            }
            long j24 = j18;
            f11 = liveConfiguration.minPlaybackSpeed;
            if (f11 == -3.4028235E38f) {
                serviceDescriptionElement4 = this.manifest.serviceDescription;
                if (serviceDescriptionElement4 != null) {
                    f11 = serviceDescriptionElement4.minPlaybackSpeed;
                } else {
                    f11 = -3.4028235E38f;
                }
            }
            f12 = liveConfiguration.maxPlaybackSpeed;
            if (f12 == -3.4028235E38f) {
                serviceDescriptionElement3 = this.manifest.serviceDescription;
                if (serviceDescriptionElement3 != null) {
                    f12 = serviceDescriptionElement3.maxPlaybackSpeed;
                } else {
                    f12 = -3.4028235E38f;
                }
            }
            if (f11 == -3.4028235E38f) {
                f11 = 1.0f;
                f12 = 1.0f;
            }
            this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(j17).setMaxOffsetMs(j24).setMinPlaybackSpeed(f11).setMaxPlaybackSpeed(f12).build();
        }
        jMin = Math.min(jUsToMs2, j21);
        j13 = jMin;
        jUsToMs = Util.usToMs(j11 - j12);
        if (jUsToMs < 0) {
            jUsToMs = 0;
        }
        j14 = this.manifest.minBufferTimeMs;
        if (j14 != C2711C.TIME_UNSET) {
            jUsToMs = Math.min(jUsToMs + j14, jUsToMs2);
        }
        jConstrainValue = jUsToMs;
        j15 = liveConfiguration.minOffsetMs;
        if (j15 != C2711C.TIME_UNSET) {
            jConstrainValue = Util.constrainValue(j15, jConstrainValue, jUsToMs2);
        } else {
            serviceDescriptionElement = this.manifest.serviceDescription;
            if (serviceDescriptionElement != null) {
                j16 = serviceDescriptionElement.minOffsetMs;
                if (j16 != C2711C.TIME_UNSET) {
                    jConstrainValue = Util.constrainValue(j16, jConstrainValue, jUsToMs2);
                }
            }
        }
        j17 = jConstrainValue;
        if (j17 > j13) {
            j18 = j17;
        } else {
            j18 = j13;
        }
        jConstrainValue2 = this.liveConfiguration.targetOffsetMs;
        if (jConstrainValue2 == C2711C.TIME_UNSET) {
            dashManifest = this.manifest;
            serviceDescriptionElement5 = dashManifest.serviceDescription;
            if (serviceDescriptionElement5 != null) {
                j19 = serviceDescriptionElement5.targetOffsetMs;
                if (j19 != C2711C.TIME_UNSET) {
                    jConstrainValue2 = j19;
                } else {
                    jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                    if (jConstrainValue2 == C2711C.TIME_UNSET) {
                        jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                    }
                }
            } else {
                jConstrainValue2 = dashManifest.suggestedPresentationDelayMs;
                if (jConstrainValue2 == C2711C.TIME_UNSET) {
                    jConstrainValue2 = this.fallbackTargetLiveOffsetMs;
                }
            }
        }
        if (jConstrainValue2 < j17) {
            jConstrainValue2 = j17;
        }
        if (jConstrainValue2 > j18) {
            jConstrainValue2 = Util.constrainValue(Util.usToMs(j11 - Math.min(this.minLiveStartPositionUs, j12 / 2)), j17, j18);
        }
        long j25 = j18;
        f11 = liveConfiguration.minPlaybackSpeed;
        if (f11 == -3.4028235E38f) {
            serviceDescriptionElement4 = this.manifest.serviceDescription;
            if (serviceDescriptionElement4 != null) {
                f11 = serviceDescriptionElement4.minPlaybackSpeed;
            } else {
                f11 = -3.4028235E38f;
            }
        }
        f12 = liveConfiguration.maxPlaybackSpeed;
        if (f12 == -3.4028235E38f) {
            serviceDescriptionElement3 = this.manifest.serviceDescription;
            if (serviceDescriptionElement3 != null) {
                f12 = serviceDescriptionElement3.maxPlaybackSpeed;
            } else {
                f12 = -3.4028235E38f;
            }
        }
        if (f11 == -3.4028235E38f) {
            f11 = 1.0f;
            f12 = 1.0f;
        }
        this.liveConfiguration = new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(jConstrainValue2).setMinOffsetMs(j17).setMaxOffsetMs(j25).setMinPlaybackSpeed(f11).setMaxPlaybackSpeed(f12).build();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j11) {
        int iIntValue = ((Integer) mediaPeriodId.periodUid).intValue() - this.firstPeriodId;
        MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(mediaPeriodId);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(this.firstPeriodId + iIntValue, this.manifest, this.baseUrlExclusionList, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.cmcdConfiguration, this.drmSessionManager, createDrmEventDispatcher(mediaPeriodId), this.loadErrorHandlingPolicy, eventDispatcherCreateEventDispatcher, this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback, getPlayerId());
        this.periodsById.put(dashMediaPeriod.f3160id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    public void onDashManifestPublishTimeExpired(long j11) {
        long j12 = this.expiredManifestPublishTimeUs;
        if (j12 == C2711C.TIME_UNSET || j12 < j11) {
            this.expiredManifestPublishTimeUs = j11;
        }
    }

    public void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    public void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j11, long j12) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j11, j12, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCanceled(loadEventInfo, parsingLoadable.type);
    }

    public void onManifestLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j11, long j12) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j11, j12, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        DashManifest result = parsingLoadable.getResult();
        DashManifest dashManifest = this.manifest;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j13 = result.getPeriod(0).startMs;
        int i11 = 0;
        while (i11 < periodCount && this.manifest.getPeriod(i11).startMs < j13) {
            i11++;
        }
        if (result.dynamic) {
            if (periodCount - i11 > result.getPeriodCount()) {
                Log.m2961w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = this.expiredManifestPublishTimeUs;
                if (j14 == C2711C.TIME_UNSET || result.publishTimeMs * 1000 > j14) {
                    this.staleManifestReloadAttempt = 0;
                } else {
                    Log.m2961w("DashMediaSource", "Loaded stale dynamic manifest: " + result.publishTimeMs + ", " + this.expiredManifestPublishTimeUs);
                }
            }
            int i12 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i12 + 1;
            if (i12 < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new DashManifestStaleException();
                return;
            }
        }
        this.manifest = result;
        this.manifestLoadPending = result.dynamic & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j11 - j12;
        this.manifestLoadEndTimestampMs = j11;
        this.firstPeriodId += i11;
        synchronized (this.manifestUriLock) {
            try {
                if (parsingLoadable.dataSpec.uri == this.manifestUri) {
                    Uri uri = this.manifest.location;
                    if (uri == null) {
                        uri = parsingLoadable.getUri();
                    }
                    this.manifestUri = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        DashManifest dashManifest2 = this.manifest;
        if (!dashManifest2.dynamic || this.elapsedRealtimeOffsetMs != C2711C.TIME_UNSET) {
            processManifest(true);
            return;
        }
        UtcTimingElement utcTimingElement = dashManifest2.utcTiming;
        if (utcTimingElement != null) {
            resolveUtcTimingElement(utcTimingElement);
        } else {
            loadNtpTimeOffset();
        }
    }

    public Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j11, long j12, IOException iOException, int i11) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j11, j12, parsingLoadable.bytesLoaded());
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable.type), iOException, i11));
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == C2711C.TIME_UNSET ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        boolean zIsRetry = loadErrorActionCreateRetryAction.isRetry();
        this.manifestEventDispatcher.loadError(loadEventInfo, parsingLoadable.type, iOException, !zIsRetry);
        if (!zIsRetry) {
            this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        }
        return loadErrorActionCreateRetryAction;
    }

    public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j11, long j12) {
        LoadEventInfo loadEventInfo = new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j11, j12, parsingLoadable.bytesLoaded());
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        this.manifestEventDispatcher.loadCompleted(loadEventInfo, parsingLoadable.type);
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j11);
    }

    public Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j11, long j12, IOException iOException) {
        this.manifestEventDispatcher.loadError(new LoadEventInfo(parsingLoadable.loadTaskId, parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), j11, j12, parsingLoadable.bytesLoaded()), parsingLoadable.type, iOException, true);
        this.loadErrorHandlingPolicy.onLoadTaskConcluded(parsingLoadable.loadTaskId);
        onUtcTimestampResolutionError(iOException);
        return Loader.DONT_RETRY;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.setPlayer(Looper.myLooper(), getPlayerId());
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new Loader("DashMediaSource");
        this.handler = Util.createHandlerForCurrentLooper();
        startLoadingManifest();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.f3160id);
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        MediaItem mediaItem2 = getMediaItem();
        MediaItem.LocalConfiguration localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem2.localConfiguration);
        MediaItem.LocalConfiguration localConfiguration2 = mediaItem.localConfiguration;
        if (localConfiguration2 != null && localConfiguration2.uri.equals(localConfiguration.uri) && localConfiguration2.streamKeys.equals(localConfiguration.streamKeys) && Util.areEqual(localConfiguration2.drmConfiguration, localConfiguration.drmConfiguration) && mediaItem2.liveConfiguration.equals(mediaItem.liveConfiguration)) {
            return true;
        }
        return false;
    }
}
