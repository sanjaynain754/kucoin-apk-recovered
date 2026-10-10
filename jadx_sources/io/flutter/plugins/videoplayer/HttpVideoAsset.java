package io.flutter.plugins.videoplayer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.Map;

/* JADX INFO: loaded from: classes60.dex */
final class HttpVideoAsset extends VideoAsset {

    @NonNull
    private final Map<String, String> httpHeaders;

    @NonNull
    private final VideoAsset.StreamingFormat streamingFormat;

    @Nullable
    private final String userAgent;

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    @NonNull
    public MediaSource.Factory getMediaSourceFactory(@NonNull Context context) {
        return getMediaSourceFactory(context, new DefaultHttpDataSource.Factory());
    }

    /* JADX INFO: renamed from: io.flutter.plugins.videoplayer.HttpVideoAsset$1 */
    public static /* synthetic */ class C389361 {

        /* JADX INFO: renamed from: $SwitchMap$io$flutter$plugins$videoplayer$VideoAsset$StreamingFormat */
        static final /* synthetic */ int[] f86843x93fc3f7c;

        static {
            int[] iArr = new int[VideoAsset.StreamingFormat.values().length];
            f86843x93fc3f7c = iArr;
            try {
                iArr[VideoAsset.StreamingFormat.SMOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86843x93fc3f7c[VideoAsset.StreamingFormat.DYNAMIC_ADAPTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f86843x93fc3f7c[VideoAsset.StreamingFormat.HTTP_LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // io.flutter.plugins.videoplayer.VideoAsset
    @NonNull
    public MediaItem getMediaItem() {
        String str;
        MediaItem.Builder uri = new MediaItem.Builder().setUri(this.assetUrl);
        int i11 = C389361.f86843x93fc3f7c[this.streamingFormat.ordinal()];
        if (i11 == 1) {
            str = MimeTypes.APPLICATION_SS;
        } else if (i11 != 2) {
            str = i11 != 3 ? null : MimeTypes.APPLICATION_M3U8;
        } else {
            str = MimeTypes.APPLICATION_MPD;
        }
        if (str != null) {
            uri.setMimeType(str);
        }
        return uri.build();
    }

    @VisibleForTesting
    public MediaSource.Factory getMediaSourceFactory(Context context, DefaultHttpDataSource.Factory factory) {
        unstableUpdateDataSourceFactory(factory, this.httpHeaders, this.userAgent);
        return new DefaultMediaSourceFactory(context).setDataSourceFactory(new DefaultDataSource.Factory(context, factory));
    }

    public HttpVideoAsset(@Nullable String str, @NonNull VideoAsset.StreamingFormat streamingFormat, @NonNull Map<String, String> map, @Nullable String str2) {
        super(str);
        this.streamingFormat = streamingFormat;
        this.httpHeaders = map;
        this.userAgent = str2;
    }

    @OptIn(markerClass = {UnstableApi.class})
    private static void unstableUpdateDataSourceFactory(@NonNull DefaultHttpDataSource.Factory factory, @NonNull Map<String, String> map, @Nullable String str) {
        factory.setUserAgent(str).setAllowCrossProtocolRedirects(true);
        if (!map.isEmpty()) {
            factory.setDefaultRequestProperties(map);
        }
    }
}
