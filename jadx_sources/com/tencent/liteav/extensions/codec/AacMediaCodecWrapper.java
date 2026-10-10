package com.tencent.liteav.extensions.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes59.dex */
public class AacMediaCodecWrapper {

    /* JADX INFO: renamed from: a */
    MediaFormat f73571a;

    /* JADX INFO: renamed from: b */
    int f73572b = 0;

    /* JADX INFO: renamed from: c */
    private final String f73573c;

    /* JADX INFO: renamed from: d */
    private final int f73574d;

    /* JADX INFO: renamed from: e */
    private MediaCodec f73575e;

    /* JADX INFO: renamed from: f */
    private final MediaCodec.BufferInfo f73576f;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.tencent.liteav.extensions.codec.AacMediaCodecWrapper$a */
    public static final class EnumC34759a {

        /* JADX INFO: renamed from: a */
        public static final int f73577a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f73578b = 2;

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ int[] f73579c = {1, 2};
    }

    /* JADX INFO: renamed from: b */
    private ByteBuffer m76159b() {
        try {
            int iDequeueOutputBuffer = this.f73575e.dequeueOutputBuffer(this.f73576f, TimeUnit.MILLISECONDS.toMicros(5L));
            if (iDequeueOutputBuffer == -1) {
                return null;
            }
            if (iDequeueOutputBuffer == -3) {
                Log.m76034i(this.f73573c, "codec output buffers changed.", new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer == -2) {
                this.f73571a = this.f73575e.getOutputFormat();
                Log.m76034i(this.f73573c, "codec output format changed: " + this.f73571a, new Object[0]);
                return null;
            }
            if (iDequeueOutputBuffer < 0) {
                Log.m76033e(this.f73573c, "unexpected result from dequeueOutputBuffer: ".concat(String.valueOf(iDequeueOutputBuffer)), new Object[0]);
                return null;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f73575e.getOutputBuffer(iDequeueOutputBuffer) : this.f73575e.getOutputBuffers()[iDequeueOutputBuffer];
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.f73576f.size);
            byteBufferAllocateDirect.put(outputBuffer);
            this.f73575e.releaseOutputBuffer(iDequeueOutputBuffer, false);
            int i11 = this.f73572b;
            if (i11 > 0) {
                this.f73572b = i11 - 1;
            }
            return byteBufferAllocateDirect;
        } catch (Exception e11) {
            Log.m76033e(this.f73573c, "dequeueOutputBuffer failed. ".concat(String.valueOf(e11)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m76161a(MediaFormat mediaFormat) {
        if (this.f73575e == null && mediaFormat != null) {
            try {
                int i11 = this.f73574d == EnumC34759a.f73577a ? 1 : 0;
                if (i11 != 0) {
                    this.f73575e = MediaCodec.createEncoderByType("audio/mp4a-latm");
                } else {
                    this.f73575e = MediaCodec.createDecoderByType("audio/mp4a-latm");
                }
                this.f73575e.configure(mediaFormat, (Surface) null, (MediaCrypto) null, i11);
                this.f73575e.start();
                return true;
            } catch (IOException e11) {
                Log.m76033e(this.f73573c, "create codec failed. ".concat(String.valueOf(e11)), new Object[0]);
                m76160a();
            }
        }
        return false;
    }

    public ByteBuffer processFrame(ByteBuffer byteBuffer) {
        MediaCodec mediaCodec = this.f73575e;
        if (mediaCodec != null && byteBuffer != null) {
            try {
                ByteBuffer[] inputBuffers = mediaCodec.getInputBuffers();
                if (inputBuffers == null || inputBuffers.length <= 0) {
                    Log.m76033e(this.f73573c, "get invalid input buffers.", new Object[0]);
                } else {
                    int iDequeueInputBuffer = this.f73575e.dequeueInputBuffer(TimeUnit.MILLISECONDS.toMicros(5L));
                    if (iDequeueInputBuffer >= 0) {
                        int iRemaining = byteBuffer.remaining();
                        inputBuffers[iDequeueInputBuffer].put(byteBuffer);
                        this.f73575e.queueInputBuffer(iDequeueInputBuffer, 0, iRemaining, 0L, 0);
                        this.f73572b++;
                    }
                }
            } catch (Exception e11) {
                Log.m76033e(this.f73573c, "feedData failed. ".concat(String.valueOf(e11)), new Object[0]);
            }
            for (int i11 = 0; i11 < 3; i11++) {
                ByteBuffer byteBufferM76159b = m76159b();
                if (byteBufferM76159b != null) {
                    return byteBufferM76159b;
                }
            }
        }
        return null;
    }

    public AacMediaCodecWrapper(int i11) {
        String str;
        this.f73574d = i11;
        if (i11 == EnumC34759a.f73577a) {
            str = "HardwareAacEncoder";
        } else {
            str = "HardwareAacDecoder";
        }
        this.f73573c = str;
        this.f73576f = new MediaCodec.BufferInfo();
    }

    /* JADX INFO: renamed from: a */
    public final void m76160a() {
        MediaCodec mediaCodec = this.f73575e;
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Exception e11) {
            Log.m76033e(this.f73573c, "codec stop failed.".concat(String.valueOf(e11)), new Object[0]);
        }
        try {
            this.f73575e.release();
        } catch (Exception e12) {
            Log.m76033e(this.f73573c, "codec release failed.".concat(String.valueOf(e12)), new Object[0]);
        }
        this.f73575e = null;
        this.f73572b = 0;
    }
}
