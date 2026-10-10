package com.tencent.thumbplayer.tcmedia.tplayer.p174a;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.api.TPCommonEnum;
import com.tencent.thumbplayer.tcmedia.api.capability.TPCapability;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.tencent.thumbplayer.tcmedia.tplayer.p174a.p176b.C35387a;
import com.tencent.thumbplayer.tcmedia.utils.C35428h;
import com.tencent.thumbplayer.tcmedia.utils.C35429i;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.tplayer.a.j */
/* JADX INFO: loaded from: classes64.dex */
public class C35406j implements C35429i.b {

    /* JADX INFO: renamed from: a */
    private static final String f76393a = String.format("android %s", TPSystemInfo.getOsVersion());

    /* JADX INFO: renamed from: c */
    private static final Map<Integer, Integer> f76394c;

    /* JADX INFO: renamed from: d */
    private static final Map<Integer, Integer> f76395d;

    /* JADX INFO: renamed from: b */
    private Context f76396b;

    /* JADX INFO: renamed from: a */
    private int m78582a() {
        int iM78583a = 0;
        for (int i11 : TPCapability.getDRMCapabilities()) {
            iM78583a |= m78583a(i11);
        }
        return iM78583a;
    }

    /* JADX INFO: renamed from: b */
    public static int m78584b(int i11) {
        Integer num = f76394c.get(Integer.valueOf(i11));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: a */
    public static int m78583a(@TPCommonEnum.TP_DRM_TYPE int i11) {
        Integer num = f76395d.get(Integer.valueOf(i11));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public void m78586b(C35387a c35387a) {
        c35387a.m78380d(C35428h.m78870a(this.f76396b));
    }

    static {
        HashMap map = new HashMap();
        f76394c = map;
        map.put(0, -1);
        map.put(1, 0);
        map.put(2, 3);
        map.put(3, 3);
        HashMap map2 = new HashMap();
        f76395d = map2;
        map2.put(-1, -1);
        map2.put(0, 32);
        map2.put(2, 4);
    }

    public C35406j(Context context) {
        this.f76396b = context;
        C35429i.m78882a().m78894a(this);
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.C35429i.b
    /* JADX INFO: renamed from: a */
    public void mo78010a(int i11, int i12, int i13, int i14) {
        C35428h.m78875b(this.f76396b);
    }

    /* JADX INFO: renamed from: a */
    public void m78585a(C35387a c35387a) {
        c35387a.m78375b(TPPlayerConfig.getGuid());
        c35387a.m78373b(0);
        c35387a.m78377c(0);
        c35387a.m78380d(C35428h.m78870a(this.f76396b));
        c35387a.m78378c(TPSystemInfo.getDeviceName());
        c35387a.m78381d(f76393a);
        c35387a.m78384e(this.f76396b.getPackageName());
        c35387a.m78388g(TPPlayerConfig.getAppVersionName(this.f76396b));
        c35387a.m78390h("1.0.0");
        c35387a.m78386f(TPPlayerConfig.VERSION);
        c35387a.m78399m(TPPlayerConfig.getPlatform());
        c35387a.m78367a(0);
        c35387a.m78401n(m78582a());
    }
}
