package com.tencent.thumbplayer.tcmedia.adapter;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35242d;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35243e;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.C35258e;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.InterfaceC35252a;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.p154a.C35253a;
import com.tencent.thumbplayer.tcmedia.adapter.strategy.p154a.C35254b;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureCallBack;
import com.tencent.thumbplayer.tcmedia.api.TPCaptureParams;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.api.TPOptionalParam;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerState;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPProgramInfo;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPTrackInfo;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoInfo;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaSynchronizer;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p160e.C35351a;
import com.tencent.thumbplayer.tcmedia.p160e.C35352b;
import com.tencent.thumbplayer.tcmedia.p161f.InterfaceC35353a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.d */
/* JADX INFO: loaded from: classes62.dex */
public class C35246d implements InterfaceC35230a, C35241c.k {

    /* JADX INFO: renamed from: a */
    private C35352b f75740a;

    /* JADX INFO: renamed from: b */
    private C35351a f75741b;

    /* JADX INFO: renamed from: c */
    private Context f75742c;

    /* JADX INFO: renamed from: d */
    private InterfaceC35237b f75743d;

    /* JADX INFO: renamed from: e */
    private TPPlayerState f75744e;

    /* JADX INFO: renamed from: f */
    private boolean f75745f;

    /* JADX INFO: renamed from: g */
    private int f75746g = 0;

    /* JADX INFO: renamed from: h */
    private C35249g f75747h;

    /* JADX INFO: renamed from: i */
    private a f75748i;

    /* JADX INFO: renamed from: j */
    private C35245c f75749j;

    /* JADX INFO: renamed from: k */
    private C35251i f75750k;

    /* JADX INFO: renamed from: l */
    private InterfaceC35252a f75751l;

    /* JADX INFO: renamed from: m */
    private C35244b f75752m;

    /* JADX INFO: renamed from: n */
    private int f75753n;

    /* JADX INFO: renamed from: o */
    private InterfaceC35353a f75754o;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.d$a */
    public class a implements C35241c.a, C35241c.b, C35241c.c, C35241c.d, C35241c.e, C35241c.f, C35241c.g, C35241c.h, C35241c.i, C35241c.j, C35241c.l, C35241c.m, C35241c.n, C35241c.o, C35241c.p {
        private a() {
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.o
        /* JADX INFO: renamed from: a */
        public TPPostProcessFrameBuffer mo77481a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return C35246d.this.m77725a(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.b
        /* JADX INFO: renamed from: b */
        public TPPostProcessFrameBuffer mo77489b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            return C35246d.this.m77749b(tPPostProcessFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
        /* JADX INFO: renamed from: a */
        public TPRemoteSdpInfo mo77631a(String str, int i11) {
            return C35246d.this.m77727a(str, i11);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.c
        /* JADX INFO: renamed from: b */
        public void mo77490b() {
            C35246d.this.m77758y();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.j
        /* JADX INFO: renamed from: c */
        public void mo77491c() {
            C35246d.this.m77759z();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
        /* JADX INFO: renamed from: d */
        public void mo77632d() {
            C35246d.this.m77719A();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.i
        /* JADX INFO: renamed from: a */
        public void mo77482a() {
            C35246d.this.m77756w();
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.f
        /* JADX INFO: renamed from: a */
        public void mo77483a(int i11, int i12, long j11, long j12) {
            C35246d.this.m77728a(i11, i12, j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.h
        /* JADX INFO: renamed from: a */
        public void mo77484a(int i11, long j11, long j12, Object obj) {
            C35246d.this.m77729a(i11, j11, j12, obj);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.p
        /* JADX INFO: renamed from: a */
        public void mo77485a(long j11, long j12) {
            C35246d.this.m77730a(j11, j12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.a
        /* JADX INFO: renamed from: a */
        public void mo77486a(TPAudioFrameBuffer tPAudioFrameBuffer) {
            C35246d.this.m77742a(tPAudioFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.g
        /* JADX INFO: renamed from: a */
        public void mo77634a(TPDrmInfo tPDrmInfo) {
            C35246d.this.m77743a(tPDrmInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.e
        /* JADX INFO: renamed from: a */
        public void mo77633a(TPPlayerDetailInfo tPPlayerDetailInfo) {
            C35246d.this.m77744a(tPPlayerDetailInfo);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.l
        /* JADX INFO: renamed from: a */
        public void mo77487a(TPSubtitleData tPSubtitleData) {
            C35246d.this.m77745a(tPSubtitleData);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.m
        /* JADX INFO: renamed from: a */
        public void mo77636a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            C35246d.this.m77746a(tPSubtitleFrameBuffer);
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.n
        /* JADX INFO: renamed from: a */
        public void mo77488a(TPVideoFrameBuffer tPVideoFrameBuffer) {
            C35246d.this.m77747a(tPVideoFrameBuffer);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public int mo77351a() {
        C35244b c35244b = this.f75752m;
        if (c35244b != null) {
            return c35244b.m77676m();
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: b */
    public int mo77359b() {
        return this.f75744e.state();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public TPDynamicStatisticParams mo77462c(boolean z11) {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b == null) {
            return null;
        }
        return interfaceC35237b.mo77462c(z11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: d */
    public int mo77362d() {
        return this.f75753n;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: u */
    public long[] mo77479u() {
        if (this.f75750k.m77839a(19)) {
            InterfaceC35237b interfaceC35237b = this.f75743d;
            if (interfaceC35237b != null) {
                long[] jArrMo77479u = interfaceC35237b.mo77479u();
                C35244b c35244b = this.f75752m;
                if (c35244b != null) {
                    c35244b.m77647a(jArrMo77479u);
                }
                return jArrMo77479u;
            }
            this.f75741b.m78142d("getDemuxerOffsetInFile, mPlayerBase = null, return 0!");
        } else {
            C35244b c35244b2 = this.f75752m;
            if (c35244b2 != null) {
                return c35244b2.m77673j();
            }
        }
        return new long[]{-1, -1};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m77719A() {
        InterfaceC35237b interfaceC35237b;
        if (this.f75750k.m77839a(11) && (interfaceC35237b = this.f75743d) != null) {
            long jMo77472n = interfaceC35237b.mo77472n();
            C35244b c35244b = this.f75752m;
            if (c35244b != null) {
                c35244b.m77669g(jMo77472n);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private int m77720B() {
        if (this.f75751l == null) {
            this.f75751l = m77723a(this.f75749j);
        }
        return this.f75751l.mo77841a(this.f75752m);
    }

    /* JADX INFO: renamed from: C */
    private boolean m77721C() {
        int i11 = this.f75753n;
        return i11 == 2 || i11 == 3;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC35237b m77722a(int i11, C35352b c35352b) {
        InterfaceC35237b interfaceC35237bM77637a;
        Context context;
        try {
            if (i11 == 1) {
                this.f75741b.m78141c("to create androidPlayer");
                interfaceC35237bM77637a = C35242d.m77638a(this.f75742c, this.f75749j.m77718p(), c35352b);
            } else {
                if (i11 == 2) {
                    this.f75741b.m78141c("to create thumbPlayer");
                    context = this.f75742c;
                } else if (i11 == 3) {
                    this.f75741b.m78141c("to create thumbPlayer software dec");
                    context = this.f75742c;
                } else {
                    this.f75741b.m78141c("to create no Player");
                    interfaceC35237bM77637a = null;
                }
                interfaceC35237bM77637a = C35242d.m77637a(context, c35352b);
            }
        } catch (Exception e11) {
            this.f75741b.m78141c("to create Player," + e11.toString());
        }
        if (interfaceC35237bM77637a == null) {
            this.f75741b.m78141c("play is null!");
            return null;
        }
        this.f75753n = i11;
        m77750b(interfaceC35237bM77637a);
        return interfaceC35237bM77637a;
    }

    /* JADX INFO: renamed from: d */
    private void m77754d(int i11) {
        if (i11 != 5) {
            return;
        }
        try {
            this.f75743d.mo77467i();
            this.f75744e.changeState(5);
        } catch (IllegalStateException e11) {
            this.f75741b.m78137a(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public void m77756w() {
        this.f75747h.mo77484a(1000, this.f75753n, 0L, (Object) null);
        if (this.f75745f) {
            if (this.f75744e.innerPlayState() != 3) {
                this.f75741b.m78142d("handleOnPrepared, invalid state, mIsRetrying.");
                return;
            }
        } else if (!this.f75750k.m77840b(1)) {
            this.f75741b.m78141c("handleOnPrepared, invalid state");
            return;
        }
        m77757x();
        m77731a(this.f75743d);
        if (!this.f75745f) {
            this.f75744e.setInnerPlayStateState(4);
            this.f75744e.changeState(4);
            this.f75747h.mo77482a();
            return;
        }
        this.f75745f = false;
        this.f75741b.m78141c("handleOnPrepared, mIsRetrying, recoverState, state:" + this.f75744e.state());
        int iState = this.f75744e.state();
        this.f75744e.changeState(4);
        if (this.f75744e.lastState() == 3) {
            this.f75747h.mo77482a();
        }
        if (this.f75746g == 1) {
            this.f75747h.mo77484a(1014, 0L, 0L, (Object) null);
        } else {
            this.f75747h.mo77484a(201, 0L, 0L, (Object) null);
        }
        this.f75746g = 0;
        m77754d(iState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m77758y() {
        if (!this.f75750k.m77840b(2)) {
            this.f75741b.m78141c("handleOnComplete, invalid state");
        } else {
            this.f75744e.changeState(7);
            this.f75747h.mo77490b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public void m77759z() {
        if (this.f75750k.m77840b(5)) {
            this.f75747h.mo77491c();
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public long mo77458b(int i11) {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            return interfaceC35237b.mo77458b(i11);
        }
        this.f75741b.m78142d("getPropertyLong, mPlayerBase = null, return !");
        return -1L;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public String mo77463c(int i11) {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            return interfaceC35237b.mo77463c(i11);
        }
        this.f75741b.m78142d("getPropertyString, mPlayerBase = null, return !");
        return "";
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: e */
    public C35244b mo77363e() {
        return this.f75752m;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: f */
    public void mo77364f() {
        m77752c(this.f75753n, 2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: g */
    public void mo77465g() throws IOException {
        if (!this.f75750k.m77839a(1)) {
            throw new IllegalStateException("error , prepare , state invalid , current state :" + this.f75744e);
        }
        if (!this.f75749j.m77708f()) {
            throw new IOException("error , prepare , data source invalid");
        }
        InterfaceC35237b interfaceC35237bM77722a = m77722a(m77720B(), this.f75740a);
        this.f75743d = interfaceC35237bM77722a;
        if (interfaceC35237bM77722a == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f75744e.setInnerPlayStateState(3);
        this.f75744e.changeState(3);
        this.f75743d.mo77465g();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: h */
    public void mo77466h() {
        if (!this.f75750k.m77839a(1)) {
            throw new IllegalStateException("error , prepare , state invalid , current state :" + this.f75744e);
        }
        if (!this.f75749j.m77708f()) {
            throw new IllegalStateException("error , prepare , state invalid , data source invalid");
        }
        InterfaceC35237b interfaceC35237bM77722a = m77722a(m77720B(), this.f75740a);
        this.f75743d = interfaceC35237bM77722a;
        if (interfaceC35237bM77722a == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f75744e.setInnerPlayStateState(3);
        this.f75744e.changeState(3);
        this.f75743d.mo77466h();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: i */
    public void mo77467i() {
        if (!this.f75750k.m77839a(5)) {
            throw new IllegalStateException("error , start , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b == null) {
            throw new IllegalStateException("error , start , player is null");
        }
        try {
            interfaceC35237b.mo77467i();
            this.f75744e.changeState(5);
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("error , start ,state invalid");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: j */
    public void mo77468j() {
        if (!this.f75750k.m77839a(6)) {
            throw new IllegalStateException("error , pause , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b == null) {
            throw new IllegalStateException("error , pause , player is null");
        }
        if (this.f75745f) {
            this.f75744e.changeState(6);
            return;
        }
        try {
            interfaceC35237b.mo77468j();
            this.f75744e.changeState(6);
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("error , pause ,state invalid");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: k */
    public void mo77469k() {
        if (!this.f75750k.m77839a(7)) {
            throw new IllegalStateException("error , stop , state invalid , current state :" + this.f75744e);
        }
        if (this.f75743d == null) {
            throw new IllegalStateException("error , stop , player is null");
        }
        try {
            try {
                this.f75744e.changeState(8);
                this.f75743d.mo77469k();
                this.f75744e.changeState(9);
            } catch (IllegalStateException unused) {
                throw new IllegalStateException("error , stop ,state invalid");
            }
        } catch (Throwable th2) {
            this.f75744e.changeState(9);
            throw th2;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: l */
    public void mo77470l() {
        this.f75741b.m78141c("reset, current state :" + this.f75744e);
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77470l();
            this.f75743d.mo77471m();
            this.f75743d = null;
        }
        this.f75749j.m77682a();
        this.f75752m.m77678o();
        this.f75751l = null;
        this.f75745f = false;
        this.f75744e.changeState(1);
        this.f75744e.setLastState(1);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: m */
    public void mo77471m() {
        this.f75741b.m78141c("release, current state :" + this.f75744e);
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77471m();
            this.f75743d = null;
        }
        this.f75749j.m77682a();
        this.f75747h.m77798e();
        this.f75751l = null;
        this.f75745f = false;
        this.f75744e.changeState(11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: n */
    public long mo77472n() {
        C35244b c35244b = this.f75752m;
        if (c35244b != null && c35244b.m77674k() > 0) {
            return this.f75752m.m77674k();
        }
        if (!this.f75750k.m77839a(11)) {
            return 0L;
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b == null) {
            this.f75741b.m78142d("getDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long jMo77472n = interfaceC35237b.mo77472n();
        C35244b c35244b2 = this.f75752m;
        if (c35244b2 != null) {
            c35244b2.m77669g(jMo77472n);
        }
        return jMo77472n;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: o */
    public long mo77473o() {
        if (!this.f75750k.m77839a(12)) {
            C35244b c35244b = this.f75752m;
            if (c35244b != null) {
                return c35244b.m77672i();
            }
            return 0L;
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b == null) {
            this.f75741b.m78142d("getCurrentPositionMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long jMo77473o = interfaceC35237b.mo77473o();
        C35244b c35244b2 = this.f75752m;
        if (c35244b2 != null) {
            c35244b2.m77666f(jMo77473o);
        }
        return jMo77473o;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: p */
    public long mo77474p() {
        if (!this.f75750k.m77839a(12)) {
            return 0L;
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b == null) {
            this.f75741b.m78142d("getBufferedDurationMs, mPlayerBase = null, return 0!");
            return 0L;
        }
        long jMo77474p = interfaceC35237b.mo77474p();
        C35244b c35244b = this.f75752m;
        if (c35244b != null) {
            c35244b.m77671h(jMo77474p);
        }
        return jMo77474p;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: q */
    public int mo77475q() {
        C35351a c35351a;
        String str;
        C35244b c35244b = this.f75752m;
        if (c35244b != null && c35244b.m77644a() > 0) {
            return (int) this.f75752m.m77644a();
        }
        if (this.f75750k.m77839a(13)) {
            InterfaceC35237b interfaceC35237b = this.f75743d;
            if (interfaceC35237b != null) {
                int iMo77475q = interfaceC35237b.mo77475q();
                C35244b c35244b2 = this.f75752m;
                if (c35244b2 != null) {
                    c35244b2.m77646a(iMo77475q);
                }
                return iMo77475q;
            }
            c35351a = this.f75741b;
            str = "getVideoWidth, mPlayerBase = null, return 0!";
        } else {
            c35351a = this.f75741b;
            str = "getVideoWidth, state error!";
        }
        c35351a.m78142d(str);
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: r */
    public int mo77476r() {
        C35351a c35351a;
        String str;
        C35244b c35244b = this.f75752m;
        if (c35244b != null && c35244b.m77648b() > 0) {
            return (int) this.f75752m.m77648b();
        }
        if (this.f75750k.m77839a(13)) {
            InterfaceC35237b interfaceC35237b = this.f75743d;
            if (interfaceC35237b != null) {
                int iMo77476r = interfaceC35237b.mo77476r();
                C35244b c35244b2 = this.f75752m;
                if (c35244b2 != null) {
                    c35244b2.m77650b(iMo77476r);
                }
                return iMo77476r;
            }
            c35351a = this.f75741b;
            str = "getVideoHeight, mPlayerBase = null, return 0!";
        } else {
            c35351a = this.f75741b;
            str = "getVideoHeight, state error!";
        }
        c35351a.m78142d(str);
        return 0;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: s */
    public TPTrackInfo[] mo77477s() {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        return interfaceC35237b != null ? interfaceC35237b.mo77477s() : (TPTrackInfo[]) this.f75749j.m77700b().toArray(new TPTrackInfo[0]);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: t */
    public TPProgramInfo[] mo77478t() {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        return (interfaceC35237b == null || interfaceC35237b.mo77478t() == null) ? new TPProgramInfo[0] : this.f75743d.mo77478t();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: v */
    public TPGeneralPlayFlowParams mo77480v() {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b == null) {
            return null;
        }
        return interfaceC35237b.mo77480v();
    }

    public C35246d(Context context, C35352b c35352b) {
        C35352b c35352b2 = new C35352b(c35352b, "TPPlayerAdapter");
        this.f75740a = c35352b2;
        this.f75741b = new C35351a(c35352b2);
        this.f75742c = context;
        TPPlayerState tPPlayerState = new TPPlayerState();
        this.f75744e = tPPlayerState;
        tPPlayerState.setOnPlayerStateChangeListener(this);
        this.f75749j = new C35245c();
        this.f75748i = new a();
        this.f75747h = new C35249g(this.f75740a.m78145a());
        this.f75750k = new C35251i(this.f75744e);
        this.f75752m = new C35244b();
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC35252a m77723a(C35245c c35245c) {
        C35253a c35253a;
        try {
            c35253a = new C35253a(c35245c);
        } catch (IllegalArgumentException unused) {
            c35253a = new C35253a(null);
        }
        return C35258e.m77855a(c35253a);
    }

    /* JADX INFO: renamed from: c */
    private void m77752c(int i11, int i12) {
        if (i12 == 1) {
            this.f75747h.mo77484a(1013, i11, 0L, (Object) null);
        } else {
            this.f75747h.mo77484a(200, 0L, 0L, (Object) null);
        }
        this.f75746g = i12;
        TPPlayerState tPPlayerState = this.f75744e;
        tPPlayerState.setLastState(tPPlayerState.state());
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            long jMo77473o = interfaceC35237b.mo77473o();
            this.f75741b.m78141c("switchPlayer, current position:".concat(String.valueOf(jMo77473o)));
            this.f75752m.m77666f(jMo77473o);
            this.f75752m.m77671h(this.f75743d.mo77474p());
            this.f75743d.mo77470l();
            this.f75743d.mo77471m();
        }
        InterfaceC35237b interfaceC35237bM77722a = m77722a(i11, this.f75740a);
        this.f75743d = interfaceC35237bM77722a;
        if (interfaceC35237bM77722a == null) {
            throw new RuntimeException("error , create player failed");
        }
        this.f75745f = true;
        this.f75741b.m78141c("switch player to type:" + this.f75753n);
        if (this.f75752m != null) {
            this.f75743d.mo77446a(new TPOptionalParam().buildLong(100, this.f75752m.m77672i()));
        }
        this.f75744e.setInnerPlayStateState(3);
        this.f75743d.mo77466h();
    }

    /* JADX INFO: renamed from: x */
    private void m77757x() {
        if (m77721C()) {
            C35244b c35244bM77643a = C35244b.m77643a(mo77463c(0));
            this.f75752m = c35244bM77643a;
            c35244bM77643a.m77661e((int) this.f75743d.mo77458b(204));
            this.f75752m.m77645a((int) this.f75743d.mo77458b(203));
            this.f75752m.m77653c((int) this.f75743d.mo77458b(102));
            this.f75752m.m77668g((int) this.f75743d.mo77458b(201));
            this.f75752m.m77649b((int) this.f75743d.mo77458b(210));
        }
        if (this.f75752m == null) {
            this.f75752m = new C35244b();
        }
        this.f75752m.m77669g(this.f75743d.mo77472n());
        TPOptionalParam tPOptionalParamM77699b = this.f75749j.m77699b(100);
        if (tPOptionalParamM77699b != null) {
            this.f75752m.m77666f(tPOptionalParamM77699b.getParamLong().value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public TPPostProcessFrameBuffer m77749b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f75750k.m77840b(7)) {
            return this.f75747h.mo77489b(tPPostProcessFrameBuffer);
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: c */
    public void mo77464c(int i11, long j11) {
        if (!this.f75750k.m77839a(18)) {
            throw new IllegalStateException("error : selectProgram , state invalid");
        }
        TPProgramInfo[] tPProgramInfoArrMo77478t = mo77478t();
        if (tPProgramInfoArrMo77478t == null) {
            tPProgramInfoArrMo77478t = new TPProgramInfo[0];
        }
        if (i11 < 0 || i11 > tPProgramInfoArrMo77478t.length - 1) {
            throw new IllegalArgumentException("error : program index not found");
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77464c(i11, j11);
        }
        this.f75749j.m77691a(tPProgramInfoArrMo77478t[i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public TPPostProcessFrameBuffer m77725a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        if (this.f75750k.m77840b(7)) {
            return this.f75747h.mo77481a(tPPostProcessFrameBuffer);
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77459b(float f11) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error , setPlaySpeedRatio , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77459b(f11);
        } else {
            this.f75741b.m78141c("setPlaySpeedRatio, mPlayerBase = null!");
        }
        this.f75749j.m77701b(f11);
        InterfaceC35353a interfaceC35353a = this.f75754o;
        if (interfaceC35353a != null) {
            try {
                interfaceC35353a.mo78148a(f11);
            } catch (Exception unused) {
                this.f75741b.m78142d("setPlaySpeedRatio, rich media processor setPlaySpeedRatio err.");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.k
    /* JADX INFO: renamed from: b */
    public void mo77635b(int i11, int i12) {
        this.f75747h.mo77635b(i11, i12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: c */
    public boolean mo77361c() {
        TPPlayerState tPPlayerState = this.f75744e;
        return tPPlayerState != null && tPPlayerState.state() == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public TPRemoteSdpInfo m77727a(String str, int i11) {
        return this.f75747h.mo77631a(str, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77460b(int i11, long j11) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error : deselectTrack , state invalid");
        }
        TPTrackInfo[] tPTrackInfoArrMo77477s = mo77477s();
        if (tPTrackInfoArrMo77477s == null) {
            this.f75741b.m78143e("fatal err, tpTrackInfos is null");
            return;
        }
        if (i11 < 0 || i11 > tPTrackInfoArrMo77477s.length - 1) {
            throw new IllegalArgumentException("error : track not found");
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77460b(i11, j11);
        }
        this.f75749j.m77702b(i11, j11, tPTrackInfoArrMo77477s[i11]);
    }

    /* JADX INFO: renamed from: b */
    private void m77750b(InterfaceC35237b interfaceC35237b) {
        String strM77639a;
        InterfaceC35237b interfaceC35237b2;
        interfaceC35237b.mo77437a((C35241c.h) this.f75748i);
        interfaceC35237b.mo77438a((C35241c.i) this.f75748i);
        interfaceC35237b.mo77432a((C35241c.c) this.f75748i);
        interfaceC35237b.mo77435a((C35241c.f) this.f75748i);
        interfaceC35237b.mo77439a((C35241c.j) this.f75748i);
        interfaceC35237b.mo77444a((C35241c.p) this.f75748i);
        interfaceC35237b.mo77440a((C35241c.l) this.f75748i);
        interfaceC35237b.mo77441a((C35241c.m) this.f75748i);
        interfaceC35237b.mo77434a((C35241c.e) this.f75748i);
        interfaceC35237b.mo77436a((C35241c.g) this.f75748i);
        interfaceC35237b.mo77433a((C35241c.d) this.f75748i);
        if (m77721C()) {
            interfaceC35237b.mo77442a((C35241c.n) this.f75748i);
            interfaceC35237b.mo77430a((C35241c.a) this.f75748i);
            interfaceC35237b.mo77443a((C35241c.o) this.f75748i);
            interfaceC35237b.mo77431a((C35241c.b) this.f75748i);
        }
        if (1 == this.f75749j.m77707e().m77812g()) {
            interfaceC35237b.mo77427a(this.f75749j.m77707e().m77808c());
        } else if (4 == this.f75749j.m77707e().m77812g()) {
            interfaceC35237b.mo77426a(this.f75749j.m77707e().m77809d());
        } else if (3 == this.f75749j.m77707e().m77812g()) {
            int i11 = this.f75753n;
            if (i11 == 2) {
                strM77639a = this.f75749j.m77707e().m77811f().m77641b();
            } else if (i11 == 1) {
                strM77639a = this.f75749j.m77707e().m77811f().m77639a();
            }
            interfaceC35237b.mo77452a(strM77639a, this.f75749j.m77707e().m77807b());
        } else if (2 == this.f75749j.m77707e().m77812g()) {
            interfaceC35237b.mo77447a(this.f75749j.m77707e().m77810e());
        }
        Iterator<TPOptionalParam> it = this.f75749j.m77717o().iterator();
        while (it.hasNext()) {
            interfaceC35237b.mo77446a(it.next());
        }
        for (int i12 = 0; i12 < this.f75749j.m77700b().size(); i12++) {
            TPTrackInfo tPTrackInfo = this.f75749j.m77700b().get(i12);
            int i13 = tPTrackInfo.trackType;
            if (i13 == 3) {
                for (C35245c.d dVar : this.f75749j.m77715m()) {
                    if (!TextUtils.isEmpty(dVar.f75738c) && dVar.f75738c.equals(tPTrackInfo.name)) {
                        interfaceC35237b.mo77454a(dVar.f75736a, dVar.f75739d, dVar.f75737b, dVar.f75738c);
                        break;
                    }
                }
            } else if (i13 == 2) {
                for (C35245c.a aVar : this.f75749j.m77716n()) {
                    if (!TextUtils.isEmpty(aVar.f75727b) && aVar.f75727b.equals(tPTrackInfo.name)) {
                        interfaceC35237b.mo77455a(aVar.f75726a, aVar.f75729d, aVar.f75727b, aVar.f75728c);
                        break;
                    }
                }
            }
        }
        for (C35245c.c cVar : this.f75749j.m77705c()) {
            if (cVar.f75735c.isSelected) {
                TPTrackInfo[] tPTrackInfoArrMo77477s = interfaceC35237b.mo77477s();
                if (tPTrackInfoArrMo77477s == null) {
                    this.f75741b.m78143e("playerTrackInfoList is null.");
                } else {
                    for (int i14 = 0; i14 < tPTrackInfoArrMo77477s.length; i14++) {
                        if (cVar.f75735c.name.equals(tPTrackInfoArrMo77477s[i14].name)) {
                            interfaceC35237b.mo77425a(i14, cVar.f75734b);
                        }
                    }
                }
            }
        }
        if (this.f75749j.m77713k() != null) {
            interfaceC35237b2 = interfaceC35237b;
            interfaceC35237b2.mo77457a(this.f75749j.m77713k().f75730a, this.f75749j.m77713k().f75731b, this.f75749j.m77713k().f75732c);
        } else {
            interfaceC35237b2 = interfaceC35237b;
        }
        interfaceC35237b2.mo77456a(this.f75749j.m77709g());
        if (this.f75749j.m77710h() != 0.0f) {
            interfaceC35237b2.mo77422a(this.f75749j.m77710h());
        }
        if (this.f75749j.m77712j() != 0.0f) {
            interfaceC35237b2.mo77459b(this.f75749j.m77712j());
        }
        if (!"".equals(this.f75749j.m77711i())) {
            interfaceC35237b2.mo77450a(this.f75749j.m77711i());
        }
        if (this.f75749j.m77706d() instanceof SurfaceHolder) {
            interfaceC35237b2.mo77429a((SurfaceHolder) this.f75749j.m77706d());
        } else if (this.f75749j.m77706d() instanceof Surface) {
            interfaceC35237b2.mo77428a((Surface) this.f75749j.m77706d());
        }
        interfaceC35237b2.mo77446a(new TPOptionalParam().buildQueueInt(204, this.f75751l.mo77843a()));
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77422a(float f11) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error , setAudioGainRatio , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77422a(f11);
        } else {
            this.f75741b.m78141c("setAudioGainRatio, mPlayerBase = null!");
        }
        this.f75749j.m77683a(f11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77423a(int i11) {
        if (!this.f75750k.m77839a(9)) {
            throw new IllegalStateException("error , seek to , state invalid , current state :" + this.f75744e);
        }
        if (this.f75743d == null) {
            this.f75741b.m78142d("seekTo, mPlayerBase = null!");
            return;
        }
        if (this.f75744e.state() == 7) {
            this.f75744e.changeState(5);
        }
        this.f75743d.mo77423a(i11);
        InterfaceC35353a interfaceC35353a = this.f75754o;
        if (interfaceC35353a != null) {
            try {
                interfaceC35353a.mo78149a(i11);
            } catch (Exception unused) {
                this.f75741b.m78142d("seekTo, rich media processor seek err.");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77424a(int i11, @TPCommonEnum.TPSeekMode int i12) {
        if (!this.f75750k.m77839a(9)) {
            throw new IllegalStateException("error , seek to , state invalid , current state :" + this.f75744e);
        }
        if (this.f75743d == null) {
            this.f75741b.m78142d("seekTo, mPlayerBase = null!");
            return;
        }
        if (this.f75744e.state() == 7) {
            this.f75744e.changeState(5);
        }
        this.f75743d.mo77424a(i11, i12);
        InterfaceC35353a interfaceC35353a = this.f75754o;
        if (interfaceC35353a != null) {
            try {
                interfaceC35353a.mo78149a(i11);
            } catch (Exception unused) {
                this.f75741b.m78142d("seekTo, rich media processor seek err.");
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: b */
    public void mo77360b(TPVideoInfo tPVideoInfo) {
        if (!this.f75750k.m77839a(3)) {
            this.f75741b.m78143e("updateVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.f75752m.m77650b(tPVideoInfo.getHeight());
            this.f75752m.m77646a(tPVideoInfo.getWidth());
            this.f75752m.m77655c(tPVideoInfo.getDefinition());
            this.f75752m.m77668g(tPVideoInfo.getVideoCodecId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77728a(int i11, int i12, long j11, long j12) {
        if (this.f75750k.m77840b(4)) {
            InterfaceC35252a interfaceC35252a = this.f75751l;
            C35244b c35244b = this.f75752m;
            int iMo77842a = interfaceC35252a.mo77842a(c35244b, new C35254b(this.f75753n, i11, i12, c35244b.m77656d()));
            if (iMo77842a == 0) {
                this.f75744e.changeState(10);
                this.f75747h.mo77483a(i11, i12, j11, j12);
                return;
            }
            try {
                m77752c(iMo77842a, 1);
            } catch (IOException e11) {
                this.f75741b.m78137a(e11);
                this.f75744e.changeState(10);
                this.f75747h.mo77483a(i11, i12, j11, j12);
            } catch (IllegalStateException e12) {
                this.f75741b.m78137a(e12);
                this.f75744e.changeState(10);
                this.f75747h.mo77483a(i11, i12, j11, j12);
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: b */
    public void mo77461b(boolean z11) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error , setLoopback , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77461b(z11);
        } else {
            this.f75741b.m78141c("setLoopback, mPlayerBase = null!");
        }
        this.f75749j.m77704b(z11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77425a(int i11, long j11) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error : selectTrack , state invalid");
        }
        TPTrackInfo[] tPTrackInfoArrMo77477s = mo77477s();
        if (tPTrackInfoArrMo77477s == null) {
            this.f75741b.m78143e("fatal err, tpTrackInfos is null");
            return;
        }
        if (i11 < 0 || i11 > tPTrackInfoArrMo77477s.length - 1) {
            throw new IllegalArgumentException("error : track not found");
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77425a(i11, j11);
        }
        this.f75749j.m77684a(i11, j11, tPTrackInfoArrMo77477s[i11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77729a(int i11, long j11, long j12, Object obj) {
        C35244b c35244b;
        if (this.f75745f) {
            this.f75741b.m78141c("handleOnInfo, mIsReopening");
            return;
        }
        if (i11 == 152 && (c35244b = this.f75752m) != null) {
            c35244b.m77665f(((int) j11) + 1);
        }
        this.f75747h.mo77484a(i11, j11, j12, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77730a(long j11, long j12) {
        if (!this.f75750k.m77840b(6)) {
            this.f75741b.m78141c("handleOnVideoSizeChange, invalid state");
            return;
        }
        this.f75752m.m77650b(j12);
        this.f75752m.m77646a(j11);
        this.f75747h.mo77485a(j11, j12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77426a(AssetFileDescriptor assetFileDescriptor) {
        if (!this.f75750k.m77839a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        if (assetFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , afd invalid");
        }
        this.f75749j.m77685a(assetFileDescriptor);
        this.f75744e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77427a(ParcelFileDescriptor parcelFileDescriptor) {
        if (!this.f75750k.m77839a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        if (parcelFileDescriptor == null) {
            throw new IllegalArgumentException("error : setDataSource , pfd invalid");
        }
        this.f75749j.m77686a(parcelFileDescriptor);
        this.f75744e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77428a(Surface surface) {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77428a(surface);
        }
        this.f75749j.m77687a(surface);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77429a(SurfaceHolder surfaceHolder) {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77429a(surfaceHolder);
        }
        this.f75749j.m77688a(surfaceHolder);
    }

    /* JADX INFO: renamed from: a */
    private void m77731a(InterfaceC35237b interfaceC35237b) {
        TPProgramInfo tPProgramInfoM77714l;
        TPProgramInfo tPProgramInfo;
        TPProgramInfo[] tPProgramInfoArrMo77478t = mo77478t();
        if (tPProgramInfoArrMo77478t == null || (tPProgramInfoM77714l = this.f75749j.m77714l()) == null) {
            return;
        }
        for (int i11 = 0; i11 < tPProgramInfoArrMo77478t.length; i11++) {
            if (!TextUtils.isEmpty(tPProgramInfoM77714l.url) && (tPProgramInfo = tPProgramInfoArrMo77478t[i11]) != null && tPProgramInfoM77714l.url.equals(tPProgramInfo.url)) {
                interfaceC35237b.mo77464c(i11, -1L);
                return;
            }
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77430a(C35241c.a aVar) {
        this.f75747h.m77781a(aVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77431a(C35241c.b bVar) {
        this.f75747h.m77782a(bVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77432a(C35241c.c cVar) {
        this.f75747h.m77783a(cVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77433a(C35241c.d dVar) {
        this.f75747h.m77784a(dVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77434a(C35241c.e eVar) {
        this.f75747h.m77785a(eVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77435a(C35241c.f fVar) {
        this.f75747h.m77786a(fVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77436a(C35241c.g gVar) {
        this.f75747h.m77787a(gVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77437a(C35241c.h hVar) {
        this.f75747h.m77788a(hVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77438a(C35241c.i iVar) {
        this.f75747h.m77789a(iVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77439a(C35241c.j jVar) {
        this.f75747h.m77790a(jVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public void mo77352a(C35241c.k kVar) {
        this.f75747h.m77791a(kVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77440a(C35241c.l lVar) {
        this.f75747h.m77792a(lVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77441a(C35241c.m mVar) {
        this.f75747h.m77793a(mVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77442a(C35241c.n nVar) {
        this.f75747h.m77794a(nVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77443a(C35241c.o oVar) {
        this.f75747h.m77795a(oVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77444a(C35241c.p pVar) {
        this.f75747h.m77796a(pVar);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public void mo77353a(C35243e c35243e) {
        mo77355a(c35243e, (Map<String, String>) null);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public void mo77354a(C35243e c35243e, int i11, long j11) {
        String strM77639a;
        if (!this.f75750k.m77839a(17)) {
            throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.f75744e);
        }
        this.f75749j.m77689a(c35243e, (Map<String, String>) null);
        if (this.f75743d == null) {
            this.f75741b.m78142d("switchDefinition, mPlayerBase = null!");
            return;
        }
        int i12 = this.f75753n;
        if (i12 == 2) {
            strM77639a = c35243e.m77641b();
        } else {
            strM77639a = i12 == 1 ? c35243e.m77639a() : "";
        }
        this.f75743d.mo77451a(strM77639a, i11, j11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public void mo77355a(C35243e c35243e, Map<String, String> map) {
        if (!this.f75750k.m77839a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        this.f75749j.m77689a(c35243e, map);
        this.f75744e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public void mo77356a(C35243e c35243e, Map<String, String> map, int i11, long j11) {
        String strM77639a;
        if (!this.f75750k.m77839a(17)) {
            throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.f75744e);
        }
        this.f75749j.m77689a(c35243e, map);
        if (this.f75743d == null) {
            this.f75741b.m78142d("switchDefinition, mPlayerBase = null!");
            return;
        }
        int i12 = this.f75753n;
        if (i12 == 2) {
            strM77639a = c35243e.m77641b();
        } else {
            strM77639a = i12 == 1 ? c35243e.m77639a() : "";
        }
        this.f75743d.mo77453a(strM77639a, map, i11, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77742a(TPAudioFrameBuffer tPAudioFrameBuffer) {
        if (this.f75750k.m77840b(7)) {
            this.f75747h.mo77486a(tPAudioFrameBuffer);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77445a(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77445a(tPCaptureParams, tPCaptureCallBack);
        } else {
            throw new IllegalStateException("error , no player for capture :" + this.f75744e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77743a(TPDrmInfo tPDrmInfo) {
        this.f75747h.mo77634a(tPDrmInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77446a(TPOptionalParam tPOptionalParam) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("setPlayerOptionalParam , state invalid");
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77446a(tPOptionalParam);
        }
        this.f75749j.m77690a(tPOptionalParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77744a(TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.f75747h.mo77633a(tPPlayerDetailInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77745a(TPSubtitleData tPSubtitleData) {
        if (this.f75750k.m77840b(7)) {
            this.f75747h.mo77487a(tPSubtitleData);
        } else {
            this.f75741b.m78141c("handleOnSubtitleData, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77746a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        if (this.f75750k.m77840b(7)) {
            this.f75747h.mo77636a(tPSubtitleFrameBuffer);
        } else {
            this.f75741b.m78141c("handleOnSubtitleFrameOut, invalid state");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m77747a(TPVideoFrameBuffer tPVideoFrameBuffer) {
        if (this.f75750k.m77840b(7)) {
            this.f75747h.mo77488a(tPVideoFrameBuffer);
        } else {
            this.f75741b.m78141c("handleOnVideoFrameOut, invalid state");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public void mo77357a(TPVideoInfo tPVideoInfo) {
        if (!this.f75750k.m77839a(2)) {
            this.f75741b.m78143e("setVideoInfo state invalid");
        }
        if (tPVideoInfo != null) {
            this.f75752m.m77650b(tPVideoInfo.getHeight());
            this.f75752m.m77646a(tPVideoInfo.getWidth());
            this.f75752m.m77655c(tPVideoInfo.getDefinition());
            this.f75752m.m77668g(tPVideoInfo.getVideoCodecId());
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77447a(ITPMediaAsset iTPMediaAsset) {
        if (!this.f75750k.m77839a(2)) {
            throw new IllegalStateException("error : setDataSource , state invalid");
        }
        if (iTPMediaAsset == null) {
            throw new IllegalArgumentException("error : setDataSource , mediaAsset invalid");
        }
        this.f75749j.m77692a(iTPMediaAsset);
        this.f75744e.changeState(2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77448a(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
        if (!this.f75750k.m77839a(17)) {
            throw new IllegalStateException("error , switch definition , state invalid , current state :" + this.f75744e);
        }
        this.f75749j.m77692a(iTPMediaAsset);
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77448a(iTPMediaAsset, i11, j11);
        } else {
            this.f75741b.m78142d("switchDefinition, mPlayerBase = null!");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.InterfaceC35230a
    /* JADX INFO: renamed from: a */
    public void mo77358a(ITPRichMediaSynchronizer iTPRichMediaSynchronizer) {
        if (iTPRichMediaSynchronizer == null) {
            InterfaceC35353a interfaceC35353a = this.f75754o;
            if (interfaceC35353a != null) {
                interfaceC35353a.mo78150a((InterfaceC35353a.a) null);
            }
            this.f75754o = null;
            return;
        }
        if (iTPRichMediaSynchronizer instanceof InterfaceC35353a) {
            InterfaceC35353a interfaceC35353a2 = (InterfaceC35353a) iTPRichMediaSynchronizer;
            this.f75754o = interfaceC35353a2;
            interfaceC35353a2.mo78150a(new InterfaceC35353a.a() { // from class: com.tencent.thumbplayer.tcmedia.adapter.d.1
                @Override // com.tencent.thumbplayer.tcmedia.p161f.InterfaceC35353a.a
                /* JADX INFO: renamed from: a */
                public long mo77760a(ITPRichMediaSynchronizer iTPRichMediaSynchronizer2) {
                    return C35246d.this.mo77473o();
                }
            });
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77449a(C35352b c35352b) {
        this.f75740a.m78146a(c35352b, "TPPlayerAdapter");
        this.f75741b.m78136a(this.f75740a);
        this.f75747h.m77797a(this.f75740a.m78145a());
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77449a(this.f75740a);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77450a(String str) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error , setAudioNormalizeVolumeParams , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77450a(str);
        } else {
            this.f75741b.m78141c("setAudioGainRatio, mPlayerBase = null!");
        }
        this.f75749j.m77693a(str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77451a(String str, @TPCommonEnum.TPSwitchDefMode int i11, long j11) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77452a(String str, Map<String, String> map) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77453a(String str, Map<String, String> map, int i11, long j11) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77454a(String str, Map<String, String> map, String str2, String str3) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error : addSubtitleSource, state invalid");
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77454a(str, map, str2, str3);
        }
        this.f75749j.m77695a(str, map, str2, str3);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77455a(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error : addAudioTrackSource, state invalid");
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77455a(str, map, str2, list);
        }
        this.f75749j.m77696a(str, map, str2, list);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77456a(boolean z11) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error , setOutputMute , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77456a(z11);
        } else {
            this.f75741b.m78141c("setOutputMute, mPlayerBase = null!");
        }
        this.f75749j.m77697a(z11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.InterfaceC35237b
    /* JADX INFO: renamed from: a */
    public void mo77457a(boolean z11, long j11, long j12) {
        if (!this.f75750k.m77839a(3)) {
            throw new IllegalStateException("error , setLoopback , state invalid , current state :" + this.f75744e);
        }
        InterfaceC35237b interfaceC35237b = this.f75743d;
        if (interfaceC35237b != null) {
            interfaceC35237b.mo77457a(z11, j11, j12);
        } else {
            this.f75741b.m78141c("setLoopback, mPlayerBase = null!");
        }
        this.f75749j.m77698a(z11, j11, j12);
    }
}
