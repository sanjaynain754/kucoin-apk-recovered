package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.Point;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import com.facebook.jni.annotations.DoNotStrip;
import com.tencent.ugc.beauty.decoder.MediaUtils;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.shopify.reactnative.skia.d */
/* JADX INFO: compiled from: RNSkVideo.java */
/* JADX INFO: loaded from: classes59.dex */
public class C27769d {

    /* JADX INFO: renamed from: a */
    public final Uri f56516a;

    /* JADX INFO: renamed from: b */
    public final Context f56517b;

    /* JADX INFO: renamed from: c */
    public MediaExtractor f56518c;

    /* JADX INFO: renamed from: d */
    public MediaCodec f56519d;

    /* JADX INFO: renamed from: e */
    public ImageReader f56520e;

    /* JADX INFO: renamed from: f */
    public Surface f56521f;

    /* JADX INFO: renamed from: g */
    public MediaPlayer f56522g;

    /* JADX INFO: renamed from: h */
    public double f56523h;

    /* JADX INFO: renamed from: i */
    public double f56524i;

    /* JADX INFO: renamed from: j */
    public int f56525j = 0;

    /* JADX INFO: renamed from: k */
    public int f56526k = 0;

    /* JADX INFO: renamed from: l */
    public int f56527l = 0;

    /* JADX INFO: renamed from: m */
    public boolean f56528m = false;

    /* JADX INFO: renamed from: b */
    public final void m68605b() {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int iDequeueInputBuffer = this.f56519d.dequeueInputBuffer(10000L);
        if (iDequeueInputBuffer >= 0) {
            int sampleData = this.f56518c.readSampleData(this.f56519d.getInputBuffer(iDequeueInputBuffer), 0);
            if (sampleData < 0) {
                this.f56519d.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
            } else {
                this.f56519d.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.f56518c.getSampleTime(), 0);
                this.f56518c.advance();
            }
        }
        int iDequeueOutputBuffer = this.f56519d.dequeueOutputBuffer(bufferInfo, 10000L);
        if (iDequeueOutputBuffer >= 0) {
            this.f56519d.releaseOutputBuffer(iDequeueOutputBuffer, true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m68606c() {
        int iDequeueOutputBuffer = this.f56519d.dequeueOutputBuffer(new MediaCodec.BufferInfo(), 0L);
        if (iDequeueOutputBuffer < 0) {
            return false;
        }
        this.f56519d.releaseOutputBuffer(iDequeueOutputBuffer, true);
        return true;
    }

    @DoNotStrip
    public double getDuration() {
        return this.f56523h;
    }

    @DoNotStrip
    public double getFrameRate() {
        return this.f56524i;
    }

    @DoNotStrip
    public int getRotationDegrees() {
        return this.f56525j;
    }

    @DoNotStrip
    public Point getSize() {
        return new Point(this.f56526k, this.f56527l);
    }

    @DoNotStrip
    public void pause() {
        MediaPlayer mediaPlayer = this.f56522g;
        if (mediaPlayer == null || !this.f56528m) {
            return;
        }
        mediaPlayer.pause();
        this.f56528m = false;
    }

    @DoNotStrip
    public void play() {
        MediaPlayer mediaPlayer = this.f56522g;
        if (mediaPlayer == null || this.f56528m) {
            return;
        }
        mediaPlayer.start();
        this.f56528m = true;
    }

    @DoNotStrip
    public void setVolume(float f11) {
        MediaPlayer mediaPlayer = this.f56522g;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f11, f11);
        }
    }

    public C27769d(Context context, String str) {
        this.f56516a = Uri.parse(str);
        this.f56517b = context;
        m68607d();
    }

    /* JADX INFO: renamed from: d */
    public final void m68607d() {
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f56518c = mediaExtractor;
        try {
            mediaExtractor.setDataSource(this.f56517b, this.f56516a, (Map<String, String>) null);
            int iM68609f = m68609f(this.f56518c);
            if (iM68609f >= 0) {
                this.f56518c.selectTrack(iM68609f);
                MediaFormat trackFormat = this.f56518c.getTrackFormat(iM68609f);
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.f56522g = mediaPlayer;
                mediaPlayer.setDataSource(this.f56517b, this.f56516a);
                this.f56522g.setAudioStreamType(3);
                this.f56522g.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.shopify.reactnative.skia.c
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer2) {
                        this.f56515a.m68608e(mediaPlayer2);
                    }
                });
                this.f56522g.prepareAsync();
                if (trackFormat.containsKey("durationUs")) {
                    this.f56523h = trackFormat.getLong("durationUs") / 1000;
                }
                if (trackFormat.containsKey("frame-rate")) {
                    this.f56524i = trackFormat.getInteger("frame-rate");
                }
                if (trackFormat.containsKey(MediaUtils.KEY_ROTATION)) {
                    this.f56525j = trackFormat.getInteger(MediaUtils.KEY_ROTATION);
                }
                this.f56526k = trackFormat.getInteger("width");
                int integer = trackFormat.getInteger("height");
                this.f56527l = integer;
                if (Build.VERSION.SDK_INT >= 29) {
                    this.f56520e = ImageReader.newInstance(this.f56526k, integer, 34, 2, 256L);
                } else {
                    this.f56520e = ImageReader.newInstance(this.f56526k, integer, 34, 2);
                }
                this.f56521f = this.f56520e.getSurface();
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
                this.f56519d = mediaCodecCreateDecoderByType;
                mediaCodecCreateDecoderByType.configure(trackFormat, this.f56521f, (MediaCrypto) null, 0);
                this.f56519d.start();
                return;
            }
            throw new RuntimeException("No video track found in " + this.f56516a);
        } catch (IOException e11) {
            throw new RuntimeException("Failed to initialize extractor or decoder", e11);
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m68608e(MediaPlayer mediaPlayer) {
        this.f56523h = mediaPlayer.getDuration();
        mediaPlayer.start();
        this.f56528m = true;
    }

    /* JADX INFO: renamed from: f */
    public final int m68609f(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i11 = 0; i11 < trackCount; i11++) {
            if (mediaExtractor.getTrackFormat(i11).getString("mime").startsWith("video/")) {
                return i11;
            }
        }
        return -1;
    }

    @DoNotStrip
    public HardwareBuffer nextImage() {
        if (!m68606c()) {
            m68605b();
        }
        Image imageAcquireLatestImage = this.f56520e.acquireLatestImage();
        if (imageAcquireLatestImage != null) {
            HardwareBuffer hardwareBuffer = imageAcquireLatestImage.getHardwareBuffer();
            imageAcquireLatestImage.close();
            return hardwareBuffer;
        }
        return null;
    }

    @DoNotStrip
    public void seek(double d11) {
        long j11 = (long) (1000.0d * d11);
        this.f56518c.seekTo(j11, 2);
        MediaPlayer mediaPlayer = this.f56522g;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo((int) d11, 3);
        }
        MediaCodec mediaCodec = this.f56519d;
        if (mediaCodec != null) {
            mediaCodec.flush();
            boolean z11 = true;
            while (z11) {
                m68605b();
                if (this.f56518c.getSampleTime() >= j11) {
                    z11 = false;
                }
            }
        }
    }
}
