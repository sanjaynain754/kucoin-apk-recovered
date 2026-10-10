package com.tencent.thumbplayer.tcmedia.adapter.p151a.p152a;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.adapter.C35244b;
import com.tencent.thumbplayer.tcmedia.adapter.C35245c;
import com.tencent.thumbplayer.tcmedia.adapter.C35249g;
import com.tencent.thumbplayer.tcmedia.adapter.C35251i;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerState;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrack;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p155b.C35280e;
import com.tencent.thumbplayer.tcmedia.p155b.C35282g;
import com.tencent.thumbplayer.tcmedia.p155b.C35283h;
import com.tencent.thumbplayer.tcmedia.p160e.C35351a;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import com.tencent.thumbplayer.tcmedia.utils.C35422b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.d */
/* JADX INFO: loaded from: classes62.dex */
public class C35235d implements InterfaceC35237b {

    /* JADX INFO: renamed from: a */
    private C35351a f75533a;

    /* JADX INFO: renamed from: b */
    private C35352b f75534b;

    /* JADX INFO: renamed from: c */
    private Context f75535c;

    /* JADX INFO: renamed from: d */
    private InterfaceC35237b f75536d;

    /* JADX INFO: renamed from: e */
    private TPPlayerState f75537e;

    /* JADX INFO: renamed from: f */
    private C35249g f75538f;

    /* JADX INFO: renamed from: g */
    private a f75539g;

    /* JADX INFO: renamed from: h */
    private C35245c f75540h;

    /* JADX INFO: renamed from: i */
    private C35251i f75541i;

    /* JADX INFO: renamed from: j */
    private C35244b f75542j;

    /* JADX INFO: renamed from: k */
    private List<ITPMediaTrackClip> f75543k;

    /* JADX INFO: renamed from: l */
    private int f75544l = 0;

    /* JADX INFO: renamed from: m */
    private boolean f75545m;

    /* JADX INFO: renamed from: n */
    private boolean f75546n;

    /* JADX INFO: renamed from: o */
    private LinkedList<Long> f75547o;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.a.a.d$a */
    public class a implements C35241c.a, C35241c.b, C35241c.c, C35241c.f, C35241c.h, C35241c.i, C35241c.j, C35241c.l, C35241c.n, C35241c.o, C35241c.p {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.o
        /* JADX INFO: renamed from: a */
        public TPPostProcessFrameBuffer mo77481a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return C35235d.this.m77394a(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.b
        /* JADX INFO: renamed from: b */
        public TPPostProcessFrameBuffer mo77489b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return C35235d.this.m77411b(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.i
        /* JADX INFO: renamed from: a */
        public void mo77482a() {
            C35235d.this.m77395a();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.c
        /* JADX INFO: renamed from: b */
        public void mo77490b() {
            C35235d.this.m77413b();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.j
        /* JADX INFO: renamed from: c */
        public void mo77491c() {
            C35235d.this.m77418d();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.f
        /* JADX INFO: renamed from: a */
        public void mo77483a(int i11, int i12, long j11, long j12) {
            C35235d.this.m77396a(i11, i12, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.h
        /* JADX INFO: renamed from: a */
        public void mo77484a(int i11, long j11, long j12, Object obj) {
            C35235d.this.m77397a(i11, j11, j12, obj);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.p
        /* JADX INFO: renamed from: a */
        public void mo77485a(long j11, long j12) {
            C35235d.this.m77398a(j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.a
        /* JADX INFO: renamed from: a */
        public void mo77486a(TPAudioFrameBuffer tPAudioFrameBuffer) {
            C35235d.this.m77407a(tPAudioFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.l
        /* JADX INFO: renamed from: a */
        public void mo77487a(TPSubtitleData tPSubtitleData) {
            C35235d.this.m77408a(tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.n
        /* JADX INFO: renamed from: a */
        public void mo77488a(TPVideoFrameBuffer tPVideoFrameBuffer) {
            C35235d.this.m77409a(tPVideoFrameBuffer);
        }
    }

    /* JADX INFO: renamed from: c */
    private ITPMediaTrackClip m77416c() {
        return this.f75543k.get(this.f75544l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m77418d() {
        if (this.f75541i.m77840b(5)) {
            if (this.f75537e.m77861is(7)) {
                mo77467i();
            }
            this.f75538f.mo77491c();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public long mo77458b(int i11) {
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            return interfaceC35237b.mo77458b(i11);
        }
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: u */
    public long[] mo77479u() {
        return new long[]{-1, -1};
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: v */
    public TPGeneralPlayFlowParams mo77480v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public TPPostProcessFrameBuffer m77394a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f75541i.m77840b(7)) {
            return this.f75538f.mo77481a(tPPostProcessFrameBuffer);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m77419d(int i11) {
        for (int i12 = 0; i12 < this.f75543k.size(); i12++) {
            long j11 = i11;
            if (this.f75543k.get(i12).getStartPositionMs() <= j11 && j11 <= this.f75543k.get(i12).getStartPositionMs() + this.f75543k.get(i12).getOriginalDurationMs()) {
                try {
                    m77420d(i12, j11 - this.f75543k.get(i12).getStartPositionMs());
                } catch (IOException e11) {
                    this.f75533a.m78141c("selectClipPlayer:" + e11.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private InterfaceC35237b m77421e() {
        C35236e c35236e = new C35236e(this.f75535c, this.f75534b);
        if (this.f75542j == null) {
            this.f75542j = new C35244b();
        }
        m77406a(c35236e);
        return c35236e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public TPDynamicStatisticParams mo77462c(boolean z11) {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: g */
    public void mo77465g() throws IOException {
        if (this.f75541i.m77839a(1)) {
            if (!this.f75540h.m77708f()) {
                throw new IOException("error , prepare , data source invalid");
            }
            InterfaceC35237b interfaceC35237bM77421e = m77421e();
            this.f75536d = interfaceC35237bM77421e;
            if (interfaceC35237bM77421e == null) {
                throw new RuntimeException("error , create player failed");
            }
            this.f75537e.changeState(3);
            this.f75536d.mo77465g();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: h */
    public void mo77466h() {
        if (this.f75541i.m77839a(1)) {
            if (!this.f75540h.m77708f()) {
                throw new IllegalStateException("error , prepare , state invalid , data source invalid");
            }
            InterfaceC35237b interfaceC35237bM77421e = m77421e();
            this.f75536d = interfaceC35237bM77421e;
            if (interfaceC35237bM77421e == null) {
                throw new RuntimeException("error , create player failed");
            }
            this.f75537e.changeState(3);
            this.f75536d.mo77466h();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: i */
    public void mo77467i() {
        if (this.f75541i.m77839a(5)) {
            InterfaceC35237b interfaceC35237b = this.f75536d;
            if (interfaceC35237b == null) {
                throw new IllegalStateException("error , start , player is null");
            }
            try {
                interfaceC35237b.mo77467i();
                this.f75537e.changeState(5);
            } catch (IllegalStateException unused) {
                throw new IllegalStateException("error , start ,state invalid");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: j */
    public void mo77468j() {
        if (this.f75541i.m77839a(6)) {
            InterfaceC35237b interfaceC35237b = this.f75536d;
            if (interfaceC35237b == null) {
                throw new IllegalStateException("error , pause , player is null");
            }
            try {
                interfaceC35237b.mo77468j();
                this.f75537e.changeState(6);
            } catch (IllegalStateException unused) {
                throw new IllegalStateException("error , pause ,state invalid");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: k */
    public void mo77469k() {
        if (this.f75541i.m77839a(7)) {
            if (this.f75536d == null) {
                throw new IllegalStateException("error , stop , player is null");
            }
            try {
                try {
                    this.f75537e.changeState(8);
                    this.f75536d.mo77469k();
                    this.f75537e.changeState(9);
                } catch (IllegalStateException unused) {
                    throw new IllegalStateException("error , pause ,state invalid");
                }
            } catch (Throwable th2) {
                this.f75537e.changeState(9);
                throw th2;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: l */
    public void mo77470l() {
        this.f75533a.m78141c("reset, current state:" + this.f75537e);
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77470l();
        }
        this.f75540h.m77682a();
        this.f75538f.m77798e();
        this.f75537e.changeState(1);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: m */
    public void mo77471m() {
        this.f75533a.m78141c("release, current state:" + this.f75537e);
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77471m();
            this.f75536d = null;
        }
        this.f75540h.m77682a();
        this.f75538f.m77798e();
        this.f75537e.changeState(11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: n */
    public long mo77472n() {
        Iterator<ITPMediaTrackClip> it = this.f75543k.iterator();
        long originalDurationMs = 0;
        while (it.hasNext()) {
            originalDurationMs += it.next().getOriginalDurationMs();
        }
        return originalDurationMs;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: o */
    public long mo77473o() {
        long originalDurationMs = 0;
        for (int i11 = 0; i11 < this.f75543k.size() && i11 < this.f75544l; i11++) {
            originalDurationMs += this.f75543k.get(i11).getOriginalDurationMs();
        }
        return !this.f75541i.m77839a(12) ? originalDurationMs : originalDurationMs + this.f75536d.mo77473o();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: p */
    public long mo77474p() {
        if (this.f75541i.m77839a(15)) {
            return this.f75536d.mo77474p();
        }
        C35244b c35244b = this.f75542j;
        if (c35244b != null) {
            return c35244b.m77675l();
        }
        return 0L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: q */
    public int mo77475q() {
        C35244b c35244b = this.f75542j;
        if (c35244b == null) {
            return 0;
        }
        if (c35244b.m77644a() <= 0) {
            if (!this.f75541i.m77839a(13)) {
                return 0;
            }
            this.f75542j.m77646a(this.f75536d.mo77475q());
        }
        return (int) this.f75542j.m77644a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: r */
    public int mo77476r() {
        C35244b c35244b = this.f75542j;
        if (c35244b == null) {
            return 0;
        }
        if (c35244b.m77648b() <= 0) {
            if (!this.f75541i.m77839a(13)) {
                return 0;
            }
            this.f75542j.m77650b(this.f75536d.mo77476r());
        }
        return (int) this.f75542j.m77648b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: s */
    public TPTrackInfo[] mo77477s() {
        this.f75533a.m78143e("getTrackInfo not supported.");
        return new TPTrackInfo[0];
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: t */
    public TPProgramInfo[] mo77478t() {
        this.f75533a.m78143e("getProgramInfo not supported.");
        return new TPProgramInfo[0];
    }

    public C35235d(Context context, C35352b c35352b) {
        C35352b c35352b2 = new C35352b(c35352b, "TPSystemClipPlayer");
        this.f75534b = c35352b2;
        this.f75533a = new C35351a(c35352b2);
        this.f75535c = context;
        this.f75537e = new TPPlayerState();
        this.f75540h = new C35245c();
        this.f75539g = new a();
        this.f75538f = new C35249g(this.f75533a.m78139b());
        this.f75541i = new C35251i(this.f75537e);
        this.f75543k = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77395a() {
        C35249g c35249g = this.f75538f;
        if (c35249g != null) {
            c35249g.mo77484a(152, this.f75544l, 0L, (Object) null);
        }
        if (!this.f75545m) {
            if (this.f75541i.m77840b(1)) {
                this.f75537e.changeState(4);
                C35249g c35249g2 = this.f75538f;
                if (c35249g2 != null) {
                    c35249g2.mo77482a();
                }
                m77415b(this.f75536d);
                return;
            }
            return;
        }
        mo77467i();
        if (!this.f75546n || this.f75538f == null || C35422b.m78845a(this.f75547o)) {
            return;
        }
        Long lPoll = this.f75547o.poll();
        if (lPoll != null) {
            this.f75538f.mo77484a(3, lPoll.longValue(), 0L, (Object) null);
        }
        this.f75546n = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public TPPostProcessFrameBuffer m77411b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f75541i.m77840b(7)) {
            return this.f75538f.mo77489b(tPPostProcessFrameBuffer);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m77420d(int i11, long j11) {
        this.f75533a.m78140b("switchPlayer: clipNo:" + i11 + "   startPostion:" + j11);
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77471m();
        }
        this.f75545m = true;
        this.f75544l = i11;
        this.f75540h.m77694a(this.f75543k.get(i11).getFilePath(), this.f75543k.get(this.f75544l).getHttpHeader());
        InterfaceC35237b interfaceC35237bM77421e = m77421e();
        this.f75536d = interfaceC35237bM77421e;
        if (interfaceC35237bM77421e == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f75536d.mo77446a(new TPOptionalParam().buildLong(100, j11));
        this.f75536d.mo77465g();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public String mo77463c(int i11) {
        InterfaceC35237b interfaceC35237b = this.f75536d;
        return interfaceC35237b != null ? interfaceC35237b.mo77463c(i11) : "";
    }

    /* JADX INFO: renamed from: b */
    private List<ITPMediaTrackClip> m77412b(ITPMediaAsset iTPMediaAsset) {
        boolean z11 = iTPMediaAsset instanceof C35280e;
        if (!z11 && !(iTPMediaAsset instanceof C35282g) && !(iTPMediaAsset instanceof C35283h)) {
            throw new IllegalStateException("system mediaPlayer : media asset is illegal source!");
        }
        List<ITPMediaTrackClip> arrayList = new ArrayList<>();
        if (z11) {
            List<ITPMediaTrack> allAVTracks = ((C35280e) iTPMediaAsset).getAllAVTracks();
            if (C35422b.m78845a(allAVTracks) || allAVTracks.get(0) == null) {
                throw new IllegalStateException("empty av tracks when set data source!");
            }
            arrayList = allAVTracks.get(0).getAllTrackClips();
        } else if (iTPMediaAsset instanceof C35282g) {
            arrayList = ((C35282g) iTPMediaAsset).getAllTrackClips();
        } else {
            arrayList.add((ITPMediaTrackClip) iTPMediaAsset);
        }
        long originalDurationMs = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).setStartPositionMs(originalDurationMs);
            originalDurationMs += arrayList.get(i11).getOriginalDurationMs();
        }
        return arrayList;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77422a(float f11) {
        if (this.f75541i.m77839a(3)) {
            InterfaceC35237b interfaceC35237b = this.f75536d;
            if (interfaceC35237b != null) {
                interfaceC35237b.mo77422a(f11);
            }
            this.f75540h.m77683a(f11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public void mo77464c(int i11, long j11) {
        this.f75533a.m78143e("selectProgram not supported.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m77413b() {
        if (this.f75541i.m77840b(2)) {
            if (this.f75544l >= this.f75543k.size() - 1) {
                this.f75537e.changeState(7);
                this.f75538f.mo77490b();
                return;
            }
            try {
                m77420d(this.f75544l + 1, 0L);
            } catch (IOException e11) {
                this.f75533a.m78141c("handleOnComplete:" + e11.toString());
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77423a(int i11) {
        if (this.f75541i.m77839a(9)) {
            long j11 = i11;
            if (j11 < m77416c().getStartPositionMs() || j11 > m77416c().getStartPositionMs() + m77416c().getOriginalDurationMs()) {
                m77419d(i11);
            } else if (this.f75536d != null) {
                this.f75533a.m78140b("seek to:".concat(String.valueOf(i11)));
                this.f75536d.mo77423a((int) (j11 - m77416c().getStartPositionMs()));
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77424a(int i11, @TPCommonEnum.TPSeekMode int i12) {
        if (this.f75541i.m77839a(9)) {
            long j11 = i11;
            if (j11 < m77416c().getStartPositionMs() || j11 > m77416c().getStartPositionMs() + m77416c().getOriginalDurationMs()) {
                m77419d(i11);
                return;
            }
            if (this.f75536d != null) {
                this.f75533a.m78140b("seek to:" + i11 + "/mode=" + i12);
                this.f75536d.mo77424a((int) (j11 - m77416c().getStartPositionMs()), i12);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77459b(float f11) {
        if (this.f75541i.m77839a(3)) {
            InterfaceC35237b interfaceC35237b = this.f75536d;
            if (interfaceC35237b != null) {
                interfaceC35237b.mo77459b(f11);
            }
            this.f75540h.m77701b(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77396a(int i11, int i12, long j11, long j12) {
        if (this.f75541i.m77840b(4)) {
            this.f75538f.mo77483a(i11, i12, j11, j12);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77460b(int i11, long j11) {
        this.f75533a.m78143e("deselectTrack not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77425a(int i11, long j11) {
        this.f75533a.m78143e("selectTrack not supported.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77397a(int i11, long j11, long j12, Object obj) {
        if (this.f75541i.m77840b(3)) {
            this.f75538f.mo77484a(i11, j11, j12, obj);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m77415b(InterfaceC35237b interfaceC35237b) {
        TPTrackInfo[] tPTrackInfoArrMo77477s = mo77477s();
        if (tPTrackInfoArrMo77477s == null) {
            return;
        }
        for (int i11 = 0; i11 < tPTrackInfoArrMo77477s.length; i11++) {
            if (tPTrackInfoArrMo77477s[i11].equals(this.f75540h.m77681a(tPTrackInfoArrMo77477s[i11].getTrackType()))) {
                interfaceC35237b.mo77425a(i11, -1L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77398a(long j11, long j12) {
        if (this.f75541i.m77840b(6)) {
            this.f75542j.m77650b(j12);
            this.f75542j.m77646a(j11);
            this.f75538f.mo77485a(j11, j12);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77461b(boolean z11) {
        if (this.f75541i.m77839a(3)) {
            InterfaceC35237b interfaceC35237b = this.f75536d;
            if (interfaceC35237b != null) {
                interfaceC35237b.mo77461b(z11);
            }
            this.f75540h.m77704b(z11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77426a(AssetFileDescriptor assetFileDescriptor) {
        this.f75540h.m77685a(assetFileDescriptor);
        this.f75537e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77427a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f75540h.m77686a(parcelFileDescriptor);
        this.f75537e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77428a(Surface surface) {
        if (!this.f75541i.m77839a(4)) {
            throw new IllegalStateException("setSurface , state invalid");
        }
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77428a(surface);
        }
        this.f75540h.m77687a(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77429a(SurfaceHolder surfaceHolder) {
        if (!this.f75541i.m77839a(4)) {
            throw new IllegalStateException("setSurfaceHolder , state invalid");
        }
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77429a(surfaceHolder);
        }
        this.f75540h.m77688a(surfaceHolder);
    }

    /* JADX INFO: renamed from: a */
    private void m77406a(InterfaceC35237b interfaceC35237b) {
        InterfaceC35237b interfaceC35237b2;
        if (1 == this.f75540h.m77707e().m77812g()) {
            interfaceC35237b.mo77427a(this.f75540h.m77707e().m77808c());
        } else if (4 == this.f75540h.m77707e().m77812g()) {
            interfaceC35237b.mo77426a(this.f75540h.m77707e().m77809d());
        }
        if (this.f75540h.m77707e().m77812g() == 0) {
            interfaceC35237b.mo77452a(this.f75540h.m77707e().m77800a(), this.f75540h.m77707e().m77807b());
        }
        Iterator<TPOptionalParam> it = this.f75540h.m77717o().iterator();
        while (it.hasNext()) {
            interfaceC35237b.mo77446a(it.next());
        }
        for (C35245c.d dVar : this.f75540h.m77715m()) {
            interfaceC35237b.mo77454a(dVar.f75736a, dVar.f75739d, dVar.f75737b, dVar.f75738c);
        }
        for (C35245c.a aVar : this.f75540h.m77716n()) {
            interfaceC35237b.mo77455a(aVar.f75726a, aVar.f75729d, aVar.f75727b, aVar.f75728c);
        }
        if (this.f75540h.m77713k() != null) {
            interfaceC35237b2 = interfaceC35237b;
            interfaceC35237b2.mo77457a(this.f75540h.m77713k().f75730a, this.f75540h.m77713k().f75731b, this.f75540h.m77713k().f75732c);
        } else {
            interfaceC35237b2 = interfaceC35237b;
        }
        interfaceC35237b2.mo77456a(this.f75540h.m77709g());
        if (this.f75540h.m77710h() != 0.0f) {
            interfaceC35237b2.mo77422a(this.f75540h.m77710h());
        }
        if (this.f75540h.m77712j() != 0.0f) {
            interfaceC35237b2.mo77459b(this.f75540h.m77712j());
        }
        if (this.f75540h.m77706d() instanceof SurfaceHolder) {
            interfaceC35237b2.mo77429a((SurfaceHolder) this.f75540h.m77706d());
        } else if (this.f75540h.m77706d() instanceof Surface) {
            interfaceC35237b2.mo77428a((Surface) this.f75540h.m77706d());
        }
        interfaceC35237b2.mo77437a((C35241c.h) this.f75539g);
        interfaceC35237b2.mo77438a((C35241c.i) this.f75539g);
        interfaceC35237b2.mo77432a((C35241c.c) this.f75539g);
        interfaceC35237b2.mo77435a((C35241c.f) this.f75539g);
        interfaceC35237b2.mo77439a((C35241c.j) this.f75539g);
        interfaceC35237b2.mo77444a((C35241c.p) this.f75539g);
        interfaceC35237b2.mo77440a((C35241c.l) this.f75539g);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77430a(C35241c.a aVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77431a(C35241c.b bVar) {
        throw new IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77432a(C35241c.c cVar) {
        this.f75538f.m77783a(cVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77433a(C35241c.d dVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77434a(C35241c.e eVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77435a(C35241c.f fVar) {
        this.f75538f.m77786a(fVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77436a(C35241c.g gVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77437a(C35241c.h hVar) {
        this.f75538f.m77788a(hVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77438a(C35241c.i iVar) {
        this.f75538f.m77789a(iVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77439a(C35241c.j jVar) {
        this.f75538f.m77790a(jVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77440a(C35241c.l lVar) {
        this.f75538f.m77792a(lVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77441a(C35241c.m mVar) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77442a(C35241c.n nVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77443a(C35241c.o oVar) {
        throw new IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77444a(C35241c.p pVar) {
        this.f75538f.m77796a(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77407a(TPAudioFrameBuffer tPAudioFrameBuffer) {
        if (this.f75541i.m77840b(7)) {
            this.f75538f.mo77486a(tPAudioFrameBuffer);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77445a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77445a(tPCaptureParams, tPCaptureCallBack);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77446a(TPOptionalParam tPOptionalParam) {
        if (tPOptionalParam.getKey() == 100) {
            int i11 = (int) tPOptionalParam.getParamLong().value;
            this.f75533a.m78140b("start position:".concat(String.valueOf(i11)));
            for (int i12 = 0; i12 < this.f75543k.size(); i12++) {
                long j11 = i11;
                if (this.f75543k.get(i12).getStartPositionMs() <= j11 && j11 <= this.f75543k.get(i12).getStartPositionMs() + this.f75543k.get(i12).getOriginalDurationMs()) {
                    this.f75544l = i12;
                    this.f75540h.m77703b(this.f75543k.get(i12).getFilePath());
                    tPOptionalParam.getParamLong().value = j11 - this.f75543k.get(i12).getStartPositionMs();
                }
            }
        }
        InterfaceC35237b interfaceC35237b = this.f75536d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77446a(tPOptionalParam);
        }
        this.f75540h.m77690a(tPOptionalParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77408a(TPSubtitleData tPSubtitleData) {
        if (this.f75541i.m77840b(7)) {
            this.f75538f.mo77487a(tPSubtitleData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77409a(TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (this.f75541i.m77840b(7)) {
            this.f75538f.mo77488a(tPVideoFrameBuffer);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77447a(ITPMediaAsset iTPMediaAsset) {
        List<ITPMediaTrackClip> listM77412b = m77412b(iTPMediaAsset);
        try {
            this.f75543k = listM77412b;
            this.f75540h.m77694a(listM77412b.get(this.f75544l).getFilePath(), this.f75543k.get(this.f75544l).getHttpHeader());
            this.f75537e.changeState(2);
        } catch (Exception e11) {
            this.f75533a.m78137a(e11);
            throw new IllegalStateException("exception when system clip player set data source!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77448a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
        List<ITPMediaTrackClip> listM77412b = m77412b(iTPMediaAsset);
        if (C35422b.m78845a(listM77412b)) {
            throw new IllegalStateException("exception when switch Definition with clip mediaAsset empty source!");
        }
        long jMo77473o = mo77473o();
        try {
            this.f75543k = listM77412b;
            this.f75546n = true;
            if (C35422b.m78845a(this.f75547o)) {
                this.f75547o = new LinkedList<>();
            }
            this.f75547o.offer(Long.valueOf(j11));
            this.f75533a.m78141c("try to switch definition with system clip player, current clipNo:" + this.f75544l);
            m77419d((int) jMo77473o);
        } catch (Exception e11) {
            this.f75533a.m78137a(e11);
            throw new IllegalStateException("exception when system clip player switch definition!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77449a(C35352b c35352b) {
        this.f75533a.m78136a(new C35352b(c35352b, "TPSystemClipPlayer"));
        C35249g c35249g = this.f75538f;
        if (c35249g == null || c35352b == null) {
            return;
        }
        c35249g.m77797a(this.f75533a.m78135a().m78145a());
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77450a(String str) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77451a(String str, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77452a(String str, Map<String, String> map) {
        this.f75540h.m77694a(str, map);
        this.f75537e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77453a(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77454a(String str, Map<String, String> map, String str2, String str3) {
        this.f75533a.m78143e("addSubtitleSource not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77455a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        this.f75533a.m78143e("addAudioTrackSource not supported.");
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77456a(boolean z11) {
        if (this.f75541i.m77839a(3)) {
            InterfaceC35237b interfaceC35237b = this.f75536d;
            if (interfaceC35237b != null) {
                interfaceC35237b.mo77456a(z11);
            }
            this.f75540h.m77697a(z11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77457a(boolean z11, long j11, long j12) {
        boolean z12;
        long j13;
        long j14;
        if (this.f75541i.m77839a(3)) {
            InterfaceC35237b interfaceC35237b = this.f75536d;
            if (interfaceC35237b != null) {
                interfaceC35237b.mo77457a(z11, j11, j12);
                j14 = j12;
                j13 = j11;
                z12 = z11;
            } else {
                z12 = z11;
                j13 = j11;
                j14 = j12;
            }
            this.f75540h.m77698a(z12, j13, j14);
        }
    }
}
