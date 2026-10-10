package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import android.content.Context;
import androidx.webkit.ProxyConfig;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.tcmedia.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.tcmedia.api.reportv2.TPExtendCommonKey;
import com.tencent.thumbplayer.tcmedia.common.p158a.C35305b;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tcmedia.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.tcmedia.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.tcmedia.p159d.C35349b;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p175a.InterfaceC35385a;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.C35387a;
import com.tencent.thumbplayer.tcmedia.utils.C35423c;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.c */
/* JADX INFO: loaded from: classes64.dex */
public class C35399c implements InterfaceC35384a {

    /* JADX INFO: renamed from: i */
    private static C35423c f76354i;

    /* JADX INFO: renamed from: a */
    protected ITPReportInfoGetter f76355a;

    /* JADX INFO: renamed from: b */
    protected InterfaceC35385a f76356b;

    /* JADX INFO: renamed from: c */
    protected CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> f76357c;

    /* JADX INFO: renamed from: d */
    protected Context f76358d;

    /* JADX INFO: renamed from: e */
    protected C35408l f76359e;

    /* JADX INFO: renamed from: f */
    protected C35406j f76360f = null;

    /* JADX INFO: renamed from: g */
    protected int f76361g = 0;

    /* JADX INFO: renamed from: h */
    protected Map<String, Object> f76362h = new HashMap();

    /* JADX INFO: renamed from: c */
    private synchronized void m78518c() {
        try {
            C35423c c35423c = f76354i;
            if (c35423c == null) {
                return;
            }
            for (String str : c35423c.m78854b()) {
                String strM78520d = m78520d(str);
                C35387a c35387a = (C35387a) f76354i.m78853b(str);
                if (strM78520d != null && c35387a != null) {
                    Map<String, String> mapM78372b = c35387a.m78372b();
                    m78530b(strM78520d, mapM78372b);
                    C35305b.m78041a(strM78520d, mapM78372b);
                }
            }
            f76354i.m78855c();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public TPDynamicStatisticParams m78521a(boolean z11) {
        InterfaceC35385a interfaceC35385a = this.f76356b;
        if (interfaceC35385a != null) {
            return interfaceC35385a.mo78033a(z11);
        }
        TPLogUtil.m78797e("TPBaseReporter", "getDynamicStatParamsFromCore failed, mPlayerInfoGetter is null, return default value");
        return new TPDynamicStatisticParams();
    }

    /* JADX INFO: renamed from: b */
    public TPDynamicStatisticParams m78527b(C35349b.a aVar) {
        TPDynamicStatisticParams tPDynamicStatisticParamsM78100g;
        if (aVar instanceof C35349b.n) {
            tPDynamicStatisticParamsM78100g = ((C35349b.n) aVar).m78108e();
        } else if (aVar instanceof C35349b.l) {
            tPDynamicStatisticParamsM78100g = ((C35349b.l) aVar).m78104e();
        } else if (aVar instanceof C35349b.i) {
            tPDynamicStatisticParamsM78100g = ((C35349b.i) aVar).m78100g();
        } else {
            TPLogUtil.m78797e("TPBaseReporter", "event info do not have dynamicStatisticParams");
            tPDynamicStatisticParamsM78100g = null;
        }
        return tPDynamicStatisticParamsM78100g == null ? new TPDynamicStatisticParams() : tPDynamicStatisticParamsM78100g;
    }

    /* JADX INFO: renamed from: d */
    private static String m78520d(String str) {
        for (Field field : C35405i.class.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType() == String.class) {
                try {
                    String str2 = (String) field.get(C35405i.class);
                    if (str2 != null && str.endsWith(str2)) {
                        return str2;
                    }
                } catch (IllegalAccessException unused) {
                    TPLogUtil.m78802w("TPBaseReporter", "fail to get value of field(" + field.getName() + ") in TPReportEventId.class)");
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public TPGeneralPlayFlowParams m78522a(C35349b.a aVar) {
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsM78099f;
        if (aVar instanceof C35349b.n) {
            tPGeneralPlayFlowParamsM78099f = ((C35349b.n) aVar).m78107d();
        } else if (aVar instanceof C35349b.l) {
            tPGeneralPlayFlowParamsM78099f = ((C35349b.l) aVar).m78103d();
        } else if (aVar instanceof C35349b.i) {
            tPGeneralPlayFlowParamsM78099f = ((C35349b.i) aVar).m78099f();
        } else {
            TPLogUtil.m78797e("TPBaseReporter", "event info do not have generalPlayFlowParams");
            tPGeneralPlayFlowParamsM78099f = null;
        }
        return tPGeneralPlayFlowParamsM78099f == null ? new TPGeneralPlayFlowParams() : tPGeneralPlayFlowParamsM78099f;
    }

    /* JADX INFO: renamed from: b */
    public TPGeneralPlayFlowParams m78528b() {
        InterfaceC35385a interfaceC35385a = this.f76356b;
        if (interfaceC35385a != null) {
            return interfaceC35385a.mo78034a();
        }
        TPLogUtil.m78797e("TPBaseReporter", "getGeneralPlayFlowParams failed, mPlayerInfoGetter is null, return default value");
        return new TPGeneralPlayFlowParams();
    }

    /* JADX INFO: renamed from: c */
    public void m78531c(String str, Map<String, String> map) {
        if (this.f76359e.f76406j.booleanValue()) {
            C35305b.m78041a(str, map);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m78519c(String str) {
        if (str == null) {
            return false;
        }
        for (Field field : TPExtendCommonKey.class.getDeclaredFields()) {
            try {
                field.setAccessible(true);
                String str2 = (String) field.get(TPExtendCommonKey.class);
                if (str2 != null && str2.equals(str)) {
                    return true;
                }
            } catch (IllegalAccessException e11) {
                TPLogUtil.m78798e("TPBaseReporter", e11);
            }
        }
        return false;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78354a() {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.f76357c;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f76357c = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78529b(C35386b c35386b) {
        ITPReportInfoGetter iTPReportInfoGetter = this.f76355a;
        if (iTPReportInfoGetter == null) {
            return;
        }
        Map<String, String> initExtendReportInfo = iTPReportInfoGetter.getInitExtendReportInfo();
        if (initExtendReportInfo == null) {
            TPLogUtil.m78797e("TPBaseReporter", "fillInitExtReportInfoToCommonParams fail, initExtendReportInfo is null");
            return;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        m78516a(initExtendReportInfo, map, map2);
        c35386b.f76203a.m78371a(map);
        c35386b.f76203a.m78376b(map2);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78355a(int i11, C35349b.a aVar) {
    }

    /* JADX INFO: renamed from: b */
    public void m78530b(String str, Map<String, String> map) {
        if (this.f76357c.size() == 0) {
            return;
        }
        for (int i11 = 0; i11 < this.f76357c.size(); i11++) {
            ITPReportChannelListener iTPReportChannelListener = this.f76357c.get(i11).get();
            if (iTPReportChannelListener != null) {
                iTPReportChannelListener.reportEvent(str, map);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m78517b(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("ext_");
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78356a(Context context, C35408l c35408l) {
        this.f76358d = context;
        this.f76357c = new CopyOnWriteArrayList<>();
        this.f76359e = c35408l;
        this.f76360f = new C35406j(context);
        m78515a(context, "TPReporterCache");
        m78518c();
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m78515a(Context context, String str) {
        if (f76354i != null) {
            return;
        }
        f76354i = new C35423c(this.f76358d, str);
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78357a(ITPReportChannelListener iTPReportChannelListener) {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.f76357c;
        if (copyOnWriteArrayList == null) {
            TPLogUtil.m78802w("TPBaseReporter", "mReportChannelListenerList is null");
            return;
        }
        Iterator<WeakReference<ITPReportChannelListener>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (it.next().get() == iTPReportChannelListener) {
                TPLogUtil.m78802w("TPBaseReporter", "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.f76357c.add(new WeakReference<>(iTPReportChannelListener));
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78358a(ITPReportInfoGetter iTPReportInfoGetter) {
        this.f76355a = iTPReportInfoGetter;
    }

    @Override // com.tencent.thumbplayer.tcmedia.tplayer.p174a.InterfaceC35384a
    /* JADX INFO: renamed from: a */
    public void mo78359a(InterfaceC35385a interfaceC35385a) {
        this.f76356b = interfaceC35385a;
    }

    /* JADX INFO: renamed from: a */
    public void m78523a(C35386b c35386b) {
        InterfaceC35385a interfaceC35385a = this.f76356b;
        if (interfaceC35385a == null) {
            TPLogUtil.m78797e("TPBaseReporter", "fillStreamInfoToCommonParams fail, not set mPlayerInfoGetter");
            return;
        }
        TPGeneralPlayFlowParams tPGeneralPlayFlowParamsMo78034a = interfaceC35385a.mo78034a();
        c35386b.f76203a.m78370a(this.f76359e.f76405i);
        c35386b.f76203a.m78368a(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mDurationMs);
        c35386b.f76203a.m78383e(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mHlsSourceType);
        c35386b.f76203a.m78385f(this.f76359e.f76403g);
        c35386b.f76203a.m78387g(this.f76359e.f76402f);
        c35386b.f76203a.m78392i(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mFormatContainer);
        c35386b.f76203a.m78389h(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mVideoEncodeFormat);
        c35386b.f76203a.m78391i(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mAudioEncodeFormat);
        c35386b.f76203a.m78393j(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mSubtitleEncodeFormat);
        c35386b.f76203a.m78374b(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mVideoStreamBitrateKbps);
        c35386b.f76203a.m78366a(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mVideoFrameRate);
        c35386b.f76203a.m78394j(this.f76359e.f76401e);
        c35386b.f76203a.m78396k(tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mVideoWidth + ProxyConfig.MATCH_ALL_SCHEMES + tPGeneralPlayFlowParamsMo78034a.mPlayerBaseMediaParams.mVideoHeight);
        c35386b.f76203a.m78398l(TPDownloadProxyHelper.getNativeLibVersion());
        c35386b.f76203a.m78395k(c35386b.f76204b);
        c35386b.f76203a.m78403o(c35386b.f76207e);
        c35386b.f76203a.m78400m(c35386b.f76206d);
        c35386b.f76203a.m78402n(c35386b.f76205c);
        c35386b.f76203a.m78397l(this.f76359e.f76404h);
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
            c35386b.f76203a.m78404p(new JSONObject(this.f76362h).toString());
        } catch (NullPointerException e11) {
            TPLogUtil.m78798e("TPBaseReporter", e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78524a(String str) {
        C35423c c35423c = f76354i;
        if (c35423c == null) {
            return;
        }
        for (String str2 : c35423c.m78854b()) {
            if (str2.startsWith(str)) {
                f76354i.m78851a(str2);
                TPLogUtil.m78800i("TPBaseReporter", "remove cache, key:".concat(str2));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m78525a(String str, C35387a c35387a) {
        if (f76354i != null && this.f76359e.f76406j.booleanValue()) {
            f76354i.m78852a(c35387a.m78365a() + str, c35387a);
            TPLogUtil.m78800i("TPBaseReporter", "write cache, flowid:" + c35387a.m78365a() + ", reportId:" + str);
            return;
        }
        TPLogUtil.m78800i("TPBaseReporter", "mCache is null or does not need to report to beacon, no caching!");
    }

    /* JADX INFO: renamed from: a */
    public void m78526a(String str, Map<String, String> map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ":{";
        while (true) {
            sb2.append(str2);
            if (!it.hasNext()) {
                sb2.append("}");
                TPLogUtil.m78800i("TPBaseReporter", sb2.toString());
                return;
            }
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            sb2.append(key);
            sb2.append(C33844oi.f71346o);
            sb2.append(value);
            str2 = ",";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m78516a(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (m78519c(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            } else if (m78517b(entry.getKey())) {
                map3.put(entry.getKey(), entry.getValue());
            } else {
                TPLogUtil.m78797e("TPBaseReporter", "invalid extend info <" + entry.getKey() + ", " + entry.getValue() + "> from ITPReportInfoGetter, key valid!");
            }
        }
    }
}
