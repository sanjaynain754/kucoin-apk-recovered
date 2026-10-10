package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.storage.PersistStorageMmkv;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.HandlerC34758w;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.common.EnumC34875c;
import com.tencent.liteav.videobase.common.EnumC34876d;
import com.tencent.liteav.videobase.utils.C34898d;
import com.tencent.liteav.videobase.videobase.C34908e;
import com.tencent.liteav.videobase.videobase.EnumC34909f;
import com.tencent.liteav.videobase.videobase.InterfaceC34906c;
import com.tencent.liteav.videoconsumer.decoder.SpsInfo;
import com.tencent.liteav.videoproducer.producer.InterfaceC34969a;
import com.tencent.liteav.videoproducer.producer.ServerVideoProducerConfig;
import com.tencent.ugc.videobase.base.VideoPersistStorageKey;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.encoder.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34965b {

    /* JADX INFO: renamed from: a */
    public String f74746a;

    /* JADX INFO: renamed from: b */
    public final Bundle f74747b;

    /* JADX INFO: renamed from: c */
    public CustomHandler f74748c;

    /* JADX INFO: renamed from: d */
    public MediaCodec f74749d;

    /* JADX INFO: renamed from: e */
    public InterfaceC34968e.a f74750e;

    /* JADX INFO: renamed from: f */
    public VideoEncodeParams f74751f;

    /* JADX INFO: renamed from: l */
    private final InterfaceC34906c f74757l;

    /* JADX INFO: renamed from: y */
    private ServerVideoProducerConfig f74770y;

    /* JADX INFO: renamed from: n */
    private byte[] f74759n = null;

    /* JADX INFO: renamed from: o */
    private boolean f74760o = true;

    /* JADX INFO: renamed from: g */
    public long f74752g = 0;

    /* JADX INFO: renamed from: h */
    public HandlerC34758w f74753h = null;

    /* JADX INFO: renamed from: p */
    private long f74761p = 0;

    /* JADX INFO: renamed from: q */
    private long f74762q = 0;

    /* JADX INFO: renamed from: r */
    private long f74763r = 0;

    /* JADX INFO: renamed from: s */
    private int f74764s = -1;

    /* JADX INFO: renamed from: i */
    public final Deque<Long> f74754i = new LinkedList();

    /* JADX INFO: renamed from: t */
    private long f74765t = 0;

    /* JADX INFO: renamed from: u */
    private long f74766u = 0;

    /* JADX INFO: renamed from: v */
    private long f74767v = 0;

    /* JADX INFO: renamed from: w */
    private long f74768w = Long.MIN_VALUE;

    /* JADX INFO: renamed from: x */
    private boolean f74769x = false;

    /* JADX INFO: renamed from: z */
    private double f74771z = 0.0d;

    /* JADX INFO: renamed from: A */
    private long f74737A = 0;

    /* JADX INFO: renamed from: B */
    private long f74738B = 0;

    /* JADX INFO: renamed from: C */
    private long f74739C = 0;

    /* JADX INFO: renamed from: D */
    private long f74740D = 0;

    /* JADX INFO: renamed from: E */
    private long f74741E = 0;

    /* JADX INFO: renamed from: F */
    private final Deque<Long> f74742F = new LinkedList();

    /* JADX INFO: renamed from: G */
    private int f74743G = 0;

    /* JADX INFO: renamed from: j */
    public final AtomicLong f74755j = new AtomicLong(0);

    /* JADX INFO: renamed from: H */
    private final List<Long> f74744H = new ArrayList();

    /* JADX INFO: renamed from: I */
    private final AtomicLong f74745I = new AtomicLong(0);

    /* JADX INFO: renamed from: k */
    public final Runnable f74756k = RunnableC34966c.m76770a(this);

    /* JADX INFO: renamed from: m */
    private final InterfaceC34969a.a f74758m = InterfaceC34969a.a.STREAM_TYPE_BIG_VIDEO;

    /* JADX INFO: renamed from: a */
    public final void m76766a(ServerVideoProducerConfig serverVideoProducerConfig) {
        this.f74770y = serverVideoProducerConfig;
        LiteavLog.m76087i(this.f74746a, "Set serverConfig: " + this.f74770y);
    }

    /* JADX INFO: renamed from: b */
    public final void m76767b() {
        if (this.f74753h != null) {
            LiteavLog.m76087i(this.f74746a, "stopEosTimer");
            this.f74753h.m76147a();
            this.f74753h = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76768c() {
        int i11;
        byte[] bArrM76758a;
        byte[] bArr;
        boolean z11;
        Long lPeekFirst;
        if (this.f74749d == null) {
            return;
        }
        while (true) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            try {
                int iDequeueOutputBuffer = this.f74749d.dequeueOutputBuffer(bufferInfo, 0L);
                if (iDequeueOutputBuffer == -1) {
                    break;
                }
                if (iDequeueOutputBuffer == -3) {
                    LiteavLog.m76087i(this.f74746a, "encoder output buffers changed");
                } else if (iDequeueOutputBuffer == -2) {
                    try {
                        MediaFormat outputFormat = this.f74749d.getOutputFormat();
                        InterfaceC34968e.a aVar = this.f74750e;
                        if (aVar != null) {
                            aVar.onOutputFormatChanged(outputFormat);
                        }
                        LiteavLog.m76088i(this.f74746a, "encoder output format changed: %s", outputFormat);
                    } catch (Throwable th2) {
                        m76756a("getOutputFormat failed." + th2.getMessage());
                    }
                } else {
                    if (iDequeueOutputBuffer < 0) {
                        m76756a("dequeueOutputBuffer return ".concat(String.valueOf(iDequeueOutputBuffer)));
                        break;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    this.f74744H.add(Long.valueOf(jElapsedRealtime - this.f74755j.getAndSet(jElapsedRealtime)));
                    try {
                        ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? this.f74749d.getOutputBuffer(iDequeueOutputBuffer) : this.f74749d.getOutputBuffers()[iDequeueOutputBuffer];
                        if (outputBuffer == null || ((i11 = bufferInfo.size) == 0 && (bufferInfo.flags & 4) == 0)) {
                            m76756a("size is zero, but it isn't end of stream");
                        } else {
                            byte[] bArrM76560a = C34898d.m76560a(i11);
                            if (bArrM76560a == null) {
                                bArrM76758a = null;
                            } else {
                                outputBuffer.position(bufferInfo.offset);
                                outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                outputBuffer.get(bArrM76560a);
                                bArrM76758a = m76758a(bArrM76560a);
                                VideoEncodeParams videoEncodeParams = this.f74751f;
                                if (videoEncodeParams != null && !videoEncodeParams.annexb) {
                                    bArrM76758a = m76760b(bArrM76758a);
                                }
                            }
                            if (bArrM76758a == null) {
                                m76756a("modifyEncodedData return null byte array");
                            } else {
                                int i12 = bufferInfo.flags;
                                boolean z12 = true;
                                boolean z13 = (i12 & 2) > 0;
                                boolean z14 = (i12 & 1) > 0;
                                if (z13 && z14) {
                                    VideoEncodeParams videoEncodeParams2 = this.f74751f;
                                    this.f74759n = SpsInfo.nativeGetSpsPps(bArrM76758a, videoEncodeParams2 == null || videoEncodeParams2.codecType == CodecType.H264, videoEncodeParams2 == null || videoEncodeParams2.annexb);
                                } else if (z13) {
                                    this.f74759n = (byte[]) bArrM76758a.clone();
                                } else if (this.f74760o && z14) {
                                    byte[] bArr2 = this.f74759n;
                                    if (bArr2 != null) {
                                        byte[] bArrM76560a2 = C34898d.m76560a(bArr2.length + bArrM76758a.length);
                                        if (bArrM76560a2 != null) {
                                            byte[] bArr3 = this.f74759n;
                                            System.arraycopy(bArr3, 0, bArrM76560a2, 0, bArr3.length);
                                            System.arraycopy(bArrM76758a, 0, bArrM76560a2, this.f74759n.length, bArrM76758a.length);
                                            bArrM76758a = bArrM76560a2;
                                        } else {
                                            m76756a("add spspps for I frame, allocate buffer failed.");
                                        }
                                    } else {
                                        m76756a("mSpsPps is null.");
                                    }
                                }
                                boolean z15 = (bufferInfo.flags & 1) > 0;
                                if (z15) {
                                    this.f74764s = -1;
                                }
                                VideoEncodeParams videoEncodeParams3 = this.f74751f;
                                if (videoEncodeParams3 != null && !videoEncodeParams3.fullIFrame) {
                                    int i13 = this.f74764s + 1;
                                    this.f74764s = i13;
                                    if (i13 == videoEncodeParams3.fps * videoEncodeParams3.gop) {
                                        m76769d();
                                    }
                                }
                                long length = bArrM76758a.length;
                                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                if (z15) {
                                    z11 = z15;
                                    long j11 = this.f74740D;
                                    if (jElapsedRealtime2 > 1000 + j11) {
                                        bArr = bArrM76758a;
                                        this.f74739C = (long) (((this.f74741E * 8000.0d) / (jElapsedRealtime2 - j11)) / 1024.0d);
                                        this.f74741E = 0L;
                                        this.f74740D = jElapsedRealtime2;
                                        if (!this.f74742F.isEmpty()) {
                                            int i14 = this.f74751f.fps;
                                            if (((float) (((double) i14) - this.f74771z)) <= Math.max(i14 / 2.0f, 5.0f) && (lPeekFirst = this.f74742F.peekFirst()) != null && SystemClock.elapsedRealtime() > lPeekFirst.longValue()) {
                                                this.f74742F.removeFirst();
                                                if (((long) this.f74743G) - this.f74739C > Math.max(this.f74751f.bitrate / 2, 100)) {
                                                    LiteavLog.m76093w(this.f74746a, "restart hardware encoder because real bitrate is too low.expectBitrate: " + this.f74743G + ", realBitrate=" + this.f74739C);
                                                    this.f74747b.putBoolean("need_restart_when_down_bitrate", true);
                                                    this.f74756k.run();
                                                    this.f74742F.clear();
                                                }
                                            }
                                        }
                                    } else {
                                        bArr = bArrM76758a;
                                    }
                                } else {
                                    bArr = bArrM76758a;
                                    z11 = z15;
                                }
                                this.f74741E += length;
                                m76761e();
                                if (z11) {
                                    this.f74762q++;
                                    this.f74763r = 0L;
                                } else {
                                    this.f74763r++;
                                }
                                this.f74761p++;
                                Long lPollFirst = this.f74754i.pollFirst();
                                long jLongValue = lPollFirst == null ? 0L : lPollFirst.longValue();
                                long millis = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
                                if (this.f74765t == 0) {
                                    this.f74765t = jLongValue;
                                }
                                if (this.f74766u == 0) {
                                    this.f74766u = millis;
                                }
                                long j12 = millis + (this.f74765t - this.f74766u);
                                long j13 = this.f74767v;
                                if (jLongValue <= j13) {
                                    jLongValue = j13 + 1;
                                }
                                if (jLongValue > j12) {
                                    jLongValue = j12;
                                }
                                this.f74767v = jLongValue;
                                EncodedVideoFrame encodedVideoFrame = new EncodedVideoFrame();
                                VideoEncodeParams videoEncodeParams4 = this.f74751f;
                                if (videoEncodeParams4 == null || !videoEncodeParams4.isEnablesUnlimitedGop()) {
                                    encodedVideoFrame.nalType = z11 ? EnumC34875c.IDR : EnumC34875c.P;
                                } else {
                                    encodedVideoFrame.nalType = z11 ? EnumC34875c.IDR : EnumC34875c.P_MULTI_REF;
                                }
                                ByteBuffer byteBufferM76561b = C34898d.m76561b(bArr.length);
                                encodedVideoFrame.data = byteBufferM76561b;
                                if (byteBufferM76561b == null) {
                                    m76756a("allocate direct buffer for nal failed");
                                } else {
                                    byteBufferM76561b.put(bArr);
                                    encodedVideoFrame.data.rewind();
                                    encodedVideoFrame.dts = jLongValue;
                                    encodedVideoFrame.pts = j12;
                                    encodedVideoFrame.info = bufferInfo;
                                    encodedVideoFrame.gopIndex = this.f74762q;
                                    long j14 = this.f74763r;
                                    encodedVideoFrame.frameIndex = j14;
                                    encodedVideoFrame.gopFrameIndex = j14;
                                    if (!z11) {
                                        j14--;
                                    }
                                    encodedVideoFrame.refFrameIndex = j14;
                                    encodedVideoFrame.profileType = EnumC34876d.BASELINE;
                                    VideoEncodeParams videoEncodeParams5 = this.f74751f;
                                    encodedVideoFrame.codecType = videoEncodeParams5.codecType;
                                    encodedVideoFrame.width = videoEncodeParams5.width;
                                    encodedVideoFrame.height = videoEncodeParams5.height;
                                    if ((bufferInfo.flags & 4) > 0) {
                                        m76767b();
                                    } else {
                                        boolean z16 = videoEncodeParams5.enableBFrame;
                                        if (!z16 && !this.f74769x && j12 < this.f74768w) {
                                            LiteavLog.m76088i(this.f74746a, "has B frame,isEnablesBframe=%b,mLastPresentationTimestamp=%d,packet.pts=%d", Boolean.valueOf(z16), Long.valueOf(this.f74768w), Long.valueOf(encodedVideoFrame.pts));
                                            this.f74769x = true;
                                            PersistStorageMmkv persistStorageMmkv = new PersistStorageMmkv(PersistStorage.GLOBAL_DOMAIN);
                                            persistStorageMmkv.put(VideoPersistStorageKey.CONFIG_KEY_LOCAL_RTC_ENCODE_HIGH_PROFILE, 0);
                                            persistStorageMmkv.commit();
                                            InterfaceC34968e.a aVar2 = this.f74750e;
                                            if (aVar2 != null) {
                                                aVar2.mo76771a();
                                            }
                                        }
                                        this.f74768w = encodedVideoFrame.pts;
                                        z12 = false;
                                    }
                                    InterfaceC34968e.a aVar3 = this.f74750e;
                                    if (aVar3 != null) {
                                        aVar3.onEncodedNAL(encodedVideoFrame, z12);
                                    }
                                }
                            }
                        }
                        MediaCodec mediaCodec = this.f74749d;
                        if (mediaCodec == null) {
                            return;
                        }
                        try {
                            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        } catch (Throwable th3) {
                            m76756a("releaseOutputBuffer failed." + th3.getMessage());
                        }
                    } catch (Throwable th4) {
                        m76756a("getOutputBuffer failed." + th4.getMessage());
                    }
                }
            } catch (Throwable th5) {
                m76756a("dequeueOutputBuffer failed." + th5.getMessage());
            }
        }
        if (this.f74754i.isEmpty()) {
            return;
        }
        int i15 = this.f74751f.fps;
        int i16 = i15 != 0 ? 500 / i15 : 10;
        if (this.f74748c.hasMessages(10)) {
            return;
        }
        this.f74748c.sendEmptyMessageDelayed(10, i16);
    }

    public C34965b(Bundle bundle, InterfaceC34906c interfaceC34906c, String str) {
        this.f74757l = interfaceC34906c;
        this.f74747b = bundle;
        this.f74746a = str + "SurfaceInputVideoEncoder_" + hashCode();
    }

    /* JADX INFO: renamed from: e */
    private void m76761e() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime <= this.f74737A + TimeUnit.SECONDS.toMillis(2L)) {
            this.f74738B++;
            return;
        }
        this.f74771z = (this.f74738B * 1000.0d) / (jElapsedRealtime - this.f74737A);
        this.f74738B = 1L;
        this.f74737A = jElapsedRealtime;
        Iterator<Long> it = this.f74744H.iterator();
        long j11 = -1;
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (j11 < jLongValue) {
                j11 = jLongValue;
            }
        }
        this.f74745I.set(j11);
        this.f74744H.clear();
    }

    /* JADX INFO: renamed from: a */
    public final void m76764a(int i11) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i12 = 1; i12 <= 3; i12++) {
            this.f74742F.addLast(Long.valueOf(((long) (i12 * 2000)) + jElapsedRealtime));
        }
        this.f74743G = i11;
    }

    /* JADX INFO: renamed from: d */
    public final void m76769d() {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 19 && this.f74749d != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                this.f74749d.setParameters(bundle);
            } catch (Throwable th2) {
                LiteavLog.m76084e(this.f74746a, "requestSyncFrame failed.", th2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static byte[] m76760b(byte[] bArr) {
        int length = bArr.length;
        ArrayList<int[]> arrayList = new ArrayList(20);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i11 > length) {
                break;
            }
            int i15 = i11 + 2;
            if (i15 < length && bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i15] == 1) {
                i14 = 3;
            } else {
                int i16 = i11 + 3;
                if (i16 < length && bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i15] == 0 && bArr[i16] == 1) {
                    i14 = 4;
                }
            }
            if (i14 == 3 || i14 == 4 || i11 == length) {
                if (i13 != i11) {
                    arrayList.add(new int[]{i13, i11});
                    i12 += i11 - i13;
                }
                i13 = i11 + i14;
            }
            i11 += i14;
        }
        byte[] bArrM76560a = C34898d.m76560a(i12 + (arrayList.size() * 4));
        if (bArrM76560a == null) {
            return bArr;
        }
        int i17 = 0;
        for (int[] iArr : arrayList) {
            int i18 = iArr[1] - iArr[0];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(new byte[4]).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.putInt(i18);
            System.arraycopy(byteBufferOrder.array(), 0, bArrM76560a, i17, 4);
            int i19 = i17 + 4;
            System.arraycopy(bArr, iArr[0], bArrM76560a, i19, i18);
            i17 = i19 + i18;
        }
        return bArrM76560a;
    }

    /* JADX INFO: renamed from: a */
    public final void m76765a(MediaCodec mediaCodec, int i11) {
        if (mediaCodec == null || LiteavSystemInfo.getSystemOSVersionInt() < 19) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i11 * 1024);
            mediaCodec.setParameters(bundle);
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.f74746a, "updateBitrateToMediaCodec failed.", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76756a(String str) {
        LiteavLog.m76083e(this.f74746a, "notifyEncodeError message = ".concat(String.valueOf(str)));
        InterfaceC34968e.a aVar = this.f74750e;
        if (aVar != null) {
            aVar.onEncodedFail(C34908e.a.ERR_VIDEO_ENCODE_FAIL);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76763a() {
        this.f74748c.removeMessages(10);
        m76755a(this.f74749d);
        this.f74749d = null;
    }

    /* JADX INFO: renamed from: b */
    private MediaCodec m76759b(String str) throws Throwable {
        String name;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
        try {
            name = mediaCodecCreateEncoderByType.getName();
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.f74746a, "mediaCodec getName failed.", th2);
            name = null;
        }
        LiteavLog.m76087i(this.f74746a, "codecName=".concat(String.valueOf(name)));
        if (name == null || !name.equals("OMX.google.h264.encoder")) {
            return mediaCodecCreateEncoderByType;
        }
        LiteavLog.m76093w(this.f74746a, "will be destroyed codecName=".concat(name));
        m76755a(mediaCodecCreateEncoderByType);
        throw new IOException("this is a Google H264 soft encoder. cancel use MediaCodec.");
    }

    /* JADX INFO: renamed from: a */
    public final Surface m76762a(VideoEncodeParams videoEncodeParams) {
        String str;
        ServerVideoProducerConfig serverVideoProducerConfig;
        MediaCodec mediaCodecM76759b;
        Surface surfaceCreateInputSurface;
        MediaFormat mediaFormatM76752a;
        boolean z11;
        int integer;
        this.f74752g = SystemClock.elapsedRealtime();
        this.f74768w = Long.MIN_VALUE;
        if (videoEncodeParams.bitrate == 0) {
            int i11 = videoEncodeParams.width;
            int i12 = videoEncodeParams.height;
            videoEncodeParams.bitrate = (int) (Math.sqrt((i11 * i11) + (i12 * i12)) * 1.2d);
        }
        VideoEncodeParams videoEncodeParams2 = new VideoEncodeParams(videoEncodeParams);
        this.f74751f = videoEncodeParams2;
        this.f74761p = videoEncodeParams2.baseFrameIndex;
        this.f74762q = videoEncodeParams2.baseGopIndex;
        this.f74763r = 0L;
        if (videoEncodeParams2.codecType == CodecType.H265) {
            str = "video/hevc";
        } else {
            str = "video/avc";
        }
        VideoEncoderDef.EncoderProfile encoderProfile = videoEncodeParams2.encoderProfile;
        VideoEncoderDef.EncoderProfile encoderProfile2 = VideoEncoderDef.EncoderProfile.PROFILE_MAIN;
        if (encoderProfile == encoderProfile2) {
            videoEncodeParams2.encoderProfile = VideoEncoderDef.EncoderProfile.PROFILE_HIGH;
        }
        VideoEncoderDef.EncoderProfile encoderProfile3 = videoEncodeParams2.encoderProfile;
        VideoEncoderDef.EncoderProfile encoderProfile4 = VideoEncoderDef.EncoderProfile.PROFILE_HIGH;
        if ((encoderProfile3 == encoderProfile4 || encoderProfile3 == encoderProfile2) && (serverVideoProducerConfig = this.f74770y) != null && !serverVideoProducerConfig.isHardwareEncoderHighProfileAllowed()) {
            this.f74751f.encoderProfile = VideoEncoderDef.EncoderProfile.PROFILE_BASELINE;
        }
        VideoEncodeParams videoEncodeParams3 = this.f74751f;
        VideoEncoderDef.EncoderProfile encoderProfile5 = videoEncodeParams3.encoderProfile;
        if ((encoderProfile5 == encoderProfile4 || encoderProfile5 == encoderProfile2) && !videoEncodeParams3.enableBFrame) {
            Integer num = new PersistStorageMmkv(PersistStorage.GLOBAL_DOMAIN).getInt(VideoPersistStorageKey.CONFIG_KEY_LOCAL_RTC_ENCODE_HIGH_PROFILE);
            LiteavLog.m76087i(this.f74746a, "enable high profile from persist storage:".concat(String.valueOf(num)));
            if (num != null && num.intValue() == 0) {
                this.f74751f.encoderProfile = VideoEncoderDef.EncoderProfile.PROFILE_BASELINE;
            }
        }
        try {
            mediaCodecM76759b = m76759b(str);
            try {
                C34964a c34964a = new C34964a(mediaCodecM76759b, str, this.f74751f, this.f74770y.isHardwareEncoderBitrateModeCBRSupported());
                c34964a.f74729a = true;
                MediaFormat mediaFormatM76752a2 = c34964a.m76752a();
                if (m76757a(mediaCodecM76759b, mediaFormatM76752a2)) {
                    mediaFormatM76752a = mediaFormatM76752a2;
                    z11 = true;
                } else {
                    z11 = false;
                    c34964a.f74730b = false;
                    mediaFormatM76752a = c34964a.m76752a();
                    if (m76757a(mediaCodecM76759b, mediaFormatM76752a)) {
                        mediaFormatM76752a2 = mediaFormatM76752a;
                        mediaFormatM76752a = mediaFormatM76752a2;
                        z11 = true;
                    }
                }
                if (z11) {
                    surfaceCreateInputSurface = mediaCodecM76759b.createInputSurface();
                    try {
                        mediaCodecM76759b.start();
                        try {
                            this.f74751f.width = mediaFormatM76752a.getInteger("width");
                            this.f74751f.height = mediaFormatM76752a.getInteger("height");
                            this.f74751f.bitrate = mediaFormatM76752a.getInteger("bitrate") / 1024;
                            int i13 = this.f74751f.bitrate;
                            if (LiteavSystemInfo.getSystemOSVersionInt() > 30) {
                                LiteavLog.m76087i(this.f74746a, "resetBitrateAfterApiLevel30,bitrate=".concat(String.valueOf(i13)));
                                m76765a(mediaCodecM76759b, i13);
                            }
                            if (this.f74750e != null) {
                                VideoEncoderDef.BitrateMode bitrateMode = VideoEncoderDef.BitrateMode.UNKNOWN;
                                if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (integer = mediaFormatM76752a.getInteger("bitrate-mode", -1)) != -1) {
                                    if (integer == 0) {
                                        bitrateMode = VideoEncoderDef.BitrateMode.CQ;
                                    } else if (integer == 1) {
                                        bitrateMode = VideoEncoderDef.BitrateMode.VBR;
                                    } else if (integer == 2) {
                                        bitrateMode = VideoEncoderDef.BitrateMode.CBR;
                                    }
                                }
                                this.f74750e.onBitrateModeUpdated(bitrateMode);
                            }
                        } catch (Throwable th2) {
                            LiteavLog.m76084e(this.f74746a, "MediaFormat get key fail", th2);
                        }
                        LiteavLog.m76087i(this.f74746a, "start MediaCodec with format: ".concat(String.valueOf(mediaFormatM76752a)));
                        this.f74749d = mediaCodecM76759b;
                        return surfaceCreateInputSurface;
                    } catch (Throwable th3) {
                        th = th3;
                        if (surfaceCreateInputSurface != null) {
                            surfaceCreateInputSurface.release();
                        }
                        m76755a(mediaCodecM76759b);
                        C34908e.c cVar = C34908e.c.WARNING_VIDEO_ENCODE_START_FAILED;
                        String str2 = "Start encoder failed:" + th.getMessage();
                        if (LiteavSystemInfo.getSystemOSVersionInt() >= 23 && (th instanceof MediaCodec.CodecException) && th.getErrorCode() == 1100) {
                            cVar = C34908e.c.WARNING_VIDEO_ENCODE_START_FAILED_INSUFFICIENT_RESOURCE;
                            str2 = "Insufficient resource, Start encoder failed:" + th.getMessage();
                        }
                        this.f74757l.updateStatus(EnumC34909f.STATUS_VIDEO_HW_ENCODE_START_ERROR_TYPE, this.f74758m.mValue, Integer.valueOf(cVar.mValue));
                        this.f74757l.notifyWarning(cVar, str2);
                        LiteavLog.m76084e(this.f74746a, "Start MediaCodec failed,encode params:" + this.f74751f, th);
                        return null;
                    }
                }
                throw new IOException("configure encoder failed.");
            } catch (Throwable th4) {
                th = th4;
                surfaceCreateInputSurface = null;
            }
        } catch (Throwable th5) {
            th = th5;
            mediaCodecM76759b = null;
            surfaceCreateInputSurface = null;
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m76757a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (mediaFormat == null) {
            return false;
        }
        try {
            LiteavLog.m76088i(this.f74746a, "configure format: %s", mediaFormat);
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            return true;
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.f74746a, "configure failed.", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m76758a(byte[] bArr) {
        byte[] bArrM76560a;
        if (bArr.length > 5 && bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0 && bArr[4] == 0 && bArr[5] == 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 3;
                if (i12 >= bArr.length) {
                    i11 = 0;
                    break;
                }
                byte b11 = bArr[i11];
                if ((b11 == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 0 && bArr[i12] == 1) || (b11 == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 1)) {
                    break;
                }
                i11++;
            }
            if (i11 != 0 && (bArrM76560a = C34898d.m76560a(bArr.length - i11)) != null) {
                System.arraycopy(bArr, i11, bArrM76560a, 0, bArrM76560a.length);
                return bArrM76560a;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    private void m76755a(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Throwable th2) {
            LiteavLog.m76084e(this.f74746a, "destroy mediaCodec stop failed.", th2);
        }
        try {
            mediaCodec.release();
        } catch (Throwable th3) {
            LiteavLog.m76084e(this.f74746a, "destroy mediaCodec release failed.", th3);
        }
        LiteavLog.m76087i(this.f74746a, "destroy mediaCodec");
    }
}
