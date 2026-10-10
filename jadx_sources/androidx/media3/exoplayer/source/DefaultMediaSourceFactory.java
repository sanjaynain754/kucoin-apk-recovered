package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.C2711C;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleExtractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes34.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {
    private static final String TAG = "DMediaSourceFactory";

    @Nullable
    private AdViewProvider adViewProvider;

    @Nullable
    private AdsLoader.Provider adsLoaderProvider;
    private DataSource.Factory dataSourceFactory;
    private final DelegateFactoryLoader delegateFactoryLoader;

    @Nullable
    private ExternalLoader externalImageLoader;
    private long liveMaxOffsetMs;
    private float liveMaxSpeed;
    private long liveMinOffsetMs;
    private float liveMinSpeed;
    private long liveTargetOffsetMs;

    @Nullable
    private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean parseSubtitlesDuringExtraction;

    @Nullable
    private MediaSource.Factory serverSideAdInsertionMediaSourceFactory;
    private SubtitleParser.Factory subtitleParserFactory;

    @UnstableApi
    @Deprecated
    public interface AdsLoaderProvider extends AdsLoader.Provider {
    }

    public static final class DelegateFactoryLoader {

        @Nullable
        private CmcdConfiguration.Factory cmcdConfigurationFactory;
        private DataSource.Factory dataSourceFactory;

        @Nullable
        private DrmSessionManagerProvider drmSessionManagerProvider;
        private final ExtractorsFactory extractorsFactory;

        @Nullable
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;
        private SubtitleParser.Factory subtitleParserFactory;
        private final Map<Integer, Supplier<MediaSource.Factory>> mediaSourceFactorySuppliers = new HashMap();
        private final Map<Integer, MediaSource.Factory> mediaSourceFactories = new HashMap();
        private boolean parseSubtitlesDuringExtraction = true;

        private void ensureAllSuppliersAreLoaded() {
            maybeLoadSupplier(0);
            maybeLoadSupplier(1);
            maybeLoadSupplier(2);
            maybeLoadSupplier(3);
            maybeLoadSupplier(4);
        }

        private Supplier<MediaSource.Factory> loadSupplier(int i11) throws ClassNotFoundException {
            Supplier<MediaSource.Factory> supplier;
            Supplier<MediaSource.Factory> supplier2;
            Supplier<MediaSource.Factory> supplier3 = this.mediaSourceFactorySuppliers.get(Integer.valueOf(i11));
            if (supplier3 != null) {
                return supplier3;
            }
            final DataSource.Factory factory = (DataSource.Factory) Assertions.checkNotNull(this.dataSourceFactory);
            if (i11 == 0) {
                int i12 = DashMediaSource.Factory.f3161a;
                final Class clsAsSubclass = DashMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.f
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass, factory);
                    }
                };
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i13 = HlsMediaSource.Factory.f3231a;
                        final Class clsAsSubclass2 = HlsMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                        supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.h
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return DefaultMediaSourceFactory.newInstance(clsAsSubclass2, factory);
                            }
                        };
                    } else if (i11 == 3) {
                        int i14 = RtspMediaSource.Factory.f3302a;
                        final Class clsAsSubclass3 = RtspMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                        supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.i
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return DefaultMediaSourceFactory.newInstance(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i11 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i11);
                        }
                        supplier2 = new Supplier() { // from class: androidx.media3.exoplayer.source.j
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                return DefaultMediaSourceFactory.DelegateFactoryLoader.m3387c(this.f3357b, factory);
                            }
                        };
                    }
                    this.mediaSourceFactorySuppliers.put(Integer.valueOf(i11), supplier2);
                    return supplier2;
                }
                int i15 = SsMediaSource.Factory.f3320a;
                final Class clsAsSubclass4 = SsMediaSource.Factory.class.asSubclass(MediaSource.Factory.class);
                supplier = new Supplier() { // from class: androidx.media3.exoplayer.source.g
                    @Override // com.google.common.base.Supplier
                    public final Object get() {
                        return DefaultMediaSourceFactory.newInstance(clsAsSubclass4, factory);
                    }
                };
            }
            supplier2 = supplier;
            this.mediaSourceFactorySuppliers.put(Integer.valueOf(i11), supplier2);
            return supplier2;
        }

        public MediaSource.Factory getMediaSourceFactory(int i11) throws ClassNotFoundException {
            MediaSource.Factory factory = this.mediaSourceFactories.get(Integer.valueOf(i11));
            if (factory != null) {
                return factory;
            }
            MediaSource.Factory factory2 = loadSupplier(i11).get();
            CmcdConfiguration.Factory factory3 = this.cmcdConfigurationFactory;
            if (factory3 != null) {
                factory2.setCmcdConfigurationFactory(factory3);
            }
            DrmSessionManagerProvider drmSessionManagerProvider = this.drmSessionManagerProvider;
            if (drmSessionManagerProvider != null) {
                factory2.setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
            LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
            if (loadErrorHandlingPolicy != null) {
                factory2.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
            factory2.setSubtitleParserFactory(this.subtitleParserFactory);
            factory2.experimentalParseSubtitlesDuringExtraction(this.parseSubtitlesDuringExtraction);
            this.mediaSourceFactories.put(Integer.valueOf(i11), factory2);
            return factory2;
        }

        public void setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
            this.cmcdConfigurationFactory = factory;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setCmcdConfigurationFactory(factory);
            }
        }

        public void setDataSourceFactory(DataSource.Factory factory) {
            if (factory != this.dataSourceFactory) {
                this.dataSourceFactory = factory;
                this.mediaSourceFactorySuppliers.clear();
                this.mediaSourceFactories.clear();
            }
        }

        public void setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.drmSessionManagerProvider = drmSessionManagerProvider;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setDrmSessionManagerProvider(drmSessionManagerProvider);
            }
        }

        public void setJpegExtractorFlags(int i11) {
            ExtractorsFactory extractorsFactory = this.extractorsFactory;
            if (extractorsFactory instanceof DefaultExtractorsFactory) {
                ((DefaultExtractorsFactory) extractorsFactory).setJpegExtractorFlags(i11);
            }
        }

        public void setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            }
        }

        public void setParseSubtitlesDuringExtraction(boolean z11) {
            this.parseSubtitlesDuringExtraction = z11;
            this.extractorsFactory.experimentalSetTextTrackTranscodingEnabled(z11);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().experimentalParseSubtitlesDuringExtraction(z11);
            }
        }

        public void setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = factory;
            this.extractorsFactory.setSubtitleParserFactory(factory);
            Iterator<MediaSource.Factory> it = this.mediaSourceFactories.values().iterator();
            while (it.hasNext()) {
                it.next().setSubtitleParserFactory(factory);
            }
        }

        public DelegateFactoryLoader(ExtractorsFactory extractorsFactory, SubtitleParser.Factory factory) {
            this.extractorsFactory = extractorsFactory;
            this.subtitleParserFactory = factory;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ MediaSource.Factory m3387c(DelegateFactoryLoader delegateFactoryLoader, DataSource.Factory factory) {
            delegateFactoryLoader.getClass();
            return new ProgressiveMediaSource.Factory(factory, delegateFactoryLoader.extractorsFactory);
        }

        @Nullable
        @CanIgnoreReturnValue
        private Supplier<MediaSource.Factory> maybeLoadSupplier(int i11) {
            try {
                return loadSupplier(i11);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public int[] getSupportedTypes() {
            ensureAllSuppliersAreLoaded();
            return Ints.toArray(this.mediaSourceFactorySuppliers.keySet());
        }
    }

    public DefaultMediaSourceFactory(Context context) {
        this(new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls, DataSource.Factory factory) {
        try {
            return cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory clearLocalAdInsertionComponents() {
        this.adsLoaderProvider = null;
        this.adViewProvider = null;
        return this;
    }

    public static final class UnknownSubtitlesExtractor implements Extractor {
        private final Format format;

        @Override // androidx.media3.extractor.Extractor
        public void init(ExtractorOutput extractorOutput) {
            TrackOutput trackOutputTrack = extractorOutput.track(0, 3);
            extractorOutput.seekMap(new SeekMap.Unseekable(C2711C.TIME_UNSET));
            extractorOutput.endTracks();
            trackOutputTrack.format(this.format.buildUpon().setSampleMimeType(MimeTypes.TEXT_UNKNOWN).setCodecs(this.format.sampleMimeType).build());
        }

        @Override // androidx.media3.extractor.Extractor
        public boolean sniff(ExtractorInput extractorInput) {
            return true;
        }

        public UnknownSubtitlesExtractor(Format format) {
            this.format = format;
        }

        @Override // androidx.media3.extractor.Extractor
        public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
            if (extractorInput.skip(Integer.MAX_VALUE) == -1) {
                return -1;
            }
            return 0;
        }

        @Override // androidx.media3.extractor.Extractor
        public void release() {
        }

        @Override // androidx.media3.extractor.Extractor
        public void seek(long j11, long j12) {
        }
    }

    @UnstableApi
    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        this(new DefaultDataSource.Factory(context), extractorsFactory);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Extractor[] m3384a(DefaultMediaSourceFactory defaultMediaSourceFactory, Format format) {
        return new Extractor[]{defaultMediaSourceFactory.subtitleParserFactory.supportsFormat(format) ? new SubtitleExtractor(defaultMediaSourceFactory.subtitleParserFactory.create(format), format) : new UnknownSubtitlesExtractor(format)};
    }

    private static MediaSource maybeClipMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
        if (clippingConfiguration.startPositionUs == 0 && clippingConfiguration.endPositionUs == Long.MIN_VALUE && !clippingConfiguration.relativeToDefaultPosition) {
            return mediaSource;
        }
        MediaItem.ClippingConfiguration clippingConfiguration2 = mediaItem.clippingConfiguration;
        return new ClippingMediaSource(mediaSource, clippingConfiguration2.startPositionUs, clippingConfiguration2.endPositionUs, !clippingConfiguration2.startsAtKeyFrame, clippingConfiguration2.relativeToLiveWindow, clippingConfiguration2.relativeToDefaultPosition);
    }

    private MediaSource maybeWrapWithAdsMediaSource(MediaItem mediaItem, MediaSource mediaSource) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
        if (adsConfiguration == null) {
            return mediaSource;
        }
        AdsLoader.Provider provider = this.adsLoaderProvider;
        AdViewProvider adViewProvider = this.adViewProvider;
        if (provider == null || adViewProvider == null) {
            Log.m2961w(TAG, "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return mediaSource;
        }
        AdsLoader adsLoader = provider.getAdsLoader(adsConfiguration);
        if (adsLoader == null) {
            Log.m2961w(TAG, "Playing media without ads, as no AdsLoader was provided.");
            return mediaSource;
        }
        DataSpec dataSpec = new DataSpec(adsConfiguration.adTagUri);
        Object objM13442of = adsConfiguration.adsId;
        if (objM13442of == null) {
            objM13442of = ImmutableList.m13442of((Uri) mediaItem.mediaId, mediaItem.localConfiguration.uri, adsConfiguration.adTagUri);
        }
        return new AdsMediaSource(mediaSource, dataSpec, objM13442of, this, adsLoader, adViewProvider);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    public MediaSource createMediaSource(MediaItem mediaItem) {
        Assertions.checkNotNull(mediaItem.localConfiguration);
        String scheme = mediaItem.localConfiguration.uri.getScheme();
        if (scheme != null && scheme.equals(C2711C.SSAI_SCHEME)) {
            return ((MediaSource.Factory) Assertions.checkNotNull(this.serverSideAdInsertionMediaSourceFactory)).createMediaSource(mediaItem);
        }
        if (Objects.equals(mediaItem.localConfiguration.mimeType, MimeTypes.APPLICATION_EXTERNALLY_LOADED_IMAGE)) {
            return new ExternallyLoadedMediaSource.Factory(Util.msToUs(mediaItem.localConfiguration.imageDurationMs), (ExternalLoader) Assertions.checkNotNull(this.externalImageLoader)).createMediaSource(mediaItem);
        }
        MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
        int iInferContentTypeForUriAndMimeType = Util.inferContentTypeForUriAndMimeType(localConfiguration.uri, localConfiguration.mimeType);
        if (mediaItem.localConfiguration.imageDurationMs != C2711C.TIME_UNSET) {
            this.delegateFactoryLoader.setJpegExtractorFlags(1);
        }
        try {
            MediaSource.Factory mediaSourceFactory = this.delegateFactoryLoader.getMediaSourceFactory(iInferContentTypeForUriAndMimeType);
            MediaItem.LiveConfiguration.Builder builderBuildUpon = mediaItem.liveConfiguration.buildUpon();
            if (mediaItem.liveConfiguration.targetOffsetMs == C2711C.TIME_UNSET) {
                builderBuildUpon.setTargetOffsetMs(this.liveTargetOffsetMs);
            }
            if (mediaItem.liveConfiguration.minPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMinPlaybackSpeed(this.liveMinSpeed);
            }
            if (mediaItem.liveConfiguration.maxPlaybackSpeed == -3.4028235E38f) {
                builderBuildUpon.setMaxPlaybackSpeed(this.liveMaxSpeed);
            }
            if (mediaItem.liveConfiguration.minOffsetMs == C2711C.TIME_UNSET) {
                builderBuildUpon.setMinOffsetMs(this.liveMinOffsetMs);
            }
            if (mediaItem.liveConfiguration.maxOffsetMs == C2711C.TIME_UNSET) {
                builderBuildUpon.setMaxOffsetMs(this.liveMaxOffsetMs);
            }
            MediaItem.LiveConfiguration liveConfigurationBuild = builderBuildUpon.build();
            if (!liveConfigurationBuild.equals(mediaItem.liveConfiguration)) {
                mediaItem = mediaItem.buildUpon().setLiveConfiguration(liveConfigurationBuild).build();
            }
            MediaSource mediaSourceCreateMediaSource = mediaSourceFactory.createMediaSource(mediaItem);
            ImmutableList<MediaItem.SubtitleConfiguration> immutableList = ((MediaItem.LocalConfiguration) Util.castNonNull(mediaItem.localConfiguration)).subtitleConfigurations;
            if (!immutableList.isEmpty()) {
                MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
                mediaSourceArr[0] = mediaSourceCreateMediaSource;
                for (int i11 = 0; i11 < immutableList.size(); i11++) {
                    if (this.parseSubtitlesDuringExtraction) {
                        final Format formatBuild = new Format.Builder().setSampleMimeType(immutableList.get(i11).mimeType).setLanguage(immutableList.get(i11).language).setSelectionFlags(immutableList.get(i11).selectionFlags).setRoleFlags(immutableList.get(i11).roleFlags).setLabel(immutableList.get(i11).label).setId(immutableList.get(i11).f2790id).build();
                        ProgressiveMediaSource.Factory suppressPrepareError = new ProgressiveMediaSource.Factory(this.dataSourceFactory, new ExtractorsFactory() { // from class: androidx.media3.exoplayer.source.e
                            @Override // androidx.media3.extractor.ExtractorsFactory
                            public final Extractor[] createExtractors() {
                                return DefaultMediaSourceFactory.m3384a(this.f3348a, formatBuild);
                            }
                        }).setSuppressPrepareError(true);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy != null) {
                            suppressPrepareError.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
                        }
                        mediaSourceArr[i11 + 1] = suppressPrepareError.createMediaSource(MediaItem.fromUri(immutableList.get(i11).uri.toString()));
                    } else {
                        SingleSampleMediaSource.Factory factory = new SingleSampleMediaSource.Factory(this.dataSourceFactory);
                        LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.loadErrorHandlingPolicy;
                        if (loadErrorHandlingPolicy2 != null) {
                            factory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy2);
                        }
                        mediaSourceArr[i11 + 1] = factory.createMediaSource(immutableList.get(i11), C2711C.TIME_UNSET);
                    }
                }
                mediaSourceCreateMediaSource = new MergingMediaSource(mediaSourceArr);
            }
            return maybeWrapWithAdsMediaSource(mediaItem, maybeClipMediaSource(mediaItem, mediaSourceCreateMediaSource));
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory experimentalParseSubtitlesDuringExtraction(boolean z11) {
        this.parseSubtitlesDuringExtraction = z11;
        this.delegateFactoryLoader.setParseSubtitlesDuringExtraction(z11);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @UnstableApi
    public int[] getSupportedTypes() {
        return this.delegateFactoryLoader.getSupportedTypes();
    }

    @CanIgnoreReturnValue
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory setAdViewProvider(@Nullable AdViewProvider adViewProvider) {
        this.adViewProvider = adViewProvider;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    @Deprecated
    public DefaultMediaSourceFactory setAdsLoaderProvider(@Nullable AdsLoader.Provider provider) {
        this.adsLoaderProvider = provider;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setCmcdConfigurationFactory(CmcdConfiguration.Factory factory) {
        this.delegateFactoryLoader.setCmcdConfigurationFactory((CmcdConfiguration.Factory) Assertions.checkNotNull(factory));
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.delegateFactoryLoader.setDataSourceFactory(factory);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
        this.delegateFactoryLoader.setDrmSessionManagerProvider((DrmSessionManagerProvider) Assertions.checkNotNull(drmSessionManagerProvider, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setExternalImageLoader(@Nullable ExternalLoader externalLoader) {
        this.externalImageLoader = externalLoader;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMaxOffsetMs(long j11) {
        this.liveMaxOffsetMs = j11;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMaxSpeed(float f11) {
        this.liveMaxSpeed = f11;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMinOffsetMs(long j11) {
        this.liveMinOffsetMs = j11;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveMinSpeed(float f11) {
        this.liveMinSpeed = f11;
        return this;
    }

    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLiveTargetOffsetMs(long j11) {
        this.liveTargetOffsetMs = j11;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.loadErrorHandlingPolicy = (LoadErrorHandlingPolicy) Assertions.checkNotNull(loadErrorHandlingPolicy, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.delegateFactoryLoader.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setServerSideAdInsertionMediaSourceFactory(@Nullable MediaSource.Factory factory) {
        this.serverSideAdInsertionMediaSourceFactory = factory;
        return this;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.Factory
    @CanIgnoreReturnValue
    @UnstableApi
    public DefaultMediaSourceFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        this.subtitleParserFactory = (SubtitleParser.Factory) Assertions.checkNotNull(factory);
        this.delegateFactoryLoader.setSubtitleParserFactory(factory);
        return this;
    }

    @UnstableApi
    public DefaultMediaSourceFactory(DataSource.Factory factory) {
        this(factory, new DefaultExtractorsFactory());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaSource.Factory newInstance(Class<? extends MediaSource.Factory> cls) {
        try {
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @CanIgnoreReturnValue
    public DefaultMediaSourceFactory setLocalAdInsertionComponents(AdsLoader.Provider provider, AdViewProvider adViewProvider) {
        this.adsLoaderProvider = (AdsLoader.Provider) Assertions.checkNotNull(provider);
        this.adViewProvider = (AdViewProvider) Assertions.checkNotNull(adViewProvider);
        return this;
    }

    @UnstableApi
    public DefaultMediaSourceFactory(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
        this.dataSourceFactory = factory;
        DefaultSubtitleParserFactory defaultSubtitleParserFactory = new DefaultSubtitleParserFactory();
        this.subtitleParserFactory = defaultSubtitleParserFactory;
        DelegateFactoryLoader delegateFactoryLoader = new DelegateFactoryLoader(extractorsFactory, defaultSubtitleParserFactory);
        this.delegateFactoryLoader = delegateFactoryLoader;
        delegateFactoryLoader.setDataSourceFactory(factory);
        this.liveTargetOffsetMs = C2711C.TIME_UNSET;
        this.liveMinOffsetMs = C2711C.TIME_UNSET;
        this.liveMaxOffsetMs = C2711C.TIME_UNSET;
        this.liveMinSpeed = -3.4028235E38f;
        this.liveMaxSpeed = -3.4028235E38f;
        this.parseSubtitlesDuringExtraction = true;
    }
}
