package com.tencent.thumbplayer.tcmedia.adapter;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c;
import com.tencent.thumbplayer.tcmedia.api.TPAudioFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerDetailInfo;
import com.tencent.thumbplayer.tcmedia.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPRemoteSdpInfo;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleData;
import com.tencent.thumbplayer.tcmedia.api.TPSubtitleFrameBuffer;
import com.tencent.thumbplayer.tcmedia.api.TPVideoFrameBuffer;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.g */
/* JADX INFO: loaded from: classes62.dex */
public class C35249g implements C35241c.a, C35241c.b, C35241c.c, C35241c.d, C35241c.e, C35241c.f, C35241c.g, C35241c.h, C35241c.i, C35241c.j, C35241c.k, C35241c.l, C35241c.m, C35241c.n, C35241c.o, C35241c.p {

    /* JADX INFO: renamed from: a */
    private C35241c.i f75764a;

    /* JADX INFO: renamed from: b */
    private C35241c.c f75765b;

    /* JADX INFO: renamed from: c */
    private C35241c.h f75766c;

    /* JADX INFO: renamed from: d */
    private C35241c.f f75767d;

    /* JADX INFO: renamed from: e */
    private C35241c.j f75768e;

    /* JADX INFO: renamed from: f */
    private C35241c.p f75769f;

    /* JADX INFO: renamed from: g */
    private C35241c.l f75770g;

    /* JADX INFO: renamed from: h */
    private C35241c.n f75771h;

    /* JADX INFO: renamed from: i */
    private C35241c.a f75772i;

    /* JADX INFO: renamed from: j */
    private C35241c.m f75773j;

    /* JADX INFO: renamed from: k */
    private C35241c.o f75774k;

    /* JADX INFO: renamed from: l */
    private C35241c.b f75775l;

    /* JADX INFO: renamed from: m */
    private C35241c.k f75776m;

    /* JADX INFO: renamed from: n */
    private C35241c.e f75777n;

    /* JADX INFO: renamed from: o */
    private C35241c.g f75778o;

    /* JADX INFO: renamed from: p */
    private C35241c.d f75779p;

    /* JADX INFO: renamed from: q */
    private a f75780q;

    /* JADX INFO: renamed from: r */
    private String f75781r = "TPPlayerListenerS";

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.adapter.g$a */
    public static class a implements C35241c.a, C35241c.b, C35241c.c, C35241c.d, C35241c.e, C35241c.f, C35241c.g, C35241c.h, C35241c.i, C35241c.j, C35241c.k, C35241c.l, C35241c.m, C35241c.n, C35241c.o, C35241c.p {

        /* JADX INFO: renamed from: a */
        private String f75782a;

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.o
        /* JADX INFO: renamed from: a */
        public TPPostProcessFrameBuffer mo77481a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onVideoProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.b
        /* JADX INFO: renamed from: b */
        public TPPostProcessFrameBuffer mo77489b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onAudioProcessFrameOut");
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
        /* JADX INFO: renamed from: a */
        public TPRemoteSdpInfo mo77631a(String str, int i11) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onSdpExchange");
            return null;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.c
        /* JADX INFO: renamed from: b */
        public void mo77490b() {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onCompletion");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.j
        /* JADX INFO: renamed from: c */
        public void mo77491c() {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onSeekComplete");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
        /* JADX INFO: renamed from: d */
        public void mo77632d() {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onDurationUpdate");
        }

        public a(String str) {
            this.f75782a = str;
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.k
        /* JADX INFO: renamed from: b */
        public void mo77635b(int i11, int i12) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onStateChange");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.i
        /* JADX INFO: renamed from: a */
        public void mo77482a() {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onPrepared");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.f
        /* JADX INFO: renamed from: a */
        public void mo77483a(int i11, int i12, long j11, long j12) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onError");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.h
        /* JADX INFO: renamed from: a */
        public void mo77484a(int i11, long j11, long j12, Object obj) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onInfo");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.p
        /* JADX INFO: renamed from: a */
        public void mo77485a(long j11, long j12) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onVideoSizeChanged");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.a
        /* JADX INFO: renamed from: a */
        public void mo77486a(TPAudioFrameBuffer tPAudioFrameBuffer) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onAudioFrameOut");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.g
        /* JADX INFO: renamed from: a */
        public void mo77634a(TPDrmInfo tPDrmInfo) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onEventRecord");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.e
        /* JADX INFO: renamed from: a */
        public void mo77633a(TPPlayerDetailInfo tPPlayerDetailInfo) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onDetailInfo");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.l
        /* JADX INFO: renamed from: a */
        public void mo77487a(TPSubtitleData tPSubtitleData) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onSubtitleData");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.m
        /* JADX INFO: renamed from: a */
        public void mo77636a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , TPSubtitleFrameBuffer");
        }

        @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.n
        /* JADX INFO: renamed from: a */
        public void mo77488a(TPVideoFrameBuffer tPVideoFrameBuffer) {
            TPLogUtil.m78800i(this.f75782a, " empty base listener , notify , onVideoFrameOut");
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.o
    /* JADX INFO: renamed from: a */
    public TPPostProcessFrameBuffer mo77481a(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f75774k.mo77481a(tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.b
    /* JADX INFO: renamed from: b */
    public TPPostProcessFrameBuffer mo77489b(TPPostProcessFrameBuffer tPPostProcessFrameBuffer) {
        return this.f75775l.mo77489b(tPPostProcessFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
    /* JADX INFO: renamed from: a */
    public TPRemoteSdpInfo mo77631a(String str, int i11) {
        return this.f75779p.mo77631a(str, i11);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.c
    /* JADX INFO: renamed from: b */
    public void mo77490b() {
        this.f75765b.mo77490b();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.j
    /* JADX INFO: renamed from: c */
    public void mo77491c() {
        this.f75768e.mo77491c();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.d
    /* JADX INFO: renamed from: d */
    public void mo77632d() {
        this.f75779p.mo77632d();
    }

    /* JADX INFO: renamed from: e */
    public void m77798e() {
        a aVar = this.f75780q;
        this.f75764a = aVar;
        this.f75765b = aVar;
        this.f75766c = aVar;
        this.f75767d = aVar;
        this.f75768e = aVar;
        this.f75769f = aVar;
        this.f75770g = aVar;
        this.f75771h = aVar;
        this.f75772i = aVar;
        this.f75773j = aVar;
        this.f75776m = aVar;
        this.f75774k = aVar;
        this.f75775l = aVar;
        this.f75777n = aVar;
        this.f75778o = aVar;
        this.f75779p = aVar;
    }

    public C35249g(String str) {
        m77797a(str);
        a aVar = new a(this.f75781r);
        this.f75780q = aVar;
        this.f75764a = aVar;
        this.f75765b = aVar;
        this.f75766c = aVar;
        this.f75767d = aVar;
        this.f75768e = aVar;
        this.f75769f = aVar;
        this.f75770g = aVar;
        this.f75771h = aVar;
        this.f75772i = aVar;
        this.f75773j = aVar;
        this.f75774k = aVar;
        this.f75775l = aVar;
        this.f75776m = aVar;
        this.f75777n = aVar;
        this.f75778o = aVar;
        this.f75779p = aVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.i
    /* JADX INFO: renamed from: a */
    public void mo77482a() {
        this.f75764a.mo77482a();
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.k
    /* JADX INFO: renamed from: b */
    public void mo77635b(int i11, int i12) {
        this.f75776m.mo77635b(i11, i12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.f
    /* JADX INFO: renamed from: a */
    public void mo77483a(@TPCommonEnum.TPErrorType int i11, int i12, long j11, long j12) {
        this.f75767d.mo77483a(i11, i12, j11, j12);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.h
    /* JADX INFO: renamed from: a */
    public void mo77484a(int i11, long j11, long j12, Object obj) {
        this.f75766c.mo77484a(i11, j11, j12, obj);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.p
    /* JADX INFO: renamed from: a */
    public void mo77485a(long j11, long j12) {
        this.f75769f.mo77485a(j11, j12);
    }

    /* JADX INFO: renamed from: a */
    public void m77781a(C35241c.a aVar) {
        if (aVar == null) {
            aVar = this.f75780q;
        }
        this.f75772i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77782a(C35241c.b bVar) {
        if (bVar == null) {
            bVar = this.f75780q;
        }
        this.f75775l = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77783a(C35241c.c cVar) {
        if (cVar == null) {
            cVar = this.f75780q;
        }
        this.f75765b = cVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77784a(C35241c.d dVar) {
        if (dVar == null) {
            dVar = this.f75780q;
        }
        this.f75779p = dVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77785a(C35241c.e eVar) {
        if (eVar == null) {
            eVar = this.f75780q;
        }
        this.f75777n = eVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77786a(C35241c.f fVar) {
        if (fVar == null) {
            fVar = this.f75780q;
        }
        this.f75767d = fVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77787a(C35241c.g gVar) {
        if (gVar == null) {
            gVar = this.f75780q;
        }
        this.f75778o = gVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77788a(C35241c.h hVar) {
        if (hVar == null) {
            hVar = this.f75780q;
        }
        this.f75766c = hVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77789a(C35241c.i iVar) {
        if (iVar == null) {
            iVar = this.f75780q;
        }
        this.f75764a = iVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77790a(C35241c.j jVar) {
        if (jVar == null) {
            jVar = this.f75780q;
        }
        this.f75768e = jVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77791a(C35241c.k kVar) {
        if (kVar == null) {
            kVar = this.f75780q;
        }
        this.f75776m = kVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77792a(C35241c.l lVar) {
        if (lVar == null) {
            lVar = this.f75780q;
        }
        this.f75770g = lVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77793a(C35241c.m mVar) {
        if (mVar == null) {
            mVar = this.f75780q;
        }
        this.f75773j = mVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77794a(C35241c.n nVar) {
        if (nVar == null) {
            nVar = this.f75780q;
        }
        this.f75771h = nVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77795a(C35241c.o oVar) {
        if (oVar == null) {
            oVar = this.f75780q;
        }
        this.f75774k = oVar;
    }

    /* JADX INFO: renamed from: a */
    public void m77796a(C35241c.p pVar) {
        if (pVar == null) {
            pVar = this.f75780q;
        }
        this.f75769f = pVar;
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.a
    /* JADX INFO: renamed from: a */
    public void mo77486a(TPAudioFrameBuffer tPAudioFrameBuffer) {
        this.f75772i.mo77486a(tPAudioFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.g
    /* JADX INFO: renamed from: a */
    public void mo77634a(TPDrmInfo tPDrmInfo) {
        this.f75778o.mo77634a(tPDrmInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.e
    /* JADX INFO: renamed from: a */
    public void mo77633a(TPPlayerDetailInfo tPPlayerDetailInfo) {
        this.f75777n.mo77633a(tPPlayerDetailInfo);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.l
    /* JADX INFO: renamed from: a */
    public void mo77487a(TPSubtitleData tPSubtitleData) {
        this.f75770g.mo77487a(tPSubtitleData);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.m
    /* JADX INFO: renamed from: a */
    public void mo77636a(TPSubtitleFrameBuffer tPSubtitleFrameBuffer) {
        this.f75773j.mo77636a(tPSubtitleFrameBuffer);
    }

    @Override // com.tencent.thumbplayer.tcmedia.adapter.p151a.C35241c.n
    /* JADX INFO: renamed from: a */
    public void mo77488a(TPVideoFrameBuffer tPVideoFrameBuffer) {
        this.f75771h.mo77488a(tPVideoFrameBuffer);
    }

    /* JADX INFO: renamed from: a */
    public void m77797a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "TPPlayerListenerS";
        }
        this.f75781r = str;
        a aVar = this.f75780q;
        if (aVar != null) {
            aVar.f75782a = this.f75781r;
        }
    }
}
