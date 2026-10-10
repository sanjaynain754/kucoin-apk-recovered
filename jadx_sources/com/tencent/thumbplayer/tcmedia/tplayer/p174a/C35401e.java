package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.C35387a;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p177a.C35388a;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p177a.C35389b;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p177a.C35390c;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.p177a.C35391d;
import com.tencent.thumbplayer.tcmedia.utils.C35435o;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.e */
/* JADX INFO: loaded from: classes64.dex */
public class C35401e extends C35399c {

    /* JADX INFO: renamed from: i */
    private boolean f76371i = true;

    /* JADX INFO: renamed from: j */
    private boolean f76372j = false;

    /* JADX INFO: renamed from: k */
    private C35400d f76373k = new C35400d();

    /* JADX INFO: renamed from: l */
    private final Object f76374l = new Object();

    /* JADX INFO: renamed from: m */
    private Future<?> f76375m = null;

    /* JADX INFO: renamed from: n */
    private Runnable f76376n = new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.tplayer.a.e.1
        @Override // java.lang.Runnable
        public void run() {
            if (!C35401e.this.f76371i) {
                C35401e.this.m78552g();
                return;
            }
            TPLogUtil.m78800i("TPLiveReporter", "Period Timer Exit because play done.");
            C35401e.this.f76375m.cancel(true);
            C35401e.this.f76375m = null;
        }
    };

    /* JADX INFO: renamed from: b */
    private C35388a m78539b(long j11, int i11, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        C35388a c35388a = new C35388a();
        C35400d c35400d = this.f76373k;
        long j12 = c35400d.f76366i + (j11 - c35400d.f76364g);
        c35400d.f76366i = j12;
        c35388a.m78406c(j12);
        c35388a.m78407o(i11);
        m78536a(c35388a, tPGeneralPlayFlowParams);
        C35387a c35387a = this.f76373k.f76203a;
        int i12 = this.f76361g;
        this.f76361g = i12 + 1;
        c35387a.m78367a(i12);
        this.f76360f.m78586b(this.f76373k.f76203a);
        c35388a.m78369a(this.f76373k.f76203a);
        return c35388a;
    }

    /* JADX INFO: renamed from: c */
    private void m78542c() {
        TPLogUtil.m78800i("TPLiveReporter", "startPeriodReportTimer");
        synchronized (this.f76374l) {
            try {
                if (this.f76375m == null) {
                    this.f76375m = C35435o.m78917a().m78925e().scheduleAtFixedRate(this.f76376n, 0L, 60000L, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m78546d() {
        TPLogUtil.m78800i("TPLiveReporter", "destroyPeriodReportTimer");
        synchronized (this.f76374l) {
            try {
                Future<?> future = this.f76375m;
                if (future != null) {
                    future.cancel(true);
                    this.f76375m = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private void m78548e() {
        TPLogUtil.m78800i("TPLiveReporter", "onAppForeground");
        m78524a(this.f76373k.f76203a.m78365a());
    }

    /* JADX INFO: renamed from: f */
    private void m78550f() {
        TPLogUtil.m78800i("TPLiveReporter", "onAppBackground");
        if (this.f76371i) {
            return;
        }
        m78525a("live_flow", m78540b(m78528b(), m78521a(false)));
        m78525a("live_end", m78539b(SystemClock.elapsedRealtime(), 0, m78528b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m78552g() {
        TPLogUtil.m78800i("TPLiveReporter", "periodReportEvent enter.");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C35400d c35400d = this.f76373k;
        c35400d.f76370m += jElapsedRealtime - c35400d.f76365h;
        c35400d.f76365h = SystemClock.elapsedRealtime();
        C35390c c35390c = new C35390c();
        c35390c.m78424o(this.f76373k.f76369l);
        c35390c.m78414c(this.f76373k.f76368k);
        c35390c.m78415d(this.f76373k.f76370m);
        TPDynamicStatisticParams tPDynamicStatisticParamsMo78033a = this.f76356b.mo78033a(true);
        c35390c.m78416e(tPDynamicStatisticParamsMo78033a.mMaxVideoStreamBitrate);
        c35390c.m78417f(tPDynamicStatisticParamsMo78033a.mAvgVideoStreamBitrate);
        c35390c.m78418g(tPDynamicStatisticParamsMo78033a.mMinVideoStreamBitrate);
        c35390c.m78419h(tPDynamicStatisticParamsMo78033a.mMaxVideoDecodeCostTimeMs);
        c35390c.m78420i(tPDynamicStatisticParamsMo78033a.mAvgVideoDecodeCostTimeMs);
        c35390c.m78421j(tPDynamicStatisticParamsMo78033a.mMinVideoDecodeCostTimeMs);
        c35390c.m78427r(tPDynamicStatisticParamsMo78033a.mMaxVideoGopSize);
        c35390c.m78426q(tPDynamicStatisticParamsMo78033a.mAvgVideoGopSize);
        c35390c.m78425p(tPDynamicStatisticParamsMo78033a.mMinVideoGopSize);
        c35390c.m78428s(tPDynamicStatisticParamsMo78033a.mVideoDecodeFrameCount);
        c35390c.m78429t(tPDynamicStatisticParamsMo78033a.mVideoRenderFrameCount);
        c35390c.m78422k(tPDynamicStatisticParamsMo78033a.mVideoBufferedDurationMs);
        c35390c.m78423l(tPDynamicStatisticParamsMo78033a.mAudioBufferedDurationMs);
        m78544c(this.f76373k);
        C35387a c35387a = this.f76373k.f76203a;
        int i11 = this.f76361g;
        this.f76361g = i11 + 1;
        c35387a.m78367a(i11);
        this.f76360f.m78586b(this.f76373k.f76203a);
        c35390c.m78369a(this.f76373k.f76203a);
        Map<String, String> mapM78372b = c35390c.m78372b();
        m78526a("periodReportEvent", mapM78372b);
        m78530b("live_period_report", mapM78372b);
        m78531c("live_period_report", mapM78372b);
        C35400d c35400d2 = this.f76373k;
        c35400d2.f76369l = 0;
        c35400d2.f76368k = 0L;
        c35400d2.f76370m = 0L;
        c35400d2.f76203a.m78379c((Map<String, String>) null);
        this.f76373k.f76203a.m78382d((Map<String, String>) null);
    }

    /* JADX INFO: renamed from: b */
    private C35391d m78540b(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        C35391d c35391d = new C35391d();
        c35391d.m78430c(this.f76359e.f76397a);
        c35391d.m78431d(this.f76359e.f76398b);
        c35391d.m78432e(this.f76359e.f76399c);
        c35391d.m78443p(this.f76373k.f76363f);
        m78537a(c35391d, tPGeneralPlayFlowParams);
        C35387a c35387a = this.f76373k.f76203a;
        int i11 = this.f76361g;
        this.f76361g = i11 + 1;
        c35387a.m78367a(i11);
        this.f76360f.m78586b(this.f76373k.f76203a);
        c35391d.m78369a(this.f76373k.f76203a);
        return c35391d;
    }

    /* JADX INFO: renamed from: c */
    private void m78543c(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.o)) {
            TPLogUtil.m78797e("TPLiveReporter", "onPrepareDone fail:params is not match");
            return;
        }
        C35349b.o oVar = (C35349b.o) aVar;
        long jM78080b = oVar.m78080b() - this.f76359e.f76399c;
        this.f76373k.f76363f = oVar.m78080b();
        TPLogUtil.m78800i("TPLiveReporter", "Live onPrepareDone timeMs:".concat(String.valueOf(jM78080b)));
        m78523a(this.f76373k);
        C35387a c35387a = this.f76373k.f76203a;
        int i11 = this.f76361g;
        this.f76361g = i11 + 1;
        c35387a.m78367a(i11);
        this.f76360f.m78586b(this.f76373k.f76203a);
        m78529b(this.f76373k);
        C35389b c35389b = new C35389b();
        c35389b.m78413c(jM78080b);
        c35389b.m78369a(this.f76373k.f76203a);
        Map<String, String> mapM78372b = c35389b.m78372b();
        m78526a("onPrepareDone", mapM78372b);
        m78530b("live_first_load", mapM78372b);
        m78531c("live_first_load", mapM78372b);
    }

    /* JADX INFO: renamed from: d */
    private void m78547d(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.m)) {
            TPLogUtil.m78797e("TPLiveReporter", "onPlayerStart fail:params is not match");
            return;
        }
        C35349b.m mVar = (C35349b.m) aVar;
        this.f76371i = false;
        C35400d c35400d = this.f76373k;
        if (c35400d.f76364g == 0) {
            c35400d.f76364g = mVar.m78080b();
        }
        this.f76373k.f76365h = mVar.m78080b();
        TPLogUtil.m78800i("TPLiveReporter", "Live onPlayerStart FirstStartTimeMs:" + this.f76373k.f76364g + " mPlayerStartOccurElapsedTimeMs:" + this.f76373k.f76365h);
        m78542c();
    }

    /* JADX INFO: renamed from: e */
    private void m78549e(C35349b.a aVar) {
        if (this.f76371i) {
            TPLogUtil.m78797e("TPLiveReporter", "Player has been called End");
            return;
        }
        this.f76371i = true;
        m78534a(aVar.m78080b(), 0, m78522a(aVar), m78527b(aVar));
        m78524a(this.f76373k.f76203a.m78365a());
    }

    /* JADX INFO: renamed from: f */
    private void m78551f(C35349b.a aVar) {
        if (this.f76371i) {
            TPLogUtil.m78797e("TPLiveReporter", "Player has been called End");
            return;
        }
        this.f76371i = true;
        if (!(aVar instanceof C35349b.i)) {
            TPLogUtil.m78797e("TPLiveReporter", "onPlayerError fail:params is not match");
            return;
        }
        C35349b.i iVar = (C35349b.i) aVar;
        m78534a(iVar.m78080b(), iVar.m78098e(), m78522a(iVar), m78527b(iVar));
        m78524a(this.f76373k.f76203a.m78365a());
    }

    /* JADX INFO: renamed from: g */
    private void m78553g(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.c)) {
            TPLogUtil.m78797e("TPLiveReporter", "onBufferingStart fail:params is not match");
            return;
        }
        this.f76372j = true;
        this.f76373k.f76367j = ((C35349b.c) aVar).m78080b();
        TPLogUtil.m78800i("TPLiveReporter", "Live onBufferingStart timeMs:" + this.f76373k.f76367j);
        C35400d c35400d = this.f76373k;
        c35400d.f76370m = c35400d.f76370m + (c35400d.f76367j - c35400d.f76365h);
    }

    /* JADX INFO: renamed from: h */
    private void m78554h(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.b)) {
            TPLogUtil.m78797e("TPLiveReporter", "onBufferingEnd fail:params is not match");
            return;
        }
        this.f76372j = false;
        long jM78080b = ((C35349b.b) aVar).m78080b();
        C35400d c35400d = this.f76373k;
        long j11 = jM78080b - c35400d.f76367j;
        c35400d.f76365h = SystemClock.elapsedRealtime();
        TPLogUtil.m78800i("TPLiveReporter", "Live onBufferingEnd bufferingCostTimeMs:".concat(String.valueOf(j11)));
        if (j11 <= 1200) {
            return;
        }
        C35400d c35400d2 = this.f76373k;
        c35400d2.f76369l++;
        c35400d2.f76368k += j11;
        c35400d2.f76367j = 0L;
    }

    /* JADX INFO: renamed from: i */
    private void m78555i(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.e)) {
            TPLogUtil.m78797e("TPLiveReporter", "onDTProcessUpdate fail:params is not match");
            return;
        }
        int iM78087d = ((C35349b.e) aVar).m78087d();
        TPLogUtil.m78800i("TPLiveReporter", "Vod onDTProcessUpdate speedKbps:".concat(String.valueOf(iM78087d)));
        this.f76373k.f76204b = iM78087d;
    }

    /* JADX INFO: renamed from: j */
    private void m78556j(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.d)) {
            TPLogUtil.m78797e("TPLiveReporter", "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        C35349b.d dVar = (C35349b.d) aVar;
        String strM78084d = dVar.m78084d();
        String strM78085e = dVar.m78085e();
        TPLogUtil.m78800i("TPLiveReporter", "Vod onDTCdnUrlUpdate cdnIp:" + strM78084d + " uIp:" + strM78085e);
        C35400d c35400d = this.f76373k;
        c35400d.f76205c = strM78084d;
        c35400d.f76206d = strM78085e;
    }

    /* JADX INFO: renamed from: k */
    private void m78557k(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.f)) {
            TPLogUtil.m78797e("TPLiveReporter", "onDTProtocolUpdate fail:params is not match");
            return;
        }
        String strM78090d = ((C35349b.f) aVar).m78090d();
        TPLogUtil.m78800i("TPLiveReporter", "Vod onDTProtocolUpdate protocolVer:".concat(String.valueOf(strM78090d)));
        this.f76373k.f76207e = strM78090d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78354a() {
        super.mo78354a();
        m78546d();
    }

    /* JADX INFO: renamed from: c */
    private void m78544c(C35386b c35386b) {
        ITPReportInfoGetter iTPReportInfoGetter = this.f76355a;
        if (iTPReportInfoGetter == null) {
            return;
        }
        Map<String, String> periodExtendReportInfo = iTPReportInfoGetter.getPeriodExtendReportInfo();
        if (periodExtendReportInfo == null) {
            TPLogUtil.m78797e("TPLiveReporter", "fillPeriodExtReportInfoToCommonParams fail, period ExtendReportInfo is null");
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        C35399c.m78516a(periodExtendReportInfo, map, map2);
        c35386b.f76203a.m78379c(map);
        c35386b.f76203a.m78382d(map2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78355a(int i11, C35349b.a aVar) {
        if (i11 == 2) {
            m78543c(aVar);
            return;
        }
        if (i11 == 3) {
            m78547d(aVar);
            return;
        }
        if (i11 == 5) {
            m78549e(aVar);
            return;
        }
        if (i11 == 6) {
            m78551f(aVar);
            return;
        }
        if (i11 == 9) {
            m78553g(aVar);
            return;
        }
        if (i11 == 10) {
            m78554h(aVar);
            return;
        }
        if (i11 == 1001) {
            m78548e();
            return;
        }
        if (i11 == 1002) {
            m78550f();
            return;
        }
        switch (i11) {
            case 100:
                m78555i(aVar);
                break;
            case 101:
                m78556j(aVar);
                break;
            case 102:
                m78557k(aVar);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78533a(long j11, int i11, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        Map<String, String> mapM78372b = m78539b(j11, i11, tPGeneralPlayFlowParams).m78372b();
        m78526a("reportLiveEndEvent", mapM78372b);
        m78530b("live_end", mapM78372b);
        m78531c("live_end", mapM78372b);
    }

    /* JADX INFO: renamed from: a */
    private void m78534a(long j11, int i11, TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        if (this.f76372j) {
            m78554h(new C35349b.b());
            this.f76372j = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C35400d c35400d = this.f76373k;
        c35400d.f76370m += jElapsedRealtime - c35400d.f76365h;
        m78546d();
        TPLogUtil.m78800i("TPLiveReporter", "reportPlayerEndEvent playerStopTimeMs:" + j11 + " errorCode:" + i11);
        m78535a(tPGeneralPlayFlowParams, tPDynamicStatisticParams);
        m78533a(j11, i11, tPGeneralPlayFlowParams);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78356a(Context context, C35408l c35408l) {
        super.mo78356a(context, c35408l);
        this.f76360f.m78585a(this.f76373k.f76203a);
    }

    /* JADX INFO: renamed from: a */
    private void m78535a(TPGeneralPlayFlowParams tPGeneralPlayFlowParams, TPDynamicStatisticParams tPDynamicStatisticParams) {
        Map<String, String> mapM78372b = m78540b(tPGeneralPlayFlowParams, tPDynamicStatisticParams).m78372b();
        m78526a("reportLiveEndFlowEvent", mapM78372b);
        m78530b("live_flow", mapM78372b);
        m78531c("live_flow", mapM78372b);
    }

    /* JADX INFO: renamed from: a */
    private void m78536a(C35388a c35388a, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        c35388a.m78409q(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoDecoderType);
        c35388a.m78410r(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioDecoderType);
        c35388a.m78411s(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mVideoRenderType);
        c35388a.m78412t(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mAudioRenderType);
        c35388a.m78408p(tPGeneralPlayFlowParams.mPlayerBaseMediaParams.mDemuxerType);
    }

    /* JADX INFO: renamed from: a */
    private void m78537a(C35391d c35391d, TPGeneralPlayFlowParams tPGeneralPlayFlowParams) {
        c35391d.m78433f(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        c35391d.m78434g(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadPrepareTimeMs);
        c35391d.m78435h(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadPrepareTimeMs);
        c35391d.m78436i(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerOpenFileSTimeMs);
        c35391d.m78437j(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreApiPrepareTimeMs);
        c35391d.m78438k(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mInitFirstClipPositionETimeMs);
        c35391d.m78439l(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoPacketReadETimeMs);
        c35391d.m78440m(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioPacketReadETimeMs);
        c35391d.m78441n(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mDemuxerThreadOnPreparedTimeMs);
        c35391d.m78442o(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mCoreSchedulingThreadOnPreparedTimeMs);
        c35391d.m78444q(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mVideoDecoderOpenedTimeMs);
        c35391d.m78445r(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstVideoFrameRenderETimeMs);
        c35391d.m78446s(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mAudioDecoderOpenedTimeMs);
        c35391d.m78447t(tPGeneralPlayFlowParams.mPlayerGeneralTrackingParams.mFirstAudioFrameRenderETimeMs);
    }
}
