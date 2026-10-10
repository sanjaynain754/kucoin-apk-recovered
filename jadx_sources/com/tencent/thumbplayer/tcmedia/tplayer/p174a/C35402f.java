package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p175a.InterfaceC35385a;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.C35392b;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.f */
/* JADX INFO: loaded from: classes64.dex */
public class C35402f extends C35399c {

    /* JADX INFO: renamed from: i */
    private C35386b f76378i = new C35386b();

    /* JADX INFO: renamed from: c */
    private void m78558c() {
        InterfaceC35385a interfaceC35385a = this.f76356b;
        if (interfaceC35385a == null) {
            TPLogUtil.m78797e("TPPrepareFailReporter", "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsMo78034a = interfaceC35385a.mo78034a();
        this.f76378i.f76203a.m78370a(this.f76359e.f76405i);
        this.f76378i.f76203a.m78385f(this.f76359e.f76403g);
        this.f76378i.f76203a.m78394j(this.f76359e.f76401e);
        this.f76378i.f76203a.m78398l(TPDownloadProxyHelper.getNativeLibVersion());
        C35386b c35386b = this.f76378i;
        c35386b.f76203a.m78395k(c35386b.f76204b);
        C35386b c35386b2 = this.f76378i;
        c35386b2.f76203a.m78403o(c35386b2.f76207e);
        C35386b c35386b3 = this.f76378i;
        c35386b3.f76203a.m78400m(c35386b3.f76206d);
        C35386b c35386b4 = this.f76378i;
        c35386b4.f76203a.m78402n(c35386b4.f76205c);
        this.f76378i.f76203a.m78397l(this.f76359e.f76404h);
        this.f76362h.put("buffermintotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mBufferMinTotalDurationMs));
        this.f76362h.put("buffermaxtotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mBufferMaxTotalDurationMs));
        this.f76362h.put("preloadtotaldurationms", Long.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mPreloadTotalDurationMs));
        this.f76362h.put("minbufferingdurationms", Long.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mMinBufferingDurationMs));
        this.f76362h.put("minbufferingtimems", Long.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mMinBufferingTimeMs));
        this.f76362h.put("maxbufferingtimems", Long.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mMaxBufferingTimeMs));
        this.f76362h.put("reducelatencyaction", Integer.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mReduceLatencyAction));
        this.f76362h.put("reducelatencyspeed", Float.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mReduceLatencyPlaySpeed));
        this.f76362h.put("buffertype", Integer.valueOf(tPGeneralPlayFlowParamsMo78034a.mPlayerConfigParams.mBufferType));
        try {
            this.f76378i.f76203a.m78404p(new JSONObject(this.f76362h).toString());
        } catch (NullPointerException e11) {
            TPLogUtil.m78798e("TPPrepareFailReporter", e11);
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78354a() {
        super.mo78354a();
    }

    /* JADX INFO: renamed from: c */
    private void m78559c(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.i)) {
            TPLogUtil.m78797e("TPPrepareFailReporter", "onPrepareError fail:params is not match");
            return;
        }
        C35349b.i iVar = (C35349b.i) aVar;
        int iM78097d = iVar.m78097d();
        int iM78098e = iVar.m78098e();
        TPLogUtil.m78800i("TPPrepareFailReporter", "onPrepareError errorType:" + iM78097d + " errorCode:" + iM78098e);
        C35392b c35392b = new C35392b();
        c35392b.m78448o(iM78098e);
        m78558c();
        m78529b(this.f76378i);
        this.f76360f.m78586b(this.f76378i.f76203a);
        c35392b.m78369a(this.f76378i.f76203a);
        Map<String, String> mapM78372b = c35392b.m78372b();
        m78526a("onPrepareError", mapM78372b);
        m78530b("prepare_fail", mapM78372b);
        m78531c("prepare_fail", mapM78372b);
    }

    /* JADX INFO: renamed from: d */
    private void m78560d(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.e)) {
            TPLogUtil.m78797e("TPPrepareFailReporter", "onDTProcessUpdate fail:params is not match");
            return;
        }
        int iM78087d = ((C35349b.e) aVar).m78087d();
        TPLogUtil.m78800i("TPPrepareFailReporter", "Vod onDTProcessUpdate speedKbps:".concat(String.valueOf(iM78087d)));
        this.f76378i.f76204b = iM78087d;
    }

    /* JADX INFO: renamed from: e */
    private void m78561e(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.d)) {
            TPLogUtil.m78797e("TPPrepareFailReporter", "onDTCdnUrlUpdate fail:params is not match");
            return;
        }
        C35349b.d dVar = (C35349b.d) aVar;
        String strM78084d = dVar.m78084d();
        String strM78085e = dVar.m78085e();
        TPLogUtil.m78800i("TPPrepareFailReporter", "Vod onDTCdnUrlUpdate cdnIp:" + strM78084d + " uIp:" + strM78085e);
        C35386b c35386b = this.f76378i;
        c35386b.f76205c = strM78084d;
        c35386b.f76206d = strM78085e;
    }

    /* JADX INFO: renamed from: f */
    private void m78562f(C35349b.a aVar) {
        if (!(aVar instanceof C35349b.f)) {
            TPLogUtil.m78797e("TPPrepareFailReporter", "onDTProtocolUpdate fail:params is not match");
            return;
        }
        String strM78090d = ((C35349b.f) aVar).m78090d();
        TPLogUtil.m78800i("TPPrepareFailReporter", "Vod onDTProtocolUpdate protocolVer:".concat(String.valueOf(strM78090d)));
        this.f76378i.f76207e = strM78090d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78355a(int i11, C35349b.a aVar) {
        if (i11 == 6) {
            m78559c(aVar);
            return;
        }
        switch (i11) {
            case 100:
                m78560d(aVar);
                break;
            case 101:
                m78561e(aVar);
                break;
            case 102:
                m78562f(aVar);
                break;
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.C35399c, com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78356a(Context context, C35408l c35408l) {
        super.mo78356a(context, c35408l);
        this.f76360f.m78585a(this.f76378i.f76203a);
    }
}
