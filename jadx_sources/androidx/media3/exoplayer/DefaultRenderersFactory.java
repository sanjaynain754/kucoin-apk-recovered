package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.MediaCodecAudioRenderer;
import androidx.media3.exoplayer.image.ImageDecoder;
import androidx.media3.exoplayer.image.ImageRenderer;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionRenderer;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public class DefaultRenderersFactory implements RenderersFactory {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final DefaultMediaCodecAdapterFactory codecAdapterFactory;
    private final Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtensionRendererMode {
    }

    public void buildAudioRenderers(Context context, int i11, MediaCodecSelector mediaCodecSelector, boolean z11, AudioSink audioSink, Handler handler, AudioRendererEventListener audioRendererEventListener, ArrayList<Renderer> arrayList) {
        int i12;
        int i13;
        int i14;
        int i15;
        arrayList.add(new MediaCodecAudioRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, z11, handler, audioRendererEventListener, audioSink));
        if (i11 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i11 == 2) {
            size--;
        }
        try {
            try {
                i12 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class).newInstance(context));
                    Log.m2959i(TAG, "Loaded MidiRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i12;
                    i12 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i13 = i12 + 1;
                    try {
                        arrayList.add(i12, (Renderer) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                        Log.m2959i(TAG, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i12 = i13;
                        i13 = i12;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    try {
                        i14 = i13 + 1;
                        try {
                            arrayList.add(i13, (Renderer) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                            Log.m2959i(TAG, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused5) {
                            i13 = i14;
                            i14 = i13;
                        }
                    } catch (ClassNotFoundException unused6) {
                    }
                    try {
                        try {
                            i15 = i14 + 1;
                            try {
                                arrayList.add(i14, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(handler, audioRendererEventListener, audioSink));
                                Log.m2959i(TAG, "Loaded FfmpegAudioRenderer.");
                            } catch (ClassNotFoundException unused7) {
                                i14 = i15;
                                i15 = i14;
                            }
                        } catch (ClassNotFoundException unused8) {
                        }
                        try {
                            arrayList.add(i15, (Renderer) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, AudioRendererEventListener.class, AudioSink.class).newInstance(context, handler, audioRendererEventListener, audioSink));
                            Log.m2959i(TAG, "Loaded LibiamfAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                        } catch (Exception e11) {
                            throw new IllegalStateException("Error instantiating IAMF extension", e11);
                        }
                    } catch (Exception e12) {
                        throw new IllegalStateException("Error instantiating FFmpeg extension", e12);
                    }
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating FLAC extension", e13);
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating Opus extension", e14);
            }
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating MIDI extension", e15);
        }
    }

    @Nullable
    public AudioSink buildAudioSink(Context context, boolean z11, boolean z12) {
        return new DefaultAudioSink.Builder(context).setEnableFloatOutput(z11).setEnableAudioTrackPlaybackParams(z12).build();
    }

    public void buildCameraMotionRenderers(Context context, int i11, ArrayList<Renderer> arrayList) {
        arrayList.add(new CameraMotionRenderer());
    }

    public void buildImageRenderers(ArrayList<Renderer> arrayList) {
        arrayList.add(new ImageRenderer(getImageDecoderFactory(), null));
    }

    public void buildMetadataRenderers(Context context, MetadataOutput metadataOutput, Looper looper, int i11, ArrayList<Renderer> arrayList) {
        arrayList.add(new MetadataRenderer(metadataOutput, looper));
    }

    public void buildTextRenderers(Context context, TextOutput textOutput, Looper looper, int i11, ArrayList<Renderer> arrayList) {
        arrayList.add(new TextRenderer(textOutput, looper));
    }

    public void buildVideoRenderers(Context context, int i11, MediaCodecSelector mediaCodecSelector, boolean z11, Handler handler, VideoRendererEventListener videoRendererEventListener, long j11, ArrayList<Renderer> arrayList) {
        String str;
        int i12;
        int i13;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        arrayList.add(new MediaCodecVideoRenderer(context, getCodecAdapterFactory(), mediaCodecSelector, j11, z11, handler, videoRendererEventListener, 50));
        if (i11 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i11 == 2) {
            size--;
        }
        try {
            try {
                i12 = size + 1;
                try {
                    arrayList.add(size, (Renderer) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j11), handler, videoRendererEventListener, 50));
                    str = TAG;
                    try {
                        Log.m2959i(str, "Loaded LibvpxVideoRenderer.");
                    } catch (ClassNotFoundException unused) {
                        size = i12;
                        i12 = size;
                    }
                } catch (ClassNotFoundException unused2) {
                    str = TAG;
                }
            } catch (Exception e11) {
                throw new IllegalStateException("Error instantiating VP9 extension", e11);
            }
        } catch (ClassNotFoundException unused3) {
            str = TAG;
        }
        try {
            try {
                i13 = i12 + 1;
                try {
                    arrayList.add(i12, (Renderer) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j11), handler, videoRendererEventListener, 50));
                    Log.m2959i(str, "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused4) {
                    i12 = i13;
                    i13 = i12;
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                arrayList.add(i13, (Renderer) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, VideoRendererEventListener.class, cls).newInstance(Long.valueOf(j11), handler, videoRendererEventListener, 50));
                Log.m2959i(str, "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused6) {
            } catch (Exception e12) {
                throw new IllegalStateException("Error instantiating FFmpeg extension", e12);
            }
        } catch (Exception e13) {
            throw new IllegalStateException("Error instantiating AV1 extension", e13);
        }
    }

    @Override // androidx.media3.exoplayer.RenderersFactory
    public Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        Handler handler2;
        ArrayList<Renderer> arrayList = new ArrayList<>();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, videoRendererEventListener, this.allowedVideoJoiningTimeMs, arrayList);
        AudioSink audioSinkBuildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (audioSinkBuildAudioSink != null) {
            handler2 = handler;
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, audioSinkBuildAudioSink, handler2, audioRendererEventListener, arrayList);
        } else {
            handler2 = handler;
        }
        buildTextRenderers(this.context, textOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, metadataOutput, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler2, this.extensionRendererMode, arrayList);
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z11) {
        this.codecAdapterFactory.experimentalSetAsyncCryptoFlagEnabled(z11);
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceDisableAsynchronous();
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.forceEnableAsynchronous();
        return this;
    }

    public MediaCodecAdapter.Factory getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    public ImageDecoder.Factory getImageDecoderFactory() {
        return ImageDecoder.Factory.DEFAULT;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setAllowedVideoJoiningTimeMs(long j11) {
        this.allowedVideoJoiningTimeMs = j11;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setEnableAudioFloatOutput(boolean z11) {
        this.enableFloatOutput = z11;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setEnableAudioTrackPlaybackParams(boolean z11) {
        this.enableAudioTrackPlaybackParams = z11;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setEnableDecoderFallback(boolean z11) {
        this.enableDecoderFallback = z11;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setExtensionRendererMode(int i11) {
        this.extensionRendererMode = i11;
        return this;
    }

    @CanIgnoreReturnValue
    public final DefaultRenderersFactory setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
        this.mediaCodecSelector = mediaCodecSelector;
        return this;
    }

    public DefaultRenderersFactory(Context context) {
        this.context = context;
        this.codecAdapterFactory = new DefaultMediaCodecAdapterFactory(context);
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i11, ArrayList<Renderer> arrayList) {
    }
}
