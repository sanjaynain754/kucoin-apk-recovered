package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory;
import io.flutter.plugins.videoplayer.platformview.PlatformViewVideoPlayer;
import io.flutter.plugins.videoplayer.texture.TextureVideoPlayer;
import io.flutter.view.TextureRegistry;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class VideoPlayerPlugin implements FlutterPlugin, Messages.AndroidVideoPlayerApi {
    private static final String TAG = "VideoPlayerPlugin";
    private FlutterState flutterState;
    private final LongSparseArray<VideoPlayer> videoPlayers = new LongSparseArray<>();
    private final VideoPlayerOptions sharedOptions = new VideoPlayerOptions();
    private long nextPlayerIdentifier = 1;

    public interface KeyForAssetAndPackageName {
        String get(String str, String str2);
    }

    public interface KeyForAssetFn {
        String get(String str);
    }

    private void disposeAllPlayers() {
        for (int i11 = 0; i11 < this.videoPlayers.size(); i11++) {
            this.videoPlayers.valueAt(i11).dispose();
        }
        this.videoPlayers.clear();
    }

    /* JADX INFO: renamed from: io.flutter.plugins.videoplayer.VideoPlayerPlugin$1 */
    /* JADX INFO: loaded from: classes60.dex */
    public static /* synthetic */ class C389391 {

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$plugins$videoplayer$Messages$PlatformVideoFormat */
        static final /* synthetic */ int[] f86845x8319c5f9;

        static {
            int[] iArr = new int[Messages.PlatformVideoFormat.values().length];
            f86845x8319c5f9 = iArr;
            try {
                iArr[Messages.PlatformVideoFormat.SS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86845x8319c5f9[Messages.PlatformVideoFormat.DASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86845x8319c5f9[Messages.PlatformVideoFormat.HLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class FlutterState {
        final Context applicationContext;
        final BinaryMessenger binaryMessenger;
        final KeyForAssetFn keyForAsset;
        final KeyForAssetAndPackageName keyForAssetAndPackageName;
        final TextureRegistry textureRegistry;

        public void stopListening(BinaryMessenger binaryMessenger) {
            Messages.AndroidVideoPlayerApi.setUp(binaryMessenger, null);
        }

        public FlutterState(Context context, BinaryMessenger binaryMessenger, KeyForAssetFn keyForAssetFn, KeyForAssetAndPackageName keyForAssetAndPackageName, TextureRegistry textureRegistry) {
            this.applicationContext = context;
            this.binaryMessenger = binaryMessenger;
            this.keyForAsset = keyForAssetFn;
            this.keyForAssetAndPackageName = keyForAssetAndPackageName;
            this.textureRegistry = textureRegistry;
        }

        public void startListening(VideoPlayerPlugin videoPlayerPlugin, BinaryMessenger binaryMessenger) {
            Messages.AndroidVideoPlayerApi.setUp(binaryMessenger, videoPlayerPlugin);
        }
    }

    @NonNull
    private EventChannel createEventChannel(long j11) {
        return new EventChannel(this.flutterState.binaryMessenger, "flutter.io/videoPlayer/videoEvents" + j11);
    }

    @NonNull
    private VideoPlayer getPlayer(long j11) {
        VideoPlayer videoPlayer = this.videoPlayers.get(j11);
        if (videoPlayer != null) {
            return videoPlayer;
        }
        String str = "No player found with playerId <" + j11 + ">";
        if (this.videoPlayers.size() == 0) {
            str = str + " and no active players created by the plugin.";
        }
        throw new IllegalStateException(str);
    }

    private void registerPlayerInstance(VideoPlayer videoPlayer, long j11) {
        final BinaryMessenger binaryMessenger = this.flutterState.binaryMessenger;
        final String string = Long.toString(j11);
        Messages.VideoPlayerInstanceApi.setUp(binaryMessenger, string, videoPlayer);
        videoPlayer.setDisposeHandler(new VideoPlayer.DisposeHandler() { // from class: io.flutter.plugins.videoplayer.n
            @Override // io.flutter.plugins.videoplayer.VideoPlayer.DisposeHandler
            public final void onDispose() {
                Messages.VideoPlayerInstanceApi.setUp(binaryMessenger, string, null);
            }
        });
        this.videoPlayers.put(j11, videoPlayer);
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    @NonNull
    public String getLookupKeyForAsset(@NonNull String str, @Nullable String str2) {
        return str2 == null ? this.flutterState.keyForAsset.get(str) : this.flutterState.keyForAssetAndPackageName.get(str, str2);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.flutterState == null) {
            Log.wtf(TAG, "Detached from the engine before registering to it.");
        }
        this.flutterState.stopListening(flutterPluginBinding.getBinaryMessenger());
        this.flutterState = null;
        onDestroy();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void setMixWithOthers(@NonNull Boolean bool) {
        this.sharedOptions.mixWithOthers = bool.booleanValue();
    }

    @NonNull
    private VideoAsset videoAssetWithOptions(@NonNull Messages.CreationOptions creationOptions) {
        String uri = creationOptions.getUri();
        if (uri.startsWith("asset:")) {
            return VideoAsset.fromAssetUrl(uri);
        }
        if (uri.startsWith("rtsp:")) {
            return VideoAsset.fromRtspUrl(uri);
        }
        VideoAsset.StreamingFormat streamingFormat = VideoAsset.StreamingFormat.UNKNOWN;
        Messages.PlatformVideoFormat formatHint = creationOptions.getFormatHint();
        if (formatHint != null) {
            int i11 = C389391.f86845x8319c5f9[formatHint.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        streamingFormat = VideoAsset.StreamingFormat.HTTP_LIVE;
                    }
                } else {
                    streamingFormat = VideoAsset.StreamingFormat.DYNAMIC_ADAPTIVE;
                }
            } else {
                streamingFormat = VideoAsset.StreamingFormat.SMOOTH;
            }
        }
        return VideoAsset.fromRemoteUrl(uri, streamingFormat, creationOptions.getHttpHeaders(), creationOptions.getUserAgent());
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    @NonNull
    public Long createForPlatformView(@NonNull Messages.CreationOptions creationOptions) {
        VideoAsset videoAssetVideoAssetWithOptions = videoAssetWithOptions(creationOptions);
        long j11 = this.nextPlayerIdentifier;
        this.nextPlayerIdentifier = 1 + j11;
        registerPlayerInstance(PlatformViewVideoPlayer.create(this.flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(createEventChannel(j11)), videoAssetVideoAssetWithOptions, this.sharedOptions), j11);
        return Long.valueOf(j11);
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    @NonNull
    public Messages.TexturePlayerIds createForTextureView(@NonNull Messages.CreationOptions creationOptions) {
        VideoAsset videoAssetVideoAssetWithOptions = videoAssetWithOptions(creationOptions);
        long j11 = this.nextPlayerIdentifier;
        this.nextPlayerIdentifier = 1 + j11;
        TextureRegistry.SurfaceProducer surfaceProducerCreateSurfaceProducer = this.flutterState.textureRegistry.createSurfaceProducer();
        registerPlayerInstance(TextureVideoPlayer.create(this.flutterState.applicationContext, VideoPlayerEventCallbacks.bindTo(createEventChannel(j11)), surfaceProducerCreateSurfaceProducer, videoAssetVideoAssetWithOptions, this.sharedOptions), j11);
        return new Messages.TexturePlayerIds.Builder().setPlayerId(Long.valueOf(j11)).setTextureId(Long.valueOf(surfaceProducerCreateSurfaceProducer.mo87506id())).build();
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void dispose(@NonNull Long l11) {
        getPlayer(l11.longValue()).dispose();
        this.videoPlayers.remove(l11.longValue());
    }

    @Override // io.flutter.plugins.videoplayer.Messages.AndroidVideoPlayerApi
    public void initialize() {
        disposeAllPlayers();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        FlutterInjector flutterInjectorInstance = FlutterInjector.instance();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        final FlutterLoader flutterLoader = flutterInjectorInstance.flutterLoader();
        Objects.requireNonNull(flutterLoader);
        KeyForAssetFn keyForAssetFn = new KeyForAssetFn() { // from class: io.flutter.plugins.videoplayer.o
            @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetFn
            public final String get(String str) {
                return flutterLoader.getLookupKeyForAsset(str);
            }
        };
        final FlutterLoader flutterLoader2 = flutterInjectorInstance.flutterLoader();
        Objects.requireNonNull(flutterLoader2);
        FlutterState flutterState = new FlutterState(applicationContext, binaryMessenger, keyForAssetFn, new KeyForAssetAndPackageName() { // from class: io.flutter.plugins.videoplayer.p
            @Override // io.flutter.plugins.videoplayer.VideoPlayerPlugin.KeyForAssetAndPackageName
            public final String get(String str, String str2) {
                return flutterLoader2.getLookupKeyForAsset(str, str2);
            }
        }, flutterPluginBinding.getTextureRegistry());
        this.flutterState = flutterState;
        flutterState.startListening(this, flutterPluginBinding.getBinaryMessenger());
        PlatformViewRegistry platformViewRegistry = flutterPluginBinding.getPlatformViewRegistry();
        final LongSparseArray<VideoPlayer> longSparseArray = this.videoPlayers;
        Objects.requireNonNull(longSparseArray);
        platformViewRegistry.registerViewFactory("plugins.flutter.dev/video_player_android", new PlatformVideoViewFactory(new PlatformVideoViewFactory.VideoPlayerProvider() { // from class: io.flutter.plugins.videoplayer.q
            @Override // io.flutter.plugins.videoplayer.platformview.PlatformVideoViewFactory.VideoPlayerProvider
            public final VideoPlayer getVideoPlayer(Long l11) {
                return (VideoPlayer) longSparseArray.get(l11.longValue());
            }
        }));
    }

    public void onDestroy() {
        disposeAllPlayers();
    }
}
