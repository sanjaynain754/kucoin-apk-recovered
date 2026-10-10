package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.thumbplayer.tcmedia.api.TPDrmInfo;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.C35387a;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p178b.C35393a;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p178b.C35394b;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p178b.C35395c;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p178b.C35396d;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p178b.C35397e;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p178b.C35398f;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.n */
/* JADX INFO: loaded from: classes64.dex */
public class C35410n extends C35399c {

    /* JADX INFO: renamed from: i */
    private boolean f76425i = true;

    /* JADX INFO: renamed from: j */
    private boolean f76426j = false;

    /* JADX INFO: renamed from: k */
    private boolean f76427k = false;

    /* JADX INFO: renamed from: l */
    private boolean f76428l = false;

    /* JADX INFO: renamed from: m */
    private C35409m f76429m = new C35409m();

    /* JADX INFO: renamed from: b */
    private C35394b m78596b(TPDrmInfo tPDrmInfo) {
        C35394b c35394b = new C35394b();
        c35394b.m78401n(tPDrmInfo.drmAbility);
        c35394b.m78467q(tPDrmInfo.drmSupportSecureDecoder);
        c35394b.m78470r(tPDrmInfo.drmSupportSecureDecrypt);
        c35394b.m78465p(tPDrmInfo.drmSecureLevel);
        c35394b.m78469q(tPDrmInfo.drmComponentName);
        c35394b.m78463o(tPDrmInfo.drmType);
        c35394b.m78451c(tPDrmInfo.drmPrepareStartTimeMs);
        c35394b.m78452d(tPDrmInfo.drmPrepareEndTimeMs);
        c35394b.m78453e(tPDrmInfo.drmOpenSessionStartTimeMs);
        c35394b.m78454f(tPDrmInfo.drmOpenSessionEndTimeMs);
        c35394b.m78455g(tPDrmInfo.drmGetProvisionReqStartTimeMs);
        c35394b.m78456h(tPDrmInfo.drmGetProvisionReqEndTimeMs);
        c35394b.m78457i(tPDrmInfo.drmSendProvisionReqTimeMs);
        c35394b.m78458j(tPDrmInfo.drmRecvProvisionRespTimeMs);
        c35394b.m78459k(tPDrmInfo.drmProvideProvisionRespStartTimeMs);
        c35394b.m78460l(tPDrmInfo.drmProvideProvisionRespEndTimeMs);
        c35394b.m78461m(tPDrmInfo.drmGetKeyReqStartTimeMs);
        c35394b.m78462n(tPDrmInfo.drmGetKeyReqEndTimeMs);
        c35394b.m78464o(tPDrmInfo.drmSendKeyReqTimeMs);
        c35394b.m78466p(tPDrmInfo.drmRecvKeyRespTimeMs);
        c35394b.m78468q(tPDrmInfo.drmProvideKeyRespStartTimeMs);
        c35394b.m78471r(tPDrmInfo.drmProvideKeyRespEndTimeMs);
        this.f76360f.m78586b(this.f76429m.f76203a);
        C35387a c35387a = this.f76429m.f76203a;
        int i11 = this.f76361g;
        this.f76361g = i11 + 1;
        c35387a.m78367a(i11);
        c35394b.m78369a(this.f76429m.f76203a);
        return c35394b;
    }

    /* JADX INFO: renamed from: c */
    private void m78599c() {
        TPLogUtil.m78796d("TPVodReporter", "onAppForeground");
        m78524a(this.f76429m.f76203a.m78365a());
    }

    /* JADX INFO: renamed from: d */
    private void m78601d() {
        TPLogUtil.m78796d("TPVodReporter", "onAppBackground");
        if (this.f76425i) {
            return;
        }
        m78525a("vod_flow", m78598b(m78528b(), m78521a(false)));
        m78525a("vod_end", m78597b(SystemClock.elapsedRealtime(), 0, m78528b()));
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78354a() {
        super.mo78354a();
    }

    /* JADX INFO: renamed from: b */
    private C35395c m78597b(long j11, int i11, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        C35395c c35395c = new C35395c();
        C35409m c35409m = this.f76429m;
        long j12 = j11 - c35409m.f76408g;
        c35409m.f76410i = j12;
        c35395c.m78472c(j12);
        c35395c.m78475o(i11);
        c35395c.m78476p(this.f76429m.f76414m);
        c35395c.m78477q(this.f76429m.f76415n);
        c35395c.m78473d(this.f76429m.f76416o);
        c35395c.m78478r(this.f76429m.f76418q);
        c35395c.m78474e(this.f76429m.f76419r);
        m78593a(c35395c, tPGeneralPlayFlowParams);
        C35387a c35387a = this.f76429m.f76203a;
        int i12 = this.f76361g;
        this.f76361g = i12 + 1;
        c35387a.m78367a(i12);
        this.f76360f.m78586b(this.f76429m.f76203a);
        c35395c.m78369a(this.f76429m.f76203a);
        return c35395c;
    }

    /* JADX INFO: renamed from: c */
    private void m78600c(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.o)) {
            TPLogUtil.m78797e("TPVodReporter", "onPrepareDone fail:params is not match");
            return;
        }
        C35349b.o oVar = (C35349b.o) aVar;
        long jM78080b = oVar.m78080b() - this.f76359e.f76399c;
        this.f76429m.f76407f = oVar.m78080b();
        m78523a(this.f76429m);
        C35387a c35387a = this.f76429m.f76203a;
        int i11 = this.f76361g;
        this.f76361g = i11 + 1;
        c35387a.m78367a(i11);
        this.f76360f.m78586b(this.f76429m.f76203a);
        m78529b(this.f76429m);
        C35396d c35396d = new C35396d();
        c35396d.m78484c(jM78080b);
        c35396d.m78369a(this.f76429m.f76203a);
        Map<String, String> mapM78372b = c35396d.m78372b();
        m78526a("onPrepareDone", mapM78372b);
        m78530b("vod_first_load", mapM78372b);
        m78531c("vod_first_load", mapM78372b);
    }

    /* JADX INFO: renamed from: d */
    private void m78602d(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.m)) {
            TPLogUtil.m78797e("TPVodReporter", "onPlayerStart fail:params is not match");
            return;
        }
        C35349b.m mVar = (C35349b.m) aVar;
        this.f76425i = false;
        this.f76428l = false;
        C35409m c35409m = this.f76429m;
        if (c35409m.f76408g == 0) {
            c35409m.f76408g = mVar.m78080b();
        }
        this.f76429m.f76409h = mVar.m78080b();
        C35409m c35409m2 = this.f76429m;
        if (c35409m2.f76411j > 0) {
            long j11 = c35409m2.f76412k;
            long jM78080b = mVar.m78080b();
            C35409m c35409m3 = this.f76429m;
            c35409m2.f76412k = j11 + (jM78080b - c35409m3.f76411j);
            c35409m3.f76411j = 0L;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m78603e(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.j)) {
            TPLogUtil.m78797e("TPVodReporter", "onPlayerPause fail:params is not match");
            return;
        }
        C35349b.j jVar = (C35349b.j) aVar;
        if (this.f76428l) {
            TPLogUtil.m78797e("TPVodReporter", "onPlayerPause has been called");
            return;
        }
        this.f76428l = true;
        this.f76429m.f76411j = jVar.m78080b();
        TPLogUtil.m78796d("TPVodReporter", "Vod onPlayerPause timeMs:" + this.f76429m.f76411j);
    }

    /* JADX INFO: renamed from: f */
    private void m78604f(C35349b.a aVar) {
        if (this.f76425i) {
            TPLogUtil.m78797e("TPVodReporter", "Player has been called End");
            return;
        }
        this.f76425i = true;
        m78589a(aVar.m78080b(), 0, m78522a(aVar), m78527b(aVar));
        m78524a(this.f76429m.f76203a.m78365a());
    }

    /* JADX INFO: renamed from: g */
    private void m78605g(C35349b.a aVar) {
        if (this.f76425i) {
            TPLogUtil.m78797e("TPVodReporter", "Player has been called End");
            return;
        }
        this.f76425i = true;
        if (!(aVar instanceof C35349b.i)) {
            TPLogUtil.m78797e("TPVodReporter", "onPlayerError fail:params is not match");
            return;
        }
        C35349b.i iVar = (C35349b.i) aVar;
        m78589a(iVar.m78080b(), iVar.m78098e(), m78522a(iVar), m78527b(iVar));
        m78524a(this.f76429m.f76203a.m78365a());
    }

    /* JADX INFO: renamed from: h */
    private void m78606h(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.r)) {
            TPLogUtil.m78797e("TPVodReporter", "onSeekStart fail:params is not match");
            return;
        }
        C35349b.r rVar = (C35349b.r) aVar;
        if (this.f76427k) {
            m78609k(new C35349b.b());
        }
        if (this.f76426j) {
            m78607i(new C35349b.q());
        }
        this.f76426j = true;
        this.f76429m.f76413l = rVar.m78080b();
        TPLogUtil.m78796d("TPVodReporter", "Vod onSeekStart timeMs:" + this.f76429m.f76413l);
    }

    /* JADX INFO: renamed from: i */
    private void m78607i(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.q)) {
            TPLogUtil.m78797e("TPVodReporter", "onSeekEnd fail:params is not match");
            return;
        }
        this.f76426j = false;
        long jM78080b = ((C35349b.q) aVar).m78080b();
        C35409m c35409m = this.f76429m;
        long j11 = jM78080b - c35409m.f76413l;
        if (j11 > 1200) {
            c35409m.f76415n++;
            c35409m.f76416o = (int) (((long) c35409m.f76416o) + j11);
        }
        c35409m.f76414m++;
        TPLogUtil.m78796d("TPVodReporter", "Vod onSeekEnd seekCostTimeMs:" + j11 + " mSeekTotalCount:" + this.f76429m.f76414m + " mSeekBufferingTotalCount:" + this.f76429m.f76415n + " mSeekBufferingTotalDurationMs:" + this.f76429m.f76416o);
    }

    /* JADX INFO: renamed from: j */
    private void m78608j(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.c)) {
            TPLogUtil.m78797e("TPVodReporter", "onBufferingStart fail:params is not match");
            return;
        }
        C35349b.c cVar = (C35349b.c) aVar;
        this.f76427k = true;
        if (this.f76426j) {
            return;
        }
        this.f76429m.f76417p = cVar.m78080b();
        TPLogUtil.m78796d("TPVodReporter", "Vod onBufferingStart timeMs:" + this.f76429m.f76417p);
    }

    /* JADX INFO: renamed from: k */
    private void m78609k(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.b)) {
            TPLogUtil.m78797e("TPVodReporter", "onBufferingEnd fail:params is not match");
            return;
        }
        C35349b.b bVar = (C35349b.b) aVar;
        this.f76427k = false;
        if (this.f76426j) {
            return;
        }
        long jM78080b = bVar.m78080b() - this.f76429m.f76417p;
        TPLogUtil.m78796d("TPVodReporter", "Vod onBufferingEnd bufferingCostTimeMs:".concat(String.valueOf(jM78080b)));
        if (jM78080b <= 1200) {
            return;
        }
        C35409m c35409m = this.f76429m;
        c35409m.f76418q++;
        c35409m.f76419r = (int) (((long) c35409m.f76419r) + jM78080b);
        C35393a c35393a = new C35393a();
        c35393a.m78449b(this.f76429m.f76420s);
        c35393a.m78450c(jM78080b);
        this.f76360f.m78586b(this.f76429m.f76203a);
        C35387a c35387a = this.f76429m.f76203a;
        int i11 = this.f76361g;
        this.f76361g = i11 + 1;
        c35387a.m78367a(i11);
        c35393a.m78369a(this.f76429m.f76203a);
        Map<String, String> mapM78372b = c35393a.m78372b();
        m78526a("onBufferingEnd", mapM78372b);
        m78530b("vod_second_buffering", mapM78372b);
        m78531c("vod_second_buffering", mapM78372b);
    }

    /* JADX INFO: renamed from: l */
    private void m78610l(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.v)) {
            TPLogUtil.m78797e("TPVodReporter", "onSetPlaySpeed fail:params is not match");
            return;
        }
        this.f76429m.f76420s = ((C35349b.v) aVar).m78132d();
        TPLogUtil.m78796d("TPVodReporter", "Vod onSetPlaySpeed mPlaySpeed:" + this.f76429m.f76420s);
    }

    /* JADX INFO: renamed from: m */
    private void m78611m(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.t)) {
            TPLogUtil.m78797e("TPVodReporter", "onSelectTrackStart fail:params is not match");
            return;
        }
        C35349b.t tVar = (C35349b.t) aVar;
        int iM78122d = tVar.m78122d();
        long jM78123e = tVar.m78123e();
        TPLogUtil.m78796d("TPVodReporter", "Vod onSelectTrackStart trackId:" + iM78122d + " trackUniqueIndex:" + jM78123e);
        if (this.f76429m.f76421t.containsKey(Long.valueOf(jM78123e))) {
            return;
        }
        C35409m.a aVar2 = new C35409m.a();
        aVar2.f76422a = iM78122d;
        aVar2.f76424c = tVar.m78124f();
        aVar2.f76423b = tVar.m78080b();
        this.f76429m.f76421t.put(Long.valueOf(tVar.m78123e()), aVar2);
    }

    /* JADX INFO: renamed from: n */
    private void m78612n(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.s)) {
            TPLogUtil.m78797e("TPVodReporter", "onSelectTrackEnd fail:params is not match");
            return;
        }
        C35349b.s sVar = (C35349b.s) aVar;
        int iM78117d = sVar.m78117d();
        long jM78118e = sVar.m78118e();
        TPLogUtil.m78796d("TPVodReporter", "Vod onSelectTrackEnd errorCode:" + iM78117d + " trackUniqueIndex:" + jM78118e);
        m78590a(jM78118e, sVar.m78080b(), iM78117d);
    }

    /* JADX INFO: renamed from: o */
    private void m78613o(C35349b.a aVar) {
        if (aVar instanceof C35349b.h) {
            m78591a(((C35349b.h) aVar).m78092d());
        } else {
            TPLogUtil.m78797e("TPVodReporter", "onDrmInfo fail:params is not match");
        }
    }

    /* JADX INFO: renamed from: p */
    private void m78614p(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.e)) {
            TPLogUtil.m78797e("TPVodReporter", "onDTProcessUpdate fail:params is not match");
            return;
        }
        int iM78087d = ((C35349b.e) aVar).m78087d();
        TPLogUtil.m78796d("TPVodReporter", "Vod onDTProcessUpdate speedKbps:".concat(String.valueOf(iM78087d)));
        this.f76429m.f76204b = iM78087d;
    }

    /* JADX INFO: renamed from: q */
    private void m78615q(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.d)) {
            TPLogUtil.m78797e("TPVodReporter", "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        C35349b.d dVar = (C35349b.d) aVar;
        String strM78084d = dVar.m78084d();
        String strM78085e = dVar.m78085e();
        TPLogUtil.m78796d("TPVodReporter", "Vod onDTCdnUrlUpdate cdnIp:" + strM78084d + " uIp:" + strM78085e);
        C35409m c35409m = this.f76429m;
        c35409m.f76205c = strM78084d;
        c35409m.f76206d = strM78085e;
    }

    /* JADX INFO: renamed from: r */
    private void m78616r(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.f)) {
            TPLogUtil.m78797e("TPVodReporter", "onDTProtocolUpdate fail:params is not match");
            return;
        }
        String strM78090d = ((C35349b.f) aVar).m78090d();
        TPLogUtil.m78796d("TPVodReporter", "Vod onDTProtocolUpdate protocolVer:".concat(String.valueOf(strM78090d)));
        this.f76429m.f76207e = strM78090d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78355a(int i11, C35349b.a aVar) {
        if (i11 == 1001) {
            m78599c();
            return;
        }
        if (i11 == 1002) {
            m78601d();
            return;
        }
        switch (i11) {
            case 2:
                m78600c(aVar);
                break;
            case 3:
                m78602d(aVar);
                break;
            case 4:
                m78603e(aVar);
                break;
            case 5:
                m78604f(aVar);
                break;
            case 6:
                m78605g(aVar);
                break;
            case 7:
                m78606h(aVar);
                break;
            case 8:
                m78607i(aVar);
                break;
            case 9:
                m78608j(aVar);
                break;
            case 10:
                m78609k(aVar);
                break;
            case 11:
                m78611m(aVar);
                break;
            case 12:
                m78612n(aVar);
                break;
            case 13:
                m78610l(aVar);
                break;
            case 14:
                m78613o(aVar);
                break;
            default:
                switch (i11) {
                    case 100:
                        m78614p(aVar);
                        break;
                    case 101:
                        m78615q(aVar);
                        break;
                    case 102:
                        m78616r(aVar);
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78588a(long j11, int i11, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        Map<String, String> mapM78372b = m78597b(j11, i11, tPGeneralPlayFlowParams).m78372b();
        m78526a("reportVodEndEvent", mapM78372b);
        m78530b("vod_end", mapM78372b);
        m78531c("vod_end", mapM78372b);
    }

    /* JADX INFO: renamed from: b */
    private C35397e m78598b(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        C35397e c35397e = new C35397e();
        c35397e.m78485c(this.f76359e.f76397a);
        c35397e.m78486d(this.f76359e.f76398b);
        c35397e.m78487e(this.f76359e.f76399c);
        c35397e.m78500p(this.f76429m.f76407f);
        m78595a(c35397e, tPGeneralPlayFlowParams);
        m78594a(c35397e, tPDynamicStatisticParams);
        this.f76360f.m78586b(this.f76429m.f76203a);
        C35387a c35387a = this.f76429m.f76203a;
        int i11 = this.f76361g;
        this.f76361g = i11 + 1;
        c35387a.m78367a(i11);
        c35397e.m78369a(this.f76429m.f76203a);
        return c35397e;
    }

    /* JADX INFO: renamed from: a */
    private void m78589a(long j11, int i11, TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.f76427k) {
            m78609k(new C35349b.b());
            this.f76427k = false;
        }
        if (this.f76426j) {
            m78607i(new C35349b.q());
            this.f76426j = false;
        }
        if (this.f76428l) {
            C35409m c35409m = this.f76429m;
            if (c35409m.f76411j > 0) {
                long j12 = c35409m.f76412k;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C35409m c35409m2 = this.f76429m;
                c35409m.f76412k = j12 + (jElapsedRealtime - c35409m2.f76411j);
                c35409m2.f76411j = 0L;
            }
            this.f76428l = false;
        }
        TPLogUtil.m78796d("TPVodReporter", "reportPlayerEndEvent playerStopTimeMs:" + j11 + " errorCode:" + i11);
        m78592a(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        m78588a(j11, i11, tPGeneralPlayFlowParams);
    }

    /* JADX INFO: renamed from: a */
    private void m78590a(long j11, long j12, int i11) {
        if (!this.f76429m.f76421t.containsKey(Long.valueOf(j11))) {
            TPLogUtil.m78797e("TPVodReporter", "reportSelectTrackEndEvent mSelectTrackInfoList is not contain key:".concat(String.valueOf(j11)));
            return;
        }
        C35409m.a aVar = this.f76429m.f76421t.get(Long.valueOf(j11));
        long j13 = j12 - aVar.f76423b;
        TPLogUtil.m78796d("TPVodReporter", "reportSelectTrackEndEvent trackUniqueIndex:" + j11 + " costTimeMs:" + j13 + " trackId:" + aVar.f76422a);
        C35398f c35398f = new C35398f();
        c35398f.m78512o(i11);
        c35398f.m78511c(j13);
        c35398f.m78513p(aVar.f76424c.getTrackType());
        c35398f.m78514q(aVar.f76424c.isInternal ? 1 : 0);
        this.f76360f.m78586b(this.f76429m.f76203a);
        C35387a c35387a = this.f76429m.f76203a;
        int i12 = this.f76361g;
        this.f76361g = i12 + 1;
        c35387a.m78367a(i12);
        c35398f.m78369a(this.f76429m.f76203a);
        Map<String, String> mapM78372b = c35398f.m78372b();
        m78526a("onSelectTrackEnd", mapM78372b);
        m78530b("vod_select_track", mapM78372b);
        m78531c("vod_select_track", mapM78372b);
        this.f76429m.f76421t.remove(Long.valueOf(j11));
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78356a(Context context, C35408l c35408l) {
        super.mo78356a(context, c35408l);
        this.f76360f.m78585a(this.f76429m.f76203a);
    }

    /* JADX INFO: renamed from: a */
    private void m78591a(TPDrmInfo tPDrmInfo) {
        Map<String, String> mapM78372b = m78596b(tPDrmInfo).m78372b();
        m78526a("reportPlayerDrmInfoEvent", mapM78372b);
        m78530b("vod_drm_authentication", mapM78372b);
        m78531c("vod_drm_authentication", mapM78372b);
    }

    /* JADX INFO: renamed from: a */
    private void m78592a(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        Map<String, String> mapM78372b = m78598b(tPGeneralPlayFlowParams, tPDynamicStatisticParams).m78372b();
        m78526a("reportVodEndFlowEvent", mapM78372b);
        m78530b("vod_flow", mapM78372b);
        m78531c("vod_flow", mapM78372b);
    }

    /* JADX INFO: renamed from: a */
    private void m78593a(C35395c c35395c, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        c35395c.m78480t(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        c35395c.m78481u(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        c35395c.m78482v(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        c35395c.m78483w(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        c35395c.m78479s(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    /* JADX INFO: renamed from: a */
    private void m78594a(C35397e c35397e, TPDynamicStatisticParams tPDynamicStatisticParams) {
        c35397e.m78505u(tPDynamicStatisticParams.mMaxVideoStreamBitrate);
        c35397e.m78506v(tPDynamicStatisticParams.mAvgVideoStreamBitrate);
        c35397e.m78507w(tPDynamicStatisticParams.mMinVideoStreamBitrate);
        c35397e.m78508x(tPDynamicStatisticParams.mMaxVideoDecodeCostTimeMs);
        c35397e.m78509y(tPDynamicStatisticParams.mAvgVideoDecodeCostTimeMs);
        c35397e.m78510z(tPDynamicStatisticParams.mMinVideoDecodeCostTimeMs);
        c35397e.m78497o(tPDynamicStatisticParams.mVideoDecodeFrameCount);
        c35397e.m78499p(tPDynamicStatisticParams.mVideoRenderFrameCount);
    }

    /* JADX INFO: renamed from: a */
    private void m78595a(C35397e c35397e, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        c35397e.m78488f(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        c35397e.m78489g(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        c35397e.m78490h(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        c35397e.m78491i(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        c35397e.m78492j(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        c35397e.m78493k(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        c35397e.m78494l(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        c35397e.m78495m(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        c35397e.m78496n(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        c35397e.m78498o(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        c35397e.m78501q(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        c35397e.m78502r(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        c35397e.m78503s(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        c35397e.m78504t(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }
}
