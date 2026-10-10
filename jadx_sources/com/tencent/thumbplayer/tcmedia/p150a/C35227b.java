package com.tencent.thumbplayer.tcmedia.p150a;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.core.common.TPGeneralError;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.b */
/* JADX INFO: loaded from: classes62.dex */
public class C35227b {

    /* JADX INFO: renamed from: a */
    private static C35227b f75485a;

    /* JADX INFO: renamed from: b */
    private HandlerThread f75486b;

    /* JADX INFO: renamed from: c */
    private c f75487c;

    /* JADX INFO: renamed from: d */
    private MediaMetadataRetriever f75488d = null;

    /* JADX INFO: renamed from: e */
    private int f75489e = 0;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo77333a(int i11, int i12);

        /* JADX INFO: renamed from: a */
        void mo77334a(int i11, long j11, int i12, int i13, Bitmap bitmap, long j12);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        protected a f75490a;

        /* JADX INFO: renamed from: b */
        private int f75491b;

        /* JADX INFO: renamed from: c */
        private String f75492c;

        /* JADX INFO: renamed from: d */
        private FileDescriptor f75493d;

        /* JADX INFO: renamed from: e */
        private AssetFileDescriptor f75494e;

        /* JADX INFO: renamed from: f */
        private long f75495f;

        /* JADX INFO: renamed from: g */
        private int f75496g;

        /* JADX INFO: renamed from: h */
        private int f75497h;

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.b$c */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IOException {
            int i11 = message.what;
            if (i11 == 1) {
                TPLogUtil.m78800i("TPSysPlayerImageCapture", "eventHandler EV_CAP_IMAGE");
                C35227b.this.m77330a((b) message.obj);
            } else {
                if (i11 != 2) {
                    TPLogUtil.m78800i("TPSysPlayerImageCapture", "eventHandler unknow msg");
                    return;
                }
                TPLogUtil.m78800i("TPSysPlayerImageCapture", "eventHandler EV_STOP_CAP_IMAGE");
                if (C35227b.this.f75488d != null) {
                    C35227b.this.f75488d.release();
                    C35227b.this.f75488d = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.a.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public String f75499a;

        /* JADX INFO: renamed from: b */
        public FileDescriptor f75500b;

        /* JADX INFO: renamed from: c */
        public AssetFileDescriptor f75501c;

        /* JADX INFO: renamed from: d */
        public long f75502d;

        /* JADX INFO: renamed from: e */
        public int f75503e;

        /* JADX INFO: renamed from: f */
        public int f75504f;
    }

    /* JADX INFO: renamed from: a */
    public int m77332a(d dVar, a aVar) {
        TPLogUtil.m78800i("TPSysPlayerImageCapture", "captureImageWithPosition, position: " + dVar.f75502d + ", width: " + dVar.f75503e + ", height: " + dVar.f75504f);
        this.f75489e = this.f75489e + 1;
        if (!TextUtils.isEmpty(TPSystemInfo.getDeviceName()) && TPSystemInfo.getDeviceName().equals("Lenovo+K900")) {
            TPLogUtil.m78800i("TPSysPlayerImageCapture", "captureImageWithPosition, Lenovo+K900 no incompatible");
            return -1;
        }
        b bVar = new b();
        bVar.f75491b = this.f75489e;
        bVar.f75493d = dVar.f75500b;
        bVar.f75494e = dVar.f75501c;
        bVar.f75492c = dVar.f75499a;
        bVar.f75495f = dVar.f75502d;
        bVar.f75496g = dVar.f75503e;
        bVar.f75497h = dVar.f75504f;
        bVar.f75490a = aVar;
        Message message = new Message();
        message.what = 1;
        message.obj = bVar;
        if (!this.f75487c.sendMessage(message)) {
            TPLogUtil.m78800i("TPSysPlayerImageCapture", "captureImageWithPosition, send msg failed ");
        }
        return this.f75489e;
    }

    private C35227b() {
        this.f75486b = null;
        this.f75487c = null;
        try {
            this.f75486b = C35435o.m78917a().m78922b();
            this.f75487c = new c(this.f75486b.getLooper());
        } catch (Throwable th2) {
            TPLogUtil.m78798e("TPSysPlayerImageCapture", th2);
            this.f75487c = new c(Looper.getMainLooper());
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C35227b m77329a() {
        try {
            if (f75485a == null) {
                f75485a = new C35227b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f75485a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77330a(b bVar) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever2 = this.f75488d;
            if (mediaMetadataRetriever2 != null) {
                mediaMetadataRetriever2.release();
                this.f75488d = null;
            }
            this.f75488d = new MediaMetadataRetriever();
            if (bVar.f75493d == null) {
                if (bVar.f75494e != null) {
                    this.f75488d.setDataSource(bVar.f75494e.getFileDescriptor(), bVar.f75494e.getStartOffset(), bVar.f75494e.getLength());
                } else {
                    this.f75488d.setDataSource(bVar.f75492c, new HashMap());
                }
            } else {
                this.f75488d.setDataSource(bVar.f75493d);
            }
            Bitmap frameAtTime = this.f75488d.getFrameAtTime(bVar.f75495f * 1000, 2);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (frameAtTime != null) {
                bVar.f75490a.mo77334a(bVar.f75491b, bVar.f75495f, bVar.f75496g, bVar.f75497h, frameAtTime, jCurrentTimeMillis2);
            } else {
                bVar.f75490a.mo77333a(bVar.f75491b, TPGeneralError.FAILED);
            }
            mediaMetadataRetriever = this.f75488d;
            if (mediaMetadataRetriever == null) {
                return;
            }
        } catch (Exception e11) {
            TPLogUtil.m78798e("TPSysPlayerImageCapture", e11);
            TPLogUtil.m78797e("TPSysPlayerImageCapture", "doRealCaptureImage, Exception: " + e11.toString());
            bVar.f75490a.mo77333a(bVar.f75491b, TPGeneralError.FAILED);
            mediaMetadataRetriever = this.f75488d;
            if (mediaMetadataRetriever == null) {
                return;
            }
        } finally {
            MediaMetadataRetriever mediaMetadataRetriever3 = this.f75488d;
            if (mediaMetadataRetriever3 != null) {
                mediaMetadataRetriever3.release();
                this.f75488d = null;
            }
        }
        mediaMetadataRetriever.release();
    }
}
