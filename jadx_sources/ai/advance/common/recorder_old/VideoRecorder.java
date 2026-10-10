package ai.advance.common.recorder_old;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33879qb;
import com.tencent.bugly.proguard.C34004wg;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p326i.C38390w;
import p353j.C40194a;
import p387k.C40832g;

/* JADX INFO: loaded from: classes23.dex */
@RequiresApi(api = 18)
public class VideoRecorder {

    /* JADX INFO: renamed from: A */
    public int f899A;

    /* JADX INFO: renamed from: B */
    public long f900B;

    /* JADX INFO: renamed from: C */
    public int f901C;

    /* JADX INFO: renamed from: D */
    public long f902D;

    /* JADX INFO: renamed from: c */
    public int f905c;

    /* JADX INFO: renamed from: d */
    public int f906d;

    /* JADX INFO: renamed from: e */
    public int f907e;

    /* JADX INFO: renamed from: f */
    public int f908f;

    /* JADX INFO: renamed from: g */
    public File f909g;

    /* JADX INFO: renamed from: h */
    public byte[] f910h;

    /* JADX INFO: renamed from: i */
    public C0338a f911i;

    /* JADX INFO: renamed from: j */
    public MediaCodec f912j;

    /* JADX INFO: renamed from: k */
    public MediaCodec f913k;

    /* JADX INFO: renamed from: l */
    public long f914l;

    /* JADX INFO: renamed from: m */
    public MediaMuxer f915m;

    /* JADX INFO: renamed from: p */
    public CountDownLatch f918p;

    /* JADX INFO: renamed from: s */
    public volatile boolean f921s;

    /* JADX INFO: renamed from: t */
    public int f922t;

    /* JADX INFO: renamed from: u */
    public volatile boolean f923u;

    /* JADX INFO: renamed from: v */
    public Integer f924v;

    /* JADX INFO: renamed from: w */
    public Integer f925w;

    /* JADX INFO: renamed from: x */
    public int f926x;

    /* JADX INFO: renamed from: a */
    public int f903a = C33879qb.f71562h;

    /* JADX INFO: renamed from: b */
    public int f904b = 30;

    /* JADX INFO: renamed from: y */
    public int f927y = 0;

    /* JADX INFO: renamed from: z */
    public int f928z = 10;

    /* JADX INFO: renamed from: q */
    public ConcurrentLinkedQueue<C38390w> f919q = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: r */
    public ConcurrentLinkedQueue<byte[]> f920r = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: n */
    public final Object f916n = new Object();

    /* JADX INFO: renamed from: o */
    public final Object f917o = new Object();

    public enum MediaType {
        VideoType,
        AudioType
    }

    /* JADX INFO: renamed from: ai.advance.common.recorder_old.VideoRecorder$a */
    public class C0338a extends Thread {
        public C0338a() {
            super("liveness_video_recorder_thread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            VideoRecorder.this.f914l = System.currentTimeMillis();
            while (VideoRecorder.this.f921s) {
                try {
                    VideoRecorder.this.m1233k();
                } catch (Exception unused) {
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - VideoRecorder.this.f914l;
                VideoRecorder videoRecorder = VideoRecorder.this;
                if (jCurrentTimeMillis >= videoRecorder.f908f) {
                    videoRecorder.m1243u();
                }
            }
            super.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m1243u() {
        try {
            if (this.f921s) {
                this.f921s = false;
                if (this.f912j != null && this.f915m != null) {
                    this.f923u = true;
                    CountDownLatch countDownLatch = this.f918p;
                    if (countDownLatch != null && countDownLatch.getCount() > 0) {
                        this.f918p.countDown();
                    }
                }
                m1226d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m1225c(MediaType mediaType, int i11) {
        return (mediaType == MediaType.VideoType ? this.f912j : this.f913k).getInputBuffer(i11);
    }

    /* JADX INFO: renamed from: d */
    public void m1226d() {
        try {
            MediaCodec mediaCodec = this.f912j;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
        } catch (Exception unused) {
        }
        try {
            MediaCodec mediaCodec2 = this.f913k;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
        } catch (Exception unused2) {
        }
        try {
            MediaMuxer mediaMuxer = this.f915m;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.f915m.release();
            }
        } catch (Exception unused3) {
        }
        this.f919q.clear();
        this.f920r.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m1227e(MediaType mediaType, MediaFormat mediaFormat) {
        if (mediaType == MediaType.VideoType) {
            this.f924v = Integer.valueOf(this.f915m.addTrack(mediaFormat));
        } else if (mediaType == MediaType.AudioType) {
            this.f925w = Integer.valueOf(this.f915m.addTrack(mediaFormat));
        }
        if (this.f924v != null) {
            this.f915m.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m1229g(int i11, int i12, C38390w c38390w) {
        if (this.f910h == null) {
            this.f910h = new byte[((i11 * i12) * 3) / 2];
        }
        byte[] bArrM86571b = c38390w.m86571b();
        int i13 = i11 * i12;
        if (i13 >= 0) {
            System.arraycopy(bArrM86571b, 0, this.f910h, 0, i13);
        }
        int i14 = (i13 / 4) + i13;
        int i15 = i13;
        int i16 = i15;
        while (i15 < (i13 * 3) / 2) {
            byte[] bArr = this.f910h;
            bArr[i14] = bArrM86571b[i15];
            bArr[i16] = bArrM86571b[i15 + 1];
            i14++;
            i16++;
            i15 += 2;
        }
        return this.f910h;
    }

    /* JADX INFO: renamed from: h */
    public final ByteBuffer m1230h(MediaType mediaType, int i11) {
        return (mediaType == MediaType.VideoType ? this.f912j : this.f913k).getOutputBuffer(i11);
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m1231i(int i11, int i12, C38390w c38390w) {
        if (this.f910h == null) {
            this.f910h = new byte[((i11 * i12) * 3) / 2];
        }
        byte[] bArrM86571b = c38390w.m86571b();
        int i13 = i11 * i12;
        if (i13 >= 0) {
            System.arraycopy(bArrM86571b, 0, this.f910h, 0, i13);
        }
        int i14 = i13;
        while (i14 < (i13 * 3) / 2) {
            int i15 = i14 + 1;
            if (i15 % 2 == 0) {
                byte[] bArr = this.f910h;
                int i16 = i14 - 1;
                bArr[i14] = bArrM86571b[i16];
                bArr[i16] = bArrM86571b[i14];
            }
            i14 = i15;
        }
        return this.f910h;
    }

    /* JADX INFO: renamed from: j */
    public final byte[] m1232j(int i11, int i12, C38390w c38390w) {
        return this.f926x == 21 ? m1231i(i11, i12, c38390w) : m1229g(i11, i12, c38390w);
    }

    /* JADX INFO: renamed from: l */
    public JSONObject m1234l() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C40832g.m89354i(jSONObject2, "encode_frame_count", Integer.valueOf(this.f901C));
        C40832g.m89354i(jSONObject2, "lost_model_frame_count", Integer.valueOf(this.f927y));
        C40832g.m89354i(jSONObject2, "encode_queue_max_size", Integer.valueOf(this.f928z));
        JSONObject jSONObject3 = new JSONObject();
        File file = this.f909g;
        if (file != null && file.exists()) {
            C40832g.m89354i(jSONObject3, SessionDescription.ATTR_LENGTH, Float.valueOf((this.f909g.length() / 1024.0f) / 1024.0f));
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever.setDataSource(this.f909g.getPath());
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                        C40832g.m89354i(jSONObject3, "size", strExtractMetadata + ProxyConfig.MATCH_ALL_SCHEMES + strExtractMetadata2);
                        C40832g.m89354i(jSONObject3, TypedValues.TransitionType.S_DURATION, strExtractMetadata3);
                        C40832g.m89354i(jSONObject3, "frame_count", mediaMetadataRetriever.extractMetadata(32));
                        mediaMetadataRetriever.release();
                    } catch (Throwable th2) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable unused) {
                }
                C40832g.m89354i(jSONObject, "meta_data", jSONObject3);
            }
        }
        C40832g.m89354i(jSONObject, "config", jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: m */
    public boolean m1235m() {
        return this.f921s;
    }

    /* JADX INFO: renamed from: n */
    public void m1236n(C38390w c38390w) {
        if (this.f921s) {
            System.currentTimeMillis();
            if (this.f919q.size() > 2) {
                this.f919q.poll();
                this.f927y++;
            }
            this.f919q.add(c38390w);
            CountDownLatch countDownLatch = this.f918p;
            if (countDownLatch == null || countDownLatch.getCount() <= 0) {
                return;
            }
            this.f918p.countDown();
        }
    }

    /* JADX INFO: renamed from: o */
    public void m1237o(int i11) {
        m1228f("比特率：" + i11);
        this.f903a = i11;
    }

    /* JADX INFO: renamed from: p */
    public void m1238p(int i11) {
        this.f928z = i11;
    }

    /* JADX INFO: renamed from: q */
    public void m1239q(int i11) {
        this.f904b = i11;
    }

    /* JADX INFO: renamed from: r */
    public void m1240r(int i11) {
        this.f899A = i11;
    }

    /* JADX INFO: renamed from: s */
    public void m1241s(int i11) {
        this.f905c = i11;
    }

    /* JADX INFO: renamed from: t */
    public void m1242t(int i11, int i12, int i13, File file) {
        this.f906d = i11;
        this.f907e = i12;
        this.f908f = i13;
        this.f909g = file;
        if (file.exists()) {
            this.f909g.delete();
        }
        try {
            MediaMuxer mediaMuxer = new MediaMuxer(this.f909g.getCanonicalPath(), 0);
            this.f915m = mediaMuxer;
            mediaMuxer.setOrientationHint(this.f905c);
            MediaCodecInfo mediaCodecInfoM88548b = C40194a.m88548b("video/avc");
            if (mediaCodecInfoM88548b == null) {
                return;
            }
            this.f926x = C40194a.m88547a(mediaCodecInfoM88548b, "video/avc");
            this.f912j = MediaCodec.createByCodecName(mediaCodecInfoM88548b.getName());
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", i11, i12);
            m1228f("放入的 bitRate:" + this.f903a);
            mediaFormatCreateVideoFormat.setInteger("bitrate", this.f903a);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f904b);
            mediaFormatCreateVideoFormat.setInteger("color-format", this.f926x);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
            this.f912j.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            this.f912j.start();
            this.f921s = true;
            C0338a c0338a = new C0338a();
            this.f911i = c0338a;
            c0338a.start();
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"MissingPermission"})
    public VideoRecorder() {
    }

    /* JADX INFO: renamed from: k */
    public void m1233k() {
        ByteBuffer byteBufferM1230h;
        System.currentTimeMillis();
        if (this.f921s) {
            if (!this.f923u || this.f919q.size() != 0) {
                C38390w c38390wPoll = this.f919q.poll();
                if (c38390wPoll == null) {
                    synchronized (this.f916n) {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        this.f918p = countDownLatch;
                        try {
                            countDownLatch.await();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        c38390wPoll = this.f919q.poll();
                    }
                }
                if (c38390wPoll != null) {
                    if (this.f901C == 0) {
                        this.f900B = c38390wPoll.m86570a();
                    }
                    if (c38390wPoll.m86570a() - this.f900B >= this.f902D) {
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                        byte[] bArrM1232j = m1232j(this.f906d, this.f907e, c38390wPoll);
                        System.currentTimeMillis();
                        int iDequeueInputBuffer = this.f912j.dequeueInputBuffer(C34004wg.f72453m);
                        long jM86570a = 1000 * (c38390wPoll.m86570a() - this.f900B);
                        if (jM86570a >= 0) {
                            if (iDequeueInputBuffer >= 0) {
                                ByteBuffer byteBufferM1225c = m1225c(MediaType.VideoType, iDequeueInputBuffer);
                                byteBufferM1225c.clear();
                                byteBufferM1225c.put(bArrM1232j);
                                this.f912j.queueInputBuffer(iDequeueInputBuffer, 0, bArrM1232j.length, jM86570a, 0);
                                this.f922t++;
                            }
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            int iDequeueOutputBuffer = this.f912j.dequeueOutputBuffer(bufferInfo, C34004wg.f72453m);
                            if (iDequeueOutputBuffer != -1) {
                                if (iDequeueOutputBuffer == -2) {
                                    m1227e(MediaType.VideoType, this.f912j.getOutputFormat());
                                    return;
                                }
                                if (iDequeueOutputBuffer >= 0 && (byteBufferM1230h = m1230h(MediaType.VideoType, iDequeueOutputBuffer)) != null) {
                                    byteBufferM1230h.position(bufferInfo.offset);
                                    byteBufferM1230h.limit(bufferInfo.offset + bufferInfo.size);
                                    if (this.f924v != null) {
                                        System.currentTimeMillis();
                                        this.f915m.writeSampleData(this.f924v.intValue(), byteBufferM1230h, bufferInfo);
                                    }
                                    this.f912j.releaseOutputBuffer(iDequeueOutputBuffer, false);
                                    this.f902D = c38390wPoll.m86570a() - this.f900B;
                                    this.f901C++;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1228f(String str) {
    }
}
