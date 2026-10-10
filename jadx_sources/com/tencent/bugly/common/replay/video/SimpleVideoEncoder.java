package com.tencent.bugly.common.replay.video;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.proguard.C33986vi;
import com.tencent.rmonitor.common.logger.Logger;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0013H\u0002J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020\u0006J\u0006\u0010-\u001a\u00020\u0006R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/tencent/bugly/common/replay/video/SimpleVideoEncoder;", "", "muxerConfig", "Lcom/tencent/bugly/common/replay/video/MuxerConfig;", "onClose", "Lkotlin/Function0;", "", "(Lcom/tencent/bugly/common/replay/video/MuxerConfig;Lkotlin/jvm/functions/Function0;)V", "TAG", "", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", TypedValues.TransitionType.S_DURATION, "", "getDuration", "()J", "frameMuxer", "Lcom/tencent/bugly/common/replay/video/SimpleMp4FrameMuxer;", "hasExynosCodec", "", "getHasExynosCodec", "()Z", "hasExynosCodec$delegate", "Lkotlin/Lazy;", "mediaCodec", "Landroid/media/MediaCodec;", "getMediaCodec$bugly_pro_release", "()Landroid/media/MediaCodec;", "mediaFormat", "Landroid/media/MediaFormat;", "getMediaFormat", "()Landroid/media/MediaFormat;", "mediaFormat$delegate", "getMuxerConfig", "()Lcom/tencent/bugly/common/replay/video/MuxerConfig;", "getOnClose", "()Lkotlin/jvm/functions/Function0;", "surface", "Landroid/view/Surface;", "drainCodec", "endOfStream", "encode", "image", "Landroid/graphics/Bitmap;", "release", "start", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@TargetApi(26)
public final class SimpleVideoEncoder {

    @NotNull
    private final String TAG;

    @NotNull
    private final MediaCodec.BufferInfo bufferInfo;

    @NotNull
    private final SimpleMp4FrameMuxer frameMuxer;

    /* JADX INFO: renamed from: hasExynosCodec$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hasExynosCodec;

    @NotNull
    private final MediaCodec mediaCodec;

    /* JADX INFO: renamed from: mediaFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mediaFormat;

    @NotNull
    private final MuxerConfig muxerConfig;

    @Nullable
    private final Function0<Unit> onClose;

    @Nullable
    private Surface surface;

    public SimpleVideoEncoder(@NotNull MuxerConfig muxerConfig, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(muxerConfig, "muxerConfig");
        this.muxerConfig = muxerConfig;
        this.onClose = function0;
        this.TAG = "SimpleVideoEncoder";
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.hasExynosCodec = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<Boolean>() { // from class: com.tencent.bugly.common.replay.video.SimpleVideoEncoder$hasExynosCodec$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                boolean z11 = false;
                MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                Intrinsics.checkNotNullExpressionValue(codecInfos, "MediaCodecList(MediaCode…)\n            .codecInfos");
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    String name = mediaCodecInfo.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "it.name");
                    if (StringsKt.contains$default((CharSequence) name, (CharSequence) "c2.exynos", false, 2, (Object) null)) {
                        z11 = true;
                        break;
                    }
                }
                return Boolean.valueOf(z11);
            }
        });
        MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        Intrinsics.checkNotNullExpressionValue(mediaCodecCreateByCodecName, "if (hasExynosCodec) {\n  …onfig.mimeType)\n        }");
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MediaFormat>() { // from class: com.tencent.bugly.common.replay.video.SimpleVideoEncoder$mediaFormat$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final MediaFormat invoke() {
                int bitRate = this.this$0.getMuxerConfig().getBitRate();
                try {
                    MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
                    if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                        Logger.INSTANCE.mo77130d(this.this$0.TAG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one");
                        Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                        Intrinsics.checkNotNullExpressionValue(objClamp, "videoCapabilities.bitrateRange.clamp(bitRate)");
                        bitRate = ((Number) objClamp).intValue();
                    }
                } catch (Throwable th2) {
                    Logger.INSTANCE.exception(this.this$0.TAG, "Could not retrieve MediaCodec info", th2);
                }
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
                Intrinsics.checkNotNullExpressionValue(mediaFormatCreateVideoFormat, "createVideoFormat(\n     …recordingHeight\n        )");
                mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
                mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
                mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
                mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
                return mediaFormatCreateVideoFormat;
            }
        });
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "muxerConfig.file.absolutePath");
        this.frameMuxer = new SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    private final void drainCodec(boolean endOfStream) {
        ByteBuffer byteBuffer;
        Logger logger = Logger.INSTANCE;
        logger.mo77130d(this.TAG, "[Encoder]: drainCodec(" + endOfStream + ')');
        if (endOfStream) {
            logger.mo77130d(this.TAG, "[Encoder]: sending EOS to encoder");
            this.mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.mediaCodec.getOutputBuffers();
        while (true) {
            int iDequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(this.bufferInfo, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
            if (iDequeueOutputBuffer == -1) {
                if (!endOfStream) {
                    return;
                } else {
                    Logger.INSTANCE.mo77130d(this.TAG, "[Encoder]: no output available, spinning to await EOS");
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = this.mediaCodec.getOutputBuffers();
            } else if (iDequeueOutputBuffer == -2) {
                if (this.frameMuxer.getStarted()) {
                    throw new RuntimeException("format changed twice");
                }
                MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                Intrinsics.checkNotNullExpressionValue(outputFormat, "mediaCodec.outputFormat");
                Logger.INSTANCE.mo77130d(this.TAG, "[Encoder]: encoder output format changed: " + outputFormat);
                this.frameMuxer.start(outputFormat);
            } else if (iDequeueOutputBuffer < 0) {
                Logger.INSTANCE.mo77130d(this.TAG, C33986vi.m75326a("[Encoder]: unexpected result from encoder.dequeueOutputBuffer: ", iDequeueOutputBuffer));
            } else {
                if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                    throw new RuntimeException("encoderOutputBuffer " + iDequeueOutputBuffer + " was null");
                }
                if ((this.bufferInfo.flags & 2) != 0) {
                    Logger.INSTANCE.mo77130d(this.TAG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG");
                    this.bufferInfo.size = 0;
                }
                if (this.bufferInfo.size != 0) {
                    if (!this.frameMuxer.getStarted()) {
                        throw new RuntimeException("muxer hasn't started");
                    }
                    this.frameMuxer.muxVideoFrame(byteBuffer, this.bufferInfo);
                    Logger.INSTANCE.mo77130d(this.TAG, "[Encoder]: sent " + this.bufferInfo.size + " bytes to muxer");
                }
                this.mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                if ((this.bufferInfo.flags & 4) != 0) {
                    if (endOfStream) {
                        Logger.INSTANCE.mo77130d(this.TAG, "[Encoder]: end of stream reached");
                        return;
                    } else {
                        Logger.INSTANCE.mo77130d(this.TAG, "[Encoder]: reached end of stream unexpectedly");
                        return;
                    }
                }
            }
        }
    }

    private final boolean getHasExynosCodec() {
        return ((Boolean) this.hasExynosCodec.getValue()).booleanValue();
    }

    private final MediaFormat getMediaFormat() {
        return (MediaFormat) this.mediaFormat.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x0036  */
    public final void encode(@NotNull Bitmap image) {
        Surface surface;
        Canvas canvasLockCanvas;
        Intrinsics.checkNotNullParameter(image, "image");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        if (StringsKt.contains((CharSequence) MANUFACTURER, (CharSequence) JPushConstants.Manufacturer.XIAOMI, true)) {
            surface = this.surface;
            if (surface != null) {
                canvasLockCanvas = surface.lockCanvas(null);
            } else {
                canvasLockCanvas = null;
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
            if (StringsKt.contains((CharSequence) MANUFACTURER, (CharSequence) "motorola", true)) {
                surface = this.surface;
                if (surface != null) {
                    canvasLockCanvas = surface.lockCanvas(null);
                } else {
                    canvasLockCanvas = null;
                }
            } else {
                Surface surface2 = this.surface;
                if (surface2 != null) {
                    canvasLockCanvas = surface2.lockHardwareCanvas();
                } else {
                    canvasLockCanvas = null;
                }
            }
        }
        if (canvasLockCanvas != null) {
            canvasLockCanvas.drawBitmap(image, 0.0f, 0.0f, (Paint) null);
        }
        Surface surface3 = this.surface;
        if (surface3 != null) {
            surface3.unlockCanvasAndPost(canvasLockCanvas);
        }
        drainCodec(false);
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    @NotNull
    /* JADX INFO: renamed from: getMediaCodec$bugly_pro_release, reason: from getter */
    public final MediaCodec getMediaCodec() {
        return this.mediaCodec;
    }

    @NotNull
    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    @Nullable
    public final Function0<Unit> getOnClose() {
        return this.onClose;
    }

    public final void release() {
        try {
            Function0<Unit> function0 = this.onClose;
            if (function0 != null) {
                function0.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(this.TAG, "Failed to properly release video encoder", th2);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }

    public /* synthetic */ SimpleVideoEncoder(MuxerConfig muxerConfig, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(muxerConfig, (i11 & 2) != 0 ? null : function0);
    }
}
