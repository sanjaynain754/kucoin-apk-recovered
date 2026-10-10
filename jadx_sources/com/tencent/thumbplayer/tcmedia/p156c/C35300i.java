package com.tencent.thumbplayer.tcmedia.p156c;

import android.content.Context;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import com.tencent.thumbplayer.tcmedia.config.TPPlayerConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDLProxyInitParam;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.tcmedia.utils.C35426f;
import com.tencent.thumbplayer.tcmedia.utils.C35429i;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.i */
/* JADX INFO: loaded from: classes62.dex */
public class C35300i implements C35426f.a, C35429i.b {

    /* JADX INFO: renamed from: a */
    private int f75947a;

    /* JADX INFO: renamed from: b */
    private String f75948b;

    /* JADX INFO: renamed from: c */
    private int f75949c;

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<Integer, InterfaceC35293b> f75950d;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.c.i$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C35300i f75952a = new C35300i();
    }

    private C35300i() {
        this.f75947a = 0;
        this.f75948b = "";
        this.f75949c = 0;
        if (this.f75950d == null) {
            this.f75950d = new ConcurrentHashMap<>();
        }
        C35426f.m78866a(this);
        C35429i.m78882a().m78894a(this);
    }

    /* JADX INFO: renamed from: b */
    private String m78024b(boolean z11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("EnableReport", z11);
            return jSONObject.toString();
        } catch (JSONException e11) {
            TPLogUtil.m78798e("TPProxyGlobalManager", e11);
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:11:0x0027, B:13:0x0039, B:17:0x004a, B:19:0x005b, B:20:0x005e, B:27:0x0075, B:29:0x00a1, B:31:0x00ab, B:33:0x00b1, B:34:0x00b4, B:36:0x00bc, B:37:0x00c3, B:23:0x0065, B:26:0x0071), top: B:41:0x0027 }] */
    /* JADX INFO: renamed from: a */
    public InterfaceC35293b m78027a(int i11) {
        String strM78026c;
        if (i11 < 0) {
            return null;
        }
        if (this.f75950d.containsKey(Integer.valueOf(i11))) {
            return this.f75950d.get(Integer.valueOf(i11));
        }
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(i11);
        if (tPDownloadProxy != null) {
            try {
                if (tPDownloadProxy.init(TPPlayerMgr.getAppContext(), m78022a(TPPlayerMgr.getAppContext())) < 0) {
                    TPLogUtil.m78800i("TPProxyGlobalManager", "downloadProxy init failed with status:".concat(String.valueOf(tPDownloadProxy)));
                    return null;
                }
                tPDownloadProxy.setLogListener(new ITPDLProxyLogListener() { // from class: com.tencent.thumbplayer.tcmedia.c.i.1
                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    /* JADX INFO: renamed from: d */
                    public int mo78015d(String str, int i12, String str2, String str3) {
                        TPLogUtil.m78796d(str2, "[" + str + C33844oi.f71346o + i12 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    /* JADX INFO: renamed from: e */
                    public int mo78016e(String str, int i12, String str2, String str3) {
                        TPLogUtil.m78797e(str2, "[" + str + C33844oi.f71346o + i12 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    /* JADX INFO: renamed from: i */
                    public int mo78017i(String str, int i12, String str2, String str3) {
                        TPLogUtil.m78800i(str2, "[" + str + C33844oi.f71346o + i12 + "] " + str3);
                        return 0;
                    }

                    @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener
                    /* JADX INFO: renamed from: w */
                    public int mo78018w(String str, int i12, String str2, String str3) {
                        TPLogUtil.m78802w(str2, "[" + str + C33844oi.f71346o + i12 + "] " + str3);
                        return 0;
                    }
                });
                int iM78888c = C35429i.m78888c();
                if (iM78888c != 1) {
                    if (iM78888c == 2) {
                        tPDownloadProxy.pushEvent(2);
                        tPDownloadProxy.pushEvent(9);
                    } else if (iM78888c == 3) {
                        tPDownloadProxy.pushEvent(2);
                    }
                    tPDownloadProxy.pushEvent(this.f75947a);
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC, this.f75948b);
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(this.f75949c));
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, m78024b(TPPlayerConfig.isDataReportEnable()));
                    if (TPPlayerConfig.getProxyMaxUseMemoryMB() > 0 && (strM78026c = m78026c(TPPlayerConfig.getProxyMaxUseMemoryMB())) != null && strM78026c.length() > 0) {
                        tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, strM78026c);
                    }
                    if (TPPlayerConfig.getProxyMaxStorageSizeMB() > 0) {
                        tPDownloadProxy.setMaxStorageSizeMB(TPPlayerConfig.getProxyMaxStorageSizeMB());
                    }
                    C35301j c35301j = new C35301j(tPDownloadProxy);
                    this.f75950d.put(Integer.valueOf(i11), c35301j);
                    TPLogUtil.m78800i("TPProxyGlobalManager", "getPlayerProxy, init proxy succeeded, serviceType:".concat(String.valueOf(i11)));
                    return c35301j;
                }
                tPDownloadProxy.pushEvent(1);
                tPDownloadProxy.pushEvent(10);
                tPDownloadProxy.pushEvent(this.f75947a);
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC, this.f75948b);
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(this.f75949c));
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, m78024b(TPPlayerConfig.isDataReportEnable()));
                if (TPPlayerConfig.getProxyMaxUseMemoryMB() > 0) {
                    tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, strM78026c);
                }
                if (TPPlayerConfig.getProxyMaxStorageSizeMB() > 0) {
                    tPDownloadProxy.setMaxStorageSizeMB(TPPlayerConfig.getProxyMaxStorageSizeMB());
                }
                C35301j c35301j2 = new C35301j(tPDownloadProxy);
                this.f75950d.put(Integer.valueOf(i11), c35301j2);
                TPLogUtil.m78800i("TPProxyGlobalManager", "getPlayerProxy, init proxy succeeded, serviceType:".concat(String.valueOf(i11)));
                return c35301j2;
            } catch (Throwable th2) {
                TPLogUtil.m78797e("TPProxyGlobalManager", "init proxy failed:".concat(String.valueOf(th2)));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C35300i m78021a() {
        return a.f75952a;
    }

    /* JADX INFO: renamed from: b */
    private void m78025b(int i11) {
        Iterator<InterfaceC35293b> it = this.f75950d.values().iterator();
        while (it.hasNext()) {
            it.next().mo77964a(i11);
        }
    }

    /* JADX INFO: renamed from: c */
    private String m78026c(long j11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("MaxUseMemoryLevel1MB", j11);
            jSONObject.put("MaxUseMemoryLevel2MB", j11);
            jSONObject.put("MaxUseMemoryMB", j11);
            return jSONObject.toString();
        } catch (JSONException e11) {
            TPLogUtil.m78798e("TPProxyGlobalManager", e11);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static TPDLProxyInitParam m78022a(Context context) {
        return new TPDLProxyInitParam(TPPlayerConfig.getPlatform(), TPPlayerConfig.getAppVersionName(context), TPPlayerConfig.getGuid(), TPPlayerConfig.getProxyCacheDir(), TPPlayerConfig.getProxyDataDir(), TPPlayerConfig.getProxyConfigDir());
    }

    /* JADX INFO: renamed from: b */
    public void m78030b(long j11) {
        Iterator<InterfaceC35293b> it = this.f75950d.values().iterator();
        while (it.hasNext()) {
            it.next().mo77963a().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, m78026c(j11));
        }
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.C35429i.b
    /* JADX INFO: renamed from: a */
    public void mo78010a(int i11, int i12, int i13, int i14) {
        int i15 = 10;
        int i16 = 1;
        if (i12 == 1) {
            m78025b(i16);
        } else {
            i16 = 2;
            if (i12 == 2) {
                m78025b(2);
                i15 = 9;
            } else {
                if (i12 != 3) {
                    return;
                }
                m78025b(i16);
            }
        }
        m78025b(i15);
    }

    @Override // com.tencent.thumbplayer.tcmedia.utils.C35426f.a
    /* JADX INFO: renamed from: a */
    public void mo78011a(int i11, int i12, int i13, Object obj) {
        TPLogUtil.m78800i("TPProxyGlobalManager", "onEvent eventId: " + i11 + ", arg1: " + i12 + ", arg2: " + i13 + ", object" + obj);
        switch (i11) {
            case TPPlayerMgr.EVENT_ID_APP_ENTER_BACKGROUND /* 100001 */:
                this.f75947a = 13;
                m78025b(13);
                break;
            case TPPlayerMgr.EVENT_ID_APP_ENTER_FOREGROUND /* 100002 */:
                this.f75947a = 14;
                m78025b(14);
                break;
            case 100003:
                m78023a((String) obj, i12);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78028a(long j11) {
        Iterator<InterfaceC35293b> it = this.f75950d.values().iterator();
        while (it.hasNext()) {
            ITPDownloadProxy iTPDownloadProxyMo77963a = it.next().mo77963a();
            if (iTPDownloadProxyMo77963a != null && j11 > 0) {
                iTPDownloadProxyMo77963a.setMaxStorageSizeMB(j11);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m78023a(String str, int i11) {
        this.f75948b = str;
        this.f75949c = i11;
        for (InterfaceC35293b interfaceC35293b : this.f75950d.values()) {
            interfaceC35293b.mo77963a().setUserData(TPDownloadProxyEnum.USER_UPC, str);
            interfaceC35293b.mo77963a().setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78029a(boolean z11) {
        Iterator<InterfaceC35293b> it = this.f75950d.values().iterator();
        while (it.hasNext()) {
            it.next().mo77963a().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, m78024b(z11));
        }
    }
}
