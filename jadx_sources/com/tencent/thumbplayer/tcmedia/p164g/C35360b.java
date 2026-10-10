package com.tencent.thumbplayer.tcmedia.p164g;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.p164g.p165a.InterfaceC35358a;
import com.tencent.thumbplayer.tcmedia.p164g.p166b.InterfaceC35363c;
import com.tencent.thumbplayer.tcmedia.p164g.p172g.C35378a;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35381c;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35382d;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b */
/* JADX INFO: loaded from: classes64.dex */
public final class C35360b {

    /* JADX INFO: renamed from: a */
    public boolean f76058a;

    /* JADX INFO: renamed from: b */
    public boolean f76059b;

    /* JADX INFO: renamed from: c */
    private InterfaceC35363c f76060c;

    /* JADX INFO: renamed from: d */
    private InterfaceC35358a f76061d;

    /* JADX INFO: renamed from: g */
    private boolean f76064g;

    /* JADX INFO: renamed from: h */
    private final String f76065h;

    /* JADX INFO: renamed from: i */
    private b f76066i;

    /* JADX INFO: renamed from: f */
    private boolean f76063f = true;

    /* JADX INFO: renamed from: e */
    private final C35378a f76062e = new C35378a(m78224b());

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b$a */
    public static abstract class a {
        public abstract void onError(C35360b c35360b, MediaCodec.CodecException codecException);

        public abstract void onInputBufferAvailable(C35360b c35360b, int i11);

        public abstract void onOutputBufferAvailable(C35360b c35360b, int i11, MediaCodec.BufferInfo bufferInfo);

        public abstract void onOutputFormatChanged(C35360b c35360b, MediaFormat mediaFormat);
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b$b */
    public enum b {
        CreateByName,
        CreateByType
    }

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.b$c */
    public static final class c extends MediaCodec.Callback {

        /* JADX INFO: renamed from: a */
        private final C35360b f76072a;

        /* JADX INFO: renamed from: b */
        private final a f76073b;

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            a aVar = this.f76073b;
            if (aVar != null) {
                aVar.onError(this.f76072a, codecException);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
            a aVar = this.f76073b;
            if (aVar != null) {
                aVar.onInputBufferAvailable(this.f76072a, i11);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
            a aVar = this.f76073b;
            if (aVar != null) {
                aVar.onOutputBufferAvailable(this.f76072a, i11, bufferInfo);
            }
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            a aVar = this.f76073b;
            if (aVar != null) {
                aVar.onOutputFormatChanged(this.f76072a, mediaFormat);
            }
        }

        public c(C35360b c35360b, a aVar) {
            this.f76072a = c35360b;
            this.f76073b = aVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m78210a(long j11) {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            return interfaceC35363c.mo78238a(j11);
        }
        return -1000;
    }

    /* JADX INFO: renamed from: b */
    public final Image m78223b(int i11) {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            return interfaceC35363c.mo78240a().getOutputImage(i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC35358a m78225c() {
        return this.f76061d;
    }

    /* JADX INFO: renamed from: d */
    public final void m78227d(int i11) {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return;
        }
        mediaCodecMo78240a.setVideoScalingMode(i11);
    }

    /* JADX INFO: renamed from: m */
    private void m78207m() {
        this.f76062e.m78324b(this.f76059b);
        C35382d.m78351b(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (C35360b.this.f76060c != null) {
                    C35360b.this.f76060c.mo78245a(C35360b.this.f76061d);
                }
                if (C35360b.this.f76061d != null) {
                    C35360b.this.f76061d.onCreate(Boolean.valueOf(C35360b.this.f76059b));
                }
            }
        });
    }

    /* JADX INFO: renamed from: n */
    private void m78208n() {
        this.f76062e.m78325c();
    }

    /* JADX INFO: renamed from: o */
    private void m78209o() {
        this.f76062e.m78326d();
        C35382d.m78351b(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.g.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (C35360b.this.f76061d != null) {
                    C35360b.this.f76061d.onStarted(Boolean.valueOf(C35360b.this.f76059b), C35360b.this.f76062e.m78327e());
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final int m78211a(MediaCodec.BufferInfo bufferInfo, long j11) {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            return interfaceC35363c.mo78239a(bufferInfo, j11);
        }
        return -1000;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m78228d() {
        return this.f76063f;
    }

    /* JADX INFO: renamed from: f */
    public final void m78230f() {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            interfaceC35363c.mo78251f();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m78231g() {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            interfaceC35363c.mo78252g();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m78232h() {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            interfaceC35363c.mo78250e();
        }
    }

    /* JADX INFO: renamed from: i */
    public final MediaFormat m78233i() {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return null;
        }
        return mediaCodecMo78240a.getOutputFormat();
    }

    /* JADX INFO: renamed from: j */
    public final ByteBuffer[] m78234j() {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return null;
        }
        return mediaCodecMo78240a.getInputBuffers();
    }

    /* JADX INFO: renamed from: k */
    public final ByteBuffer[] m78235k() {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return null;
        }
        return mediaCodecMo78240a.getOutputBuffers();
    }

    /* JADX INFO: renamed from: l */
    public final String m78236l() {
        return this.f76065h;
    }

    private C35360b(String str, b bVar) {
        this.f76065h = str;
        this.f76066i = bVar;
    }

    /* JADX INFO: renamed from: b */
    private void m78205b(Surface surface) {
        this.f76058a = C35357a.m78185a().m78197a(this, surface);
        this.f76062e.m78321a();
        this.f76062e.m78323b();
        this.f76062e.m78322a(this.f76058a);
    }

    /* JADX INFO: renamed from: a */
    public final b m78212a() {
        return this.f76066i;
    }

    /* JADX INFO: renamed from: c */
    public final ByteBuffer m78226c(int i11) {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            return interfaceC35363c.mo78240a().getInputBuffer(i11);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m78229e() {
        if (C35380b.m78332a()) {
            C35380b.m78334b("TMediaCodec", "start codecWrapper:" + this.f76060c);
        }
        m78208n();
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            interfaceC35363c.mo78249d();
        }
        m78209o();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m78224b() {
        return C35381c.m78346a(this.f76065h);
    }

    /* JADX INFO: renamed from: a */
    public static C35360b m78203a(String str) {
        return new C35360b(str, b.CreateByName);
    }

    /* JADX INFO: renamed from: a */
    public final ByteBuffer m78213a(int i11) {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return null;
        }
        return mediaCodecMo78240a.getOutputBuffer(i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m78214a(int i11, int i12, int i13, long j11, int i14) {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            interfaceC35363c.mo78241a(i11, i12, i13, j11, i14);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78215a(int i11, int i12, MediaCodec.CryptoInfo cryptoInfo, long j11, int i13) {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return;
        }
        mediaCodecMo78240a.queueSecureInputBuffer(i11, i12, cryptoInfo, j11, i13);
    }

    /* JADX INFO: renamed from: a */
    public final void m78216a(int i11, boolean z11) {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            interfaceC35363c.mo78242a(i11, z11);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78217a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        MediaFormat mediaFormat2;
        if (!this.f76064g) {
            this.f76064g = true;
            m78205b(surface);
            try {
                mediaFormat2 = mediaFormat;
                try {
                    this.f76060c = C35357a.m78185a().m78193a(mediaFormat2, surface, mediaCrypto, i11, this);
                } catch (IOException e11) {
                    e = e11;
                    C35380b.m78335b("TMediaCodec", "createCodec mediaFormat:".concat(String.valueOf(mediaFormat2)), e);
                }
            } catch (IOException e12) {
                e = e12;
                mediaFormat2 = mediaFormat;
            }
            m78207m();
            return;
        }
        C35380b.m78337d("TMediaCodec", "configure ignored, mediaFormat:" + mediaFormat + " surface:" + surface + " crypto:" + mediaCrypto + " flags:" + i11 + " stack:" + Log.getStackTraceString(new Throwable()));
    }

    /* JADX INFO: renamed from: a */
    public final void m78218a(Bundle bundle) {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return;
        }
        mediaCodecMo78240a.setParameters(bundle);
    }

    /* JADX INFO: renamed from: a */
    public final void m78219a(Surface surface) {
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c != null) {
            interfaceC35363c.mo78244a(surface);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m78220a(InterfaceC35358a interfaceC35358a) {
        this.f76061d = interfaceC35358a;
    }

    /* JADX INFO: renamed from: a */
    public final void m78221a(a aVar, Handler handler) {
        MediaCodec mediaCodecMo78240a;
        InterfaceC35363c interfaceC35363c = this.f76060c;
        if (interfaceC35363c == null || (mediaCodecMo78240a = interfaceC35363c.mo78240a()) == null) {
            return;
        }
        mediaCodecMo78240a.setCallback(new c(this, aVar), handler);
    }

    /* JADX INFO: renamed from: a */
    public final void m78222a(boolean z11) {
        this.f76063f = z11;
    }
}
